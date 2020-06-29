package br.com.view;

import br.com.controller.BoletimController;
import br.com.model.Boletim;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmListBoletim extends javax.swing.JInternalFrame {

    BoletimController boletimController = new BoletimController();
    Boletim boletim = new Boletim();
    List<String> listaCampos = new ArrayList<String>();

    public FrmListBoletim() {
        initComponents();

        preencheListaCampos();
        boletim = boletimController.getBoletim();
        preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloBoletim = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBoletim = new javax.swing.JTable();
        btnGerarRelatorio = new javax.swing.JButton();
        lblIconeCorona1 = new javax.swing.JLabel();
        lblIconeCorona2 = new javax.swing.JLabel();
        lblIconeCorona3 = new javax.swing.JLabel();
        lblIconeCorona4 = new javax.swing.JLabel();
        lblIconeCorona5 = new javax.swing.JLabel();
        lblIconeCorona6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        lblTituloBoletim.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTituloBoletim.setForeground(new java.awt.Color(6, 52, 75));
        lblTituloBoletim.setText("Boletim Epidemiológico");

        tbBoletim.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbBoletim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Situação", "Número de casos"
            }
        ));
        jScrollPane1.setViewportView(tbBoletim);

        btnGerarRelatorio.setBackground(new java.awt.Color(6, 52, 75));
        btnGerarRelatorio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        lblIconeCorona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/coronavirus-min.png"))); // NOI18N

        lblIconeCorona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/coronavirus-min.png"))); // NOI18N

        lblIconeCorona3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/coronavirus-min.png"))); // NOI18N

        lblIconeCorona4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/coronavirus-min.png"))); // NOI18N

        lblIconeCorona5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/coronavirus-min.png"))); // NOI18N

        lblIconeCorona6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/image/coronavirus-min.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIconeCorona4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblIconeCorona5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(lblIconeCorona6)
                        .addGap(30, 30, 30)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTituloBoletim)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGerarRelatorio)
                                .addGap(63, 63, 63)
                                .addComponent(lblIconeCorona2)
                                .addGap(18, 18, 18)
                                .addComponent(lblIconeCorona1)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(lblIconeCorona3)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTituloBoletim)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIconeCorona3)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconeCorona1)
                            .addComponent(lblIconeCorona2)
                            .addComponent(btnGerarRelatorio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblIconeCorona4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeCorona6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIconeCorona5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        boletimController.gerarBoletimEpidemiologico();
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIconeCorona1;
    private javax.swing.JLabel lblIconeCorona2;
    private javax.swing.JLabel lblIconeCorona3;
    private javax.swing.JLabel lblIconeCorona4;
    private javax.swing.JLabel lblIconeCorona5;
    private javax.swing.JLabel lblIconeCorona6;
    private javax.swing.JLabel lblTituloBoletim;
    private javax.swing.JTable tbBoletim;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 6);
    }

    public void preencheListaCampos() {
        listaCampos.add("Suspeitos");
        listaCampos.add("Confirmados");
        listaCampos.add("Descartados");
        listaCampos.add("Óbitos");
        listaCampos.add("Recuperados");
    }

    public void preencheTabela() {
        tbBoletim.getColumnModel().getColumn(0).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel) tbBoletim.getModel();

        modelo.setNumRows(0);

        modelo.addRow(new Object[]{listaCampos.get(0), boletim.getSuspeitos()});
        modelo.addRow(new Object[]{listaCampos.get(1), boletim.getConfirmados()});
        modelo.addRow(new Object[]{listaCampos.get(2), boletim.getDescartados()});
        modelo.addRow(new Object[]{listaCampos.get(3), boletim.getObitos()});
        modelo.addRow(new Object[]{listaCampos.get(4), boletim.getRecuperados()});
    }

}
