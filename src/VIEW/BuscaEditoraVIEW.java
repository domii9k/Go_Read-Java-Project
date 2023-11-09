package VIEW;

//impotações
import DAO.EditoraDAO; // importação da classe dao de editora  para metodos de conexão com o banco
import DTO.EditoraDTO; // importação da classe dto de editora pra transferencias de atributos via objeto
import java.sql.SQLException; // importação para tratamento de erros no sql
import java.util.ArrayList; // importação para uso de listas
import java.util.logging.Level;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import java.util.logging.Logger; // importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane; // importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTable; // importação para o uso de jtable
import javax.swing.table.DefaultTableModel; // importação para o uso de modelo de tabelas

/**
 * Tela criada para realizar a listagem de registros  
 * e tambem busca ao digitar nos campos de texto
 */

//declaração de classe
public class BuscaEditoraVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor com inicialização de componentes 
     * e um metodo de listagem para carregar todos os registros de editora
     * cadastrados no banco na tabela quando a tela for aberta
     * Creates new form telaBuscaCliente
     */
    public BuscaEditoraVIEW() {
        initComponents();
        listarValores(tblListaBuscarEditora); // metodo responsavel pela listagem de registros 
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

        jLabel1 = new javax.swing.JLabel();
        jpaneSupBuscaEditora = new javax.swing.JPanel();
        lblBuscaEditora = new javax.swing.JLabel();
        lblFecharBuscaEditora = new javax.swing.JLabel();
        jdeskAreaImagemEditora = new javax.swing.JDesktopPane();
        lblBuscaCnpjEditora = new javax.swing.JLabel();
        txtBuscaEditoraCnpj = new javax.swing.JTextField();
        txtBuscaNomeEditora = new javax.swing.JTextField();
        lblBuscaNomeEditora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaBuscarEditora = new javax.swing.JTable();
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Área de Busca");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jpaneSupBuscaEditora.setBackground(new java.awt.Color(30, 34, 60));

        lblBuscaEditora.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblBuscaEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscaEditora.setText("BUSCAR EDITORAS");

        lblFecharBuscaEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharBuscaEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharBuscaEditoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupBuscaEditoraLayout = new javax.swing.GroupLayout(jpaneSupBuscaEditora);
        jpaneSupBuscaEditora.setLayout(jpaneSupBuscaEditoraLayout);
        jpaneSupBuscaEditoraLayout.setHorizontalGroup(
            jpaneSupBuscaEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupBuscaEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(lblFecharBuscaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupBuscaEditoraLayout.setVerticalGroup(
            jpaneSupBuscaEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupBuscaEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpaneSupBuscaEditoraLayout.createSequentialGroup()
                .addComponent(lblFecharBuscaEditora)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jpaneSupBuscaEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jdeskAreaImagemEditora.setBackground(new java.awt.Color(255, 255, 255));
        jdeskAreaImagemEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jdeskAreaImagemEditora.setForeground(new java.awt.Color(255, 255, 255));
        jdeskAreaImagemEditora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscaCnpjEditora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaCnpjEditora.setText("CNPJ:");
        jdeskAreaImagemEditora.add(lblBuscaCnpjEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 20));

        txtBuscaEditoraCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaEditoraCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaEditoraCnpjKeyTyped(evt);
            }
        });
        jdeskAreaImagemEditora.add(txtBuscaEditoraCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 250, 20));

        txtBuscaNomeEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaNomeEditora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaNomeEditoraKeyTyped(evt);
            }
        });
        jdeskAreaImagemEditora.add(txtBuscaNomeEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 230, 20));

        lblBuscaNomeEditora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaNomeEditora.setText("Nome:");
        jdeskAreaImagemEditora.add(lblBuscaNomeEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        tblListaBuscarEditora.setBackground(new java.awt.Color(204, 204, 204));
        tblListaBuscarEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cnpj", "Razão social", "Tel_fixo", "Cep"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaBuscarEditora.setGridColor(new java.awt.Color(204, 204, 204));
        tblListaBuscarEditora.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblListaBuscarEditora);

        jdeskAreaImagemEditora.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 520, 360));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaBuscaAtt.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jdeskAreaImagemEditora.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        getContentPane().add(jdeskAreaImagemEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        setSize(new java.awt.Dimension(691, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    //metodo pra definir ação do botão de fechar da tela
    private void lblFecharBuscaEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharBuscaEditoraMouseClicked
        dispose();// fecha essa tela ao clicar no icone de x
    }//GEN-LAST:event_lblFecharBuscaEditoraMouseClicked

    //metodo para realizar busca a cada caractere digitado 
    private void txtBuscaEditoraCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaEditoraCnpjKeyTyped
        // pesquisa pelo cnpj
        // uma instrução sql é declarada em uma string
        String sql = "SELECT * FROM editora WHERE cnpj LIKE '%"
        + txtBuscaEditoraCnpj.getText() // o conteudo digitado no campo de texto e inserido na instrução
        + "%'";
        // o objeto da classe dao da editora é declarado para que a função de pesquisa seja utilizada
        EditoraDAO objbusca = new EditoraDAO();
        try {// o metodo de busca acontece em um bloco de tratamento
            objbusca.pesquisaEditora(sql,tblListaBuscarEditora);
            // o metodo de pesquisa recebe a instrução armazenada na string e a tabela desta tela como parametros
        } catch (SQLException ex) { // caso haja um erro na conexão com o banoco ele será tratado
             /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
            Logger.getLogger(BuscaEditoraVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaEditoraCnpjKeyTyped

    private void txtBuscaNomeEditoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeEditoraKeyTyped
          // pesquisa pelo nome
          // uma instrução sql é declarada em uma string
          // buscar na tabela editora um registro que na coluna razao_social ou cep seja igual ao que for digitado
        String sql = "SELECT * FROM editora WHERE razao_social LIKE '%" 
                // o conteudo digitado no campo de texto é inserido na instrução
                + txtBuscaNomeEditora.getText() 
                + "%' OR cep LIKE '%"
                // o conteudo digitado no campo de texto é inserido na instrução
                + txtBuscaNomeEditora.getText()
                + "%'";
        // o objeto da classe dao da editora é declarado para que a função de pesquisa seja utilizada
        EditoraDAO objbusca = new EditoraDAO();
        try {// o metodo de busca acontece em um bloco de tratamento
            objbusca.pesquisaEditora(sql,tblListaBuscarEditora);
            // o metodo de pesquisa recebe a instrução armazenada na string e a tabela desta tela como parametros
        } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
             /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
            Logger.getLogger(BuscaEditoraVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaNomeEditoraKeyTyped

    /**
     * metodo principal para execução da tela
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
            java.util.logging.Logger.getLogger(BuscaEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaEditoraVIEW().setVisible(true);
            }
        });
    }

     // declaração da variaveis que serão utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDesktopPane jdeskAreaImagemEditora;
    private javax.swing.JPanel jpaneSupBuscaEditora;
    private javax.swing.JLabel lblBuscaCnpjEditora;
    private javax.swing.JLabel lblBuscaEditora;
    private javax.swing.JLabel lblBuscaNomeEditora;
    private javax.swing.JLabel lblFecharBuscaEditora;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JTable tblListaBuscarEditora;
    private javax.swing.JTextField txtBuscaEditoraCnpj;
    private javax.swing.JTextField txtBuscaNomeEditora;
    // End of variables declaration//GEN-END:variables

    //metodos utilizados para executar as ações do botões
    private void listarValores(JTable tabela){ // metodo para listar valores em uma tabela
        
        //um bloco de tratamento é utilizado para um possivel erro na listagem de valores
        try {
            // o objeto da classe de conexões é criado
            EditoraDAO objeditoradao = new EditoraDAO();
            
            // em seguida um objeto de modelo de tabela e criado para receber a tabela da tela
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);
            
            // uma lista é criada para receber o objeto da classe de conexão criado anteriormente 
            // é instanciando o metodo pesquisar
            ArrayList<EditoraDTO> lista = objeditoradao.listarEditora();
            
            // em seguida uma busca é realizada utilizado o laço for para percorrer a lista 
            // os dados são capturados e adicionados em uma linha da tabela de acordo com a posição que pertencem
            
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCnpj(),
                    lista.get(num).getRazao_social(),
                    lista.get(num).getTel_fixo(),
                    lista.get(num).getCep()
                });
            }
            
            // caso não funcione um erro retorna avisando o problema detectado
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar valores da Editora: " + erro);
        }
    }

}
