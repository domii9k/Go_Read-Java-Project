package DTO;

/**
 * atributos e metodos de acesso e transferencia  para 
 * a tabela autor.
 */
public class AutorDTO {
    
private int id_autor;
private String nome_autor;
private String sobrenome_autor;

    /**
     * @return the id_autor
     */
    public int getId_autor() {
        return id_autor;
    }

    /**
     * @param id_autor the id_autor to set
     */
    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    /**
     * @return the nome_autor
     */
    public String getNome_autor() {
        return nome_autor;
    }

    /**
     * @param nome_autor the nome_autor to set
     */
    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    /**
     * @return the sobrenome_autor
     */
    public String getSobrenome_autor() {
        return sobrenome_autor;
    }

    /**
     * @param sobrenome_autor the sobrenome_autor to set
     */
    public void setSobrenome_autor(String sobrenome_autor) {
        this.sobrenome_autor = sobrenome_autor;
    }

    

}
