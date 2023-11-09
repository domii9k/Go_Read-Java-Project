package DAO;

/**
 *
 * @author Grupo em conjunto cada membro fez uma tela.
 */
import DTO.EbookDTO;
import DTO.EditoraDTO;
import DTO.PedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class PedidoDAO {

    //classe Pedido para inserir, listar, alterar e excluir pedidos
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public PedidoDAO() {
        this.conn = new ConexaoDAO().conectaBD();
    }

    /**
     *
     * @param pedidodto
     * @throws SQLException Método sql para cadastrar o pedido no banco.
     */
    public void CadPedido(PedidoDTO pedidodto) throws SQLException {
        String sql = "INSERT INTO PEDIDO ("
                + "DATA, VALOR_TOTAL, FORMA_PAG, situacaocad_cliente, observacoes"
                + ") VALUES ("
                + "?,?,?,?,?"
                + ")";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setDate(1, pedidodto.getData());
            pstm.setFloat(2, pedidodto.getValor_total());
            pstm.setString(3, pedidodto.getForma_pag());
            pstm.setString(4, pedidodto.getSituacaocad_cliente());
            pstm.setString(5, pedidodto.getObservacoes());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: Cadastrar Pedido."
                    + "\nContate o administrador. \n" + e);
        } finally {
            pstm.close();
        }

    }//fim cadpedido

    /**
     *
     * @return método de retorno do id do último pedido cadastrado, para que o
     * itempedido consiga pegar esse id como chave estrangeira e, assim,
     * conseguir cadastrar os itens
     */
    public int retornaUltimoPedido() {
        try {
            int ultimoPedido = 0;// variavel inteira que recebera o valor do id do ultimo pedido
            String sql = "SELECT max(id) id FROM pedido"; // comando sql que chama o id do ultimo pedido
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) { 
                PedidoDTO pdto = new PedidoDTO();
                pdto.setId_pedido(rs.getInt("id")); // aqui ele chama esse id 
                ultimoPedido = pdto.getId_pedido();

            }
            return ultimoPedido; // retornanco a variavel com o valor do id
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//fim do método retornaUltimoPedido

    /**
     *
     * @param txtEbook
     * @param table
     * @throws SQLException Método de pesquisa de ebook, recebendo como
     * parametros um txtfield e uma jtable
     */
    public void pesquisarEbook(JTextField txtEbook, JTable table) throws SQLException {

        String sql = "select isbn as Isbn, titulo as Titulo,valor_unit as Preço, editora_cnpj as Editora "
                + "from ebook WHERE titulo LIKE ? OR isbn LIKE ?"; // selecionando colunas específicas que quero chamar

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtEbook.getText() + "%"); // enquanto for digitado, a pesquisa busca um dado mais compativel
            pstm.setString(2, txtEbook.getText() + "%");
            rs = pstm.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));// os ebooks pesquisados serão atribuídos para essa tabela
            // o resultSet joga os dados pesquisados para a tabela criada.

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: pesquisarEbook. \n"
                    + " Contate o administrador. \n" + e);
        } finally {
            pstm.close();
        }
    }

    /**
     *
     * @param nome Método para pesquisar ebook e ADICIONAR os itens na tabela de
     * itens
     */
    public void pesquisar(String nome) {
        String sql = "SELECT e.isbn, e.valor_unit, e.titulo, ed.cnpj from ebook as e inner join editora as ed on"
                + " (e.editora_cnpj*ed.cnpj) where e.isbn = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            //juntado as tabelas em uma, para mostrar dados mesclados na tabela de pedido

            pstm = conn.prepareCall(sql);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            EbookDTO edto = new EbookDTO();
            EditoraDTO ed = new EditoraDTO();
            if (rs.next()) {

                edto.setIsbn(rs.getString("e.isbn"));
                edto.setValor_unit(rs.getFloat("e.valor_unit"));
                edto.setTitulo_eb(rs.getString("e.titulo"));
                ed.setCnpj(rs.getString("ed.cnpj"));
                String str = String.valueOf(ed);
                //convertendo o objeto para string, pois de primeira o metodo set (recebe string)
                //do dto nao pode ser convertido para objeto
                edto.setEditora_cnpj(str);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na classe EbookDAO: Conexão com o Banco. \n" + e);
        }
    }

    /**
     * Método de listagem de pedido
     *
     * @param tabela
     */
    public void listarPedido(JTable tabela) throws SQLException {

        String sql = "select id as ID, data as Data , valor_total as Total, forma_pag as Pagamento,  "
                + " situacaocad_cliente as Cliente from pedido";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            pstm.execute();
            rs = pstm.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);//inicializar do primeiro elemento da tabela

            //tratamento de data
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next())//o laço while se mantem  varrendo o resulset e em seguida cada registro encontrado e setado no objeto DTO para transferencias de objetos 
            //que em seguida é armazenado na lista.
            {
                model.addRow(new Object[]{
                    rs.getString("ID"),
                    data.format(rs.getDate("Data")),
                    rs.getString("Cliente"),
                    rs.getString("Pagamento"),
                    rs.getFloat("Total")

                });
            }
        } catch (SQLException e) // tratamento de erro no banco  indicando problemas na conexão.
        {
            JOptionPane.showMessageDialog(null, "Não foi possível obter os dados do banco. Erro: \n" + e);
        } finally {
            // por fim a conexão é encerrada
            pstm.close();
        }
    }

    /**
     *
     * @param txtBuscaPedidoID
     * @param tabela
     * @throws SQLException Método de pesquisa por id do pedido
     */
    public void pesquisarPedidoID(JTextField txtBuscaPedidoID, JTable tabela) throws SQLException {

        String sql = "select id as ID, data as Data , valor_total as Total, forma_pag as Pagamento,  "
                + "situacaocad_cliente as Cliente from pedido WHERE ID LIKE ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtBuscaPedidoID.getText() + "%");
            rs = pstm.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));// os ebooks pesquisados serão atribuídos para essa tabela
            // o resultSet joga os dados pesquisados para a tabela criada.

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            DateFormat data = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next())//o laço while se mantem  varrendo o resulset e em seguida cada registro encontrado e setado no objeto DTO para transferencias de objetos 
            //que em seguida é armazenado na lista.
            {
                model.addRow(new Object[]{
                    rs.getString("ID"),
                    data.format(rs.getDate("Data")),
                    rs.getString("Cliente"),
                    rs.getString("Pagamento"),
                    rs.getFloat("Total")

                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: pesquisarEbook. \n"
                    + " Contate o administrador. \n" + e);
        } finally {
            pstm.close();
        }

    }

    /**
     *
     * @param txtBuscaBuscaPedidoSC
     * @param tabela
     * @throws SQLException Método de pesquisa pela situação cadastral do
     * usuario
     */
    public void pesquisarPedidoSC(JTextField txtBuscaBuscaPedidoSC, JTable tabela) throws SQLException {

        String sql = "select id as ID, data as Data , valor_total as Total, forma_pag as Pagamento,  "
                + "situacaocad_cliente as Cliente from pedido WHERE situacaocad_cliente LIKE ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtBuscaBuscaPedidoSC.getText() + "%");

            rs = pstm.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));// os ebooks pesquisados serão atribuídos para essa tabela
            // o resultSet joga os dados pesquisados para a tabela criada.

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: pesquisarEbook. \n"
                    + " Contate o administrador. \n" + e);
        } finally {
            pstm.close();
        }

    }

    /**
     *
     * @param dto
     * @throws SQLException Método de alteração de pedido
     */
    public void alterarPedido(PedidoDTO dto) throws SQLException {
        String sql = "UPDATE pedido SET data = ? , valor_total= ?, forma_pag=?, situacaocad_cliente = ? , observacoes = ? WHERE id = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setDate(1, dto.getData());
            pstm.setFloat(2, dto.getValor_total());
            pstm.setString(3, dto.getForma_pag());
            pstm.setString(4, dto.getSituacaocad_cliente());
            pstm.setString(5, dto.getObservacoes());
            pstm.setInt(6, dto.getId_pedido());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: Alterar Pedido."
                    + "\nContate o administrador. \n" + e);
        } finally {
            pstm.close();

        }
    }// fim alterar pedido

    /**
     * @param dto Método de exclusão do pedido a partir do comando sql
     */
    public void excluirPedido(PedidoDTO dto) throws SQLException {

        String sql = "DELETE FROM pedido WHERE id LIKE ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, dto.getId_pedido());
            pstm.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: Excluir Pedido. \n" + e);
        } finally {
            pstm.close();
        }
    } // fim método excluir pedido

    /**
     *
     * @param situacaocad
     * @param txtnomecli
     * @param txtemailcli
     * @throws SQLException Método sql para selecionar nome e email do cliente
     * ao pesquisar pelo mesmo
     */
    public void buscaCliente(String situacaocad, JTextField txtnomecli, JTextField txtemailcli) throws SQLException {
        String sql = "SELECT nome, email FROM cliente WHERE situacaocad = ?";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, situacaocad);
            rs = pstm.executeQuery();

            while (rs.next()) {// o result set é consultado ate o ultimo campo e recebe os valores armazenados no banco
                txtnomecli.setText(rs.getString("nome"));
                txtemailcli.setText(rs.getString("email"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na classe PedidoDAO: Buscar Cliente. \n" + e);
        } finally {
            pstm.close();
        }

    }
}
