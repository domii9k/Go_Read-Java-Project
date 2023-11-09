package VIEW;

//importações
import DAO.EbookDAO; //importação classe dao de ebook para metodos de conexão com o banco
import java.sql.SQLException; //importação para erros de sql 
import java.util.logging.Level;// importação de log para indicação de nivel de erro 
import java.util.logging.Logger; // importação de log para declarar log a locais de possiveis erros criticos no sistema

/**
 * Tela criada para listagem e busca de livros cadastrados
 * no banco de dados.
 * 
 */

//declaração de classe
public class BuscaEbookVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para inicialização de componentes 
     * e listagem dos registros cadastrados na tabela ebook do banco
     * ao abrir a tela.
     * Creates new form telaBuscaCliente
     */
    public BuscaEbookVIEW() throws SQLException {
        initComponents();
        EbookDAO livro = new EbookDAO(); // objeto de conexão dao criado
        // para executar o metodo de listagem do livros na tabela 
        livro.listarItens(tblListaBuscarEbook);
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

        jdeskAreaImagemEbook = new javax.swing.JDesktopPane();
        jpaneSupBuscaEbook = new javax.swing.JPanel();
        lblBuscaEbook = new javax.swing.JLabel();
        lblFecharTelaEbook = new javax.swing.JLabel();
        txtBuscaBuscarEbook = new javax.swing.JTextField();
        lblBuscarEbook = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaBuscarEbook = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblFundoImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(30, 34, 60));
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

        jdeskAreaImagemEbook.setBackground(new java.awt.Color(255, 255, 255));
        jdeskAreaImagemEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemEbook.setForeground(new java.awt.Color(255, 255, 255));
        jdeskAreaImagemEbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpaneSupBuscaEbook.setBackground(new java.awt.Color(30, 34, 60));

        lblBuscaEbook.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblBuscaEbook.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscaEbook.setText("BUSCAR EBOOK");

        lblFecharTelaEbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaEbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaEbookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupBuscaEbookLayout = new javax.swing.GroupLayout(jpaneSupBuscaEbook);
        jpaneSupBuscaEbook.setLayout(jpaneSupBuscaEbookLayout);
        jpaneSupBuscaEbookLayout.setHorizontalGroup(
            jpaneSupBuscaEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupBuscaEbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaEbook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecharTelaEbook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupBuscaEbookLayout.setVerticalGroup(
            jpaneSupBuscaEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupBuscaEbookLayout.createSequentialGroup()
                .addGroup(jpaneSupBuscaEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaEbook)
                    .addGroup(jpaneSupBuscaEbookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBuscaEbook, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdeskAreaImagemEbook.add(jpaneSupBuscaEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        txtBuscaBuscarEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaBuscarEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaBuscarEbookActionPerformed(evt);
            }
        });
        txtBuscaBuscarEbook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaBuscarEbookKeyTyped(evt);
            }
        });
        jdeskAreaImagemEbook.add(txtBuscaBuscarEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, 20));

        lblBuscarEbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscarEbook.setText("Título:");
        lblBuscarEbook.setToolTipText("Digite o nome do livro ou categoria desejado");
        jdeskAreaImagemEbook.add(lblBuscarEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, 20));

        tblListaBuscarEbook.setBackground(new java.awt.Color(204, 204, 204));
        tblListaBuscarEbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Isbn", "Valor unitario", "Titulo", "Peso do arquivo", "Quantidade de paginas", "Editora", "Categoria"
            }
        ));
        tblListaBuscarEbook.setGridColor(new java.awt.Color(204, 204, 204));
        tblListaBuscarEbook.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblListaBuscarEbook);

        jdeskAreaImagemEbook.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 530, 360));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Área de Busca");
        jdeskAreaImagemEbook.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaBuscaAtt.png"))); // NOI18N
        lblFundoImagem.setText("jLabel3");
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jdeskAreaImagemEbook.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        getContentPane().add(jdeskAreaImagemEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        setSize(new java.awt.Dimension(691, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //metodo pra definir ação do botão de fechar da tela
    private void lblFecharTelaEbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaEbookMouseClicked
        dispose(); // fecha essa tela ao clicar no icone de x
    }//GEN-LAST:event_lblFecharTelaEbookMouseClicked

     //metodo para definir as cordenadas da tela no espaço onde esta localizada ao pressionar o mouse
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         // variaveis recebem as coordenadas
        x = evt.getX(); //Retorna a posição x horizontal do evento em relação ao componente de origem.
        y = evt.getY(); //Retorna a posição vertical y do evento em relação ao componente de origem.
    }//GEN-LAST:event_formMousePressed

    //metodo para definir as cordenadas da tela no espaço onde esta localizada ao arrastar o mouse
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       // outras variaveis são criadas para pegar o valor das cordenadas na tela
        int xx = evt.getXOnScreen(); //Retorna a posição x horizontal absoluta do evento.
        int yy = evt.getYOnScreen(); //Retorna a posição y vertical absoluta do evento.
        this.setLocation(xx-x,yy-y);//Move este componente para um novo local.
    }//GEN-LAST:event_formMouseDragged

    //metodo para realizar busca a cada caractere digitado 
    private void txtBuscaBuscarEbookKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaBuscarEbookKeyTyped
         // pesquisa pelo nome do livro
         // uma instrução sql é declarada em uma string
         // buscar na tabela ebook do livro onde o titulo ou a categoria for como o digitado
        String sql = "SELECT * FROM ebook WHERE titulo LIKE '%" 
                + txtBuscaBuscarEbook.getText() // o conteudo digitado no campo de texto e inserido na instrução
                + "%' OR categoria LIKE '%"
                + txtBuscaBuscarEbook.getText() // o conteudo digitado no campo de texto e inserido na instrução
                + "%'";
        // o objeto da classe dao de ebook é declarado para que a função de pesquisa seja utilizada
        EbookDAO objbusca = new EbookDAO();
        try {// o metodo de busca acontece em um bloco de tratamento
            objbusca.pesquisaEbook(sql,tblListaBuscarEbook);
             // o metodo de pesquisa recebe a instrução armazenada na string e a tabela desta tela como parametros
        } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
            /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
            Logger.getLogger(BuscaEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaBuscarEbookKeyTyped

    private void txtBuscaBuscarEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaBuscarEbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaBuscarEbookActionPerformed

    /**
     * metodo principal onde ocorre a execução da tela
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
            java.util.logging.Logger.getLogger(BuscaEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BuscaEbookVIEW().setVisible(true);
                } catch (SQLException ex) {
                   /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                    * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                    */
                    Logger.getLogger(BuscaEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //variaveis utilizadas nos componentes das telas.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdeskAreaImagemEbook;
    private javax.swing.JPanel jpaneSupBuscaEbook;
    private javax.swing.JLabel lblBuscaEbook;
    private javax.swing.JLabel lblBuscarEbook;
    private javax.swing.JLabel lblFecharTelaEbook;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JTable tblListaBuscarEbook;
    private javax.swing.JTextField txtBuscaBuscarEbook;
    // End of variables declaration//GEN-END:variables
}
