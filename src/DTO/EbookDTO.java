package DTO;

import java.sql.Date;

/**
 * atributos e metodos de acesso e transferencia  para 
 * a tabela ebook.
 */
public class EbookDTO {

    private String titulo_eb, isbn, editora_cnpj, autor_id, categoria;
    private Date ano_publicacao;
    private int quantidade_paginas;
    private float peso_arquivo, valor_unit;

    /**
     * @return the titulo_eb
     */
    public String getTitulo_eb() {
        return titulo_eb;
    }

    /**
     * @param titulo_eb the titulo_eb to set
     */
    public void setTitulo_eb(String titulo_eb) {
        this.titulo_eb = titulo_eb;
    }


    /**
     * @return the quantidade_paginas
     */
    public int getQuantidade_paginas() {
        return quantidade_paginas;
    }

    /**
     * @param quantidade_paginas the quantidade_paginas to set
     */
    public void setQuantidade_paginas(int quantidade_paginas) {
        this.quantidade_paginas = quantidade_paginas;
    }

    /**
     * @return the numero_isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the numero_isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the ano_publicacao
     */
    public Date getAno_publicacao() {
        return ano_publicacao;
    }

    /**
     * @param ano_publicacao the ano_publicacao to set
     */
    public void setAno_publicacao(Date ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    /**
     * @return the editora_cnpj
     */
    public String getEditora_cnpj() {
        return editora_cnpj;
    }

    /**
     * @param editora_cnpj the editora_cnpj to set
     */
    public void setEditora_cnpj(String editora_cnpj) {
        this.editora_cnpj = editora_cnpj;
    }

    /**
     * @return the autor_id
     */
    public String getAutor_id() {
        return autor_id;
    }

    /**
     * @param autor_id the autor_id to set
     */
    public void setAutor_id(String autor_id) {
        this.autor_id = autor_id;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the peso_arquivo
     */
    public float getPeso_arquivo() {
        return peso_arquivo;
    }

    /**
     * @param peso_arquivo the peso_arquivo to set
     */
    public void setPeso_arquivo(float peso_arquivo) {
        this.peso_arquivo = peso_arquivo;
    }

    /**
     * @return the valor_unit
     */
    public float getValor_unit() {
        return valor_unit;
    }

    /**
     * @param valor_unit the valor_unit to set
     */
    public void setValor_unit(float valor_unit) {
        this.valor_unit = valor_unit;
    }

}
