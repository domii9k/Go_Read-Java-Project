package VIEW;

//importações
import DAO.ClienteDAO; // importação da classe dao de conexão do cliente com o banco
import DTO.ClienteDTO; // importação da classe dto de tranferencia do cliente
import DTO.Validador; // importação da classe de validação do cpf e do cnpj
import java.sql.SQLException; // tratamento de erros com o banco
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane;// importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JRadioButton; // importação do radiobutton para poder escolher entre cpf e cnpj
import javax.swing.JTextField; // importação do jtextfield para indicar parametros de campo de texto em metodos

/**
 * Tela criada para cadastro de clientes 
 * cadastro de clientes que compraram os livros realizando pedidos
 * 
 */

//declaração da classe 
public class CadClienteVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para incializar os componentes
     * Creates new form telaCadastroCliente
     */
    public CadClienteVIEW() {
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

        btnCadastroGrupo = new javax.swing.ButtonGroup();
        jpaneSupCadCliente = new javax.swing.JPanel();
        lblCadAutor = new javax.swing.JLabel();
        lblFecharTelaCliente = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        rbnCpf = new javax.swing.JRadioButton();
        rbnCnpj = new javax.swing.JRadioButton();
        btnCancelarCadCliente = new javax.swing.JButton();
        btnCadastrarCadCliente = new javax.swing.JButton();
        txtTelFixoCadCliente = new javax.swing.JFormattedTextField();
        txtTelCelularCadCliente = new javax.swing.JFormattedTextField();
        txtCpfAltCliente = new javax.swing.JFormattedTextField();
        txtCnpjAltCliente = new javax.swing.JFormattedTextField();
        lblCadSitCadastralCliente = new javax.swing.JLabel();
        lblCadNomeCliente = new javax.swing.JLabel();
        lblCadSobrenomeCliente = new javax.swing.JLabel();
        lblEmailCadCliente = new javax.swing.JLabel();
        lblTelFixoCadCliente = new javax.swing.JLabel();
        lblTelCelularCadCliente = new javax.swing.JLabel();
        txtEmailCadCliente = new javax.swing.JTextField();
        txtNomeCadCliente = new javax.swing.JTextField();
        txtSobNomeCadCliente = new javax.swing.JTextField();
        lblFundoImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Go!Read");
        setBackground(new java.awt.Color(204, 204, 204));
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

        jpaneSupCadCliente.setBackground(new java.awt.Color(30, 34, 60));

        lblCadAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblCadAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblCadAutor.setText("CADASTRO CLIENTE");

        lblFecharTelaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupCadClienteLayout = new javax.swing.GroupLayout(jpaneSupCadCliente);
        jpaneSupCadCliente.setLayout(jpaneSupCadClienteLayout);
        jpaneSupCadClienteLayout.setHorizontalGroup(
            jpaneSupCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                .addComponent(lblFecharTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupCadClienteLayout.setVerticalGroup(
            jpaneSupCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupCadClienteLayout.createSequentialGroup()
                .addGroup(jpaneSupCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaCliente)
                    .addGroup(jpaneSupCadClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpaneSupCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastroGrupo.add(rbnCpf);
        rbnCpf.setText("CPF:");
        rbnCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnCpfMouseClicked(evt);
            }
        });
        jDesktopPane1.add(rbnCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        btnCadastroGrupo.add(rbnCnpj);
        rbnCnpj.setText("CNPJ:");
        rbnCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnCnpjMouseClicked(evt);
            }
        });
        jDesktopPane1.add(rbnCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        btnCancelarCadCliente.setBackground(new java.awt.Color(30, 34, 60));
        btnCancelarCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCadCliente.setText("CANCELAR");
        btnCancelarCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadClienteActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCancelarCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 130, 30));

        btnCadastrarCadCliente.setBackground(new java.awt.Color(84, 119, 97));
        btnCadastrarCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCadCliente.setText("CADASTRAR");
        btnCadastrarCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCadClienteActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCadastrarCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, 30));

        txtTelFixoCadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelFixoCadCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelFixoCadCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelFixoCadCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtTelFixoCadCliente.setOpaque(true);
        jDesktopPane1.add(txtTelFixoCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 310, -1));

        txtTelCelularCadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelCelularCadCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCelularCadCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelCelularCadCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtTelCelularCadCliente.setOpaque(true);
        jDesktopPane1.add(txtTelCelularCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 310, -1));

        txtCpfAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCpfAltCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCpfAltCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtCpfAltCliente.setOpaque(true);
        jDesktopPane1.add(txtCpfAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 110, -1));

        txtCnpjAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCnpjAltCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCnpjAltCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtCnpjAltCliente.setOpaque(true);
        jDesktopPane1.add(txtCnpjAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 110, -1));

        lblCadSitCadastralCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCadSitCadastralCliente.setText("Situação Cadastral:");
        lblCadSitCadastralCliente.setToolTipText("Selecione uma opção e cadastre de acordo com o tipo de documento do cliente");
        jDesktopPane1.add(lblCadSitCadastralCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, -1));

        lblCadNomeCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCadNomeCliente.setText("Nome:");
        jDesktopPane1.add(lblCadNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 86, 20));

        lblCadSobrenomeCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCadSobrenomeCliente.setText("Sobrenome:");
        jDesktopPane1.add(lblCadSobrenomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 86, 20));

        lblEmailCadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEmailCadCliente.setText("E-mail:");
        jDesktopPane1.add(lblEmailCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 86, -1));

        lblTelFixoCadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTelFixoCadCliente.setText("Tel. Fixo:");
        jDesktopPane1.add(lblTelFixoCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 86, -1));

        lblTelCelularCadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTelCelularCadCliente.setText("Tel. Celular:");
        jDesktopPane1.add(lblTelCelularCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 86, 20));

        txtEmailCadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmailCadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtEmailCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 310, -1));

        txtNomeCadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomeCadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtNomeCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 310, 20));

        txtSobNomeCadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSobNomeCadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtSobNomeCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 310, -1));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaCadastro.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jDesktopPane1.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


// metodo criado para executar a função de enecerramento da tela ao clicar no icone de x
    private void lblFecharTelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaClienteMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_lblFecharTelaClienteMouseClicked

//metodo para definir as cordenadas da tela no espaço onde esta localizada ao pressionar o mouse
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // variaveis recebem as coordenadas
        x=evt.getX();//Retorna a posição x horizontal do evento em relação ao componente de origem.
        y=evt.getY();//Retorna a posição vertical y do evento em relação ao componente de origem.
    }//GEN-LAST:event_formMousePressed

 //metodo para definir as cordenadas da tela no espaço onde esta localizada ao arrastar o mouse
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // outras variaveis são criadas para pegar o valor das cordenadas na tela
        int xx = evt.getXOnScreen();//Retorna a posição x horizontal absoluta do evento.
        int yy = evt.getYOnScreen();//Retorna a posição y vertical absoluta do evento.
        this.setLocation(xx-x,yy-y);//Move este componente para um novo local.
    }//GEN-LAST:event_formMouseDragged

    //metodo para executar o cadastro de clientes no sistema ao clicar no botão de cadastrar
    private void btnCadastrarCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCadClienteActionPerformed
        // verifica se os campos estão vazios e caso estejam emite uma mensagem ao usuario para que preencha todos os campos
        if(txtCnpjAltCliente.getText().equals("") ||txtCpfAltCliente.getText().equals("") || txtEmailCadCliente.getText().equals("") || txtNomeCadCliente.getText().equals("") ||txtSobNomeCadCliente.getText().equals("") ||txtTelCelularCadCliente.getText().equals("") ||txtTelFixoCadCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
        }else 
         // um bloco de tratamento foi utlizado no cadastro
            try {
                // o objeto validar foi criado a partir da classe de validação
                // por meio desse objeto e feita a validação do cpf do cliente ou cnpj
                 Validador validar = new Validador();
                 // se o documento digitado for valido o cadastro é concluido e uma mensagem indicando que o documento é valido será emitida
                 if (validar.isCPF(txtCpfAltCliente.getText())) { // o metodo isCPF verifica se o documento cpf digitado é valido
                     // o metodo de cadastro é executado e em seguida os campos são limpos para que um nvo cadastro seja executado
                     cadastrarItem(txtCpfAltCliente,txtEmailCadCliente,txtNomeCadCliente,txtTelFixoCadCliente,txtTelCelularCadCliente,txtSobNomeCadCliente,txtCnpjAltCliente);
                     limparCampos(txtCpfAltCliente,txtEmailCadCliente,txtNomeCadCliente,txtTelFixoCadCliente,txtTelCelularCadCliente,txtSobNomeCadCliente,txtCnpjAltCliente);
                     resetCampos(txtCpfAltCliente, txtCnpjAltCliente, rbnCpf, rbnCnpj); // por fim os campos de cnpj e cpf são resetados
                     JOptionPane.showMessageDialog(null, "Resultado:\n CPF VALIDO!!!", "Dados validos", JOptionPane.INFORMATION_MESSAGE);
                 } else if (validar.isCNPJ(txtCnpjAltCliente.getText())) {
                     // nesse bloco acontece exatamente o mesmo processo descrito no bloco anterior porem para o documento de cnpj
                     cadastrarItem(txtCnpjAltCliente,txtEmailCadCliente,txtNomeCadCliente,txtTelFixoCadCliente,txtTelCelularCadCliente,txtSobNomeCadCliente,txtCnpjAltCliente);
                     limparCampos(txtCnpjAltCliente,txtEmailCadCliente,txtNomeCadCliente,txtTelFixoCadCliente,txtTelCelularCadCliente,txtSobNomeCadCliente,txtCnpjAltCliente);
                     resetCampos(txtCpfAltCliente, txtCnpjAltCliente, rbnCpf, rbnCnpj); // por fim os campos de cnpj e cpf são resetados
                     JOptionPane.showMessageDialog(null,"Resultado:\n CNPJ VALIDO!!!","Dados validos", JOptionPane.INFORMATION_MESSAGE);
                 }else{
                     // caso o documento digitado não seja valido sera informado ao usuario por meio de uma mensagem que os dados digitados são invalidos
                     JOptionPane.showMessageDialog(null, "Dados invalidos !!", "Não será possivel cadastrar o cliente, verifique o dccumento e digite novamente", JOptionPane.ERROR_MESSAGE);
                 }     
            } catch (SQLException ex) { // tratamento de erro sql
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                 * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                 */
                Logger.getLogger(CadClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_btnCadastrarCadClienteActionPerformed

    //metodo para limpar os campos e resetar os campos de cpf e cnpj caso o usuario clique em cancelar
    private void btnCancelarCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadClienteActionPerformed
        limparCampos(txtCpfAltCliente,txtEmailCadCliente,txtNomeCadCliente,txtTelFixoCadCliente,txtTelCelularCadCliente,txtSobNomeCadCliente,txtCnpjAltCliente);
        resetCampos(txtCpfAltCliente, txtCnpjAltCliente, rbnCpf, rbnCnpj);
        JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCancelarCadClienteActionPerformed

    //metodo para travar a opção de cpf quando o usuario clicar na opção de cpf
    private void rbnCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnCpfMouseClicked
       // se o radiobutton de cpf é selecionado o de cnpj e o campo de cnpj são desabilitados
        if(rbnCpf.isSelected()){
            rbnCnpj.setEnabled(false);
            txtCnpjAltCliente.setEnabled(false);
        }    
    }//GEN-LAST:event_rbnCpfMouseClicked

    //metodo para travar a opção de cnpj quando o usuario clicar na opção de cnpj
    private void rbnCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnCnpjMouseClicked
        // se o radio button de cnpj for selecionado o botão de cpf e o campo de cpf são desabilitados 
        if(rbnCnpj.isSelected()){
            rbnCpf.setEnabled(false);
            txtCpfAltCliente.setEnabled(false);
        }     
    }//GEN-LAST:event_rbnCnpjMouseClicked

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
            java.util.logging.Logger.getLogger(CadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadClienteVIEW().setVisible(true);
            }
        });
    }

    //declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCadCliente;
    private javax.swing.ButtonGroup btnCadastroGrupo;
    private javax.swing.JButton btnCancelarCadCliente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jpaneSupCadCliente;
    private javax.swing.JLabel lblCadAutor;
    private javax.swing.JLabel lblCadNomeCliente;
    private javax.swing.JLabel lblCadSitCadastralCliente;
    private javax.swing.JLabel lblCadSobrenomeCliente;
    private javax.swing.JLabel lblEmailCadCliente;
    private javax.swing.JLabel lblFecharTelaCliente;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JLabel lblTelCelularCadCliente;
    private javax.swing.JLabel lblTelFixoCadCliente;
    private javax.swing.JRadioButton rbnCnpj;
    private javax.swing.JRadioButton rbnCpf;
    private javax.swing.JFormattedTextField txtCnpjAltCliente;
    private javax.swing.JFormattedTextField txtCpfAltCliente;
    private javax.swing.JTextField txtEmailCadCliente;
    private javax.swing.JTextField txtNomeCadCliente;
    private javax.swing.JTextField txtSobNomeCadCliente;
    private javax.swing.JFormattedTextField txtTelCelularCadCliente;
    private javax.swing.JFormattedTextField txtTelFixoCadCliente;
    // End of variables declaration//GEN-END:variables

    //metodo utilizados para realizar ações nos botões
    // criados para fins de reutilização em outras telas e para melhor clareza no entendimento do codigo
    public void cadastrarItem(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JTextField campo6,JTextField campo7) throws SQLException{
        String cpf, cnpj, email, nome,telfixo,telcelular,sobrenome;// cria-se uma string para armazenar os valores rcebidos nos campos

        //os valores digitados nos campos são armazenados
       cpf = campo1.getText();
       email = campo2.getText();
       nome = campo3.getText();
       telfixo = campo4.getText();
       telcelular = campo5.getText();
       sobrenome = campo6.getText();
       cnpj = campo7.getText();

        // uma instancia de objeto da  classe cliente de transferencia  é criada
       // em seguida os metodos de set são instanciados para receber os valores das variaveis
            ClienteDTO objclientdto = new ClienteDTO();
            // uma condição foi criada para caso o botão de cpf seja selecionado o valor de cpf seja armazenado no dto
            if (rbnCpf.isEnabled() == true) {
                objclientdto.setSituacaocad(cpf);
            // eo contrario acontece quando o botão de cnpj é selecionado     
            } else if (rbnCnpj.isEnabled() == true) {
                objclientdto.setSituacaocad(cnpj);
            }
            // essa condição tem como fim o armazenamento do valor corretamente mesmo que o usuario digite em campos trocados.
            objclientdto.setEmail(email);
            objclientdto.setNome(nome);
            objclientdto.setTel_fixo(telfixo);
            objclientdto.setTel_celular(telcelular);
            objclientdto.setSobrenome(sobrenome);

            // uma instancia de objeto da classe de acesso e conexão da class cliente é criada
            // o objeto criado recebe uma instancia de um metodo da classe DAO utilizado para cadastrar o cliente no banco
            ClienteDAO objclientdao = new ClienteDAO();
            objclientdao.cadastrarCliente(objclientdto);

            // por fim uma mensagem em joptionpane é exibida sinalizado que o cadastro foi realizado com sucesso
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso !!!!");  
    }
    
    public void limparCampos(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JTextField campo6,JTextField campo7) // metodo utilzado para limpar os campos
    {
        //os campos recebem uma string vazia como valor e são resetados
        // o botão foi criado para limpar os campos caso queira fazer um novo registro
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
        campo7.setText("");
    }
    
    
    //metodo criado para resetar os campos de cpf e cnpj do formulario
    public void resetCampos(JTextField campo1,JTextField campo2,JRadioButton rb1,JRadioButton rb2){
        campo1.setEnabled(true);
        rb1.setEnabled(true);
        campo2.setEnabled(true);
        rb2.setEnabled(true);
    }

}
