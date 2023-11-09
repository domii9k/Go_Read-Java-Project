package VIEW;

//importações
import DAO.EbookDAO; // importação da classe dao de ebook para conexão com o banco
import DTO.EbookDTO; // importação da classe dto de ebook para transferencia de atributos 
import java.awt.HeadlessException; // importação para tratamento de erro de digitação
import java.sql.SQLException; // importação para tratamento de erros sql
import java.text.ParseException; // importação para tratamento de erro na conversão de numeros
import java.text.SimpleDateFormat; // importação para formatação de data
import java.util.logging.Level;// importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane; // importação de de radiobutton para uso como parametros em metodos
import javax.swing.JTextField;//importação para uso Jtextfield como parametros

/**
 * Tela criada para alteração e exclusão de ebooks
 * 
 */

//declaração de classe
public class AltCadEbookVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para inicialização de componentes
     * Creates new form telaAlteraçãoAutor
     */
    public AltCadEbookVIEW() {
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

        jdeskAreaImagemEbook = new javax.swing.JDesktopPane();
        txtAltCategoriaCadEbook = new javax.swing.JComboBox<>();
        btnCancelarAltEbook = new javax.swing.JButton();
        lblAltEditoraCnpj = new javax.swing.JLabel();
        jpaneSupAltEbook = new javax.swing.JPanel();
        lblAlterarEbook = new javax.swing.JLabel();
        lblFecharTelaEbook = new javax.swing.JLabel();
        txtCnpjEditora = new javax.swing.JFormattedTextField();
        txtBuscaAtlEbook = new javax.swing.JTextField();
        lblBuscaTitulo = new javax.swing.JLabel();
        txtAltAnoPublicacao = new javax.swing.JFormattedTextField();
        lblIsbnAltEbook = new javax.swing.JLabel();
        btnConsultaEbook = new javax.swing.JButton();
        txtIsbnEbook = new javax.swing.JTextField();
        btnAlterarAltEbook = new javax.swing.JButton();
        btnExcluirAltEbook = new javax.swing.JButton();
        lblAltValorUnitario = new javax.swing.JLabel();
        lblAltTitulo = new javax.swing.JLabel();
        lblPesoArquivoEbook = new javax.swing.JLabel();
        txtValorUnitarioAltEbook = new javax.swing.JTextField();
        txtPesoArqAltEbook = new javax.swing.JTextField();
        txtQuantPagAltEbook = new javax.swing.JTextField();
        txtTituloAltEbook = new javax.swing.JTextField();
        lblAltQtdPaginasEbook = new javax.swing.JLabel();
        lblAnoPubAltEbook = new javax.swing.JLabel();
        lblAltCategoriaEbook = new javax.swing.JLabel();
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

        jdeskAreaImagemEbook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAltCategoriaCadEbook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplicativos", "Programação", "Manutenção de computadores", "Banco de dados", "Desenvolvimento Web" }));
        jdeskAreaImagemEbook.add(txtAltCategoriaCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 310, -1));

        btnCancelarAltEbook.setBackground(new java.awt.Color(30, 34, 60));
        btnCancelarAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelarAltEbook.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAltEbook.setText("CANCELAR");
        btnCancelarAltEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAltEbookActionPerformed(evt);
            }
        });
        jdeskAreaImagemEbook.add(btnCancelarAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 130, 30));

        lblAltEditoraCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltEditoraCnpj.setText("Editora Cnpj:");
        jdeskAreaImagemEbook.add(lblAltEditoraCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 110, -1));

        jpaneSupAltEbook.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarEbook.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarEbook.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarEbook.setText("ALTERAR EBOOK");

        lblFecharTelaEbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaEbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaEbookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupAltEbookLayout = new javax.swing.GroupLayout(jpaneSupAltEbook);
        jpaneSupAltEbook.setLayout(jpaneSupAltEbookLayout);
        jpaneSupAltEbookLayout.setHorizontalGroup(
            jpaneSupAltEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupAltEbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarEbook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecharTelaEbook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupAltEbookLayout.setVerticalGroup(
            jpaneSupAltEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupAltEbookLayout.createSequentialGroup()
                .addGroup(jpaneSupAltEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaEbook)
                    .addGroup(jpaneSupAltEbookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarEbook, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jdeskAreaImagemEbook.add(jpaneSupAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        txtCnpjEditora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtCnpjEditora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpjEditora.setToolTipText("O cnpj da editora não pode ser alterado");
        txtCnpjEditora.setEnabled(false);
        jdeskAreaImagemEbook.add(txtCnpjEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 310, 20));

        txtBuscaAtlEbook.setToolTipText("Digite  corretamente o titulo do livro  a ser alterado ou excluido");
        txtBuscaAtlEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemEbook.add(txtBuscaAtlEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 240, 30));

        lblBuscaTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaTitulo.setText("Buscar por titulo:");
        jdeskAreaImagemEbook.add(lblBuscaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtAltAnoPublicacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtAltAnoPublicacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAltAnoPublicacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAltAnoPublicacao.setMaximumSize(new java.awt.Dimension(64, 18));
        txtAltAnoPublicacao.setOpaque(true);
        jdeskAreaImagemEbook.add(txtAltAnoPublicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 80, -1));

        lblIsbnAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIsbnAltEbook.setText("Isbn:");
        jdeskAreaImagemEbook.add(lblIsbnAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, -1));

        btnConsultaEbook.setBackground(new java.awt.Color(84, 119, 97));
        btnConsultaEbook.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnConsultaEbook.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaEbook.setText("OK");
        btnConsultaEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEbookActionPerformed(evt);
            }
        });
        jdeskAreaImagemEbook.add(btnConsultaEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 30));

        txtIsbnEbook.setToolTipText("O isbn do livro não pode ser alterado");
        txtIsbnEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIsbnEbook.setEnabled(false);
        jdeskAreaImagemEbook.add(txtIsbnEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 310, 20));

        btnAlterarAltEbook.setBackground(new java.awt.Color(84, 119, 97));
        btnAlterarAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterarAltEbook.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarAltEbook.setText("ALTERAR");
        btnAlterarAltEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAltEbookActionPerformed(evt);
            }
        });
        jdeskAreaImagemEbook.add(btnAlterarAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 30));

        btnExcluirAltEbook.setBackground(new java.awt.Color(30, 34, 60));
        btnExcluirAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluirAltEbook.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAltEbook.setText("EXCLUIR");
        btnExcluirAltEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAltEbookActionPerformed(evt);
            }
        });
        jdeskAreaImagemEbook.add(btnExcluirAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 30));

        lblAltValorUnitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltValorUnitario.setText("Valor unitario:");
        jdeskAreaImagemEbook.add(lblAltValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 92, -1));

        lblAltTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltTitulo.setText("Titulo:");
        jdeskAreaImagemEbook.add(lblAltTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 37, -1));

        lblPesoArquivoEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesoArquivoEbook.setText("Peso arquivo:");
        jdeskAreaImagemEbook.add(lblPesoArquivoEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 92, -1));

        txtValorUnitarioAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValorUnitarioAltEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtValorUnitarioAltEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitarioAltEbookActionPerformed(evt);
            }
        });
        jdeskAreaImagemEbook.add(txtValorUnitarioAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 90, -1));

        txtPesoArqAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesoArqAltEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemEbook.add(txtPesoArqAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 310, -1));

        txtQuantPagAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantPagAltEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemEbook.add(txtQuantPagAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 310, -1));

        txtTituloAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTituloAltEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdeskAreaImagemEbook.add(txtTituloAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 310, -1));

        lblAltQtdPaginasEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltQtdPaginasEbook.setText("Quantidade de paginas:");
        jdeskAreaImagemEbook.add(lblAltQtdPaginasEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        lblAnoPubAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAnoPubAltEbook.setText("Ano de publicação:");
        jdeskAreaImagemEbook.add(lblAnoPubAltEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 123, -1));

        lblAltCategoriaEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAltCategoriaEbook.setText("Categoria:");
        jdeskAreaImagemEbook.add(lblAltCategoriaEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 78, -1));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Desktop - 2.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jdeskAreaImagemEbook.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jdeskAreaImagemEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        setSize(new java.awt.Dimension(730, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    //metodo pra definir ação do botão de fechar da tela
    private void lblFecharTelaEbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaEbookMouseClicked
         // fecha essa tela ao clicar no icone de x
        dispose();
    }//GEN-LAST:event_lblFecharTelaEbookMouseClicked

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

     //metodo para excluir registros da tabela ebook do banco de dados
    private void btnExcluirAltEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAltEbookActionPerformed
         // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtIsbnEbook.getText().equals("") || txtCnpjEditora.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Para Excluir informe o ISBN e o CNPJ Da editora!!!");
        }else{
            //foi criada um tela de confirmação para que o usuario confirme se deseja realmente excluir o registro indicado
            int respostaJOptionPane = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esse Ebook ?",
                    "Apagar Cadastro", JOptionPane.YES_NO_OPTION);
            //caso a opção seja sim  o metodo de exclusão será executado
            if(respostaJOptionPane == JOptionPane.YES_OPTION)
            {
                try {// dentro do bloco de tratamento o metodo de exclusão e executado e recebe como parametro 
                    //a caixa onde foi digitado o id do autor
                    // esse indicara qual registro será excluido
                     excluirEbook(txtIsbnEbook, txtCnpjEditora);//método para apagar
                     limparCampos(txtTituloAltEbook,txtQuantPagAltEbook,txtValorUnitarioAltEbook,txtPesoArqAltEbook,txtAltAnoPublicacao);
                    JOptionPane.showMessageDialog(null, "Ebook Excluido!!");//mensagem indicando que o registro selecionado foi excluido
                }catch (HeadlessException e) { //tratamento de erros de digitação
                    JOptionPane.showMessageDialog(null,"Ebook não poderá ser deletado" + e);
                }
                //caso a opção seja não a operação será cancelada 
            }else if (respostaJOptionPane == JOptionPane.NO_OPTION){
                //uma mensagem e emitida para usuario indicando que a operação foi cancelada
                JOptionPane.showMessageDialog(null, "Operação cancelada!!!");
            }
        }
        
    }//GEN-LAST:event_btnExcluirAltEbookActionPerformed

    //metodo para realizar consulta no banco ao digitar no campo de texto e retorna o resultado nos campos a serem alterados
    private void btnConsultaEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEbookActionPerformed
        // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtBuscaAtlEbook.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Digite o valor a ser consultado no campo primeiro!!!");
       }else{
            // declaração de objeto dao para conexão com o banco e instancia do metodo consultar 
            EbookDAO objconsultar = new EbookDAO();
            try {// a consulta ocorre dentro de um bloco de tratamento
                // o objeto criado para consulta instancia o metodo consulta e 
                // recebe como parametros 3 campos  um para consulta , e os outros para receberem o resultado
                objconsultar.consultar(txtBuscaAtlEbook, txtIsbnEbook, txtTituloAltEbook, txtQuantPagAltEbook, txtValorUnitarioAltEbook, txtPesoArqAltEbook, txtAltCategoriaCadEbook, txtAltAnoPublicacao, txtCnpjEditora);
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                 /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                 * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                 */
                Logger.getLogger(AltCadEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultaEbookActionPerformed

    //metodo para executar a ação de alteração ao clicar no botão alterar
    private void btnAlterarAltEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAltEbookActionPerformed
        // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos 
        if(txtIsbnEbook.getText().isEmpty() || txtAltAnoPublicacao.getText().isEmpty() || txtAltCategoriaCadEbook.getSelectedItem().equals("") || txtTituloAltEbook.getText().isEmpty() || txtCnpjEditora.getText().isEmpty() || txtIsbnEbook.getText().isEmpty() || txtPesoArqAltEbook.getText().isEmpty()||txtQuantPagAltEbook.getText().isEmpty() || txtValorUnitarioAltEbook.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
       }else{
            // declaração do objeto dto para setar os valores digitados
           EbookDTO objalterar = new EbookDTO();
           //pegar os dados dos componentes e jogar na classe CadastroCliente
           // os valores digitados nos campos são armazenados no objeto dto
            objalterar.setTitulo_eb(txtTituloAltEbook.getText());
            objalterar.setValor_unit(Float.parseFloat(txtValorUnitarioAltEbook.getText()));
            objalterar.setPeso_arquivo(Float.parseFloat(txtPesoArqAltEbook.getText()));
            objalterar.setQuantidade_paginas(Integer.parseInt(txtQuantPagAltEbook.getText()));
            
       
            // em seguida é feita uma mascara de formatação para receber o valor da data no formato padrao
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            try { // dentro do bloco de tratamento  a conversao da data digitada 
                //por fim é setada a data no objeto de dto
                java.util.Date date = sdf.parse(txtAltAnoPublicacao.getText());
                java.sql.Date dataSql = new java.sql.Date(date.getTime());
                // por fim a data é inserida formatada no objeto dto
                objalterar.setAno_publicacao(dataSql); 
            } catch (ParseException ex) { // caso haja algum erro na formatação data será informado
                JOptionPane.showMessageDialog(null, "Erro na formatação de data!!!!" +ex);
                Logger.getLogger(AltCadEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
            // ultimos atributos a serem setados no objeto dto
            objalterar.setCategoria(txtAltCategoriaCadEbook.getSelectedItem().toString());
            objalterar.setIsbn(txtIsbnEbook.getText());

            // declaração do objeto dao de ebook para conexão com o banco e instancia do metodo alterar
            EbookDAO objatualizar = new EbookDAO();
            try {
                // o metodo de alteração acontece de um bloco de tratamento
                // o objeto criado instancia o metodo alterar que recebe como parametro os campos
                // a serem alterados e por ultimo o parametro que indica  a chave do registro onde será feita a alteração 
                objatualizar.atualizarDados(objalterar);
                limparCampos(txtAltAnoPublicacao, txtTituloAltEbook, txtValorUnitarioAltEbook, txtQuantPagAltEbook, txtPesoArqAltEbook);
                 //caso seja executado com sucesso a alteração uma mensagem é emitida ao usuario
            JOptionPane.showMessageDialog(null, "dados alterados com sucesso !!!!");
            
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                  * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                  */
                //Caso a alteração não seja possivel uma mensagem de erro será informada ao usuario
                JOptionPane.showMessageDialog(null, "Erro na alteração de dados!!!"+ ex); 
                Logger.getLogger(AltCadEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnAlterarAltEbookActionPerformed

    //metodo para cancelar e limpar os campos caso o usuario clique no botao cancelar
    private void btnCancelarAltEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltEbookActionPerformed
         limparCampos(txtAltAnoPublicacao, txtTituloAltEbook, txtValorUnitarioAltEbook, txtQuantPagAltEbook, txtPesoArqAltEbook);
         JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCancelarAltEbookActionPerformed

    private void txtValorUnitarioAltEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitarioAltEbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioAltEbookActionPerformed

    /**
     * //metodo principal para executar a tela
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
            java.util.logging.Logger.getLogger(AltCadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltCadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltCadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltCadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AltCadEbookVIEW().setVisible(true);
            }
        });
    }

    //declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAltEbook;
    private javax.swing.JButton btnCancelarAltEbook;
    private javax.swing.JButton btnConsultaEbook;
    private javax.swing.JButton btnExcluirAltEbook;
    private javax.swing.JDesktopPane jdeskAreaImagemEbook;
    private javax.swing.JPanel jpaneSupAltEbook;
    private javax.swing.JLabel lblAltCategoriaEbook;
    private javax.swing.JLabel lblAltEditoraCnpj;
    private javax.swing.JLabel lblAltQtdPaginasEbook;
    private javax.swing.JLabel lblAltTitulo;
    private javax.swing.JLabel lblAltValorUnitario;
    private javax.swing.JLabel lblAlterarEbook;
    private javax.swing.JLabel lblAnoPubAltEbook;
    private javax.swing.JLabel lblBuscaTitulo;
    private javax.swing.JLabel lblFecharTelaEbook;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JLabel lblIsbnAltEbook;
    private javax.swing.JLabel lblPesoArquivoEbook;
    private javax.swing.JFormattedTextField txtAltAnoPublicacao;
    private javax.swing.JComboBox<String> txtAltCategoriaCadEbook;
    private javax.swing.JTextField txtBuscaAtlEbook;
    private javax.swing.JFormattedTextField txtCnpjEditora;
    private javax.swing.JTextField txtIsbnEbook;
    private javax.swing.JTextField txtPesoArqAltEbook;
    private javax.swing.JTextField txtQuantPagAltEbook;
    private javax.swing.JTextField txtTituloAltEbook;
    private javax.swing.JTextField txtValorUnitarioAltEbook;
    // End of variables declaration//GEN-END:variables

    //metodo para realizar ações no botões 
    //metodo para excluir um ebook que recebe dois parametros um para o isbn do livro e outro para o cnpj da editora
    public void excluirEbook(JTextField campocodigo, JTextField campocnpj){
        // duas strings são criadas para receber o isbn e cnpj da editora
        String isbn,cnpj_editora;
        
        //as variaveis recebem o valor setado em ambos os campos
        isbn = campocodigo.getText();
        cnpj_editora = campocnpj.getText();
        
        // um objeto dto é declarado
        EbookDTO objexcluir = new EbookDTO();
        //os valores são setados no objeto dto
        objexcluir.setIsbn(isbn);
        objexcluir.setEditora_cnpj(cnpj_editora);
        
        //em seguida um objeto dao é declarado e instanciado o metodo de exclusão
        EbookDAO objDao = new EbookDAO();
        try {
            // o metodo recebe como parametro o objeto dto com os valores setados anteriormente
            objDao.excluirEbook(objexcluir);
        } catch (SQLException ex) { // um tratamento será executado caso ocorra algum erro na exclusão
            Logger.getLogger(AltCadEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // metodo utilzado para limpar os campos
    public void limparCampos(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo5) 
    {
        //campos recebem uma string vazia como valor e são resetados
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo5.setText("");
    }

}
