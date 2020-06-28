package br.com.view;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        lblBackground = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemProfissional = new javax.swing.JMenuItem();
        menuItemUsuario = new javax.swing.JMenuItem();
        menuItemPaciente = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuItemBoletim = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/background.jpg"))); // NOI18N
        lblBackground.setText("jLabel1");

        Desktop.setLayer(lblBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackground)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addComponent(lblBackground)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        menuCadastro.setText("Cadastro");

        menuItemProfissional.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        menuItemProfissional.setBackground(new java.awt.Color(255, 255, 255));
        menuItemProfissional.setText("Profissional");
        menuItemProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProfissionalActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemProfissional);

        menuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuItemUsuario.setBackground(new java.awt.Color(255, 255, 255));
        menuItemUsuario.setText("Usuário");
        menuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemUsuario);

        menuItemPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menuItemPaciente.setBackground(new java.awt.Color(255, 255, 255));
        menuItemPaciente.setText("Paciente");
        menuItemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemPaciente);

        menuPrincipal.add(menuCadastro);

        menuRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        menuRelatorios.setText("Relatórios");
        menuRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatoriosActionPerformed(evt);
            }
        });

        menuItemBoletim.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        menuItemBoletim.setBackground(new java.awt.Color(255, 255, 255));
        menuItemBoletim.setText("Boletim Epidemiológico");
        menuRelatorios.add(menuItemBoletim);

        menuPrincipal.add(menuRelatorios);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuPrincipal.add(menuSair);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProfissionalActionPerformed
        FrmCadProfissional profissional = new FrmCadProfissional();
        Desktop.add(profissional);
        profissional.setVisible(true);
        profissional.setPosicao();
    }//GEN-LAST:event_menuItemProfissionalActionPerformed

    private void menuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUsuarioActionPerformed
        FrmCadUsuario usuario = new FrmCadUsuario();
        Desktop.add(usuario);
        usuario.setVisible(true);
        usuario.setPosicao();
    }//GEN-LAST:event_menuItemUsuarioActionPerformed

    private void menuItemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPacienteActionPerformed
        FrmCadPaciente paciente = new FrmCadPaciente();
        Desktop.add(paciente);
        paciente.setVisible(true);
        paciente.setPosicao();
    }//GEN-LAST:event_menuItemPacienteActionPerformed

    private void menuRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatoriosActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        new FrmLogin().show();
        this.dispose();
    }//GEN-LAST:event_menuSairMouseClicked

    /**
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemBoletim;
    private javax.swing.JMenuItem menuItemPaciente;
    private javax.swing.JMenuItem menuItemProfissional;
    private javax.swing.JMenuItem menuItemUsuario;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
