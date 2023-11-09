package VIEW;

//importações                                      
import DAO.AutorDAO; // importação da classe de conexão de autor com o banco
import DTO.AutorDTO; // importação da classe de transferencia de autor para acessar seus metodos
import java.sql.SQLException; // importação da classe de tratamento de erros do sql
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger; // importação de log para declarar log a locais de possiveis erros criticos no sistema
import javax.swing.JOptionPane; // importação para joptionpane para indicar mensagens ao usuario
import javax.swing.JTextField; // importação do jtextfield para indicar parametros de campo de texto em metodos

/**
 * Tela de cadastro de autor 
 * tela para que o usuario 
 * realize cadastro de autores dos livros
 */
public class CadAutorVIEW extends javax.swing.JFrame {

    /**
     * metodo construtor para incializar os componentes da tela
     * Creates new form TelaCadastroAutor
     */
    public CadAutorVIEW() {
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

        jpaneSupCadAutor = new javax.swing.JPanel();
        lblAlterarAutor = new javax.swing.JLabel();
        fecharTelaAutor = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtSobNomeCadAutor = new javax.swing.JTextField();
        btnCadastrarCadAutor = new javax.swing.JButton();
        btnCadastrarCadCancelar = new javax.swing.JButton();
        lblRazaoSozial = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        txtNomeCadAutor = new javax.swing.JTextField();
        lblfundoImagem = new javax.swing.JLabel();

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

        jpaneSupCadAutor.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarAutor.setText("CADASTRO AUTOR");

        fecharTelaAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        fecharTelaAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharTelaAutorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpaneSupCadAutorLayout = new javax.swing.GroupLayout(jpaneSupCadAutor);
        jpaneSupCadAutor.setLayout(jpaneSupCadAutorLayout);
        jpaneSupCadAutorLayout.setHorizontalGroup(
            jpaneSupCadAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupCadAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(fecharTelaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpaneSupCadAutorLayout.setVerticalGroup(
            jpaneSupCadAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpaneSupCadAutorLayout.createSequentialGroup()
                .addGroup(jpaneSupCadAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecharTelaAutor)
                    .addGroup(jpaneSupCadAutorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpaneSupCadAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSobNomeCadAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSobNomeCadAutor.setToolTipText("Digite o sobrenome do autor");
        txtSobNomeCadAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtSobNomeCadAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 310, 20));

        btnCadastrarCadAutor.setBackground(new java.awt.Color(84, 119, 97));
        btnCadastrarCadAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCadAutor.setText("CADASTRAR");
        btnCadastrarCadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCadAutorActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCadastrarCadAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, 30));

        btnCadastrarCadCancelar.setBackground(new java.awt.Color(30, 34, 60));
        btnCadastrarCadCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCadCancelar.setText("CANCELAR");
        btnCadastrarCadCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCadCancelarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCadastrarCadCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 130, 30));

        lblRazaoSozial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRazaoSozial.setText("Nome:");
        jDesktopPane1.add(lblRazaoSozial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 117, 20));

        lblCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCnpj.setText("Sobrenome:");
        jDesktopPane1.add(lblCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 117, 30));

        txtNomeCadAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeCadAutor.setToolTipText("Digite o nome do autor");
        txtNomeCadAutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(txtNomeCadAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 310, 20));

        lblfundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaCadastro.png"))); // NOI18N
        lblfundoImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 34, 60)));
        jDesktopPane1.add(lblfundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //metodo pra definir ação do botão de fechar da tela
    private void fecharTelaAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharTelaAutorMouseClicked
        // TODO add your handling code here:
        dispose(); // fecha essa tela ao clicar no icone de x
    }//GEN-LAST:event_fecharTelaAutorMouseClicked

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

    //metodo para cancelar o cadastro do autor  
    private void btnCadastrarCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCadCancelarActionPerformed
        limparCampos(txtNomeCadAutor,txtSobNomeCadAutor); // limpa todos os campos da tela
        JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!!!");
    }//GEN-LAST:event_btnCadastrarCadCancelarActionPerformed

    //metodo para cadastrar autores no sistema
    private void btnCadastrarCadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCadAutorActionPerformed
        // um bloco de tratamento foi utlizado para tratar possiveis erros no sql 
        // verifica se os campos estão vazios e caso estejam emite uma mensagem ao usuario para que preencha todos os campos
        if(txtNomeCadAutor.getText().equals("") ||txtSobNomeCadAutor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
        }else{
            try {
                // metodo insere novos autores no banco a partir do que é digitado nos campos pelo usuario
                cadastrarItem(txtNomeCadAutor, txtSobNomeCadAutor);
            } catch (SQLException ex) { // tratamento de erro sql
                /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
            * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
                 */
                Logger.getLogger(CadAutorVIEW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCadastrarCadAutorActionPerformed

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
            java.util.logging.Logger.getLogger(CadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAutorVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAutorVIEW().setVisible(true);
            }
        });
    }
    
    
    // declaração da variaveis que serão utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCadAutor;
    private javax.swing.JButton btnCadastrarCadCancelar;
    private javax.swing.JLabel fecharTelaAutor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jpaneSupCadAutor;
    private javax.swing.JLabel lblAlterarAutor;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblRazaoSozial;
    private javax.swing.JLabel lblfundoImagem;
    private javax.swing.JTextField txtNomeCadAutor;
    private javax.swing.JTextField txtSobNomeCadAutor;
    // End of variables declaration//GEN-END:variables

     //metodos para inserir ações nos botões
    // foram criados metodos genericos com parametros para serem reaproveitados nas outras telas
    public void cadastrarItem(JTextField campo1,JTextField campo2) throws SQLException{
       String nomeautor,sobrenomeautor; // cria-se uma string para armazenar os valores rcebidos nos campos

       nomeautor = campo1.getText(); //os valores digitados nos campos são armazenados
       sobrenomeautor = campo2.getText();
       

       AutorDTO objautordto = new AutorDTO(); // uma instancia de objeto da  classe autor de transferencia  é criada
       objautordto.setNome_autor(nomeautor); // em seguida os metodos de set são instanciados para receber os valores das variaveis
       objautordto.setSobrenome_autor(sobrenomeautor);
      
       
       AutorDAO objautordao = new AutorDAO(); // uma instancia de objeto da classe de acesso e conexão da class autor é criada
       objautordao.cadastrarAutor(objautordto); // o objeto criado recebe ums instancia de um metodo da classe DAO utilizado para cadastrar o autor no banco
       
       // por fim uma mensagem em joptionpane é exibida sinalizado que o cadastro foi realizado com sucesso
       JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso !!!!");
    }
    
    
    public void limparCampos(JTextField campo1,JTextField campo2) // metodo utilzado para limpar os campos
    {
        //campos recebem uma string vazia como valor e são resetados
        campo1.setText("");
        campo2.setText("");
    }

}
