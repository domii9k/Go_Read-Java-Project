package VIEW;

//importações
import DAO.ClienteDAO; //importação da classe dao de cliente para conexaão com o banco de dados
import DTO.ClienteDTO; // importação da classe dto de cliente para transferencias de valor de atributos 
import java.awt.HeadlessException; // importação para tratamento de erros com digitação no teclado
import java.sql.SQLException; // importação para erros de sql
import java.util.logging.Level;// importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane;// importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JRadioButton; // importação de de radiobutton para uso como parametros em metodos
import javax.swing.JTextField;//importação para uso Jtextfield como parametros

/**
 * Tela criada para alteração e exclusão de clientes no sistema
 */

//declaração da classe principal
public class AltCadClienteVIEW extends javax.swing.JFrame {

    /**
     * //metodo construtor para inicialização dos componentes da tela
     * Creates new form telaAlteraçãoAutor
     */
    public AltCadClienteVIEW() {
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

        btnGrupoAltCadClient = new javax.swing.ButtonGroup();
        jdeskAreaImagemAltClientes = new javax.swing.JDesktopPane();
        japaneSupCadCliente = new javax.swing.JPanel();
        lblAlterarCliente = new javax.swing.JLabel();
        lblFecharTelaCliente = new javax.swing.JLabel();
        lblSitCadastralCliente = new javax.swing.JLabel();
        txtSituacaoCadAtual = new javax.swing.JTextField();
        txtBuscaAltCliente = new javax.swing.JTextField();
        btnResetCampos = new javax.swing.JButton();
        rbnAltCnpj = new javax.swing.JRadioButton();
        rbnAltCpf = new javax.swing.JRadioButton();
        lblBuscaBuscarCliente = new javax.swing.JLabel();
        btnOkAltCliente = new javax.swing.JButton();
        lblSituacaoCadCliente = new javax.swing.JLabel();
        lblCpfCliente = new javax.swing.JLabel();
        txtCpfAltCliente = new javax.swing.JFormattedTextField();
        lblCnpjCliente = new javax.swing.JLabel();
        txtCnpjAltCliente = new javax.swing.JFormattedTextField();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeAltCliente = new javax.swing.JTextField();
        lblSobreNomeCliente = new javax.swing.JLabel();
        txtSobNomeAltCliente = new javax.swing.JTextField();
        lblEmailCliente = new javax.swing.JLabel();
        txtEmailAltCliente = new javax.swing.JTextField();
        lblTelefoneFixo = new javax.swing.JLabel();
        txtTelFixoAltCliente = new javax.swing.JFormattedTextField();
        lblTelefoneCel = new javax.swing.JLabel();
        txtTelCellAltCliente1 = new javax.swing.JFormattedTextField();
        btnAlterarAltCliente = new javax.swing.JButton();
        btnExcluirAltCliente = new javax.swing.JButton();
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

        jdeskAreaImagemAltClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        japaneSupCadCliente.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarCliente.setText("ALTERAR CLIENTES");

        lblFecharTelaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout japaneSupCadClienteLayout = new javax.swing.GroupLayout(japaneSupCadCliente);
        japaneSupCadCliente.setLayout(japaneSupCadClienteLayout);
        japaneSupCadClienteLayout.setHorizontalGroup(
            japaneSupCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(japaneSupCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecharTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        japaneSupCadClienteLayout.setVerticalGroup(
            japaneSupCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(japaneSupCadClienteLayout.createSequentialGroup()
                .addGroup(japaneSupCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaCliente)
                    .addGroup(japaneSupCadClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdeskAreaImagemAltClientes.add(japaneSupCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        lblSitCadastralCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSitCadastralCliente.setText("Situação Cadastral atual:");
        jdeskAreaImagemAltClientes.add(lblSitCadastralCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        txtSituacaoCadAtual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSituacaoCadAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSituacaoCadAtual.setEnabled(false);
        jdeskAreaImagemAltClientes.add(txtSituacaoCadAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 310, 20));

        txtBuscaAltCliente.setToolTipText("Digite corretamente o nome do cliente a ser alterado ou excluido");
        txtBuscaAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemAltClientes.add(txtBuscaAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 240, 30));

        btnResetCampos.setBackground(new java.awt.Color(30, 34, 60));
        btnResetCampos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnResetCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCampos.setText("CANCELAR");
        btnResetCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCamposActionPerformed(evt);
            }
        });
        jdeskAreaImagemAltClientes.add(btnResetCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 130, 30));

        btnGrupoAltCadClient.add(rbnAltCnpj);
        rbnAltCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnAltCnpjMouseClicked(evt);
            }
        });
        jdeskAreaImagemAltClientes.add(rbnAltCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        btnGrupoAltCadClient.add(rbnAltCpf);
        rbnAltCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbnAltCpfMouseClicked(evt);
            }
        });
        jdeskAreaImagemAltClientes.add(rbnAltCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        lblBuscaBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaBuscarCliente.setText("Busca por nome:");
        jdeskAreaImagemAltClientes.add(lblBuscaBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        btnOkAltCliente.setBackground(new java.awt.Color(84, 119, 97));
        btnOkAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnOkAltCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnOkAltCliente.setText("OK");
        btnOkAltCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkAltClienteActionPerformed(evt);
            }
        });
        jdeskAreaImagemAltClientes.add(btnOkAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 30));

        lblSituacaoCadCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSituacaoCadCliente.setText("Situação Cadastral:");
        jdeskAreaImagemAltClientes.add(lblSituacaoCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 121, -1));

        lblCpfCliente.setText("CPF:");
        jdeskAreaImagemAltClientes.add(lblCpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, 40));

        txtCpfAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCpfAltCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCpfAltCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtCpfAltCliente.setOpaque(true);
        jdeskAreaImagemAltClientes.add(txtCpfAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, -1));

        lblCnpjCliente.setText("CNPJ:");
        jdeskAreaImagemAltClientes.add(lblCnpjCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 40, 40));

        txtCnpjAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCnpjAltCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCnpjAltCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtCnpjAltCliente.setOpaque(true);
        jdeskAreaImagemAltClientes.add(txtCnpjAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 120, -1));

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeCliente.setText("Nome:");
        jdeskAreaImagemAltClientes.add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 92, -1));

        txtNomeAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemAltClientes.add(txtNomeAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 310, -1));

        lblSobreNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSobreNomeCliente.setText("Sobrenome:");
        jdeskAreaImagemAltClientes.add(lblSobreNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        txtSobNomeAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobNomeAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemAltClientes.add(txtSobNomeAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 310, -1));

        lblEmailCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmailCliente.setText("Email:");
        jdeskAreaImagemAltClientes.add(lblEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 37, -1));

        txtEmailAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmailAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemAltClientes.add(txtEmailAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 310, -1));

        lblTelefoneFixo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefoneFixo.setText("Telefone fixo:");
        jdeskAreaImagemAltClientes.add(lblTelefoneFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 123, -1));

        txtTelFixoAltCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelFixoAltCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelFixoAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelFixoAltCliente.setMaximumSize(new java.awt.Dimension(64, 18));
        txtTelFixoAltCliente.setOpaque(true);
        jdeskAreaImagemAltClientes.add(txtTelFixoAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 310, -1));

        lblTelefoneCel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefoneCel.setText("Telefone celular:");
        jdeskAreaImagemAltClientes.add(lblTelefoneCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 123, -1));

        txtTelCellAltCliente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTelCellAltCliente1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCellAltCliente1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelCellAltCliente1.setMaximumSize(new java.awt.Dimension(64, 18));
        txtTelCellAltCliente1.setOpaque(true);
        jdeskAreaImagemAltClientes.add(txtTelCellAltCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 310, -1));

        btnAlterarAltCliente.setBackground(new java.awt.Color(84, 119, 97));
        btnAlterarAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterarAltCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarAltCliente.setText("ALTERAR");
        btnAlterarAltCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAltClienteActionPerformed(evt);
            }
        });
        jdeskAreaImagemAltClientes.add(btnAlterarAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 30));

        btnExcluirAltCliente.setBackground(new java.awt.Color(30, 34, 60));
        btnExcluirAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluirAltCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAltCliente.setText("EXCLUIR");
        btnExcluirAltCliente.setToolTipText("O Cliente que estiver relacionado a um pedido não poderá ser excluido , exclua primeiro o pedido");
        btnExcluirAltCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAltClienteActionPerformed(evt);
            }
        });
        jdeskAreaImagemAltClientes.add(btnExcluirAltCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 30));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Desktop - 2.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jdeskAreaImagemAltClientes.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jdeskAreaImagemAltClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        setSize(new java.awt.Dimension(730, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //metodo pra definir ação do botão de fechar da tela
    private void lblFecharTelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaClienteMouseClicked
         // fecha essa tela ao clicar no icone de x
        dispose();
    }//GEN-LAST:event_lblFecharTelaClienteMouseClicked


    //metodo para definir as cordenadas da tela no espaço onde esta localizada ao arrastar o mouse
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // outras variaveis são criadas para pegar o valor das cordenadas na tela
        int xx = evt.getXOnScreen(); //Retorna a posição x horizontal absoluta do evento.
        int yy = evt.getYOnScreen(); //Retorna a posição y vertical absoluta do evento.
        this.setLocation(xx-x,yy-y);//Move este componente para um novo local.
    }//GEN-LAST:event_formMouseDragged

    //metodo para definir as cordenadas da tela no espaço onde esta localizada ao pressionar o mouse
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // variaveis recebem as coordenadas
        x = evt.getX(); //Retorna a posição x horizontal do evento em relação ao componente de origem.
        y = evt.getY(); //Retorna a posição vertical y do evento em relação ao componente de origem.
    }//GEN-LAST:event_formMousePressed

    //metodo para realizar consulta no banco ao digitar no campo de texto e retorna o resultado nos campos a serem alterados
    private void btnOkAltClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkAltClienteActionPerformed
        // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
       if(txtBuscaAltCliente.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Digite o valor a ser consultado no campo primeiro!!!");
       }else{
           // declaração de objeto dao para conexão com o banco e instancia do metodo consultar 
           ClienteDAO objconsultar = new ClienteDAO();
           try {// a consulta ocorre dentro de um bloco de tratamento
                // o objeto criado para consulta instancia o metodo consulta e 
                //recebe como parametros  campos de texto,  um para consulta , e os outros para receberem o resultado
               objconsultar.consultar(txtBuscaAltCliente, txtNomeAltCliente, txtSobNomeAltCliente, txtSituacaoCadAtual, txtEmailAltCliente, txtTelFixoAltCliente, txtTelCellAltCliente1);
           } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
               /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
              */
               Logger.getLogger(AltCadClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_btnOkAltClienteActionPerformed

    //metodo para executar a ação de alteração ao clicar no botão alterar
    private void btnAlterarAltClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAltClienteActionPerformed
        // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtBuscaAltCliente.getText().isEmpty() || txtNomeAltCliente.getText().isEmpty() || txtSobNomeAltCliente.getText().isEmpty() || txtCnpjAltCliente.getText().isEmpty() || txtCpfAltCliente.getText().isEmpty() ||txtEmailAltCliente.getText().isEmpty() ||txtTelCellAltCliente1.getText().isEmpty() ||txtTelFixoAltCliente.getText().isEmpty() ||txtSituacaoCadAtual.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
       }else{
            try {// o metodo de alteração acontece de um bloco de tratamento
                // declaração do objeto dao de autor para conexão com o banco e instancia do metodo alterar
                ClienteDAO objalterar = new ClienteDAO();
                // o objeto criado instancia o metodo alterar que recebe como parametros os campos
                // a serem alterados e por ultimo o parametro que indica  a chave do registro onde será feita a alteração 
                // em seguida os campos são limpos e os campos de cpf e cnpj resetados
                objalterar.alterar(rbnAltCpf, rbnAltCnpj, txtEmailAltCliente, txtNomeAltCliente, txtSobNomeAltCliente, txtTelFixoAltCliente, txtTelCellAltCliente1, txtCpfAltCliente, txtCnpjAltCliente, txtSituacaoCadAtual);
                limparCampos(txtNomeAltCliente, txtSobNomeAltCliente, txtCpfAltCliente, txtEmailAltCliente, txtTelFixoAltCliente, txtTelCellAltCliente1);
                resetCampos(txtCpfAltCliente, txtCnpjAltCliente, rbnAltCpf, rbnAltCnpj);
                //caso seja executado com sucesso a alteração uma mensagem é emitida ao usuario
                JOptionPane.showMessageDialog(null, "dados alterados com sucesso!!");
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                  * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                  */
                Logger.getLogger(AltCadClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
    }//GEN-LAST:event_btnAlterarAltClienteActionPerformed

    //metodo para excluir registros da tabela cliente do banco de dados
    private void btnExcluirAltClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAltClienteActionPerformed
       // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtCpfAltCliente.getText().equals("") || txtNomeAltCliente.getText().equals("") || txtSobNomeAltCliente.getText().equals("") || txtCnpjAltCliente.getText().equals("") || txtEmailAltCliente.getText().equals("") || txtSituacaoCadAtual.getText().equals("") || txtTelCellAltCliente1.getText().equals("") || txtTelFixoAltCliente.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
        }else{
            //foi criada um tela de confirmação para que o usuario confirme se deseja realmente excluir o registro indicado
            int respostaJOptionPane = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esse cadastro ?",
                    "Apagar Cadastro", JOptionPane.YES_NO_OPTION);
             //caso a opção seja sim  o metodo de exclusão será executado
            if(respostaJOptionPane == JOptionPane.YES_OPTION)
            {
                try {// dentro do bloco de tratamento o metodo de exclusão e executado e recebe como parametro a caixa onde foi digitado o id do autor
                    // esse indicara qual registro será excluido
                    excluirCliente(txtSituacaoCadAtual); //método para apagar
                    JOptionPane.showMessageDialog(null, "Cliente Excluido!!");//mensagem indicando que o registro selecionado foi excluido
                } catch (HeadlessException e) {// tratamento de erros de digitação
                    JOptionPane.showMessageDialog(null,"Cliente não poderá ser deletado" + e);
                } catch (SQLException ex) {// tratamento para erros sql
                    //mensagem indicando erro de violação na integridade
                    JOptionPane.showMessageDialog(null, "Problema de violação da integridade do banco remova primeiro o Pedido!!!"+ ex); 
                    /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                    * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                    */
                    Logger.getLogger(AltCadClienteVIEW.class.getName()).log(Level.SEVERE, null, ex);
                }
             //caso a opção seja não a operação será cancelada 
            }else if (respostaJOptionPane == JOptionPane.NO_OPTION){
                //uma mensagem e emitida para usuario indicando que a operação foi cancelada
                JOptionPane.showMessageDialog(null, "Operação cancelada!!!");
            }
        }
        // os campos são limpos após a execução do metodo de exclusão
        limparCampos(txtNomeAltCliente,txtSobNomeAltCliente,txtCpfAltCliente,txtEmailAltCliente,txtTelFixoAltCliente,txtTelCellAltCliente1);
    }//GEN-LAST:event_btnExcluirAltClienteActionPerformed

    //metodo para travar a opção de cpf quando o usuario clicar na opção de cpf
    private void rbnAltCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnAltCpfMouseClicked
       // se o radiobutton de cpf é selecionado o de cnpj e o campo de cnpj são desabilitados
        if(rbnAltCpf.isSelected()){
            rbnAltCnpj.setEnabled(false);
            txtCnpjAltCliente.setEnabled(false);
        }  
    }//GEN-LAST:event_rbnAltCpfMouseClicked

    //metodo para travar a opção de cnpj quando o usuario clicar na opção de cnpj
    private void rbnAltCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbnAltCnpjMouseClicked
        // se o radio button de cnpj for selecionado o botão de cpf e o campo de cpf são desabilitados 
        if(rbnAltCnpj.isSelected()){
            rbnAltCpf.setEnabled(false);
            txtCpfAltCliente.setEnabled(false);
        } 
    }//GEN-LAST:event_rbnAltCnpjMouseClicked

    //metodo para limpar os campos e resetar os campos de cpf e cnpj caso o usuario clique em cancelar
    private void btnResetCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCamposActionPerformed
        limparCampos(txtNomeAltCliente,txtSobNomeAltCliente,txtCpfAltCliente,txtEmailAltCliente,txtTelFixoAltCliente,txtTelCellAltCliente1);
        resetCampos(txtCpfAltCliente, txtCnpjAltCliente, rbnAltCpf, rbnAltCnpj);
        JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnResetCamposActionPerformed

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
            java.util.logging.Logger.getLogger(AltCadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltCadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltCadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltCadClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltCadClienteVIEW().setVisible(true);
            }
        });
    }

    //declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAltCliente;
    private javax.swing.JButton btnExcluirAltCliente;
    private javax.swing.ButtonGroup btnGrupoAltCadClient;
    private javax.swing.JButton btnOkAltCliente;
    private javax.swing.JButton btnResetCampos;
    private javax.swing.JPanel japaneSupCadCliente;
    private javax.swing.JDesktopPane jdeskAreaImagemAltClientes;
    private javax.swing.JLabel lblAlterarCliente;
    private javax.swing.JLabel lblBuscaBuscarCliente;
    private javax.swing.JLabel lblCnpjCliente;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblFecharTelaCliente;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblSitCadastralCliente;
    private javax.swing.JLabel lblSituacaoCadCliente;
    private javax.swing.JLabel lblSobreNomeCliente;
    private javax.swing.JLabel lblTelefoneCel;
    private javax.swing.JLabel lblTelefoneFixo;
    private javax.swing.JRadioButton rbnAltCnpj;
    private javax.swing.JRadioButton rbnAltCpf;
    private javax.swing.JTextField txtBuscaAltCliente;
    private javax.swing.JFormattedTextField txtCnpjAltCliente;
    private javax.swing.JFormattedTextField txtCpfAltCliente;
    private javax.swing.JTextField txtEmailAltCliente;
    private javax.swing.JTextField txtNomeAltCliente;
    private javax.swing.JTextField txtSituacaoCadAtual;
    private javax.swing.JTextField txtSobNomeAltCliente;
    private javax.swing.JFormattedTextField txtTelCellAltCliente1;
    private javax.swing.JFormattedTextField txtTelFixoAltCliente;
    // End of variables declaration//GEN-END:variables

    //metodo para exclusão de clientes com o parametro do campo indicando qual a chave utilizada para indicar o registro a ser removido
    public void excluirCliente(JTextField campocodigo) throws SQLException{
        //uma variavel é criada para receber o campo de texto com a informação inserida
        String cpf_cnpj;
        
        // a variavel recebe o que for inserido no campo chave
        cpf_cnpj = campocodigo.getText();
        
        //o objeto dto de cliente é declarado e em seguida e setado o valor do atributo cpf_cnpj
        ClienteDTO objexcluir = new ClienteDTO();
        objexcluir.setSituacaocad(cpf_cnpj);
        
        // o objeto dao de cliente é criado e em seguida e instanciado o metodo par excluir o autor 
        //que recebe como parametro o objdedto com o valor setado.
        ClienteDAO objDao = new ClienteDAO();
        objDao.excluirCliente(objexcluir);
    }
    
    public void limparCampos(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5,JTextField campo6) // metodo utilzado para limpar os campos
    {
        //os campos recebem uma string vazia como valor e são resetados
        // o botão foi criado para limpar os campos caso queira fazer um novo registro
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
        campo6.setText("");
    }
    
    //metodo para resetar os campos de cpf e cnpj que recebe como parametro os campos de texto e os radiobuttons 
    public void resetCampos(JTextField campo1,JTextField campo2,JRadioButton rb1,JRadioButton rb2){
        campo1.setEnabled(true);
        rb1.setEnabled(true);
        campo2.setEnabled(true);
        rb2.setEnabled(true);
    }

}
