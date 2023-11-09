package DAO;

//imports necessários para conexão entre classes e acesso a bibliotecas do sistema.
import DAO.ConexaoDAO;
import DTO.ItemPedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo em conjunto cada membro fez uma tela.
 */
public class ItemPedidoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    /**
     *
     * @param itempedidodto
     * @throws SQLException Método de exclusão do item pedido dentro da tabela
     * de itempedido
     *
     */
    public void excluirItemPedido(ItemPedidoDTO itempedidodto) throws SQLException {

        String sql = "DELETE itempedido FROM itempedido\n"
                + "INNER JOIN pedido ON itempedido.fk_pedido = pedido.id where itempedido.fk_pedido = ?";

        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, itempedidodto.getPedidodto().getId_pedido());
            pstm.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ItemPedidoDAO: excluirItemPedido. \n" + e);
        } finally {
            pstm.close();
        }
    }// fim excluir itempedido


    /**
     *
     * @param itemdto
     * @throws SQLException Método para cadastrar os itens na tabela
     * "itempedido" do banco de dados
     */
    public void cadastrarItemPedido(ItemPedidoDTO itemdto) throws SQLException {

        String sql = "INSERT INTO itempedido (preco_vendido, qtd_copias, ebook_isbn, fk_pedido) VALUES (?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setFloat(1, itemdto.getPreco_vendido());
            pstm.setInt(2, itemdto.getQtd_copias());
            pstm.setString(3, itemdto.getEbookdto().getIsbn());
            pstm.setInt(4, itemdto.getPedidodto().getId_pedido());
            pstm.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na classe ItemPedidoDAO: CadItens. \n" + e);

        } finally {
            pstm.close();

        }
    }//fim metodo cadastra itens

    public void setarItemPePedido(JTable tabela, int dto, JFormattedTextField situacaocad, JTextField data, JTextField valorT, JTextArea obs) throws SQLException {

        String sql = "select ip.ebook_isbn, ip.preco_vendido , ip.qtd_copias, e.titulo, e.valor_unit, p.situacaocad_cliente, p.data, p.valor_total, p.observacoes from itempedido as ip inner join ebook as e on ip.ebook_isbn = e.isbn inner join pedido as p on p.id = ip.fk_pedido where p.id = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            pstm.setInt(1, dto);
            pstm.execute();
            rs = pstm.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);//inicializar do primeiro elemento da tabela

            //tratamento de data
            DateFormat dataA = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next())//o laço while se mantem  varrendo o resulset e em seguida cada registro encontrado e setado no objeto DTO para transferencias de objetos 
            //que em seguida é armazenado na lista.
            {
                model.addRow(new Object[]{
                    rs.getString("ip.ebook_isbn"),
                    rs.getString("e.titulo"),
                    rs.getString("ip.qtd_copias"),
                    rs.getString("e.valor_unit"),
                    rs.getString("ip.preco_vendido"),});
                
                situacaocad.setText(rs.getString("p.situacaocad_cliente"));
                data.setText(dataA.format(rs.getDate("p.data")));
                valorT.setText(Float.toString(rs.getFloat("p.valor_total")));
                obs.setText(rs.getString("p.observacoes"));
            }

        } catch (SQLException e) // tratamento de erro no banco  indicando problemas na conexão.
        {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Erro: \n" + e);
        } finally {
            // por fim a conexão é encerrada
            pstm.close();
        }
    }

} //fim classe itemPedidoDAO
