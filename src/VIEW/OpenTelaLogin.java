package VIEW;

//importações de pacotes 
import DAO.LoginDAO; // importação de conexões com o banco
import DTO.LoginDTO; // importação de metodos de acesso
import java.sql.ResultSet; // importação de resultset para setagem de resultados do banco
import java.sql.SQLException; // importação para tratamento de exceptions relacionadas a operações no banco
import javax.swing.JOptionPane; // importação do joption pane para utilização de janelas de informação ao usuario

/**
 * Tela responsavel pelo login do usuario
 * usuario digita nome e senha para acessar o sistema
 * @author Grupo em conjunto cada membro fez uma tela.
 */

// declaração da classe
public class OpenTelaLogin extends javax.swing.JFrame {

    /**
     * inicialização dos componentes da tela
     * Creates new form TelaLogin
     */
    public OpenTelaLogin() {
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

        lblNomeLogo = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        lblsenha = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaLogin");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeLogo.setFont(new java.awt.Font("SansSerif", 0, 54)); // NOI18N
        lblNomeLogo.setText("GO!READ");
        getContentPane().add(lblNomeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        btnFechar.setToolTipText("Fechar Janela");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 40));

        txtSenha.setToolTipText("Digite a Senha do Usuário");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 270, 30));

        txtLogin.setToolTipText("Digite o nome do Usuário");
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 270, 30));

        btnEntrar.setBackground(new java.awt.Color(80, 113, 94));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 100, 30));

        lblsenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblsenha.setText("Senha:");
        getContentPane().add(lblsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogin.setText("Login:");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/FundoLogin.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// metodo para acionar a função de entrar no sistema ao clicar no botão entrar    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
     logar();
    }//GEN-LAST:event_btnEntrarActionPerformed
// metodo para encerrar o sistema ao clicar no icone de x
    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        // FECHA AO CLICAR//
        System.exit(0);
    }//GEN-LAST:event_btnFecharMouseClicked

    /**
     * metodo principal por onde é inicializada a tela
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
            java.util.logging.Logger.getLogger(OpenTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new LoadingSplashView().setVisible(true);
            }
        });
    }

    // declaração das variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNomeLogo;
    private javax.swing.JLabel lblsenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    // metodo criado para logar no sistema 
    private void logar(){
        try {
            // string de usuario e senha criadas para receber a entrada do usuario nos campos de texto 
            String nome_Login, senha_Login;
        
            // entradas do usuario são atribuidas as strings e armazenadas nas mesmas
            nome_Login = txtLogin.getText();
            senha_Login = new String(txtSenha.getPassword());

            /*declaração de objeto a partir da classe dto de login 
             *para acessar metodos de alteração de valores 
            */ 
            LoginDTO objLoginDTO = new LoginDTO();
            objLoginDTO.setNome_Login(nome_Login);
            objLoginDTO.setSenha_Login(senha_Login);
            
            /*declaração de objeto da classe dao de login 
              para acesso a metodo de conexão ao banco e autenticação do usuario*/
            LoginDAO objlogindao = new LoginDAO();
            ResultSet rsusuariodao = objlogindao.autenticacaoUsuario(objLoginDTO);
            
            // checagem da existencia do usuario no banco e em seguida declaração de tela principal
            if(rsusuariodao.next()){
                //chamar tela que eu quero abrir
                PrincipalSplashVIEW telaprincipal = new PrincipalSplashVIEW();
                telaprincipal.setVisible(true);
                
                dispose(); //fechar tela de login ao executar entrada no sistema
            }else{
                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos!!");
            }
        } catch (SQLException e) { // tratamento de erro na entrada do usuario no sistema
            JOptionPane.showMessageDialog(null, "LOGIN ERRO ,PROBLEMA NA CONEXÃO COM O BANCO" + e);
        }
    }

}
