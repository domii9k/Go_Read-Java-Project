package DTO;

import DTO.EbookDTO;

/**
 *
 * @author Grupo em conjunto cada membro fez uma tela.
 * Classe DTO (modelo) para encapsulamento dos atributos
 */
public class ItemPedidoDTO {

    private int id_itemPedido, qtd_copias;
    private float preco_vendido;
    private String ebook_isbn;
    private PedidoDTO pedidodto;
    private EbookDTO ebookdto;

    /**
     * @return the id_itemPedido
     */
    public int getId_itemPedido() {
        return id_itemPedido;
    }

    /**
     * @param id_itemPedido the id_itemPedido to set
     */
    public void setId_itemPedido(int id_itemPedido) {
        this.id_itemPedido = id_itemPedido;
    }

    /**
     * @return the qtd_copias
     */
    public int getQtd_copias() {
        return qtd_copias;
    }

    /**
     * @param qtd_copias the qtd_copias to set
     */
    public void setQtd_copias(int qtd_copias) {
        this.qtd_copias = qtd_copias;
    }

    /**
     * @return the preco_vendido
     */
    public float getPreco_vendido() {
        return preco_vendido;
    }

    /**
     * @param preco_vendido the preco_vendido to set
     */
    public void setPreco_vendido(float preco_vendido) {
        this.preco_vendido = preco_vendido;
    }

    /**
     * @return the ebook_isbn
     */
    public String getEbook_isbn() {
        return ebook_isbn;
    }

    /**
     * @param ebook_isbn the ebook_isbn to set
     */
    public void setEbook_isbn(String ebook_isbn) {
        this.ebook_isbn = ebook_isbn;
    }

    /**
     * @return the pedidodto
     */
    public PedidoDTO getPedidodto() {
        return pedidodto;
    }

    /**
     * @param pedidodto the pedidodto to set
     */
    public void setPedidodto(PedidoDTO pedidodto) {
        this.pedidodto = pedidodto;
    }

    /**
     * @return the ebookdto
     */
    public EbookDTO getEbookdto() {
        return ebookdto;
    }

    /**
     * @param ebookdto the ebookdto to set
     */
    public void setEbookdto(EbookDTO ebookdto) {
        this.ebookdto = ebookdto;
    }

}
