package br.com.view;

import br.com.controller.ProfissionalController;
import br.com.model.Profissional;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCadProfissional extends javax.swing.JInternalFrame {

    int indice = 0;
    int idincrement = 0;
    List<Profissional> lista = new ArrayList<Profissional>();
    ProfissionalController profissionalController = new ProfissionalController();

    public FrmCadProfissional() {
        initComponents();

        txtId.setEnabled(false);
        lista = profissionalController.getProfissionais();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não foram cadastrados profissionais");
        } else {
            mostrarDados();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloCadastro = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProfissionais = new javax.swing.JTable();
        lblTituloListagem = new javax.swing.JLabel();
        lblIconeProfissional = new javax.swing.JLabel();
        lblIconeListagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setClosable(true);
        setIconifiable(true);

        lblTituloCadastro.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloCadastro.setForeground(new java.awt.Color(6, 52, 75));
        lblTituloCadastro.setText("Cadastro de Profissionais");

        lblId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(6, 52, 75));
        lblId.setText("Id:");

        lblNome.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(6, 52, 75));
        lblNome.setText("Nome:");

        lblMatricula.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblMatricula.setForeground(new java.awt.Color(6, 52, 75));
        lblMatricula.setText("Matrícula:");

        lblCargo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(6, 52, 75));
        lblCargo.setText("Cargo:");

        txtId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtNome.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtMatricula.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtCargo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

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

        tbProfissionais.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbProfissionais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Matrícula", "Cargo"
            }
        ));
        tbProfissionais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProfissionaisMouseClicked(evt);
            }
        });
        tbProfissionais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbProfissionaisKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbProfissionais);

        lblTituloListagem.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloListagem.setForeground(new java.awt.Color(6, 52, 75));
        lblTituloListagem.setText("Listagem de Profissionais");

        lblIconeProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/med.png"))); // NOI18N

        lblIconeListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/list.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome)
                            .addComponent(lblMatricula)
                            .addComponent(lblCargo)
                            .addComponent(lblId)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiro)
                                .addGap(61, 61, 61)
                                .addComponent(btnAnterior)
                                .addGap(81, 81, 81)
                                .addComponent(btnProximo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnUltimo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnNovo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEditar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExcluir)))
                            .addComponent(txtNome)
                            .addComponent(txtMatricula)
                            .addComponent(txtCargo)
                            .addComponent(txtId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloCadastro)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblIconeProfissional)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTituloListagem)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIconeListagem)
                        .addGap(220, 220, 220))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconeProfissional)
                    .addComponent(lblIconeListagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCadastro)
                    .addComponent(lblTituloListagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblId)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrimeiro)
                            .addComponent(btnAnterior)
                            .addComponent(btnProximo)
                            .addComponent(btnUltimo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnSalvar)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
        idincrement = profissionalController.buscarUltimoId() + 1;
        txtId.setText("" + idincrement);
        txtNome.setText("");
        txtMatricula.setText("");
        txtCargo.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Profissional profissional = new Profissional();
        profissional.setId(Integer.parseInt(txtId.getText()));
        profissional.setNome(txtNome.getText());
        if (txtMatricula.getText().equals("")) {
            profissional.setMatricula(0);
        } else {
            profissional.setMatricula(Integer.parseInt(txtMatricula.getText()));
        }
        profissional.setCargo(txtCargo.getText());

        profissionalController.salvarProfissional(profissional);
        lista.clear();
        lista = profissionalController.getProfissionais();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Profissional profissional = new Profissional();
        profissional.setId(Integer.parseInt(txtId.getText()));
        profissional.setNome(txtNome.getText());
        if (txtMatricula.getText().equals("")) {
            profissional.setMatricula(0);
        } else {
            profissional.setMatricula(Integer.parseInt(txtMatricula.getText()));
        }
        profissional.setCargo(txtCargo.getText());

        profissionalController.alterarProfissional(profissional);
        lista.clear();
        lista = profissionalController.getProfissionais();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = (Integer.parseInt(txtId.getText()));

        profissionalController.excluirProfissional(id);
        lista.clear();
        lista = profissionalController.getProfissionais();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tbProfissionaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProfissionaisMouseClicked
        preencherDadosFormulario();
    }//GEN-LAST:event_tbProfissionaisMouseClicked

    private void tbProfissionaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProfissionaisKeyReleased
        if (evt.getKeyCode() == 38 || evt.getKeyCode() == 40) {
            preencherDadosFormulario();
        }
    }//GEN-LAST:event_tbProfissionaisKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblIconeListagem;
    private javax.swing.JLabel lblIconeProfissional;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JLabel lblTituloListagem;
    private javax.swing.JTable tbProfissionais;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 6);
    }

    public void mostrarDados() {
        txtId.setText("" + lista.get(indice).getId());
        txtNome.setText(lista.get(indice).getNome());
        txtMatricula.setText("" + lista.get(indice).getMatricula());
        txtCargo.setText(lista.get(indice).getCargo());

        preencheTabela();
    }

    public void preencheTabela() {
        tbProfissionais.getColumnModel().getColumn(0).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel) tbProfissionais.getModel();

        modelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
                lista.get(i).getMatricula(),
                lista.get(i).getCargo()
            });
        }
    }

    public void preencherDadosFormulario() {
        int indiceDaTabela = tbProfissionais.getSelectedRow();
        txtId.setText("" + tbProfissionais.getValueAt(indiceDaTabela, 0));
        txtNome.setText(tbProfissionais.getValueAt(indiceDaTabela, 1).toString());
        txtMatricula.setText("" + tbProfissionais.getValueAt(indiceDaTabela, 2));
        txtCargo.setText(tbProfissionais.getValueAt(indiceDaTabela, 3).toString());
    }

}
