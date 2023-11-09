package DAO;

import DTO.EbookDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe com metodos de funções e conexões  com o banco
 * para a tabela ebook.
 * @author Grupo em conjunto cada membro fez uma tela.
 */
public class EbookDAO {
    
    Connection conn; // variavel de conexão
    PreparedStatement pstm; // variavel de preparação para a conexão
    ResultSet rs;// variavel para receber Uma tabela de dados que representa um conjunto de resultados de banco de dados, 
    //que geralmente é gerado pela execução de uma instrução que consulta o banco de dados.
    
 
    // metodo criado para executar a função de cadastro de uma tabela no banco com o parametro que indica de onde estão vindo os dados
    public void cadastrarEbook(EbookDTO objebookdto) throws SQLException{
        /*variavel criada para executar a instrução de inserção de dados no banco, 
        com os nomes das colunas e em seguida com os valores sendo representados pelos sinais de interrogação*/
        
        String sql ="insert into ebook (isbn,valor_unit,titulo,peso_arquivo,qtd_pag,ano_publicacao,editora_cnpj,autor_id,categoria) values (?,?,?,?,?,?,?,?,?)"; 
        
        // a variavel de conexão instancia um metodo de conexão com o banco
        conn = new ConexaoDAO().conectaBD();
        
        try {
            if(objebookdto.getAutor_id()== null && objebookdto.getEditora_cnpj()==null){
            JOptionPane.showMessageDialog(null, "Erro, nenhum autor ou editora foram cadastrados ainda!!");
            }else{
                // a variavel de preparação recebe os valores digitados nos campos do cadastro 
            pstm = conn.prepareStatement(sql); 
            // a instrução é instanciada passando como parametro a instrução sql definida anteriormente
           
            pstm.setString(1,objebookdto.getIsbn());
            pstm.setFloat(2,objebookdto.getValor_unit());
            pstm.setString(3, objebookdto.getTitulo_eb());
            pstm.setFloat(4,objebookdto.getPeso_arquivo());
            pstm.setInt(5, objebookdto.getQuantidade_paginas());
            pstm.setDate(6, objebookdto.getAno_publicacao());
            pstm.setString(7, objebookdto.getEditora_cnpj());
            pstm.setString(8, objebookdto.getAutor_id());
            pstm.setString(9, objebookdto.getCategoria());
            
            // em seguida o comando é executado e logo apos o banco é desconectado
            pstm.execute();
            }        
        } catch (SQLException e) {
            // caso não esteja correta a instrução um erro e indicado em uma tela de aviso
            JOptionPane.showMessageDialog(null, "Ebook" + e);
        }finally{
            pstm.close();
        }
            
    }
    
    // no ebook foi utlizado um metodo um pouco diferente para listar os registros com o parametro direto da tabela na tela  de listar ebooks
    public void listarItens(JTable tabela) throws SQLException{
        
        // string criada para receber o comando de mysql que buscara todos os registros da tabela
        String sql = "select * from ebook";
        // variavel conn é criada  e se inicia uma conexão instanciando o metodo para conectar com o banco a partir da classe de conexão
        conn = new ConexaoDAO().conectaBD();
        
        // um bloco de tratamento é executado e então é declarada a variavel pstm do tipo preparedstatement
        try
        {
            // essa variavel recebe a variavel de conexão conn instanciando o prepareStatement recebendo a string sql como parametro
            // esse metodo recebe e armazena a instrução no banco
            pstm = conn.prepareCall(sql);
            pstm.execute();
            
            // a variavel resultset  recebe o pstm agora com o comando sql armazenado e instanciado o comando executeQuery() para que o comando sejá executado
            // no banco
            rs = pstm.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);//inicializar do primeiro elemento da tabela
            
            //tratamento de data
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            
            while(rs.next())//o laço while se mantem  varrendo o resulset e em seguida cada registro encontrado e setado no objeto DTO para transferencias de objetos 
                //que em seguida é armazenado na lista.
            {
                model.addRow(new Object[] 
                {
                    rs.getString("isbn"),
                    rs.getFloat("valor_unit"), 
                    rs.getString("titulo"),
                    rs.getFloat("peso_arquivo"),
                    rs.getInt("qtd_pag"),
                    rs.getString("editora_cnpj"),
                    rs.getString("categoria"),
                    data.format(rs.getDate("ano_publicacao"))
                });
            }
        }
        catch(SQLException ex) // tratamento de erro no banco  indicando problemas na conexão.
        {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Erro:" + ex);
        }finally{
            // por fim a conexão é encerrada
            pstm.close();
        }
    }
   
    /*metodo para realizar pesquisas ao digitar no campo de texto possui 2 parametros , um para receber a instrução sql em string e outro para receber a tabela da tela onde
    será feita a pesquisa*/ 
    public void pesquisaEbook(String sql,JTable tabela) throws SQLException{
        
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
            
            //tratamento de data para que seja convertida a do formato do banco aaaa/mm/dd para o formato comum nacional
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            while(rs.next())// o laço roda por todo o resultset e em seguida adiciona uma nova linha com todos os dados buscados presentes no banco
            {
                model.addRow(new Object[] // o metodo get string recebe uma string como o nome exato da coluna no banco
                {
                    rs.getString("isbn"),
                    rs.getFloat("valor_unit"), 
                    rs.getString("titulo"),
                    rs.getFloat("peso_arquivo"),
                    rs.getInt("qtd_pag"),
                    rs.getString("editora_cnpj"),
                    rs.getString("categoria"),
                    data.format(rs.getDate("ano_publicacao"))
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
    
    //metodo utilizado para atualizar informações do ebook possui um parametro para receber o objto dto e realizar as modificações por meio de transferencia
    public void atualizarDados(EbookDTO livro) throws SQLException
    {
        // variavel conn recebe a instancia de conexão e atraves do metodo conectaBD realiza conexao com o banco
        conn = new ConexaoDAO().conectaBD();//conectando ao banco de dados
        
        // string sql criada para receber a instrução sql responsavel pela atualização das informações digitadas pelo usuario   
        String sql = "UPDATE ebook SET titulo = ?, valor_unit = ?, peso_arquivo = ?,"
                + " qtd_pag = ?, ano_publicacao = ?, categoria = ?" 
                + "WHERE isbn = ?";
 
        // bloco de tratamento onde será feito a passagem de valores para o banco
        try
        {
            // a variavel pstm recebe a variavel conn instanciando preparestatemnt com a instrução armazenada na string sql
            // em seguida são setados valores para cada campo especifico de acordo com o tipo armazenado no banco
            // o numero indica a ordem em que estão digitado os campo na instrução sql , e o outro valor representa o valor 
            //que foi capturado do objeto dto que recebeu por meio de inserção do usuario nos campos indicados os valores que precisam ser digitados
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, livro.getTitulo_eb());
            pstm.setFloat(2, livro.getValor_unit());
            pstm.setFloat(3, livro.getPeso_arquivo());
            pstm.setInt(4, livro.getQuantidade_paginas());
            pstm.setDate(5, livro.getAno_publicacao());
            pstm.setString(6, livro.getCategoria());
            pstm.setString(7, livro.getIsbn()); 
            
            // em seguida o a instrução e executada utilizando o metodo executeUpadte
            pstm.executeUpdate();
            
            // por fim uma mensagem será exibida indicando que os dados foram alterados ou que houve algum erro no banco
            
        }
        catch(SQLException erro) 
        // se algum erro for detecdato ele sera armazenado no parametro erro e em seguida será impresso em um joptionpane
        {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar no banco de dados. Erro: " + erro);
        }
        finally // o bloco finally será executado indpendente de a conexão ser ou não bem sucedida
        {
            pstm.close(); // por fim a conexão será encerrada de qualquer forma
        }
    }
    
    
    
    // metodo para consultar a coluna onde será feita a alteração , possui parametros que indicam os campos de texto onde serão feitas as alterações
    public void consultar(JTextField campobusca,JTextField campoisbn,JTextField campotitulo,JTextField campoqtdpaginas,JTextField campopreco,JTextField campopeso,JComboBox campocategoria,JTextField campoanopub,JTextField campocnpj) throws SQLException{
        String sql = "SELECT * FROM ebook WHERE titulo=?";
        // string sql onde será feita uma consulta na tabela indicada e em seguida buscara de acordo com o atributo indicado pelo usuario no campo de busca
        // nesse caso foi utilizado o isbn do livro e o canpj da editora para ser feita a consulta , por serem registros unicos 
        conn = new ConexaoDAO().conectaBD();
        // uma conexão é feita no banco utilizando o metodo conectaBD
        try {
           // a variavel de preparação recebe a conexão com a instrução que é enviada ao banco 
           pstm= conn.prepareStatement(sql);
            // em seguida é setado por meio do parametro que indica a exata posição do campo indicado que recebera o que o usuario digitar
           pstm.setString(1, campobusca.getText());
           // logo apos a query é executada  em um resultset
           rs=pstm.executeQuery();
           DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
            if (rs.next()) {// o result set é consultado ate o ultimo campo e recebe os valores armazenados no banco
                campopreco.setText(Float.toString(rs.getInt(2)));
                campotitulo.setText(rs.getString(3));
                campoisbn.setText(rs.getString(1));
                campocnpj.setText(rs.getString(7));
                campopeso.setText(Float.toString(rs.getFloat(4)));
                campoqtdpaginas.setText(Integer.toString(rs.getInt(5)));
                campoanopub.setText(data.format(rs.getDate(6)));
                campocategoria.setSelectedItem(rs.getString(9));
            } else {// caso não seja retornado nenhum resultado  uma mensagem indicando isso ao usuario é retornada e logo em seguida os campos são limpos para uma nova busca
                JOptionPane.showMessageDialog(null, "ebook não cadastrado");
                    //campos recebem uma string vazia como valor e são resetados
                    campobusca.setText("");
                    campopreco.setText("");
                    campotitulo.setText("");
                    campopeso.setText("");
                    campoqtdpaginas.setText("");
                    campoanopub.setText("");
                    campoisbn.setText("");
                    campocnpj.setText("");
            }
        } catch (SQLException e) {// caso haja algum problema na instrução sql um erro e indicando em uma janela
            JOptionPane.showMessageDialog(null, "Erro na conexão de Ebook. Erro:" + e);
        }finally{
            pstm.close();
        }
    }
    
    // metodo para excluir um registro do banco
    public void excluirEbook(EbookDTO objebook) throws SQLException{ //o metodo recebe como parametro o objeto dto do autor 
        // um string sql indicando o a instrução é feita com a função de apagar uma linha em que o id seja igual ao inserido em campo
        String sql = "DELETE from ebook where isbn = ? and editora_cnpj=?";
        
        // é feita uma conexão com o banco atraves da variavel conn e em seguida o metodo conectBD é instanciado
        conn = new ConexaoDAO().conectaBD();
        
        try {
          
          // logo em seguida o o statement recebe a conexãoe prepara a instrução sql que será recebia e executada pelo banco
          pstm = conn.prepareStatement(sql);
          
          //um valor inteiro é setado e recupera o valor do id no objeto autor
          pstm.setString(1, objebook.getIsbn());
          pstm.setString(2, objebook.getEditora_cnpj());
          
          //a instrução é executada  e em seguida a conexão é encerrada
          pstm.execute();
        } catch (SQLException e) { // caso haja algum problema na instrução sql um erro e indicando em uma janela
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco e a tabela autor Erro:"+"/n possiveis problemas"
                    + "Erro de integridade no banco ao tentar excluir registros com relacionamentos"
                    + "Erro de instrução SQL comando digitado erroneamente ou nome da tabela digitada errada"
                    + "Erro de conversão de dados para o banco" + e);
        }finally{
          pstm.close();  
        }
    }
}
