package DAO;

import DTO.EditoraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe com metodos de funções e conexões  com o banco
 * para a tabela editora.
 * @author Grupo em conjunto cada membro fez uma tela.
 */
public class EditoraDAO {
    Connection conn; // variavel de conexão
    PreparedStatement pstm; // variavel de preparação para a conexão
    ResultSet rs; // variavel para receber Uma tabela de dados que representa um conjunto de resultados de banco de dados, 
    //que geralmente é gerado pela execução de uma instrução que consulta o banco de dados.
    ArrayList<EditoraDTO> lista = new ArrayList<>(); // uma arraylist é criada para receber os dados digitados 
    
    // metodo criado para executar a função de cadastro de uma tabela no banco com o parametro que indica de onde estão vindo os dados
    public void cadastrarEditora(EditoraDTO objeditoradto) throws SQLException{
        /*variavel criada para executar a instrução de inserção de dados no banco, 
        com os nomes das colunas e em seguida com os valores sendo representados pelos sinais de interrogação*/
        
        String sql ="insert into editora (cnpj,razao_social,tel_fixo,cep) values (?,?,?,?)"; 
        
        // a variavel de conexão instancia um metodo de conexão com o banco
        conn = new ConexaoDAO().conectaBD();
        
        try {
                // a variavel de preparação recebe os valores digitados nos campos do cadastro 
            pstm = conn.prepareStatement(sql); 
            // a instrução é instanciada passando como parametro a instrução sql definida anteriormente
            pstm.setString(1,objeditoradto.getCnpj());
            pstm.setString(2,objeditoradto.getRazao_social());
            pstm.setString(3,objeditoradto.getTel_fixo());
            pstm.setString(4,objeditoradto.getCep());
            
            // em seguida o comando é executado e logo apos o banco é desconectado
            pstm.execute();
        } catch (SQLException e) {
            // caso não esteja correta a instrução um erro e indicado em uma tela de aviso
            JOptionPane.showMessageDialog(null, "Erro no cadastro da editora" + e);
        }finally{
            pstm.close();
        }
            
    }
    
    // metodo criado para executar a função de listagem das editoras  por meio de uma pesquisa no banco na tabela editora
    public ArrayList<EditoraDTO> listarEditora() throws SQLException{
        
        // string criada para receber o comando de mysql que buscara todos os registros da tabela
        String sql = "select * from editora";
        // variavel conn é criada  e se inicia uma conexão instanciando o metodo para conectar com o banco a partir da classe de conexão
        conn = new ConexaoDAO().conectaBD();

        // um bloco de tratamento é executado e então é declarada a variavel pstm do tipo preparedstatement 
        try {
            // essa variavel recebe a variavel de conexão conn instanciando o prepareStatement recebendo a string sql como parametro
            // esse metodo recebe e armazena a instrução no banco
            pstm = conn.prepareStatement(sql);
            
            // a variavel resultset  recebe o pstm agora com o comando sql armazenado e instanciado o comando executeQuery() para que o comando sejá executado
            // no banco
            rs = pstm.executeQuery();
            
            while (rs.next()) {// o laço while se mantem  varrendo o resulset e em seguida cada registro encontrado e setado no objeto DTO para transferencias de objetos 
                //que em seguida é armazenado na lista.                
                EditoraDTO objeditoradto = new EditoraDTO();
                objeditoradto.setCnpj(rs.getString("cnpj"));
                objeditoradto.setRazao_social(rs.getString("razao_social"));
                objeditoradto.setTel_fixo(rs.getString("tel_fixo"));
                objeditoradto.setCep(rs.getString("cep"));
               
                
                lista.add(objeditoradto);
            }

        } catch (SQLException erro) { // tratamento de erro no banco  indicando problemas na conexão.
            JOptionPane.showMessageDialog(null, "Erro Pesquisar de Editora" + erro);
        }finally{
           // por fim a conexão é encerrada
            pstm.close(); 
        }
        return lista; //por fim o metodo retorna a lista que recebeu o objeto DTO no laço while
    }
    
    /*metodo para realizar pesquisas ao digitar no campo de texto possui 2 parametros , um para receber a instrução sql em string e outro para receber a tabela da tela onde
    será feita a pesquisa*/
    public void pesquisaEditora(String sql,JTable tabela) throws SQLException{
        // é feita a conexão com o banco por meio da variavel conn
        conn = new ConexaoDAO().conectaBD();
        
        // um bloco de tratamento é utilizado  e inicia-se uma conexão que recebe como parametro
        try
        {
            // em prepare statement que envia as instruções sql para o banco
            // em seguida essa instrução é executada e logo apos recebe uma execução da query dentro do resulset
            pstm = conn.prepareStatement(sql);
            pstm.execute();
            
            // o resultset funciona como uma representação da tabela do banco podendo ser acessado as colunas por meio dele
            rs = pstm.executeQuery();
            
            // uma tabela é declarada para que seja feita a recepção dos dados pesquisados  em cada linha resultante da pesquisa no banco
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);//inicializar do primeiro elemento da tabela
            
            //tratamento de data caso seja necessario 
            //DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            while(rs.next()) // o laço roda por todo o resultset e em seguida adiciona uma nova linha com todos os dados buscados presentes no banco
            {
                model.addRow(new Object[] 
                {
                    // o metodo get string recebe uma string como o nome exato da coluna no banco
                    rs.getString("cnpj"),
                    rs.getString("razao_social"), 
                    rs.getString("tel_fixo"),
                    rs.getString("cep")
                });
            }

        }
        catch(SQLException ex) // uma mensagem de erro é informada caso não seja encontrado os dados buscados.
        {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Erro:" + ex);
        }finally{
            // por fim a conexão é encerrada
            pstm.close();
        }
        
    }
    
    // metodo para atualizar informações no banco possui 3 parametros indicando os campos que receberam as modificações realizada pelo usuario
    public void alterarEditora(JTextField camporazaosocial,JTextField campotelfixo,JTextField campocep,JTextField campocnpj) throws SQLException{
        // uma string para dar a instrução sql ao banco  nesse caso uma instrução para atualizar colunas em uma coluna especifica onde o id for igual ao digitado pelo usuario
         String sql = "UPDATE editora set razao_social =?,tel_fixo = ?,cep =? WHERE cnpj = ?";
         
         // variavel conn usada para instanciar a conexão DAO e em seguida conectar-se ao banco
         conn = new ConexaoDAO().conectaBD();
         
         // no bloco de tratamento um a variavel de preparestatement e declarada e em seguida recebe uma instancia de preparação de instrução 
         // tem como parametro a string sql
         try {
             // em seguida as colunas recebem os novos valores digitados com os parametros indicando a posição da coluna e o campo de onde esta sendo pego o valor
             pstm = conn.prepareStatement(sql);
             pstm.setString(1,camporazaosocial.getText());
             pstm.setString(2,campotelfixo.getText());
             pstm.setString(3,campocep.getText());
             pstm.setString(4,campocnpj.getText());
             
             // o comando execute update realiza a atualização das informações no banco e em seguida a conexão e fechada
             pstm.executeUpdate();
         } catch (SQLException e) { // uma mensagem de erro será informada caso a conexão não seja bem sucedida ou haja algum problema com a instrução sql
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados do banco. Erro:" + e); 
         }finally{
             pstm.close();
         }  
     }
    
    // metodo para consultar a coluna onde será feita a alteração , possui parametros que indicam os campos de texto onde serão feitas as alterações
    public void consultarEditora(JTextField campobusca,JTextField campocnpj,JTextField camporazaosocial,JTextField campotelfixo,JTextField campocep) throws SQLException{
        // string sql onde será feita uma consulta na tabela indicada e em seguida buscara de acordo com o atributo indicado pelo usuario no campo de busca
        // nesse caso foi utilizado o id do usuario para ser feita a consulta , por ser um registro unico 
        String sql = "SELECT * FROM editora WHERE razao_social = ?";
        // uma conexão é feita no banco utilizando o metodo conectaBD
        conn = new ConexaoDAO().conectaBD();
        try {
            
           // a variavel de preparação recebe a conexão com a instrução que é enviada ao banco 
           pstm= conn.prepareStatement(sql); 
           // em seguida é setado por meio do parametro que indica a exata posição do campo indicado que recebera o que o usuario digitar
           pstm.setString(1, campobusca.getText());
           // logo apos a query é executada  em um resultset
           rs=pstm.executeQuery();
            if (rs.next()) { // o result set é consultado ate o ultimo campo e recebe os valores armazenados no banco
                campocnpj.setText(rs.getString(1));
                camporazaosocial.setText(rs.getString(2));
                campotelfixo.setText(rs.getString(3));
                campocep.setText(rs.getString(4));
            } else { // caso não seja retornado nenhum resultado  uma mensagem indicando isso ao usuario é retornada e logo em seguida os campos são limpos para uma nova busca
                JOptionPane.showMessageDialog(null, "Editora não cadastrada");
                    //campos recebem uma string vazia como valor e são resetados
                    campobusca.setText("");
                    camporazaosocial.setText("");
                    campotelfixo.setText("");
                    campocep.setText("");
            }
        } catch (SQLException e) { // caso haja algum problema na instrução sql um erro e indicando em uma janela
            JOptionPane.showMessageDialog(null, "Erro na conexão com a tabela Editora. Erro:" + e);
        }finally{
            pstm.close();
        }
    }
    
    // metodo para excluir um registro do banco
    public void excluirEditora(EditoraDTO objeditora) throws SQLException{ //o metodo recebe como parametro o objeto dto do autor 
        // um string sql indicando o a instrução é feita com a função de apagar uma linha em que o id seja igual ao digitado
        String sql = "DELETE from editora where cnpj = ?";
        
        // é feita uma conexão com o banco atraves da variavel conn e em seguida o metodo conectBD é instanciado
        conn = new ConexaoDAO().conectaBD();
        
        try {
          
           // logo em seguida o o statement recebe a conexãoe prepara a instrução sql que será recebia e executada pelo banco
          pstm = conn.prepareStatement(sql);
          
          //um valor inteiro é setado e recupera o valor do id no objeto autor
          pstm.setString(1, objeditora.getCnpj()); 
          
          //a instrução é executada  e em seguida a conexão é encerrada
          pstm.execute();
          
        } catch (SQLException e) { // caso haja algum problema na instrução sql um erro e indicando em uma janela
            JOptionPane.showMessageDialog(null, "Erro na conexão com a tabela Editora. Erro:" + e);
        }finally{
           pstm.close();
        }
        
    }
}
