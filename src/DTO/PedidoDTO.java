
package DTO;

import java.sql.Date;

/**
 *
 @author Grupo em conjunto cada membro fez uma tela.
 */
public class PedidoDTO {
    private int id_pedido;
    private String forma_pag, observacoes;
    private float Valor_total;
    private Date data;
    private String situacaocad_cliente;

    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the forma_pag
     */
    public String getForma_pag() {
        return forma_pag;
    }

    /**
     * @param forma_pag the forma_pag to set
     */
    public void setForma_pag(String forma_pag) {
        this.forma_pag = forma_pag;
    }
 

    /**
     * @return the Valor_total
     */
    public float getValor_total() {
        return Valor_total;
    }

    /**
     * @param Valor_total the Valor_total to set
     */
    public void setValor_total(float Valor_total) {
        this.Valor_total = Valor_total;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the situacaocad_cliente
     */
    public String getSituacaocad_cliente() {
        return situacaocad_cliente;
    }

    /**
     * @param situacaocad_cliente the situacaocad_cliente to set
     */
    public void setSituacaocad_cliente(String situacaocad_cliente) {
        this.situacaocad_cliente = situacaocad_cliente;
    }
    
}
