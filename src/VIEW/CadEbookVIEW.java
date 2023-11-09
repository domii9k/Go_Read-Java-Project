package VIEW;

//importações 
import DAO.EbookDAO; // importação da classe Dao de ebook para conexões com o banoco
import DTO.EbookDTO; // importação da classe dto de ebook para transferencias do objeto
import java.sql.Date; // importação do sql data para tratamento e conversão de datas 
import java.sql.SQLException; // importação para tratamento de erros relazionados com o banco
import java.text.ParseException; //importação para tratamento de erros de conversão de texto para numeros
import java.text.SimpleDateFormat; // importação para formatação da data
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JComboBox; // importação da classe jcombox como parametro
import javax.swing.JOptionPane;// importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTextField;// importação do jtextfield para indicar parametros de campo de texto em metodos

/**
 * Tela criada para executar o cadastro de
 * livros digitais 
 * no sistema da livraria.
 * @author Grupo em conjunto cada membro fez uma tela.
 */

//declaração da classe
public class CadEbookVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para inicializar 
     * os componentes da tela.
     * Creates new form telaCadastral
     */
    public CadEbookVIEW() {
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

        jDesktopPane2 = new javax.swing.JDesktopPane();
        txtCategoriaCadEbook = new javax.swing.JComboBox<>();
        txtValorUnitarioCadEbook = new javax.swing.JTextField();
        jpaneSupCadEbook = new javax.swing.JPanel();
        lblAlterarAutor = new javax.swing.JLabel();
        lblFecharTelaEbook = new javax.swing.JLabel();
        txtEditoraCnpjAltCad = new javax.swing.JFormattedTextField();
        txtPesoArquivoCadEbook = new javax.swing.JTextField();
        txtAnoPublicacaoCadEbook = new javax.swing.JFormattedTextField();
        lblCadAutorIDEbook = new javax.swing.JLabel();
        lblEditoraCnpjEbook = new javax.swing.JLabel();
        txtAutorID = new javax.swing.JTextField();
        txtTituloCadEbook = new javax.swing.JTextField();
        lblTituloCadEbook = new javax.swing.JLabel();
        lblValorCadEbook = new javax.swing.JLabel();
        txtQtdPaginasCadEbook = new javax.swing.JTextField();
        lblPesoArquivoCadEbook = new javax.swing.JLabel();
        lblQtdPaginasCadEbook = new javax.swing.JLabel();
        lblIsbnCadEbook = new javax.swing.JLabel();
        lblAnoPubCadEbook = new javax.swing.JLabel();
        lblCategoriaCadEbook = new javax.swing.JLabel();
        btnCadastrarCadEbook = new javax.swing.JButton();
        btnCancelarCadEbook = new javax.swing.JButton();
        txtIsbnCadEbook = new javax.swing.JTextField();
        lblFundoImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCategoriaCadEbook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aplicativos", "Programação", "Manutenção de computadores", "Banco de dados", "Desenvolvimento Web" }));
        jDesktopPane2.add(txtCategoriaCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 310, -1));

        txtValorUnitarioCadEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValorUnitarioCadEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(txtValorUnitarioCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 80, -1));

        jpaneSupCadEbook.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarAutor.setText("CADASTRO EBOOK");

        lblFecharTelaEbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaEbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaEbookMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupCadEbookLayout = new javax.swing.GroupLayout(jpaneSupCadEbook);
        jpaneSupCadEbook.setLayout(jpaneSupCadEbookLayout);
        jpaneSupCadEbookLayout.setHorizontalGroup(
            jpaneSupCadEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupCadEbookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecharTelaEbook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupCadEbookLayout.setVerticalGroup(
            jpaneSupCadEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupCadEbookLayout.createSequentialGroup()
                .addGroup(jpaneSupCadEbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecharTelaEbook)
                    .addGroup(jpaneSupCadEbookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane2.add(jpaneSupCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        txtEditoraCnpjAltCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtEditoraCnpjAltCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane2.add(txtEditoraCnpjAltCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 310, 20));

        txtPesoArquivoCadEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesoArquivoCadEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(txtPesoArquivoCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 310, -1));

        txtAnoPublicacaoCadEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtAnoPublicacaoCadEbook.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jDesktopPane2.add(txtAnoPublicacaoCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 80, 20));

        lblCadAutorIDEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCadAutorIDEbook.setText("Autor ID:");
        jDesktopPane2.add(lblCadAutorIDEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        lblEditoraCnpjEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEditoraCnpjEbook.setText("Editora CNPJ:");
        jDesktopPane2.add(lblEditoraCnpjEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        txtAutorID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAutorID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(txtAutorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 310, -1));

        txtTituloCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTituloCadEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(txtTituloCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 310, 20));

        lblTituloCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTituloCadEbook.setText("Titulo:");
        jDesktopPane2.add(lblTituloCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 40, 20));

        lblValorCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblValorCadEbook.setText("Valor Unitario:");
        jDesktopPane2.add(lblValorCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 90, 20));

        txtQtdPaginasCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtQtdPaginasCadEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(txtQtdPaginasCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 310, -1));

        lblPesoArquivoCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPesoArquivoCadEbook.setText("Peso Arquivo:");
        jDesktopPane2.add(lblPesoArquivoCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 90, -1));

        lblQtdPaginasCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblQtdPaginasCadEbook.setText("Qtd. Paginas:");
        jDesktopPane2.add(lblQtdPaginasCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 86, -1));

        lblIsbnCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblIsbnCadEbook.setText("ISBN:");
        jDesktopPane2.add(lblIsbnCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 86, 20));

        lblAnoPubCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAnoPubCadEbook.setText("Ano de Publicação:");
        jDesktopPane2.add(lblAnoPubCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, -1));

        lblCategoriaCadEbook.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCategoriaCadEbook.setText("Categoria:");
        jDesktopPane2.add(lblCategoriaCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 86, 20));

        btnCadastrarCadEbook.setBackground(new java.awt.Color(84, 119, 97));
        btnCadastrarCadEbook.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCadEbook.setText("CADASTRAR");
        btnCadastrarCadEbook.setToolTipText("Para cadastrar um ebook digite todos os valores nos campos corretamente");
        btnCadastrarCadEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCadEbookActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btnCadastrarCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 130, 30));

        btnCancelarCadEbook.setBackground(new java.awt.Color(30, 34, 60));
        btnCancelarCadEbook.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCadEbook.setText("CANCELAR");
        btnCancelarCadEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadEbookActionPerformed(evt);
            }
        });
        jDesktopPane2.add(btnCancelarCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 130, 30));

        txtIsbnCadEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIsbnCadEbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane2.add(txtIsbnCadEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 310, -1));

        lblFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaCadastro.png"))); // NOI18N
        lblFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jDesktopPane2.add(lblFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //metodo para fechar a tela ao clicar no icone de x
    private void lblFecharTelaEbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaEbookMouseClicked
        // metodo para encerrar a tela que está sendo executada
        dispose();
    }//GEN-LAST:event_lblFecharTelaEbookMouseClicked

    //metodo para definir as cordenadas da tela no espaço onde esta localizada ao pressionar o mouse sobre a tela
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

    //metodo para executar a ação de limpar todos os campos ao clicar no botão cancelar
    private void btnCancelarCadEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadEbookActionPerformed
         limparCampos(txtTituloCadEbook,txtQtdPaginasCadEbook,txtValorUnitarioCadEbook,txtPesoArquivoCadEbook,txtAnoPublicacaoCadEbook,txtIsbnCadEbook,txtEditoraCnpjAltCad,txtAutorID);
          JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCancelarCadEbookActionPerformed

    //metodo para relizar o cadastro de ebooks clicar no botão cadastrar
    private void btnCadastrarCadEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCadEbookActionPerformed
       // caso os campos estiverem vazios uma tela aparece ao pressionar o botão de cadastro solicitando que preencha todos os campos
        if(txtAnoPublicacaoCadEbook.getText().equals("") ||txtAutorID.getText().equals("") || txtCategoriaCadEbook.getSelectedItem().equals("") || txtEditoraCnpjAltCad.getText().equals("") ||txtIsbnCadEbook.getText().equals("") ||txtPesoArquivoCadEbook.getText().equals("") ||txtQtdPaginasCadEbook.getText().equals("") ||txtTituloCadEbook.getText().equals("") ||txtValorUnitarioCadEbook.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
        }else{
              try { // o comando de cadastro e executado dentro de um bloco de tratamento 
                  cadastrarItem(txtTituloCadEbook, txtQtdPaginasCadEbook, txtValorUnitarioCadEbook, txtPesoArquivoCadEbook, txtCategoriaCadEbook, txtAnoPublicacaoCadEbook, txtIsbnCadEbook, txtEditoraCnpjAltCad, txtAutorID);
              } catch (SQLException | ParseException ex) { // nesse bloco estão sendo considerados tanto o erro de sql como o de conversão
                  /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                   * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                   */
                  Logger.getLogger(CadEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
    }//GEN-LAST:event_btnCadastrarCadEbookActionPerformed

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
            java.util.logging.Logger.getLogger(CadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEbookVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEbookVIEW().setVisible(true);
            }
        });
    }

    // declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCadEbook;
    private javax.swing.JButton btnCancelarCadEbook;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel jpaneSupCadEbook;
    private javax.swing.JLabel lblAlterarAutor;
    private javax.swing.JLabel lblAnoPubCadEbook;
    private javax.swing.JLabel lblCadAutorIDEbook;
    private javax.swing.JLabel lblCategoriaCadEbook;
    private javax.swing.JLabel lblEditoraCnpjEbook;
    private javax.swing.JLabel lblFecharTelaEbook;
    private javax.swing.JLabel lblFundoImagem;
    private javax.swing.JLabel lblIsbnCadEbook;
    private javax.swing.JLabel lblPesoArquivoCadEbook;
    private javax.swing.JLabel lblQtdPaginasCadEbook;
    private javax.swing.JLabel lblTituloCadEbook;
    private javax.swing.JLabel lblValorCadEbook;
    private javax.swing.JFormattedTextField txtAnoPublicacaoCadEbook;
    private javax.swing.JTextField txtAutorID;
    private javax.swing.JComboBox<String> txtCategoriaCadEbook;
    private javax.swing.JFormattedTextField txtEditoraCnpjAltCad;
    private javax.swing.JTextField txtIsbnCadEbook;
    private javax.swing.JTextField txtPesoArquivoCadEbook;
    private javax.swing.JTextField txtQtdPaginasCadEbook;
    private javax.swing.JTextField txtTituloCadEbook;
    private javax.swing.JTextField txtValorUnitarioCadEbook;
    // End of variables declaration//GEN-END:variables

    //metodo utilizados para realizar ações nos botões 
    //metodo para cadastrar um ebook
    public void cadastrarItem(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JComboBox campo5,JTextField campo6,JTextField campo7,JTextField campo8,JTextField campo9) throws SQLException, ParseException{
           String titulo,categoria,isbn,autorID,editoracnpj;
           int qtdpaginas;
           Date anopub = null;
           float pesoarquivo,valorunit; // cria-se variaveis para armazenar os valores recebidos nos campos

            //os valores digitados nos campos são armazenados
           titulo = campo1.getText();
           qtdpaginas = Integer.parseInt(campo2.getText());
           valorunit = Float.parseFloat(campo3.getText().replace(",","."));
           pesoarquivo = Float.parseFloat(campo4.getText());
           categoria = (String) campo5.getSelectedItem();
           
           // nesse caso foi realizado uma conversão na data para armazena-la no formato correto do banco
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
            try
            {
                java.util.Date date =  sdf.parse(campo6.getText());
                java.sql.Date dataSql = new java.sql.Date(date.getTime());
                anopub = dataSql;
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(CadEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }

            isbn = campo7.getText();
            editoracnpj = campo8.getText();
            autorID = campo9.getText();

            // uma instancia de objeto da  classe autor de transferencia  é criada
            // em seguida os metodos de set são instanciados para receber os valores das variaveis

            EbookDTO objebookdto = new EbookDTO();
            objebookdto.setTitulo_eb(titulo);
            objebookdto.setCategoria(categoria);
            objebookdto.setIsbn(isbn);
            objebookdto.setQuantidade_paginas(qtdpaginas);
            objebookdto.setAno_publicacao(anopub);
            objebookdto.setPeso_arquivo(pesoarquivo);
            objebookdto.setValor_unit(valorunit);
            objebookdto.setEditora_cnpj(editoracnpj);
            objebookdto.setAutor_id(autorID);
            

            // uma instancia de objeto da classe de acesso e conexão da class autor é criada
            // o objeto criado recebe ums instancia de um metodo da classe DAO utilizado para cadastrar o autor no banco

            EbookDAO objebookdao = new EbookDAO();
            objebookdao.cadastrarEbook(objebookdto);

           // por fim uma mensagem em joptionpane é exibida sinalizado que o cadastro foi realizado com sucesso
           JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso !!!!");
        }
    
    // metodo utilzado para limpar os campos
    public void limparCampos(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4,JTextField campo6,JTextField campo7,JTextField campo8,JTextField campo9) 
    {
        //campos recebem uma string vazia como valor e são resetados
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
        campo4.setText("");
        campo6.setText("");
        campo7.setText("");
        campo8.setText("");
        campo9.setText("");
    }

}
