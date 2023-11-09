package VIEW;

//importações 
import DAO.EditoraDAO; // importação da classe dao de editora para conexão com banco
import DTO.EditoraDTO; // importação da classe dto de editora pra acesso aos metodos de transferencia
import DTO.Validador;
import java.sql.SQLException; // importação da biblioteca sql para tratamento de erros corriqueiros do banco
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane; // importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTextField; // importação do jtextfield para indicar parametros de campo de texto em metodos

/**
 * Tela Criada para cadastro de editoras no sistema
 * cadastro de editoras que fornecem os livros para o e-commerce
 */

// declaração da classe
public class CadEditoraVIEW extends javax.swing.JFrame {

    /**
     * inicialização dos componentes da tela 
     * Creates new form CadEditoraVIEW1
     */
    public CadEditoraVIEW() {
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

        painelSupCadEditora = new javax.swing.JPanel();
        lblAlterarAutor = new javax.swing.JLabel();
        lblFecharTelaEditora = new javax.swing.JLabel();
        painelDeskComponentes = new javax.swing.JDesktopPane();
        txtCepCadEditora = new javax.swing.JFormattedTextField();
        txtTelFixoCadEditora = new javax.swing.JFormattedTextField();
        txtCnpjCadEditora = new javax.swing.JFormattedTextField();
        btnCadastrarCadEditora = new javax.swing.JButton();
        btnCancelarCadEditora = new javax.swing.JButton();
        lblCnpj = new javax.swing.JLabel();
        lblRazSocial = new javax.swing.JLabel();
        lblTelFixoEd = new javax.swing.JLabel();
        lblCepEd = new javax.swing.JLabel();
        txtRazaoSocialCadEditora = new javax.swing.JTextField();
        lblImagemFundo = new javax.swing.JLabel();

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

        painelSupCadEditora.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarAutor.setText("CADASTRO EDITORA");

        lblFecharTelaEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaEditoraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelSupCadEditoraLayout = new javax.swing.GroupLayout(painelSupCadEditora);
        painelSupCadEditora.setLayout(painelSupCadEditoraLayout);
        painelSupCadEditoraLayout.setHorizontalGroup(
            painelSupCadEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSupCadEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addComponent(lblFecharTelaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelSupCadEditoraLayout.setVerticalGroup(
            painelSupCadEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSupCadEditoraLayout.createSequentialGroup()
                .addGroup(painelSupCadEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaEditora)
                    .addGroup(painelSupCadEditoraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelSupCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        painelDeskComponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCepCadEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCepCadEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepCadEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCepCadEditora.setMaximumSize(new java.awt.Dimension(64, 18));
        painelDeskComponentes.add(txtCepCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 310, -1));

        txtTelFixoCadEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelFixoCadEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelFixoCadEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelFixoCadEditora.setMaximumSize(new java.awt.Dimension(64, 18));
        painelDeskComponentes.add(txtTelFixoCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 310, -1));

        txtCnpjCadEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCnpjCadEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjCadEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCnpjCadEditora.setMaximumSize(new java.awt.Dimension(64, 18));
        painelDeskComponentes.add(txtCnpjCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 310, -1));

        btnCadastrarCadEditora.setBackground(new java.awt.Color(84, 119, 97));
        btnCadastrarCadEditora.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCadEditora.setText("CADASTRAR");
        btnCadastrarCadEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCadEditoraActionPerformed(evt);
            }
        });
        painelDeskComponentes.add(btnCadastrarCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, 30));

        btnCancelarCadEditora.setBackground(new java.awt.Color(30, 34, 60));
        btnCancelarCadEditora.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCadEditora.setText("CANCELAR");
        btnCancelarCadEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadEditoraActionPerformed(evt);
            }
        });
        painelDeskComponentes.add(btnCancelarCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 130, 30));

        lblCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCnpj.setText("Cnpj:");
        painelDeskComponentes.add(lblCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 77, -1));

        lblRazSocial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRazSocial.setText("Razão Social:");
        painelDeskComponentes.add(lblRazSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        lblTelFixoEd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelFixoEd.setText("Tel. Fixo:");
        painelDeskComponentes.add(lblTelFixoEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 77, -1));

        lblCepEd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCepEd.setText("CEP:");
        painelDeskComponentes.add(lblCepEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 77, -1));

        txtRazaoSocialCadEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRazaoSocialCadEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelDeskComponentes.add(txtRazaoSocialCadEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 310, 20));

        lblImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaCadastro.png"))); // NOI18N
        lblImagemFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        painelDeskComponentes.add(lblImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(painelDeskComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // metodo para realizar encerramento do sistema ao clicar no icone em x na tela
    private void lblFecharTelaEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaEditoraMouseClicked
        //encerra essa tela em especifico
        dispose();
    }//GEN-LAST:event_lblFecharTelaEditoraMouseClicked

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
        this.setLocation(xx-x,yy-y); // por fim a localização e setado atraves de um calculo com as variaveis inciais
    }//GEN-LAST:event_formMouseDragged

// metodo que faz a ação  para cadastrar editora
    private void btnCadastrarCadEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCadEditoraActionPerformed
        //bloco de tratamento por onde acontece o cadastro da editora
         // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtCepCadEditora.getText().equals("") ||txtCnpjCadEditora.getText().equals("") || txtRazaoSocialCadEditora.getText().equals("") || txtTelFixoCadEditora.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
        }else{
            try {// o cadastro acontece em um bloco de tratamento recebendo como parametro no metodo cadastradar todos os dados digitados pelo usuario
                Validador validar = new Validador();
                 // se o documento digitado for valido o cadastro é concluido e uma mensagem indicando que o documento é valido será emitida
                 if (validar.isCNPJ(txtCnpjCadEditora.getText())) { // o metodo isCPF verifica se o documento cpf digitado é valido
                     // o metodo de cadastro é executado e em seguida os campos são limpos para que um nvo cadastro seja executado
                     cadastrarItem(txtCnpjCadEditora, txtRazaoSocialCadEditora, txtTelFixoCadEditora, txtCepCadEditora);
                     //em seguida os campos são limpos para um novo registro
                     limparCampos(txtCnpjCadEditora, txtRazaoSocialCadEditora, txtTelFixoCadEditora, txtCepCadEditora);
                     JOptionPane.showMessageDialog(null, "Resultado:\n CNPJ VALIDO!!!", "Dados validos", JOptionPane.INFORMATION_MESSAGE);
                 }else{
                     // caso o documento digitado não seja valido sera informado ao usuario por meio de uma mensagem que os dados digitados são invalidos
                     JOptionPane.showMessageDialog(null, "Dados invalidos !!", "Não será possivel cadastrar a editora, verifique o dccumento e digite novamente", JOptionPane.ERROR_MESSAGE);
                 }
            } catch (SQLException ex) { // um tratameto de erro é disparado caso haja problemas  no tratamento
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                 * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                 */
                Logger.getLogger(CadEditoraVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCadastrarCadEditoraActionPerformed

//metodo para limpar os campos de texto após um cadastro ser realizado ou quando o usuario desejar
    private void btnCancelarCadEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadEditoraActionPerformed
       limparCampos(txtCnpjCadEditora,txtRazaoSocialCadEditora,txtTelFixoCadEditora,txtCepCadEditora);
       JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCancelarCadEditoraActionPerformed

    /**
     *metodo principal por onde será executada a tela
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
            java.util.logging.Logger.getLogger(CadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEditoraVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadEditoraVIEW().setVisible(true);
            }
        });
    }

//declaração das variaveis utilizadas nos componenetes
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCadEditora;
    private javax.swing.JButton btnCancelarCadEditora;
    private javax.swing.JLabel lblAlterarAutor;
    private javax.swing.JLabel lblCepEd;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblFecharTelaEditora;
    private javax.swing.JLabel lblImagemFundo;
    private javax.swing.JLabel lblRazSocial;
    private javax.swing.JLabel lblTelFixoEd;
    private javax.swing.JDesktopPane painelDeskComponentes;
    private javax.swing.JPanel painelSupCadEditora;
    private javax.swing.JFormattedTextField txtCepCadEditora;
    private javax.swing.JFormattedTextField txtCnpjCadEditora;
    private javax.swing.JTextField txtRazaoSocialCadEditora;
    private javax.swing.JFormattedTextField txtTelFixoCadEditora;
    // End of variables declaration//GEN-END:variables

    //metodos para inserir ações aos botões
     public void cadastrarItem(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4) throws SQLException{
       String cnpj,razaosocial,telfixo,cep; // cria-se uma string para armazenar os valores rcebidos nos campos

        //os valores digitados nos campos são armazenados em variaveis
        cnpj= campo1.getText();
        razaosocial = campo2.getText();
        telfixo = campo3.getText();
        cep = campo4.getText();

        // uma instancia de objeto da  classe autor de transferencia  é criada
        // em seguida os metodos de set são instanciados para receber os valores das variaveis
        EditoraDTO objeditoradto = new EditoraDTO();
        objeditoradto.setCnpj(cnpj);
        objeditoradto.setRazao_social(razaosocial);
        objeditoradto.setTel_fixo(telfixo);
        objeditoradto.setCep(cep);

        // uma instancia de objeto da classe de acesso e conexão da class autor é criada
        // o objeto criado recebe ums instancia de um metodo da classe DAO utilizado para cadastrar o autor no banco
        EditoraDAO objeditoradao = new EditoraDAO();
        objeditoradao.cadastrarEditora(objeditoradto);
       
       // por fim uma mensagem em joptionpane é exibida sinalizado que o cadastro foi realizado com sucesso
       JOptionPane.showMessageDialog(null, "Editora cadastrada com sucesso !!!!");
    }
    
     public void limparCampos(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4) // metodo utilzado para limpar os campos
    {
        //campos recebem uma string vazia como valor e são resetados
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
    }

}
