package DAO;
 // classe de conexao do banco
import java.sql.Connection; // importação para conexão sql com o banco mysql
import javax.swing.JOptionPane; // importação para emissão de mensagens por telas 
import java.sql.DriverManager; // importação para gerenciamenteo do driver de conexão do banco
import java.sql.SQLException; // tratamento de erros em sql
/**
 * Classe responsavel pelo acesso e conexão com o banco
 * 
 */
public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conn = null; // variavel declarada e incializada para conexao do banco
        
        try{ // bloco de tratamento por onde acontece a conxeão do banco com o sistema
            //variavel string para receber o endereço de conexao do banco de dados
            //a primeira ´parte indica o local / seguido do nome do banco ? nome de usuario utilizado no banco e senha do banco
            String url ="jdbc:mysql://localhost:3306/go_read?user=root&password="; 
            conn = DriverManager.getConnection(url);
            // é atribuida a variavel conn a classe driver manager com instancia do metodo getconnection que recebe como parametro a string url
            // o driver manager gerencia o drive de conexão do banco de dados que nesse caso é o jdbc
            // o metodo getconnection recebe string url e conecta o banco de acordo com o endereço armazenado na variavel url
        }catch(SQLException erro){ // tratamento de erro caso haja problemaas na conexão com o banco
            JOptionPane.showMessageDialog(null,"Erro na conexão com o banco, verifique se o endereço foi digitado corretamente" + erro.getMessage()); //indica o um erro no banoc de dados
        }
        return conn; // retorna a variavel da conexão
    }
            
}

// sobre a divisão do pacotes:

//DTO transferencias de valores de atributos do e metodos de acesso 
//DAO metodos e conexões com o banco 
//VIEW interface gráfica e componentes visuais externos
