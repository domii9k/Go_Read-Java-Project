package VIEW;

//importações
import DAO.AutorDAO; //importação da lasse dao de autor para conexão com o banco
import DTO.AutorDTO; // importtando calsse dto de autor oara tranferencias relizadas 
import java.awt.HeadlessException; //importação para tratamento de erro relacionados a digitação
import java.sql.SQLException; // importação para erros sql
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger;// importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane;// importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTextField; //importação para uso Jtextfield como parametros

/**
 * Tela criada para alteração e 
 * exclusão de registros da tabela autor do banco
 * 
 */

//declaração de classe
public class AltCadAutorVIEW extends javax.swing.JFrame {

    // variaveis utilizadas para movimentação da tela na area de trabalho 
    int x,y;
    
    /**
     * metodo construtor para inicializar os componentes 
     * Creates new form AltCadAutorVIEW1
     */
    public AltCadAutorVIEW() {
        initComponents();
    }

    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     * ATENÇÃO: NÃO modifique este código. O conteúdo deste método é sempre
     * regenerado pelo Editor de formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jpaneSupAltAutor = new javax.swing.JPanel();
        lblAlterarAutor = new javax.swing.JLabel();
        lblFecharTelaAutor = new javax.swing.JLabel();
        btnCancelarCadAutor = new javax.swing.JButton();
        lblBuscaBuscarEbook = new javax.swing.JLabel();
        txtConsultaAutor = new javax.swing.JTextField();
        btnConsultAutor = new javax.swing.JButton();
        lblNomeAltAutor = new javax.swing.JLabel();
        txtNomeAltAutor = new javax.swing.JTextField();
        lblSobnomeAltAutor = new javax.swing.JLabel();
        txtSobNomeAltAutor = new javax.swing.JTextField();
        btnAlterarAltAutor = new javax.swing.JButton();
        btnExcluirAltAutor = new javax.swing.JButton();
        lblAFundoImagem = new javax.swing.JLabel();

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

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpaneSupAltAutor.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarAutor.setText("ALTERAR AUTOR");

        lblFecharTelaAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        lblFecharTelaAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharTelaAutorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupAltAutorLayout = new javax.swing.GroupLayout(jpaneSupAltAutor);
        jpaneSupAltAutor.setLayout(jpaneSupAltAutorLayout);
        jpaneSupAltAutorLayout.setHorizontalGroup(
            jpaneSupAltAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupAltAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                .addComponent(lblFecharTelaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupAltAutorLayout.setVerticalGroup(
            jpaneSupAltAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupAltAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpaneSupAltAutorLayout.createSequentialGroup()
                .addComponent(lblFecharTelaAutor)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jpaneSupAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        btnCancelarCadAutor.setBackground(new java.awt.Color(30, 34, 60));
        btnCancelarCadAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelarCadAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCadAutor.setText("CANCELAR");
        btnCancelarCadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadAutorActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCancelarCadAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 130, 30));

        lblBuscaBuscarEbook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscaBuscarEbook.setText("Buscar por id:");
        jDesktopPane1.add(lblBuscaBuscarEbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtConsultaAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtConsultaAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 240, 30));

        btnConsultAutor.setBackground(new java.awt.Color(84, 119, 97));
        btnConsultAutor.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnConsultAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultAutor.setText("OK");
        btnConsultAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultAutorActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnConsultAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 50, 30));

        lblNomeAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeAltAutor.setText("Nome:");
        jDesktopPane1.add(lblNomeAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 87, -1));

        txtNomeAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeAltAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtNomeAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 310, 20));

        lblSobnomeAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSobnomeAltAutor.setText("Sobrenome:");
        jDesktopPane1.add(lblSobnomeAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, 20));

        txtSobNomeAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobNomeAltAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtSobNomeAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 310, 20));

        btnAlterarAltAutor.setBackground(new java.awt.Color(84, 119, 97));
        btnAlterarAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlterarAltAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarAltAutor.setText("ALTERAR");
        btnAlterarAltAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAltAutorActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnAlterarAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 130, 30));

        btnExcluirAltAutor.setBackground(new java.awt.Color(30, 34, 60));
        btnExcluirAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluirAltAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirAltAutor.setText("EXCLUIR");
        btnExcluirAltAutor.setToolTipText("Não será possivel excluir um autor relacionado a um livro, para isso exclua o livro primeiro!!");
        btnExcluirAltAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAltAutorActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnExcluirAltAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 30));

        lblAFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Desktop - 2.png"))); // NOI18N
        lblAFundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jDesktopPane1.add(lblAFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private void btnConsultAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultAutorActionPerformed
        // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
        if(txtConsultaAutor.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Digite o valor a ser consultado no campo primeiro!!!");
       }else{
            // declaração de objeto dao para conexão com o banco e instancia do metodo consultar 
            AutorDAO objconsultar = new AutorDAO();
            try { // a consulta ocorre dentro de um bloco de tratamento
                // o objeto criado para consulta instancia o metodo consulta e recebe como parametros 3 campos  um para consulta , e os outros para receberem o resultado
                objconsultar.consultar(txtConsultaAutor, txtNomeAltAutor, txtSobNomeAltAutor);
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
              * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                 */
                Logger.getLogger(AltCadAutorVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultAutorActionPerformed

    //metodo pra definir ação do botão de fechar da tela
    private void lblFecharTelaAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharTelaAutorMouseClicked
         // fecha essa tela ao clicar no icone de x
        dispose();
    }//GEN-LAST:event_lblFecharTelaAutorMouseClicked

    //metodo para executar a ação de alteração ao clicar no botão alterar
    private void btnAlterarAltAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAltAutorActionPerformed
       // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos
       if(txtConsultaAutor.getText().isEmpty() || txtNomeAltAutor.getText().isEmpty() || txtSobNomeAltAutor.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
       }else{
           // declaração do objeto dao de autor para conexão com o banco e instancia do metodo alterar
           AutorDAO objalterar = new AutorDAO();
            try { // o metodo de alteração acontece de um bloco de tratamento
                // o objeto criado instancia o metodo alterar que recebe como parametro os campos
                // a serem alterados e por ultimo o parametro que indica  a chave do registro onde será feita a alteração 
                objalterar.alterar(txtNomeAltAutor,txtSobNomeAltAutor,txtConsultaAutor);
                 //os campos de texto são limpos após a execução da alteração
                limparCampos(txtConsultaAutor,txtNomeAltAutor,txtSobNomeAltAutor);
                 //caso seja executado com sucesso a alteração uma mensagem é emitida ao usuario
                JOptionPane.showMessageDialog(null, "dados alterados com sucesso !!!"); 
            } catch (SQLException ex) {// caso haja um erro na conexão com o banoco ele será tratado
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                  * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                  */
              Logger.getLogger(AltCadAutorVIEW.class.getName()).log(Level.SEVERE, null, ex);
              //Caso a alteração não seja possivel uma mensagem de erro será informada ao usuario
              JOptionPane.showMessageDialog(null, "Erro na alteração de dados!!!"+ ex); 
            }
       }
      
    }//GEN-LAST:event_btnAlterarAltAutorActionPerformed

    //metodo para excluir registros da tabela autor do banco de dados
    private void btnExcluirAltAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAltAutorActionPerformed
         // uma condição foi criada para caso haja campos em branco o usuario seja informado que precisa preencher todos os campos 
        if(txtConsultaAutor.getText().equals("") || txtNomeAltAutor.getText().equals("") || txtSobNomeAltAutor.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios!!!");
        }else{
            //foi criada um tela de confirmação para que o usuario confirme se deseja realmente excluir o registro indicado
            int respostaJOptionPane = JOptionPane.showConfirmDialog(null, "Deseja realmente apagar esse cadastro ?",
                    "Apagar Cadastro", JOptionPane.YES_NO_OPTION);
            //caso a opção seja sim  o metodo de exclusão será executado
            if(respostaJOptionPane == JOptionPane.YES_OPTION)
            {
                try { // dentro do bloco de tratamento o metodo de exclusão e executado e recebe como parametro a caixa onde foi digitado o id do autor
                    // esse indicara qual registro será excluido
                    excluirAutor(txtConsultaAutor); //método para apagar
                    // os campos são limpos após a execução do metodo de exclusão
                    limparCampos(txtConsultaAutor,txtNomeAltAutor,txtSobNomeAltAutor);
                    JOptionPane.showMessageDialog(null, "Autor Excluido!!"); //mensagem indicando que o registro selecionado foi excluido
                } catch (HeadlessException e) { // tratamento de erros de digitação
                    JOptionPane.showMessageDialog(null,"Autor Invalido, digite corretamente!!" + e);
                } catch (SQLException ex) { // tratamento para erros sql
                    //mensagem indicando erro de violação na integridade
                    JOptionPane.showMessageDialog(null, "Problema de violação da integridade do banco remova primeiro o livro!!!"+ ex); 
                    /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
                    * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                    */
                    Logger.getLogger(AltCadAutorVIEW.class.getName()).log(Level.SEVERE, null, ex);
                }
             //caso a opção seja não a operação será cancelada  
            }else if (respostaJOptionPane == JOptionPane.NO_OPTION){
                //uma mensagem e emitida para usuario indicando que a operação foi cancelada
                JOptionPane.showMessageDialog(null, "Operação cancelada!!!");
            }
        }
        
    }//GEN-LAST:event_btnExcluirAltAutorActionPerformed

    //metodo para cancelar a operação de alteração ou de exclusão
    private void btnCancelarCadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadAutorActionPerformed
        limparCampos(txtConsultaAutor,txtNomeAltAutor,txtSobNomeAltAutor);
        JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCancelarCadAutorActionPerformed

    /**
     * //metodo principal para execução da tela
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
            java.util.logging.Logger.getLogger(AltCadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltCadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltCadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltCadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltCadAutorVIEW().setVisible(true);
            }
        });
    }

    //declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAltAutor;
    private javax.swing.JButton btnCancelarCadAutor;
    private javax.swing.JButton btnConsultAutor;
    private javax.swing.JButton btnExcluirAltAutor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jpaneSupAltAutor;
    private javax.swing.JLabel lblAFundoImagem;
    private javax.swing.JLabel lblAlterarAutor;
    private javax.swing.JLabel lblBuscaBuscarEbook;
    private javax.swing.JLabel lblFecharTelaAutor;
    private javax.swing.JLabel lblNomeAltAutor;
    private javax.swing.JLabel lblSobnomeAltAutor;
    private javax.swing.JTextField txtConsultaAutor;
    private javax.swing.JTextField txtNomeAltAutor;
    private javax.swing.JTextField txtSobNomeAltAutor;
    // End of variables declaration//GEN-END:variables

    //metodos para inserir ações nos botões
    //metodo para exclusão de um registro recebe como parametro o campo onde será digitado o atributo de consulta 
    public void excluirAutor(JTextField campocodigo) throws SQLException{
        // uma variavel é criada para receber o valor digitado no campo
        int id_autor;
        // esse valor sofre uma conversão para o tipo armazenado no banco
        id_autor = Integer.parseInt(campocodigo.getText());
        
        //objeto dto de autor e cirado para instanciar o metodo set
        // e receber o valor digitado
        AutorDTO objexcluir = new AutorDTO();
        objexcluir.setId_autor(id_autor);
        
        //o objeto dao de autor e criado para instanciar o metodo excluir
        //que recebe como parametro o objeto dto com o valor atributo digitado no campo
        AutorDAO objDao = new AutorDAO();
        objDao.excluirAutor(objexcluir);
    }
    
    //metodo para limpar os campos de texto
    public void limparCampos(JTextField campo1,JTextField campo2,JTextField campo3) // metodo utilzado para limpar os campos
    {
        //campos recebem uma string vazia como valor e são resetados
        campo1.setText("");
        campo2.setText("");
        campo3.setText("");
    }

}
