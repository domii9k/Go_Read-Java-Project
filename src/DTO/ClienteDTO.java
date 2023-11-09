package DTO;

/**
 * atributos e metodos de acesso e transferencia  para 
 * a tabela cliente.
 */
public class ClienteDTO {
 
private String situacaocad;
private String email;
private String nome;
private String sobrenome;
private String tel_fixo;
private String tel_celular;



    /**
     * @return the situacaocad
     */
    public String getSituacaocad() {
        return situacaocad;
    }

    /**
     * @param situacaocad the situacaocad to set
     */
    public void setSituacaocad(String situacaocad) {
        this.situacaocad = situacaocad;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the tel_fixo
     */
    public String getTel_fixo() {
        return tel_fixo;
    }

    /**
     * @param tel_fixo the tel_fixo to set
     */
    public void setTel_fixo(String tel_fixo) {
        this.tel_fixo = tel_fixo;
    }

    /**
     * @return the tel_celular
     */
    public String getTel_celular() {
        return tel_celular;
    }

    /**
     * @param tel_celular the tel_celular to set
     */
    public void setTel_celular(String tel_celular) {
        this.tel_celular = tel_celular;
    }



}
