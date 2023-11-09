package VIEW;

//importações
import DAO.ClienteDAO; //importação da classe DAO de cliente
import DTO.ClienteDTO; //importação da classe DTO de cliente
import java.sql.SQLException; // importação para tratamento de erros no sql
import java.util.ArrayList; // importação para uso de listas
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane; // importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTable; // importação para o uso de jtable
import javax.swing.table.DefaultTableModel; // importação para o uso de modelo de tabelas

/**
 * Tela criada para listagem 
 * e busca de registros da tabela cliente do banco
 */

//declaração da classe
public class BuscaClienteVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para inicializar os componentes da tela
     * e metodo para listar os valores da tabela de clientes
     * Creates new form telaBuscaCliente
     */
    public BuscaClienteVIEW() {
        initComponents();
        listarValores(tblListaBuscarCliente); //metodo para listagem de clientes
    }
    
    // variaveis utilizadas para movimentação da tela na area de trabalho 
    int x,y;
    
    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     * ATENÇÃO: NÃO modifique este código. O conteúdo deste método é sempre
     * regenerado pelo Editor de formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpaneSupBuscaCliente = new javax.swing.JPanel();
        lblConsultCliente = new javax.swing.JLabel();
        lblFecharTelaCliente = new javax.swing.JLabel();
        jdeskAreaImagemClientes = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblBuscaCpf_cnpj = new javax.swing.JLabel();
        txtBuscaCpfCnpj = new javax.swing.JTextField();
        txtBuscaNomeCliente = new javax.swing.JTextField();
        lblBuscaNomeCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaBuscarCliente = new javax.swing.JTable();
        lblFundoImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpaneSupBuscaCliente.setBackground(new java.awt.Color(30, 34, 60));

        lblConsultCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblConsultCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultCliente.setText("BUSCAR CLIENTES");

        lblFecharTelaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupBuscaClienteLayout = new javax.swing.GroupLayout(jpaneSupBuscaCliente);
        jpaneSupBuscaCliente.setLayout(jpaneSupBuscaClienteLayout);
        jpaneSupBuscaClienteLayout.setHorizontalGroup(
            jpaneSupBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupBuscaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                .addComponent(lblFecharTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupBuscaClienteLayout.setVerticalGroup(
            jpaneSupBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupBuscaClienteLayout.createSequentialGroup()
                .addGroup(jpaneSupBuscaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaCliente)
                    .addGroup(jpaneSupBuscaClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsultCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpaneSupBuscaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jdeskAreaImagemClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Área de Busca");
        jdeskAreaImagemClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        lblBuscaCpf_cnpj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaCpf_cnpj.setText("CPF/CNPJ:");
        jdeskAreaImagemClientes.add(lblBuscaCpf_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 20));

        txtBuscaCpfCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaCpfCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaCpfCnpjKeyTyped(evt);
            }
        });
        jdeskAreaImagemClientes.add(txtBuscaCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 250, 20));

        txtBuscaNomeCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaNomeClienteKeyTyped(evt);
            }
        });
        jdeskAreaImagemClientes.add(txtBuscaNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 230, 20));

        lblBuscaNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaNomeCliente.setText("Nome:");
        jdeskAreaImagemClientes.add(lblBuscaNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        tblListaBuscarCliente.setBackground(new java.awt.Color(204, 204, 204));
        tblListaBuscarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cpf/Cnpj", "Email", " Nome", "Sobrenome", "Tel_fixo", "Tel_celular"
            }
        ));
        tblListaBuscarCliente.setGridColor(new java.awt.Color(204, 204, 204));
        tblListaBuscarCliente.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblListaBuscarCliente);

        jdeskAreaImagemClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 520, 360));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaBuscaAtt.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jdeskAreaImagemClientes.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        getContentPane().add(jdeskAreaImagemClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        setSize(new java.awt.Dimension(691, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     //metodo pra definir ação do botão de fechar da tela
    private void lblFecharTelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaClienteMouseClicked
        // fecha essa tela ao clicar no icone de x
        dispose();
    }//GEN-LAST:event_lblFecharTelaClienteMouseClicked

    //metodo para definir as cordenadas da tela no espaço onde esta localizada ao pressionar o mouse
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // variaveis recebem as coordenadas
        x = evt.getX();//Retorna a posição x horizontal do evento em relação ao componente de origem.
        y = evt.getY();//Retorna a posição vertical y do evento em relação ao componente de origem.
    }//GEN-LAST:event_formMousePressed

    //metodo para definir as cordenadas da tela no espaço onde esta localizada ao arrastar o mouse
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
         // outras variaveis são criadas para pegar o valor das cordenadas na tela
        int xx = evt.getXOnScreen();//Retorna a posição x horizontal absoluta do evento.
        int yy = evt.getYOnScreen();//Retorna a posição y vertical absoluta do evento.
        this.setLocation(xx-x,yy-y);//Move este componente para um novo local.
    }//GEN-LAST:event_formMouseDragged

    //metodo para realizar busca a cada caractere digitado 
    private void txtBuscaCpfCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaCpfCnpjKeyTyped
        // pesquisa pelo cpf ou cnpj
        // uma instrução sql é declarada em uma string
        //buscar na tabela cliente onde o cpf ou cnpj do cliente for igual ao digitado
        String sql = "SELECT * FROM cliente WHERE situacaocad LIKE '%"
        + txtBuscaCpfCnpj.getText() //o conteudo digitado no campo de texto é inserido na instrução
        + "%'";
        // o objeto da classe dao de cliente é declarado para que a função de pesquisa seja utilizada
        ClienteDAO objbusca = new ClienteDAO();
        try {// o metodo de busca acontece em um bloco de tratamento
            objbusca.pesquisaCliente(sql,tblListaBuscarCliente);
             // o metodo de pesquisa recebe a instrução armazenada na string e a tabela desta tela como parametros
        } catch (SQLException ex) { // caso haja um erro na conexão com o banoco ele será tratado
             /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
            Logger.getLogger(BuscaClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaCpfCnpjKeyTyped

    private void txtBuscaNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeClienteKeyTyped
         // pesquisa pelo nome do cliente
         // uma instrução sql é declarada em uma string
         //buscar na tabela cliente onde o nome ou sobrenome do cliente for como o digitado
        String sql = "SELECT * FROM cliente WHERE nome  LIKE '%" 
                + txtBuscaNomeCliente.getText()//o conteudo digitado no campo de texto e inserido na instrução
                + "%' OR sobrenome LIKE '%"
                + txtBuscaNomeCliente.getText()//o conteudo digitado no campo de texto e inserido na instrução
                + "%'";
        //o objeto da classe dao de cliente é declarado para que a função de pesquisa seja utilizada
        ClienteDAO objbusca = new ClienteDAO();
        try {// o metodo de busca acontece em um bloco de tratamento
            objbusca.pesquisaCliente(sql,tblListaBuscarCliente);
             // o metodo de pesquisa recebe a instrução armazenada na string e a tabela desta tela como parametros
        } catch (SQLException ex) {
            /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
            Logger.getLogger(BuscaClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaNomeClienteKeyTyped

    /**
     * metodo principal responsavel pela execução da tela
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscaClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaClienteVIEW().setVisible(true);
            }
        });
    }

    //variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdeskAreaImagemClientes;
    private javax.swing.JPanel jpaneSupBuscaCliente;
    private javax.swing.JLabel lblBuscaCpf_cnpj;
    private javax.swing.JLabel lblBuscaNomeCliente;
    private javax.swing.JLabel lblConsultCliente;
    private javax.swing.JLabel lblFecharTelaCliente;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JTable tblListaBuscarCliente;
    private javax.swing.JTextField txtBuscaCpfCnpj;
    private javax.swing.JTextField txtBuscaNomeCliente;
    // End of variables declaration//GEN-END:variables

    //metodos para realizar ações ao clicar no botão
     private void listarValores(JTable tabela){ // metodo para listar valores em uma tabela
        
        //um bloco de tratamento é utilizado para um possivel erro na listagem de valores
        try {
            // o objeto da classe de conexões é criado
            ClienteDAO objautordao = new ClienteDAO();
            
            // em seguida um objeto de modelo de tabela e criado para receber a tabela da tela
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            
            // uma lista é criada para receber o objeto da classe de conexão criado anteriormente 
            // é instanciando o metodo pesquisar
            ArrayList<ClienteDTO> lista = objautordao.PesquisarCliente();
            
            // em seguida uma busca é realizada utilizado o laço for para percorrer a lista 
            // os dados são capturados e adicionados em uma linha da tabela de acordo com a posição que pertencem
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getSituacaocad(),
                    lista.get(num).getEmail(),
                    lista.get(num).getNome(),
                    lista.get(num).getSobrenome(),
                    lista.get(num).getTel_fixo(),
                    lista.get(num).getTel_celular()
                });
            }
            
            // caso não funcione um erro retorna avisando o problema detectado
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar valores de Autor: " + erro);
        }
    }

}
