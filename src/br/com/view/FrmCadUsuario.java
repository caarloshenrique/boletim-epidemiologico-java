package br.com.view;

import br.com.controller.ProfissionalController;
import br.com.controller.UsuarioController;
import br.com.model.Profissional;
import br.com.model.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCadUsuario extends javax.swing.JInternalFrame {

    int indice = 0;
    int idincrement = 0;
    List<Usuario> lista = new ArrayList<Usuario>();
    List<Profissional> profissionais = new ArrayList<Profissional>();
    UsuarioController usuarioController = new UsuarioController();
    ProfissionalController profissionalController = new ProfissionalController();

    public FrmCadUsuario() {
        initComponents();

        txtId.setEnabled(false);
        lista = usuarioController.getUsuarios();
        profissionais = profissionalController.getProfissionais();
        preencheProfissionais();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não foram cadastrados usuários");
        } else {
            mostrarDados();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCadastro = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblProfissional = new javax.swing.JLabel();
        cbxProfissional = new javax.swing.JComboBox<>();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        lblTitutuloListagem = new javax.swing.JLabel();
        lblIconeUsuario = new javax.swing.JLabel();
        lblIconeListagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setClosable(true);
        setIconifiable(true);

        lblTituloCadastro.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloCadastro.setForeground(new java.awt.Color(6, 52, 75));
        lblTituloCadastro.setText("Cadastro de Usuários");

        lblId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(6, 52, 75));
        lblId.setText("Id:");

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(6, 52, 75));
        lblEmail.setText("E-mail:");

        txtId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblSenha.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(6, 52, 75));
        lblSenha.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblProfissional.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblProfissional.setForeground(new java.awt.Color(6, 52, 75));
        lblProfissional.setText("Profissional:");

        cbxProfissional.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnPrimeiro.setBackground(new java.awt.Color(6, 52, 75));
        btnPrimeiro.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(6, 52, 75));
        btnAnterior.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(6, 52, 75));
        btnProximo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setBackground(new java.awt.Color(6, 52, 75));
        btnUltimo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(6, 52, 75));
        btnNovo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/img_adicionar_white.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(6, 52, 75));
        btnSalvar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/img_salvar_white.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(6, 52, 75));
        btnEditar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/img_editar_white.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(6, 52, 75));
        btnExcluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/img_excluir_white.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tbUsuarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Profissional", "E-mail"
            }
        ));
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        tbUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbUsuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuarios);

        lblTitutuloListagem.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitutuloListagem.setForeground(new java.awt.Color(6, 52, 75));
        lblTitutuloListagem.setText("Listagem de Usuários");

        lblIconeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/user.png"))); // NOI18N

        lblIconeListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/list.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProfissional)
                            .addComponent(lblSenha)
                            .addComponent(lblEmail)
                            .addComponent(lblId)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro)
                                .addGap(70, 70, 70)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProximo)
                                .addGap(72, 72, 72)
                                .addComponent(btnUltimo))
                            .addComponent(cbxProfissional, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addComponent(txtEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir))
                            .addComponent(txtId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblIconeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIconeListagem)
                        .addGap(217, 217, 217))))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblTituloCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitutuloListagem)
                .addGap(157, 157, 157))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconeListagem)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitutuloListagem)
                        .addGap(18, 18, 18)
                        .addComponent(lblId))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIconeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTituloCadastro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProfissional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiro)
                            .addComponent(btnAnterior)
                            .addComponent(btnProximo)
                            .addComponent(btnUltimo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnSalvar)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        indice = 0;
        mostrarDados();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        indice--;
        if (indice < 0) {
            indice++;
            JOptionPane.showMessageDialog(this, "Você já está no primeiro registro");
        }
        mostrarDados();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        indice++;
        if (indice > lista.size() - 1) {
            indice--;
            JOptionPane.showMessageDialog(this, "Você já está no último registro");
        } else {
            mostrarDados();
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        idincrement = usuarioController.buscarUltimoId() + 1;
        txtId.setText("" + idincrement);
        txtEmail.setText("");
        txtSenha.setText("");
        cbxProfissional.setSelectedItem("--Selecione--");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int profissionalId = profissionalController.buscarId(cbxProfissional.getSelectedItem().toString());

        Usuario usuario = new Usuario();
        usuario.setId(Integer.parseInt(txtId.getText()));
        usuario.setEmail(txtEmail.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setProfissionalId(profissionalId);

        usuarioController.salvarUsuario(usuario);
        lista.clear();
        lista = usuarioController.getUsuarios();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int profissionalId = profissionalController.buscarId(cbxProfissional.getSelectedItem().toString());

        Usuario usuario = new Usuario();
        usuario.setId(Integer.parseInt(txtId.getText()));
        usuario.setEmail(txtEmail.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setProfissionalId(profissionalId);

        usuarioController.alterarUsuario(usuario);
        lista.clear();
        lista = usuarioController.getUsuarios();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = (Integer.parseInt(txtId.getText()));

        usuarioController.excluirUsuario(id);
        lista.clear();
        lista = usuarioController.getUsuarios();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        preencherDadosFormulario();
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void tbUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbUsuariosKeyReleased
        if (evt.getKeyCode() == 38 || evt.getKeyCode() == 40) {
            preencherDadosFormulario();
        }
    }//GEN-LAST:event_tbUsuariosKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cbxProfissional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIconeListagem;
    private javax.swing.JLabel lblIconeUsuario;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblProfissional;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JLabel lblTitutuloListagem;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 6);
    }

    public void mostrarDados() {
        txtId.setText("" + lista.get(indice).getId());
        txtEmail.setText(lista.get(indice).getEmail());
        txtSenha.setText(lista.get(indice).getSenha());
        cbxProfissional.setSelectedItem(profissionalController.buscarNome(lista.get(indice).getProfissionalId()));

        preencheTabela();
    }

    public void preencheTabela() {
        tbUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel) tbUsuarios.getModel();

        modelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{lista.get(i).getId(), profissionalController.buscarNome(lista.get(i).getProfissionalId()), lista.get(i).getEmail()});
        }
    }

    public void preencheProfissionais() {
        cbxProfissional.addItem("--Selecione--");
        for (int i = 0; i < profissionais.size(); i++) {
            cbxProfissional.addItem(profissionais.get(i).getNome());
        }
    }

    public void preencherDadosFormulario() {
        int indiceDaTabela = tbUsuarios.getSelectedRow();
        txtId.setText("" + tbUsuarios.getValueAt(indiceDaTabela, 0));
        cbxProfissional.setSelectedItem(tbUsuarios.getValueAt(indiceDaTabela, 1).toString());
        txtEmail.setText(tbUsuarios.getValueAt(indiceDaTabela, 2).toString());
    }

}
