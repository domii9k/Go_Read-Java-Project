package DAO;

import DTO.LoginDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 * Classe para execução de login  do usuario ao entrar no sistema
 * @author Grupo em conjunto cada membro fez uma tela.
 */
public class LoginDAO {
    
    Connection conn; // variavel de conexão
    PreparedStatement pstm; // variavel de preparação para a conexão
    ResultSet rs;// variavel para receber Uma tabela de dados que representa um conjunto de resultados de banco de dados, 
    //que geralmente é gerado pela execução de uma instrução que consulta o banco de dados.
    
    // metodo criado para executar a função de cadastro de uma tabela no banco com o parametro que indica de onde estão vindo os dados
    public ResultSet autenticacaoUsuario(LoginDTO objLoginDTO){
     
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql ="select * from usuario where nome_usuario = ? and senha = ? "; 
            pstm = conn.prepareStatement(sql); 
            // a instrução é instanciada passando como parametro a instrução sql definida anteriormente
            pstm.setString(1,objLoginDTO.getNome_Login());
            pstm.setString(2,objLoginDTO.getSenha_Login());
            
            // a instrução é executada e em seguida os resultados são retornados
            rs = pstm.executeQuery();
            return rs;
                    
        } catch (SQLException e) { 
            // caso não esteja correta a instrução um erro e indicado em uma tela de aviso
            JOptionPane.showMessageDialog(null, "Nome de usuario ou senha estão incorretos!!" + e);
            return null; // por fim um valor nulo é retornado caso não estejam corretas as informações
        }
            
    }
}
    
     