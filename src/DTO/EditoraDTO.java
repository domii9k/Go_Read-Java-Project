package DTO;

/**
 * atributos e metodos de acesso e transferencia  para 
 * a tabela editora.
 */
public class EditoraDTO {
    
private String cnpj;
private String razao_social;
private String tel_fixo;
private String cep;

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razao_social
     */
    public String getRazao_social() {
        return razao_social;
    }

    /**
     * @param razao_social the razao_social to set
     */
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
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
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }


}
