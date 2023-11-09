package VIEW;

//importaçãoes
import DAO.EditoraDAO; //importação do objeto dao de editora para conexão com o banco
import DTO.EditoraDTO; //importação do objeto dto de editora pra transferencias de atributos
import java.awt.HeadlessException; //importação para tratamento de erros digitados
import java.sql.SQLException; // importação para tratamento de erros de sql
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane;// importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTextField;//importação para uso Jtextfield como parametros

/**
 * Tela criada para alteração 
 * e exclusão de editoras no sistema
 * 
 */

//declaração de classe
public class AltCadEditoraVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para iniciaizar os componentes da tela
     * Creates new form telaAlteraçãoAutor
     */
    public AltCadEditoraVIEW() {
        initComponents();
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

        jpaneSupAltEditora = new javax.swing.JPanel();
        lblAlterarEditora = new javax.swing.JLabel();
        fecharTelaEditora = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCancelarAltEditora = new javax.swing.JButton();
        txtCepAltEditora = new javax.swing.JFormattedTextField();
        txtSituacaoCadAltEditora = new javax.swing.JFormattedTextField();
        txtTelefoneAltEditora = new javax.swing.JFormattedTextField();
        txtRazaoSocialAltEditora = new javax.swing.JTextField();
        btnAltEditora = new javax.swing.JButton();
        btnExcluirAltEditora = new javax.swing.JButton();
        lblAltRazaoSocial = new javax.swing.JLabel();
        lblAltCnpj = new javax.swing.JLabel();
        lblAltTelefoneEditora = new javax.swing.JLabel();
        lblBuscaBuscarEbook = new javax.swing.JLabel();
        btnAlterarAltEditora = new javax.swing.JButton();
        lblAltCepEditora = new javax.swing.JLabel();
        txtBuscaAltEditora = new javax.swing.JTextField();
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

        jpaneSupAltEditora.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarEditora.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarEditora.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarEditora.setText("ALTERAR EDITORA");

        fecharTelaEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        fecharTelaEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharTelaEditoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupAltEditoraLayout = new javax.swing.GroupLayout(jpaneSupAltEditora);
        jpaneSupAltEditora.setLayout(jpaneSupAltEditoraLayout);
        jpaneSupAltEditoraLayout.setHorizontalGroup(
            jpaneSupAltEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupAltEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
                .addComponent(fecharTelaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupAltEditoraLayout.setVerticalGroup(
            jpaneSupAltEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupAltEditoraLayout.createSequentialGroup()
                .addGroup(jpaneSupAltEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecharTelaEditora)
                    .addGroup(jpaneSupAltEditoraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpaneSupAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelarAltEditora.setBackground(new java.awt.Color(30, 34, 60));
        btnCancelarAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelarAltEditora.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAltEditora.setText("CANCELAR");
        btnCancelarAltEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAltEditoraActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCancelarAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 130, 30));

        txtCepAltEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCepAltEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCepAltEditora.setMaximumSize(new java.awt.Dimension(64, 18));
        txtCepAltEditora.setOpaque(true);
        jDesktopPane1.add(txtCepAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 310, -1));

        txtSituacaoCadAltEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtSituacaoCadAltEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSituacaoCadAltEditora.setEnabled(false);
        txtSituacaoCadAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSituacaoCadAltEditora.setMaximumSize(new java.awt.Dimension(64, 18));
        txtSituacaoCadAltEditora.setOpaque(true);
        jDesktopPane1.add(txtSituacaoCadAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 310, -1));

        txtTelefoneAltEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelefoneAltEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefoneAltEditora.setMaximumSize(new java.awt.Dimension(64, 18));
        txtTelefoneAltEditora.setOpaque(true);
        jDesktopPane1.add(txtTelefoneAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 310, -1));

        txtRazaoSocialAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRazaoSocialAltEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtRazaoSocialAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 310, -1));

        btnAltEditora.setBackground(new java.awt.Color(84, 119, 97));
        btnAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAltEditora.setForeground(new java.awt.Color(255, 255, 255));
        btnAltEditora.setText("OK");
        btnAltEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltEditoraActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 30));

        btnExcluirAltEditora.setBackground(new java.awt.Color(30, 34, 60));
        btnExcluirAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluirAltEditora.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAltEditora.setText("EXCLUIR");
        btnExcluirAltEditora.setToolTipText("Não será possivel excluir uma editora que esteja relacionada a um livro");
        btnExcluirAltEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAltEditoraActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnExcluirAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 30));

        lblAltRazaoSocial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltRazaoSocial.setText("Razão social:");
        jDesktopPane1.add(lblAltRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, -1));

        lblAltCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltCnpj.setText("CNPJ:");
        jDesktopPane1.add(lblAltCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 130, -1));

        lblAltTelefoneEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltTelefoneEditora.setText("Telefone:");
        jDesktopPane1.add(lblAltTelefoneEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 60, -1));

        lblBuscaBuscarEbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaBuscarEbook.setText("Busca por nome:");
        jDesktopPane1.add(lblBuscaBuscarEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        btnAlterarAltEditora.setBackground(new java.awt.Color(84, 119, 97));
        btnAlterarAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterarAltEditora.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarAltEditora.setText("ALTERAR");
        btnAlterarAltEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAltEditoraActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnAlterarAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 30));

        lblAltCepEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltCepEditora.setText("CEP:");
        jDesktopPane1.add(lblAltCepEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 50, -1));

        txtBuscaAltEditora.setToolTipText("Digite corretamente o nome da editora a ser alterada ou excluida");
        txtBuscaAltEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtBuscaAltEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 240, 30));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Desktop - 2.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jDesktopPane1.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        setSize(new java.awt.Dimension(730, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //metodo pra definir ação do botão de fechar da tela
    private void fecharTelaEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharTelaEditoraMouseClicked
        // fecha essa tela ao clicar no icone de x
        dispose();
    }//GEN-LAST:event_fecharTelaEditoraMouseClicked

     //metodo para definir as coordenadas da tela no espaço onde esta localizada ao pressionar o mouse
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       // variaveis recebem as coordenadas
        x = evt.getX(); //Retorna a posição x horizontal do evento em relação ao componente de origem.
        y = evt.getY(); //Retorna a posição vertical y do evento em relação ao componente de origem.
    }//GEN-LAST:event_formMousePressed

     //metodo para definir as coordenadas da tela no espaço onde esta localizada ao arrastar o mouse
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // outras variaveis são criadas para pegar o valor das cordenadas na tela
        int xx = evt.getXOnScreen(); //Retorna a posição x horizontal absoluta do evento.
        int yy = evt.getYOnScreen(); //Retorna a posição y vertical absoluta do evento.
        this.setLocation(xx-x,yy-y);//Move este componente para um novo local.
    }//GEN-LAST:event_formMouseDragged

    //metodo para realizar consulta no banco ao digitar no campo de texto e retorna o resultado nos campos a serem alterados
    private void btnAltEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltEditoraActionPerformed
        // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtBuscaAltEditora.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Digite o valor a ser consultado no campo primeiro!!!");
       }else{
            // declaração de objeto dao para conexão com o banco e instancia do metodo consultar 
            EditoraDAO objConsulta = new EditoraDAO();
            try {// a consulta ocorre dentro de um bloco de tratamento
                // o objeto criado para consulta instancia o metodo consulta 
                //e recebe como parametros 3 campos  um para consulta , e os outros para receberem o resultado
                objConsulta.consultarEditora(txtBuscaAltEditora, txtSituacaoCadAltEditora, txtRazaoSocialAltEditora, txtTelefoneAltEditora, txtCepAltEditora);
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                 */
                Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_btnAltEditoraActionPerformed

    //metodo para executar a ação de alteração ao clicar no botão alterar
    private void btnAlterarAltEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAltEditoraActionPerformed
          // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtBuscaAltEditora.getText().isEmpty() || txtCepAltEditora.getText().isEmpty() || txtRazaoSocialAltEditora.getText().isEmpty() || txtSituacaoCadAltEditora.getText().isEmpty() || txtTelefoneAltEditora.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
       }else{
            // declaração do objeto dao de editora para conexão com o banco e instancia do metodo alterar
            EditoraDAO objalterar = new EditoraDAO();
            try {// o metodo de alteração acontece de um bloco de tratamento
                // o objeto criado instancia o metodo alterar que recebe como parametro os campos
                // a serem alterados e por ultimo o parametro que indica  a chave do registro onde será feita a alteração 
                objalterar.alterarEditora(txtRazaoSocialAltEditora, txtTelefoneAltEditora, txtCepAltEditora, txtSituacaoCadAltEditora);
                limparCampos(txtSituacaoCadAltEditora,txtRazaoSocialAltEditora,txtTelefoneAltEditora,txtCepAltEditora);
                 //caso seja executado com sucesso a alteração uma mensagem é emitida ao usuario
                JOptionPane.showMessageDialog(null, "dados alterados com sucesso !!!"); 
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                  * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                  */
                Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(Level.SEVERE, null, ex);
                //Caso a alteração não seja possivel uma mensagem de erro será informada ao usuario
              JOptionPane.showMessageDialog(null, "Erro na alteração de dados!!!"+ ex); 
            }
       }  
    }//GEN-LAST:event_btnAlterarAltEditoraActionPerformed

    //metodo para excluir registros da tabela autor do banco de dados
    private void btnExcluirAltEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAltEditoraActionPerformed
       if(txtRazaoSocialAltEditora.getText().equals("") || txtCepAltEditora.getText().equals("") || txtSituacaoCadAltEditora.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
        }else{
           //foi criada um tela de confirmação para que o usuario confirme se deseja realmente excluir o registro indicado
            int respostaJOptionPane = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar essa Editora ?",
                    "Apagar Editora", JOptionPane.YES_NO_OPTION);
             //caso a opção seja sim  o metodo de exclusão será executado
            if(respostaJOptionPane == JOptionPane.YES_OPTION)
            {
                try {// dentro do bloco de tratamento o metodo de exclusão e executado 
                    //e recebe como parametro a caixa onde foi digitado o id do autor
                    // esse indicara qual registro será excluido
                    excluirItem(txtSituacaoCadAltEditora); //método para apagar
                    limparCampos(txtSituacaoCadAltEditora,txtRazaoSocialAltEditora,txtTelefoneAltEditora,txtCepAltEditora);
                    JOptionPane.showMessageDialog(null, "Editora Excluida!!");//mensagem indicando que o registro selecionado foi excluido
                } catch (HeadlessException e) {// tratamento de erros de digitação
                    JOptionPane.showMessageDialog(null,"Editora digitada incorretamente" + e);
                } catch (SQLException ex) {// tratamento para erros sql
                    //mensagem indicando erro de violação na integridade
                    Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"Editora não poderá ser deletada , exclua o ebook primeiro" + ex);
                } 
                //caso a opção seja não a operação será cancelada  
            }else if (respostaJOptionPane == JOptionPane.NO_OPTION){
                //uma mensagem e emitida para usuario indicando que a operação foi cancelada
                JOptionPane.showMessageDialog(null, "Operação cancelada!!!");
            }
        }
    }//GEN-LAST:event_btnExcluirAltEditoraActionPerformed

    //metodo para cancelar a operação de alteração ou de exclusão
    private void btnCancelarAltEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltEditoraActionPerformed
        limparCampos(txtCepAltEditora, txtRazaoSocialAltEditora, txtSituacaoCadAltEditora, txtTelefoneAltEditora);
        JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCancelarAltEditoraActionPerformed

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
            java.util.logging.Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltCadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AltCadEditoraVIEW().setVisible(true);
            }
        });
    }

    // declaração de variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltEditora;
    private javax.swing.JButton btnAlterarAltEditora;
    private javax.swing.JButton btnCancelarAltEditora;
    private javax.swing.JButton btnExcluirAltEditora;
    private javax.swing.JLabel fecharTelaEditora;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jpaneSupAltEditora;
    private javax.swing.JLabel lblAltCepEditora;
    private javax.swing.JLabel lblAltCnpj;
    private javax.swing.JLabel lblAltRazaoSocial;
    private javax.swing.JLabel lblAltTelefoneEditora;
    private javax.swing.JLabel lblAlterarEditora;
    private javax.swing.JLabel lblBuscaBuscarEbook;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JTextField txtBuscaAltEditora;
    private javax.swing.JFormattedTextField txtCepAltEditora;
    private javax.swing.JTextField txtRazaoSocialAltEditora;
    private javax.swing.JFormattedTextField txtSituacaoCadAltEditora;
    private javax.swing.JFormattedTextField txtTelefoneAltEditora;
    // End of variables declaration//GEN-END:variables

    
    //metodos para inserir ações aos botões
     
     //metodo para exclusão de um registro recebe como parametro o campo onde será digitado o atributo de consulta
      public void excluirItem(JTextField campocodigo) throws SQLException{
        //uma string é criada para recebe o valor setado   
        String cnpj_editora;
        
        // a variavel recebe o valor setado no campo de texto
        cnpj_editora = campocodigo.getText();
        
        // o valor é armazenado no objeto dto declarado abaixo
        EditoraDTO objexcluir = new EditoraDTO();
        //por meio do metodo de acesso set
        objexcluir.setCnpj(cnpj_editora);
        
        // por fim o objeto dao recebe como parametro na instancia 
        //do metodo excluir objeto dto com o valor chave setado
        EditoraDAO objDao = new EditoraDAO();
        objDao.excluirEditora(objexcluir);
    }
    
      
      // metodo utilzado para limpar os campos
    public void limparCampos(JTextField campo1, JTextField campo2, JTextField campo3, JTextField campo4) {
        //campos recebem uma string vazia como valor e são resetados
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
    }
}
