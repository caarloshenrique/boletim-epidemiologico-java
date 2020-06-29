package br.com.view;

import br.com.controller.BoletimController;
import br.com.controller.PacienteController;
import br.com.model.Paciente;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCadPaciente extends javax.swing.JInternalFrame {

    int indice = 0;
    int idincrement = 0;
    List<Paciente> lista = new ArrayList<Paciente>();
    PacienteController pacienteController = new PacienteController();
    BoletimController boletimController = new BoletimController();

    public FrmCadPaciente() {
        initComponents();

        txtId.setEnabled(false);
        lista = pacienteController.getPacientes();
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não foram cadastrados pacientes");
        } else {
            mostrarDados();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoQuarentena = new javax.swing.ButtonGroup();
        lblTituloCadastro = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        lblEndereco = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        cbxStatus = new javax.swing.JComboBox<>();
        lblQuarentena = new javax.swing.JLabel();
        rbSim = new javax.swing.JRadioButton();
        rbNao = new javax.swing.JRadioButton();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        lblTituloListagem = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        lblIconePaciente = new javax.swing.JLabel();
        lblIconeListagem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setClosable(true);
        setIconifiable(true);

        lblTituloCadastro.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloCadastro.setForeground(new java.awt.Color(6, 52, 75));
        lblTituloCadastro.setText("Cadastro de Pacientes");

        lblId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(6, 52, 75));
        lblId.setText("Id:");

        txtId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblNome.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(6, 52, 75));
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblCpf.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(6, 52, 75));
        lblCpf.setText("CPF:");

        lblTelefone.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(6, 52, 75));
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(6, 52, 75));
        lblEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtEndereco.setColumns(20);
        txtEndereco.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtEndereco.setRows(2);
        jScrollPane1.setViewportView(txtEndereco);

        lblEndereco.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(6, 52, 75));
        lblEndereco.setText("Endereço:");

        lblStatus.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(6, 52, 75));
        lblStatus.setText("Status:");

        cbxStatus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Suspeito", "Confirmado", "Descartado", "Óbito", "Recuperado" }));

        lblQuarentena.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblQuarentena.setForeground(new java.awt.Color(6, 52, 75));
        lblQuarentena.setText("Paciente em quarentena?");

        grupoQuarentena.add(rbSim);
        rbSim.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rbSim.setText("Sim");

        grupoQuarentena.add(rbNao);
        rbNao.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rbNao.setText("Não");

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

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tbPacientes.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone", "E-mail", "Endereço", "Status", "Quarentena"
            }
        ));
        tbPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacientesMouseClicked(evt);
            }
        });
        tbPacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbPacientesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbPacientes);

        lblTituloListagem.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloListagem.setForeground(new java.awt.Color(6, 52, 75));
        lblTituloListagem.setText("Listagem de Pacientes");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        lblIconePaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/paciente.png"))); // NOI18N

        lblIconeListagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/list.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblEndereco)
                        .addComponent(lblId)
                        .addComponent(lblNome)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEmail)
                                    .addGap(130, 130, 130))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTelefone)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))))
                        .addComponent(txtEmail)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblStatus)
                                .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnPrimeiro)
                                            .addGap(48, 48, 48))
                                        .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnSalvar))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAnterior)
                                            .addGap(25, 25, 25)))))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblQuarentena)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbSim)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbNao))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnProximo)
                                        .addComponent(btnEditar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnExcluir))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(btnUltimo))))))
                        .addComponent(txtNome)
                        .addComponent(txtId))
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblIconePaciente))
                    .addComponent(lblTituloCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIconeListagem)
                        .addGap(68, 68, 68))
                    .addComponent(lblTituloListagem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(354, 354, 354))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconePaciente)
                    .addComponent(lblIconeListagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCadastro)
                    .addComponent(lblTituloListagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpf)
                            .addComponent(lblTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(lblQuarentena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbSim)
                            .addComponent(rbNao))
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        idincrement = pacienteController.buscarUltimoId() + 1;
        txtId.setText("" + idincrement);
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        cbxStatus.setSelectedItem("--Selecione--");
        grupoQuarentena.clearSelection();
        rbNao.setSelected(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Paciente paciente = new Paciente();
        paciente.setId(Integer.parseInt(txtId.getText()));
        paciente.setNome(txtNome.getText());
        paciente.setCpf(txtCpf.getText());
        paciente.setTelefone(txtTelefone.getText());
        paciente.setEmail(txtEmail.getText());
        paciente.setEndereco(txtEndereco.getText());
        paciente.setStatus(cbxStatus.getSelectedItem().toString());
        if (rbSim.isSelected()) {
            paciente.setQuarentena(true);
        }
        if (rbNao.isSelected()) {
            paciente.setQuarentena(false);
        }

        pacienteController.salvarPaciente(paciente);
        incrementarBoletim();

        lista.clear();
        lista = pacienteController.getPacientes();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Paciente paciente = new Paciente();
        paciente.setId(Integer.parseInt(txtId.getText()));
        paciente.setNome(txtNome.getText());
        paciente.setCpf(txtCpf.getText());
        paciente.setTelefone(txtTelefone.getText());
        paciente.setEmail(txtEmail.getText());
        paciente.setEndereco(txtEndereco.getText());
        paciente.setStatus(cbxStatus.getSelectedItem().toString());
        if (rbSim.isSelected()) {
            paciente.setQuarentena(true);
        }
        if (rbNao.isSelected()) {
            paciente.setQuarentena(false);
        }

        atualizarBoletim(paciente.getId(), paciente.getStatus());
        pacienteController.alterarPaciente(paciente);

        lista.clear();
        lista = pacienteController.getPacientes();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = (Integer.parseInt(txtId.getText()));

        Paciente paciente = new Paciente();
        paciente = pacienteController.buscarPaciente(id);
        decrementarBoletim(paciente.getStatus());
        pacienteController.excluirPaciente(id);

        lista.clear();
        lista = pacienteController.getPacientes();
        indice = lista.size() - 1;
        mostrarDados();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tbPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacientesMouseClicked
        preencherDadosFormulario();
    }//GEN-LAST:event_tbPacientesMouseClicked

    private void tbPacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPacientesKeyReleased
        if (evt.getKeyCode() == 38 || evt.getKeyCode() == 40) {
            preencherDadosFormulario();
        }
    }//GEN-LAST:event_tbPacientesKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.ButtonGroup grupoQuarentena;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIconeListagem;
    private javax.swing.JLabel lblIconePaciente;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuarentena;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTituloCadastro;
    private javax.swing.JLabel lblTituloListagem;
    private javax.swing.JRadioButton rbNao;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 11);
    }

    public void mostrarDados() {
        txtId.setText("" + lista.get(indice).getId());
        txtNome.setText(lista.get(indice).getNome());
        txtCpf.setText(lista.get(indice).getCpf());
        txtTelefone.setText(lista.get(indice).getTelefone());
        txtEmail.setText(lista.get(indice).getEmail());
        txtEndereco.setText(lista.get(indice).getEndereco());
        cbxStatus.setSelectedItem(lista.get(indice).getStatus());
        if (lista.get(indice).isQuarentena() == true) {
            rbSim.setSelected(true);
        }
        if (lista.get(indice).isQuarentena() == false) {
            rbNao.setSelected(true);
        }

        preencheTabela();
    }

    public void preencheTabela() {
        tbPacientes.getColumnModel().getColumn(0).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel) tbPacientes.getModel();

        modelo.setNumRows(0);
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[]{
                lista.get(i).getId(),
                lista.get(i).getNome(),
                lista.get(i).getCpf(),
                lista.get(i).getTelefone(),
                lista.get(i).getEmail(),
                lista.get(i).getEndereco(),
                lista.get(i).getStatus(),
                retornarStatus(lista.get(i).isQuarentena())
            });
        }
    }

    public void preencherDadosFormulario() {
        int indiceDaTabela = tbPacientes.getSelectedRow();
        txtId.setText("" + tbPacientes.getValueAt(indiceDaTabela, 0));
        txtNome.setText(tbPacientes.getValueAt(indiceDaTabela, 1).toString());
        txtCpf.setText(tbPacientes.getValueAt(indiceDaTabela, 2).toString());
        txtTelefone.setText(tbPacientes.getValueAt(indiceDaTabela, 3).toString());
        txtEmail.setText(tbPacientes.getValueAt(indiceDaTabela, 4).toString());
        txtEndereco.setText(tbPacientes.getValueAt(indiceDaTabela, 5).toString());
        cbxStatus.setSelectedItem(tbPacientes.getValueAt(indiceDaTabela, 6).toString());
        if (lista.get(indiceDaTabela).isQuarentena() == true) {
            rbSim.setSelected(true);
        }
        if (lista.get(indiceDaTabela).isQuarentena() == false) {
            rbNao.setSelected(true);
        }
    }

    public void incrementarBoletim() {
        if (cbxStatus.getSelectedItem().toString().equals("Suspeito")) {
            int anterior = boletimController.buscarSuspeitos();
            int novo = anterior + 1;
            boletimController.atualizarSuspeitos(novo);
        } else if (cbxStatus.getSelectedItem().toString().equals("Confirmado")) {
            int anterior = boletimController.buscarConfirmados();
            int novo = anterior + 1;
            boletimController.atualizarConfirmados(novo);
        } else if (cbxStatus.getSelectedItem().toString().equals("Descartado")) {
            int anterior = boletimController.buscarDescartados();
            int novo = anterior + 1;
            boletimController.atualizarDescartados(novo);
        } else if (cbxStatus.getSelectedItem().toString().equals("Óbito")) {
            int anterior = boletimController.buscarObitos();
            int novo = anterior + 1;
            boletimController.atualizarObitos(novo);
        } else if (cbxStatus.getSelectedItem().toString().equals("Recuperado")) {
            int anterior = boletimController.buscarRecuperados();
            int novo = anterior + 1;
            boletimController.atualizarRecuperados(novo);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o boletim.\nInforme um status válido para paciente!");
        }
    }

    public void decrementarBoletim(String status) {
        if (status.equals("Suspeito")) {
            int anterior = boletimController.buscarSuspeitos();
            if (anterior > 0) {
                int novo = anterior - 1;
                boletimController.atualizarSuspeitos(novo);
            }
        } else if (status.equals("Confirmado")) {
            int anterior = boletimController.buscarConfirmados();
            if (anterior > 0) {
                int novo = anterior - 1;
                boletimController.atualizarConfirmados(novo);
            }
        } else if (status.equals("Descartado")) {
            int anterior = boletimController.buscarDescartados();
            if (anterior > 0) {
                int novo = anterior - 1;
                boletimController.atualizarDescartados(novo);
            }
        } else if (status.equals("Óbito")) {
            int anterior = boletimController.buscarObitos();
            if (anterior > 0) {
                int novo = anterior - 1;
                boletimController.atualizarObitos(novo);
            }
        } else if (status.equals("Recuperado")) {
            int anterior = boletimController.buscarRecuperados();
            if (anterior > 0) {
                int novo = anterior - 1;
                boletimController.atualizarRecuperados(novo);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o boletim.\nInforme um status válido para paciente!");
        }
    }

    public void atualizarBoletim(int id, String novoStatus) {
        Paciente antigo = new Paciente();
        antigo = pacienteController.buscarPaciente(id);

        decrementarBoletim(antigo.getStatus());
        incrementarBoletim();
    }

    public String retornarStatus(boolean status) {
        if (status == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

}
