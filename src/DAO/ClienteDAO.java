package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe com metodos de funções e conexões com o banco
 * para a tabela cliente.
 * @author Grupo em conjunto cada membro fez uma tela.
 */
public class ClienteDAO {
    Connection conn; // variavel de conexão
    PreparedStatement pstm; // variavel de preparação para a conexão
    ResultSet rs;// variavel para receber Uma tabela de dados que representa um conjunto de resultados de banco de dados, 
    //que geralmente é gerado pela execução de uma instrução que consulta o banco de dados.
    ArrayList<ClienteDTO> lista = new ArrayList<>();// uma arraylist é criada para receber os dados digitados
    
    // metodo criado para executar a função de cadastro de uma tabela no banco com o parametro que indica de onde estão vindo os dados
    public void cadastrarCliente(ClienteDTO objclientdto) throws SQLException{
        /*variavel criada para executar a instrução de inserção de dados no banco, 
        com os nomes das colunas e em seguida com os valores sendo representados pelos sinais de interrogação*/
        
        String sql ="insert into cliente (situacaocad,email,nome,sobrenome,tel_fixo,tel_celular) values (?,?,?,?,?,?)"; 
        
        // a variavel de conexão instancia um metodo de conexão com o banco
        conn = new ConexaoDAO().conectaBD();
        
        try {
                // a variavel de preparação recebe os valores digitados nos campos do cadastro 
            pstm = conn.prepareStatement(sql); 
            // a instrução é instanciada passando como parametro a instrução sql definida anteriormente
            pstm.setString(1,objclientdto.getSituacaocad());
            pstm.setString(2,objclientdto.getEmail());
            pstm.setString(3, objclientdto.getNome());
            pstm.setString(4,objclientdto.getSobrenome());
            pstm.setString(5, objclientdto.getTel_fixo());
            pstm.setString(6, objclientdto.getTel_celular());
            
            // em seguida o comando é executado e logo apos o banco é desconectado
            pstm.execute();
        } catch (SQLException e) {
            // caso não esteja correta a instrução um erro e indicado em uma tela de aviso
            JOptionPane.showMessageDialog(null, "Cliente" + e);
        }finally{
            pstm.close();
        }
            
    }
    
    // metodo criado para executar a função de listagem dos clientes  por meio de uma pesquisa no banco na tabela cliente
     public ArrayList<ClienteDTO> PesquisarCliente() throws SQLException{
         
        // string criada para receber o comando de mysql que buscara todos os registros da tabela
        String sql = "select * from cliente";
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
                ClienteDTO objclientedto = new ClienteDTO();
                objclientedto.setSituacaocad(rs.getString("situacaocad"));
                objclientedto.setEmail(rs.getString("email"));
                objclientedto.setNome(rs.getString("nome"));
                objclientedto.setSobrenome(rs.getString("sobrenome"));
                objclientedto.setTel_celular(rs.getString("tel_fixo"));
                objclientedto.setTel_fixo(rs.getString("tel_celular"));
                
                lista.add(objclientedto);
            }
            
            
            
        } catch (SQLException erro) {// tratamento de erro no banco  indicando problemas na conexão.
            JOptionPane.showMessageDialog(null, "Erro AutorDAO Pesquisar" + erro);
        }finally{
            // por fim a conexão é encerrada
            pstm.close();
        }
        return lista;//por fim o metodo retorna a lista que recebeu o objeto DTO no laço while
    }
     
    //metodo para realizar pesquisas ao digitar no campo 
    public void pesquisaCliente(String sql,JTable tabela) throws SQLException{
        // é feita a conexão com o banco por meio da variavel conn
        conn = new ConexaoDAO().conectaBD();
        
        // um bloco de tratamento é utilizado  e inicia-se uma conexão que recebe como parametro
        try
        {
            // em prepare statement que envia as instruções sql para o banco
            // em seguida essa instrução é executada e logo apos recebe uma execução da query dentro do resulset
            pstm = conn.prepareCall(sql);
            pstm.execute();
            
            // o resultset funciona como uma representação da tabela do banco podendo ser acessado as colunas por meio dele
            rs = pstm.executeQuery();
            
            // uma tabela é declarada para que seja feita a recepção dos dados pesquisados  em cada linha resultante da pesquisa no banco
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);//inicializar do primeiro elemento da tabela
            
            
            //tratamento de data caso seja necessario 
            //DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            while(rs.next())// o laço roda por todo o resultset e em seguida adiciona uma nova linha com todos os dados buscados presentes no banco
            {
                 // o metodo get string recebe uma string como o nome exato da coluna no banco
                model.addRow(new Object[] 
                {
                    rs.getString("situacaocad"),
                    rs.getString("email"),
                    rs.getString("nome"), 
                    rs.getString("sobrenome"),
                    rs.getString("tel_fixo"),
                    rs.getString("tel_celular")
                });
            }
  
        }
        catch(SQLException ex)// uma mensagem de erro é informada caso não seja encontrado os dados buscados.
        {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Erro:" + ex);
        }finally{
            // por fim a conexão é encerrada
            pstm.close();
        }
        
    }
    
    // metodo para atualizar informações no banco possui 3 parametros indicando os campos que receberam as modificações realizada pelo usuario
     public void alterar(JRadioButton rbnCpf,JRadioButton rbnCnpj,JTextField campoemail,JTextField camponome,JTextField camposobrenome,JTextField campotelfixo,JTextField campotelcel,JTextField campocpf,JTextField campocnpj,JTextField campositcad) throws SQLException{
         // uma string para dar a instrução sql ao banco  nesse caso uma instrução para atualizar colunas em uma coluna especifica onde o id for igual ao digitado pelo usuario
         String sql = "UPDATE cliente set  email=?, nome =?,sobrenome = ?,tel_fixo=?,tel_celular=?,situacaocad=? WHERE situacaocad = ?";
         
         // variavel conn usada para instanciar a conexão DAO e em seguida conectar-se ao banco
         conn = new ConexaoDAO().conectaBD();
         
         // no bloco de tratamento um a variavel de preparestatement e declarada e em seguida recebe uma instancia de preparação de instrução 
         // tem como parametro a string sql
         try {
             // em seguida as colunas recebem os novos valores digitados com os parametros indicando a posição da coluna e o campo de onde esta sendo pego o valor
             pstm = conn.prepareStatement(sql);
             pstm.setString(1,campoemail.getText());
             pstm.setString(2,camponome.getText());
             pstm.setString(3,camposobrenome.getText());
             pstm.setString(4,campotelfixo.getText());
             pstm.setString(5,campotelcel.getText());
             if(rbnCpf.isSelected()==true){
                 pstm.setString(6,campocpf.getText());
             }else if (rbnCnpj.isSelected()== true){
                 pstm.setString(6,campocnpj.getText());
             }
             pstm.setString(7, campositcad.getText());
             // o comando execute update realiza a atualização das informações no banco e em seguida a conexão e fechada
             pstm.executeUpdate();
         } catch (SQLException e) { // uma mensagem de erro será informada caso a conexão não seja bem sucedida ou haja algum problema com a instrução sql
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados do banco. Erro:" + e); 
         }finally{
            pstm.close();
         }
     }
     
    // metodo para consultar a coluna onde será feita a alteração , possui parametros que indicam os campos de texto onde serão feitas as alterações
    public void consultar(JTextField campobusca,JTextField camponome,JTextField camposobrenome,JTextField campositcad,JTextField campoemail,JTextField campotelfixo,JTextField campotelcelular) throws SQLException{
         // string sql onde será feita uma consulta na tabela indicada e em seguida buscara de acordo com o atributo indicado pelo usuario no campo de busca
        // nesse caso foi utilizado o id do usuario para ser feita a consulta , por ser um registro unico
        String sql = "SELECT * FROM cliente WHERE nome = ? OR sobrenome =?";
        // uma conexão é feita no banco utilizando o metodo conectaBD
        conn = new ConexaoDAO().conectaBD();
        try {
            
            // a variavel de preparação recebe a conexão com a instrução que é enviada ao banco
           pstm= conn.prepareStatement(sql);
           // em seguida é setado por meio do parametro que indica a exata posição do campo indicado que recebera o que o usuario digitar
           pstm.setString(1, campobusca.getText());
           pstm.setString(2, campobusca.getText());
           // logo apos a query é executada  em um resultset
           rs=pstm.executeQuery();
            if (rs.next()) { // o result set é consultado ate o ultimo campo e recebe os valores armazenados no banco
                camponome.setText(rs.getString(3));
                camposobrenome.setText(rs.getString(4));
                campositcad.setText(rs.getString(1));
                campoemail.setText(rs.getString(2));
                campotelfixo.setText(rs.getString(5));
                campotelcelular.setText(rs.getString(6));
            } else { // caso não seja retornado nenhum resultado  uma mensagem indicando isso ao usuario é retornada e logo em seguida os campos são limpos para uma nova busca
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
                    //campos recebem uma string vazia como valor e são resetados
                    campobusca.setText("");
                    campoemail.setText("");
                    camponome.setText("");
                    campositcad.setText("");
                    campotelfixo.setText("");
                    campotelcelular.setText("");
            }
        } catch (SQLException e) { // caso haja algum problema na instrução sql um erro e indicando em uma janela
            JOptionPane.showMessageDialog(null, "Erro na conexão de Cliente. Erro:" + e);
        }finally{
            pstm.close();
        }
    }
    
     // metodo para excluir um registro do banco
    public void excluirCliente(ClienteDTO objcliente) throws SQLException{ //o metodo recebe como parametro o objeto dto do autor 
        // um string sql indicando o a instrução é feita com a função de apagar uma linha em que o id seja igual ao digitado
        String sql = "DELETE from cliente where situacaocad = ?";
        
        // é feita uma conexão com o banco atraves da variavel conn e em seguida o metodo conectBD é instanciado
        conn = new ConexaoDAO().conectaBD();
        
        try {
          
           // logo em seguida o o statement recebe a conexãoe prepara a instrução sql que será recebia e executada pelo banco
          pstm = conn.prepareStatement(sql);
          
          //um valor inteiro é setado e recupera o valor do id no objeto autor
          pstm.setString(1, objcliente.getSituacaocad()); 
          
          //a instrução é executada  e em seguida a conexão é encerrada
          pstm.execute();
        } catch (SQLException e) { // caso haja algum problema na instrução sql um erro e indicando em uma janela
            JOptionPane.showMessageDialog(null, "Erro na conexão de Autor. Erro:" + e);
        }finally{
            pstm.close();
        }
        
    }
}
