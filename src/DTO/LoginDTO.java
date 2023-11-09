package DTO;

/**
 * atributos e metodos de acesso e transferencia  para 
 * a tabela login.
 */
public class LoginDTO {
    
    private int Id_Login;
    private String nome_Login, senha_Login;

    public int getId_Login() {
        return Id_Login;
    }

    public void setId_Login(int Id_Login) {
        this.Id_Login = Id_Login;
    }

    public String getNome_Login() {
        return nome_Login;
    }

    public void setNome_Login(String nome_Login) {
        this.nome_Login = nome_Login;
    }

    public String getSenha_Login() {
        return senha_Login;
    }

    public void setSenha_Login(String senha_Login) {
        this.senha_Login = senha_Login;
    }
}