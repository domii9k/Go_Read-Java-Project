package VIEW;

//importações
import DAO.AutorDAO; //importação para utilizar a classe dao de autor para conexoes com o banco
import DTO.AutorDTO; // imposrtação da classe dto de autor para transferencias de atributos
import java.sql.SQLException; //importação para tratamento de erros sql
import java.util.ArrayList; // importação para utilização de listas
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane;// importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTable;// importação para o uso de jtable
import javax.swing.table.DefaultTableModel;// importação para o uso de modelo de tabelas

/**
 *Tela criada para busca 
 * e listagem de autores.
 */
public class BuscaAutorVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para inicializar componentes da tela
     * e listagem de registros ao abrir a tela
     * Creates new form telaBuscaCliente
     */
    public BuscaAutorVIEW() {
        initComponents();
        listarValores(tblListaBuscarAutor); // metodo para listagem de autores
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtBuscaTituloAutor = new javax.swing.JTextField();
        lblBuscaAutor = new javax.swing.JLabel();
        japaneSupConsultaAutor = new javax.swing.JPanel();
        lblConsultaAutor = new javax.swing.JLabel();
        lblFecharTelaAutor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaBuscarAutor = new javax.swing.JTable();
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

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Área de Busca");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        txtBuscaTituloAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaTituloAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaTituloAutorKeyTyped(evt);
            }
        });
        jDesktopPane1.add(txtBuscaTituloAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, 20));

        lblBuscaAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaAutor.setText("Nome:");
        jDesktopPane1.add(lblBuscaAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, 20));

        japaneSupConsultaAutor.setBackground(new java.awt.Color(30, 34, 60));

        lblConsultaAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblConsultaAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultaAutor.setText("BUSCAR AUTORES");

        lblFecharTelaAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaAutorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout japaneSupConsultaAutorLayout = new javax.swing.GroupLayout(japaneSupConsultaAutor);
        japaneSupConsultaAutor.setLayout(japaneSupConsultaAutorLayout);
        japaneSupConsultaAutorLayout.setHorizontalGroup(
            japaneSupConsultaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(japaneSupConsultaAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultaAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addComponent(lblFecharTelaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        japaneSupConsultaAutorLayout.setVerticalGroup(
            japaneSupConsultaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(japaneSupConsultaAutorLayout.createSequentialGroup()
                .addGroup(japaneSupConsultaAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaAutor)
                    .addGroup(japaneSupConsultaAutorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConsultaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(japaneSupConsultaAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        tblListaBuscarAutor.setBackground(new java.awt.Color(204, 204, 204));
        tblListaBuscarAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Sobrenome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaBuscarAutor.setGridColor(new java.awt.Color(204, 204, 204));
        tblListaBuscarAutor.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblListaBuscarAutor);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 520, 360));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaBuscaAtt.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jDesktopPane1.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        setSize(new java.awt.Dimension(690, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    //metodo pra definir ação do botão de fechar da tela
    private void lblFecharTelaAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaAutorMouseClicked
         // fecha essa tela ao clicar no icone de x
        dispose();
    }//GEN-LAST:event_lblFecharTelaAutorMouseClicked

    //metodo para realizar busca a cada caractere digitado
    private void txtBuscaTituloAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaTituloAutorKeyTyped
        // pesquisa pelo nome ou sobrenome
        // uma instrução sql é declarada em uma string
        //buscar na tabela autor onde o nome ou sobrenome do autor for igual ao digitado
        String sql = "SELECT * FROM autor WHERE nome LIKE '%" 
                + txtBuscaTituloAutor.getText() //o conteudo digitado no campo de texto é inserido na instrução
                + "%' OR sobrenome LIKE '%"
                + txtBuscaTituloAutor.getText()//o conteudo digitado no campo de texto é inserido na instrução
                + "%'";
         // o objeto da classe dao de autor é declarado para que a função de pesquisa seja utilizada
        AutorDAO objbusca = new AutorDAO();
        try {// o metodo de busca acontece em um bloco de tratamento
            objbusca.pesquisaAutor(sql, tblListaBuscarAutor);
             // o metodo de pesquisa recebe a instrução armazenada na string e a tabela desta tela como parametros
        } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
             /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
            Logger.getLogger(BuscaAutorVIEW.class.getName()).log(Level.SEVERE, null,"Erro na busca de autor"+ ex);
        }
    }//GEN-LAST:event_txtBuscaTituloAutorKeyTyped

    /**
     * metodo principal para executar a tela
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
            java.util.logging.Logger.getLogger(BuscaAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaAutorVIEW().setVisible(true);
            }
        });
    }

    // declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel japaneSupConsultaAutor;
    private javax.swing.JLabel lblBuscaAutor;
    private javax.swing.JLabel lblConsultaAutor;
    private javax.swing.JLabel lblFecharTelaAutor;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JTable tblListaBuscarAutor;
    private javax.swing.JTextField txtBuscaTituloAutor;
    // End of variables declaration//GEN-END:variables

    //metodos para inserir ações nos botões
    private void listarValores(JTable tabela){ // metodo para listar valores em uma tabela
        
        //um bloco de tratamento é utilizado para um possivel erro na listagem de valores
        try {
            // o objeto da classe de conexões é criado
            AutorDAO objautordao = new AutorDAO();
            
            // em seguida um objeto de modelo de tabela e criado para receber a tabela da tela
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            
            // uma lista é criada para receber o objeto da classe de conexão criado anteriormente 
            // é instanciando o metodo pesquisar
            ArrayList<AutorDTO> lista = objautordao.listarAutor();
            
            // em seguida uma busca é realizada utilizado o laço for para percorrer a lista 
            // os dados são capturados e adicionados em uma linha da tabela de acordo com a posição que pertencem
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_autor(),
                    lista.get(num).getNome_autor(),
                    lista.get(num).getSobrenome_autor()
                });
            }
            
            // caso não funcione um erro retorna avisando o problema detectado
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar valores de Autor: " + erro);
        }
    }

}
