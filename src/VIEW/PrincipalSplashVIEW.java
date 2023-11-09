package VIEW;

// importação de bibibliotecas 
import java.sql.SQLException; // importação da biblioteca sql para tratamento de erros relacionados ao banco
import java.util.logging.Level; // importação de log para indicação de nivel de erro 
import java.util.logging.Logger; // importação de log para declarar log a locais de possiveis erros criticos no sistema

/**
 * Tela principal responsavel por uma barra de menu com botões direcionando para
 * as telas desejadas e atalhos para acesso as outras telas de busca
 *
 * @author Grupo em conjunto cada membro fez uma tela.
 */
// declaração da  classe
public class PrincipalSplashVIEW extends javax.swing.JFrame {

    /**
     * classe utilizada para a tela principal do programa Creates new form
     * NewJFrame
     */
    public PrincipalSplashVIEW() { // metodo construtor utilizado para iniciar os componentes da tela.
        initComponents();
    }
    int y, x;

    /**
     * Este método é chamado de dentro do construtor para inicializar o
     * formulário. ATENÇÃO: NÃO modifique este código. O conteúdo deste método é
     * sempre regenerado pelo Editor de formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClientes = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JLabel();
        btnEbooks = new javax.swing.JLabel();
        btnAutores = new javax.swing.JLabel();
        btnEditoras = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblEditoras = new javax.swing.JLabel();
        lblEbooks = new javax.swing.JLabel();
        lblAutores = new javax.swing.JLabel();
        lblPainelListagem = new javax.swing.JLabel();
        lblImagemFundo3 = new javax.swing.JLabel();
        menuBarTelaPrincipal = new javax.swing.JMenuBar();
        btnMenuCadastro = new javax.swing.JMenu();
        menuCadCliente = new javax.swing.JMenuItem();
        menuCadPedido = new javax.swing.JMenuItem();
        menuCadEditora = new javax.swing.JMenuItem();
        menuCadEbook = new javax.swing.JMenuItem();
        menuCadAutor = new javax.swing.JMenuItem();
        btnMenuConsulta = new javax.swing.JMenu();
        menuBuscaCliente = new javax.swing.JMenuItem();
        menuBuscaPedido = new javax.swing.JMenuItem();
        menuBuscaEditora = new javax.swing.JMenuItem();
        menuBuscaEbook = new javax.swing.JMenuItem();
        menuBuscaAutor = new javax.swing.JMenuItem();
        btnMenuAlterar = new javax.swing.JMenu();
        menuAltCliente = new javax.swing.JMenuItem();
        menuAltPedido = new javax.swing.JMenuItem();
        menuAltEditora = new javax.swing.JMenuItem();
        menuAltEbook = new javax.swing.JMenuItem();
        menuAltAutor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        setForeground(java.awt.Color.white);
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

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Group 2.png"))); // NOI18N
        btnClientes.setToolTipText("Buscar Cliente");
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, 94));

        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Group 3.png"))); // NOI18N
        btnPedidos.setToolTipText("Buscar Pedido");
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPedidosMouseClicked(evt);
            }
        });
        getContentPane().add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, 94));

        btnEbooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Group 5.png"))); // NOI18N
        btnEbooks.setToolTipText("Buscar Ebook");
        btnEbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEbooksMouseClicked(evt);
            }
        });
        getContentPane().add(btnEbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 94));

        btnAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Group 6.png"))); // NOI18N
        btnAutores.setToolTipText("Buscar Autores");
        btnAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutoresMouseClicked(evt);
            }
        });
        getContentPane().add(btnAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, 94));

        btnEditoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/Group 4.png"))); // NOI18N
        btnEditoras.setToolTipText("Buscar Editora");
        btnEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditorasMouseClicked(evt);
            }
        });
        getContentPane().add(btnEditoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, 94));

        lblClientes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblClientes.setText(" Clientes");
        getContentPane().add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 84, -1));

        lblPedidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPedidos.setText("  Pedidos");
        getContentPane().add(lblPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 84, -1));

        lblEditoras.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblEditoras.setText(" Editoras");
        getContentPane().add(lblEditoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 84, -1));

        lblEbooks.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblEbooks.setText(" Ebooks");
        getContentPane().add(lblEbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 73, -1));

        lblAutores.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAutores.setText("  Autores");
        getContentPane().add(lblAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 84, -1));

        lblPainelListagem.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblPainelListagem.setText("Ferramentas");
        getContentPane().add(lblPainelListagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, 30));

        lblImagemFundo3.setBackground(new java.awt.Color(30, 34, 60));
        lblImagemFundo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaPrincipal.png"))); // NOI18N
        lblImagemFundo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblImagemFundo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBarTelaPrincipal.setBackground(new java.awt.Color(35, 40, 63));
        menuBarTelaPrincipal.setForeground(new java.awt.Color(35, 40, 63));

        btnMenuCadastro.setText("Cadastrar");
        btnMenuCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuCadCliente.setBackground(new java.awt.Color(35, 40, 63));
        menuCadCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadCliente.setText("Cliente");
        menuCadCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuCadCliente.setPreferredSize(new java.awt.Dimension(100, 26));
        menuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadClienteActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(menuCadCliente);

        menuCadPedido.setBackground(new java.awt.Color(35, 40, 63));
        menuCadPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadPedido.setText("Pedido");
        menuCadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadPedidoActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(menuCadPedido);

        menuCadEditora.setBackground(new java.awt.Color(35, 40, 63));
        menuCadEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadEditora.setText("Editora");
        menuCadEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadEditoraActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(menuCadEditora);

        menuCadEbook.setBackground(new java.awt.Color(35, 40, 63));
        menuCadEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadEbook.setText("Ebook");
        menuCadEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadEbookActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(menuCadEbook);

        menuCadAutor.setBackground(new java.awt.Color(35, 40, 63));
        menuCadAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadAutor.setText("Autor");
        menuCadAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadAutorActionPerformed(evt);
            }
        });
        btnMenuCadastro.add(menuCadAutor);

        menuBarTelaPrincipal.add(btnMenuCadastro);

        btnMenuConsulta.setText("Buscar");
        btnMenuConsulta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuBuscaCliente.setBackground(new java.awt.Color(35, 40, 63));
        menuBuscaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBuscaCliente.setText("Cliente");
        menuBuscaCliente.setPreferredSize(new java.awt.Dimension(100, 26));
        menuBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaClienteActionPerformed(evt);
            }
        });
        btnMenuConsulta.add(menuBuscaCliente);

        menuBuscaPedido.setBackground(new java.awt.Color(35, 40, 63));
        menuBuscaPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBuscaPedido.setText("Pedido");
        menuBuscaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaPedidoActionPerformed(evt);
            }
        });
        btnMenuConsulta.add(menuBuscaPedido);

        menuBuscaEditora.setBackground(new java.awt.Color(35, 40, 63));
        menuBuscaEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBuscaEditora.setText("Editora");
        menuBuscaEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaEditoraActionPerformed(evt);
            }
        });
        btnMenuConsulta.add(menuBuscaEditora);

        menuBuscaEbook.setBackground(new java.awt.Color(35, 40, 63));
        menuBuscaEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBuscaEbook.setText("Ebook");
        menuBuscaEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaEbookActionPerformed(evt);
            }
        });
        btnMenuConsulta.add(menuBuscaEbook);

        menuBuscaAutor.setBackground(new java.awt.Color(35, 40, 63));
        menuBuscaAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBuscaAutor.setText("Autor");
        menuBuscaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaAutorActionPerformed(evt);
            }
        });
        btnMenuConsulta.add(menuBuscaAutor);

        menuBarTelaPrincipal.add(btnMenuConsulta);

        btnMenuAlterar.setBackground(new java.awt.Color(30, 34, 60));
        btnMenuAlterar.setForeground(new java.awt.Color(30, 34, 60));
        btnMenuAlterar.setText("Alterar");
        btnMenuAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        menuAltCliente.setBackground(new java.awt.Color(35, 40, 63));
        menuAltCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAltCliente.setForeground(new java.awt.Color(255, 255, 255));
        menuAltCliente.setText("Cliente");
        menuAltCliente.setPreferredSize(new java.awt.Dimension(100, 26));
        menuAltCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltClienteActionPerformed(evt);
            }
        });
        btnMenuAlterar.add(menuAltCliente);

        menuAltPedido.setBackground(new java.awt.Color(35, 40, 63));
        menuAltPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAltPedido.setForeground(new java.awt.Color(255, 255, 255));
        menuAltPedido.setText("Pedido");
        menuAltPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltPedidoActionPerformed(evt);
            }
        });
        btnMenuAlterar.add(menuAltPedido);

        menuAltEditora.setBackground(new java.awt.Color(35, 40, 63));
        menuAltEditora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAltEditora.setForeground(new java.awt.Color(255, 255, 255));
        menuAltEditora.setText("Editora");
        menuAltEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltEditoraActionPerformed(evt);
            }
        });
        btnMenuAlterar.add(menuAltEditora);

        menuAltEbook.setBackground(new java.awt.Color(35, 40, 63));
        menuAltEbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAltEbook.setForeground(new java.awt.Color(255, 255, 255));
        menuAltEbook.setText("Ebook");
        menuAltEbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltEbookActionPerformed(evt);
            }
        });
        btnMenuAlterar.add(menuAltEbook);

        menuAltAutor.setBackground(new java.awt.Color(35, 40, 63));
        menuAltAutor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAltAutor.setForeground(new java.awt.Color(255, 255, 255));
        menuAltAutor.setText("Autor");
        menuAltAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltAutorActionPerformed(evt);
            }
        });
        btnMenuAlterar.add(menuAltAutor);

        menuBarTelaPrincipal.add(btnMenuAlterar);

        jMenu1.setBackground(new java.awt.Color(30, 34, 60));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(30, 34, 60));
        jMenu1.setEnabled(false);
        jMenu1.setMinimumSize(new java.awt.Dimension(16, 6));
        jMenu1.setPreferredSize(new java.awt.Dimension(750, 6));
        jMenu1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu1MouseDragged(evt);
            }
        });
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu1MousePressed(evt);
            }
        });
        menuBarTelaPrincipal.add(jMenu1);

        jMenu2.setText("    -");
        jMenu2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(76, 49));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        menuBarTelaPrincipal.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX_1.png"))); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        menuBarTelaPrincipal.add(jMenu3);

        setJMenuBar(menuBarTelaPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// metodos para ativar ações nos botões    
//metodo para abrir a tela de cadastro de editora
    private void menuCadEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadEditoraActionPerformed
        CadEditoraVIEW telacadeditora = new CadEditoraVIEW();
        telacadeditora.setVisible(true);
    }//GEN-LAST:event_menuCadEditoraActionPerformed

// metodo para abrir a tela de pesquisa e listagem de editora
    private void menuBuscaEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaEditoraActionPerformed
        BuscaEditoraVIEW telabuscaeditora = new BuscaEditoraVIEW();
        telabuscaeditora.setVisible(true);
    }//GEN-LAST:event_menuBuscaEditoraActionPerformed

// metodo para abrir a tela  de alteração e exclusão de editora
    private void menuAltEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltEditoraActionPerformed
        AltCadEditoraVIEW telaAltEdit = new AltCadEditoraVIEW();
        telaAltEdit.setVisible(true);
    }//GEN-LAST:event_menuAltEditoraActionPerformed

// metodo para abrir tela de busca e listagem de clientes
    private void menuBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaClienteActionPerformed
        BuscaClienteVIEW telaBuscacli = new BuscaClienteVIEW();
        telaBuscacli.setVisible(true);
    }//GEN-LAST:event_menuBuscaClienteActionPerformed

//metodo para abrir tela busca e listagem de pedidos
    private void menuBuscaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaPedidoActionPerformed
       BuscaPedidoVIEW listarPedido;
        try {
            listarPedido = new BuscaPedidoVIEW();
            listarPedido.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menuBuscaPedidoActionPerformed

// metodo para abrir tela busca e listagem de ebooks.
    private void menuBuscaEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaEbookActionPerformed
        BuscaEbookVIEW telaBuscaEbo = null;
        try {
            telaBuscaEbo = new BuscaEbookVIEW();
        } catch (SQLException ex) {
            /* o metodo logger é utilizado para registrar operações realizadas no banco ele foi utilizado como tratamento 
            * ele foi utilizado nesse bloco por haver a possibilidade ocorrer erros de nivel severo no programa 
             */
            Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaBuscaEbo.setVisible(true);
    }//GEN-LAST:event_menuBuscaEbookActionPerformed

//metodo para abrir tela de busca e listagem de autores.
    private void menuBuscaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaAutorActionPerformed
        BuscaAutorVIEW telaBuscaAut = new BuscaAutorVIEW();
        telaBuscaAut.setVisible(true);
    }//GEN-LAST:event_menuBuscaAutorActionPerformed

//metodo para abrir tela de cadastro de ebooks.
    private void menuCadEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadEbookActionPerformed
        CadEbookVIEW telaCadEbo = new CadEbookVIEW();
        telaCadEbo.setVisible(true);
    }//GEN-LAST:event_menuCadEbookActionPerformed

//metodo para abrir tela para alteração e exclusão de autores
    private void menuAltEbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltEbookActionPerformed
        AltCadEbookVIEW telaAltEbook = new AltCadEbookVIEW();
        telaAltEbook.setVisible(true);
    }//GEN-LAST:event_menuAltEbookActionPerformed

//metodo para abrir tela de alteração e exclusão de cllientes
    private void menuAltClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltClienteActionPerformed
        AltCadClienteVIEW telaAltCliente = new AltCadClienteVIEW();
        telaAltCliente.setVisible(true);
    }//GEN-LAST:event_menuAltClienteActionPerformed

//metodo para abrir tela de cadastro de clientes.
    private void menuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadClienteActionPerformed
        CadClienteVIEW telacadcliente = new CadClienteVIEW();
        telacadcliente.setVisible(true);
    }//GEN-LAST:event_menuCadClienteActionPerformed

//metodo para abrir tela de alteração e exclusão de autores
    private void menuAltAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltAutorActionPerformed
        AltCadAutorVIEW telaaltautor = new AltCadAutorVIEW();
        telaaltautor.setVisible(true);
    }//GEN-LAST:event_menuAltAutorActionPerformed

//metodo para abrir tela de cadastro de pedidos.
    private void menuCadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadPedidoActionPerformed
        CadPedidoVIEW telacadpedido = new CadPedidoVIEW();
        telacadpedido.setVisible(true);
    }//GEN-LAST:event_menuCadPedidoActionPerformed

//metodo para abrir tela de cadastro de autores.
    private void menuCadAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadAutorActionPerformed
        CadAutorVIEW telacadautor = new CadAutorVIEW();
        telacadautor.setVisible(true);
    }//GEN-LAST:event_menuCadAutorActionPerformed

//metodo para abrir tela de alteração e exclusão de pedidos
    private void menuAltPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltPedidoActionPerformed

    }//GEN-LAST:event_menuAltPedidoActionPerformed

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        BuscaClienteVIEW telaclientebusca = new BuscaClienteVIEW();
        telaclientebusca.setVisible(true);
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseClicked
        BuscaPedidoVIEW listarPedido;
        try {
            listarPedido = new BuscaPedidoVIEW();
            listarPedido.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPedidosMouseClicked

    private void btnEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditorasMouseClicked
        BuscaEditoraVIEW telaeditorabusca = new BuscaEditoraVIEW();
        telaeditorabusca.setVisible(true);
    }//GEN-LAST:event_btnEditorasMouseClicked

    private void btnEbooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEbooksMouseClicked
        BuscaEbookVIEW telaeditorabusca = null;
        try {
            telaeditorabusca = new BuscaEbookVIEW();
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaeditorabusca.setVisible(true);
    }//GEN-LAST:event_btnEbooksMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.setState(LoadingSplashView.ICONIFIED);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMenu1MousePressed

    private void jMenu1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_jMenu1MouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_formMouseDragged

    private void btnAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutoresMouseClicked
        // TODO add your handling code here:
        BuscaAutorVIEW telaautorbusca = new BuscaAutorVIEW();
        telaautorbusca.setVisible(true);
    }//GEN-LAST:event_btnAutoresMouseClicked

    /**
     * metodo principal responsavel pela inicialização da tela principal
     *
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
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalSplashVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PrincipalSplashVIEW().setVisible(true);

            }
        });
    }

    // declaração de variaveis utilizadas nos componentes da tela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAutores;
    private javax.swing.JLabel btnClientes;
    private javax.swing.JLabel btnEbooks;
    private javax.swing.JLabel btnEditoras;
    private javax.swing.JMenu btnMenuAlterar;
    private javax.swing.JMenu btnMenuCadastro;
    private javax.swing.JMenu btnMenuConsulta;
    private javax.swing.JLabel btnPedidos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel lblAutores;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblEbooks;
    private javax.swing.JLabel lblEditoras;
    private javax.swing.JLabel lblImagemFundo3;
    private javax.swing.JLabel lblPainelListagem;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JMenuItem menuAltAutor;
    private javax.swing.JMenuItem menuAltCliente;
    private javax.swing.JMenuItem menuAltEbook;
    private javax.swing.JMenuItem menuAltEditora;
    private javax.swing.JMenuItem menuAltPedido;
    private javax.swing.JMenuBar menuBarTelaPrincipal;
    private javax.swing.JMenuItem menuBuscaAutor;
    private javax.swing.JMenuItem menuBuscaCliente;
    private javax.swing.JMenuItem menuBuscaEbook;
    private javax.swing.JMenuItem menuBuscaEditora;
    private javax.swing.JMenuItem menuBuscaPedido;
    private javax.swing.JMenuItem menuCadAutor;
    private javax.swing.JMenuItem menuCadCliente;
    private javax.swing.JMenuItem menuCadEbook;
    private javax.swing.JMenuItem menuCadEditora;
    private javax.swing.JMenuItem menuCadPedido;
    // End of variables declaration//GEN-END:variables
}
