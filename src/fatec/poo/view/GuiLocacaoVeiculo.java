package fatec.poo.view;

import fatec.poo.model.LocacaoVeiculo;
import fatec.poo.dao.DaoLocacaoVeiculo;
import fatec.poo.dao.PreparaConexao;
import java.text.DecimalFormat;

public class GuiLocacaoVeiculo extends javax.swing.JFrame {
    
    public GuiLocacaoVeiculo() {
        initComponents();
        txtNomeCliente.setEnabled(false);
        rdbComum.setEnabled(false);
        rdbPremium.setEnabled(false);
        txtPlacaCarro.setEnabled(false);
        txtTaxaLocacao.setEnabled(false);
        txtValorKmRodado.setEnabled(false);
        txtKmRodados.setEnabled(false);
        txtValorLocacao.setEnabled(false);
        btnAlugar.setEnabled(false);
        btnLiberar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTipoCliente = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JPanelTipo = new javax.swing.JPanel();
        rdbComum = new javax.swing.JRadioButton();
        rdbPremium = new javax.swing.JRadioButton();
        txtCodigoLocacao = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtPlacaCarro = new javax.swing.JTextField();
        txtTaxaLocacao = new javax.swing.JTextField();
        txtValorKmRodado = new javax.swing.JTextField();
        txtKmRodados = new javax.swing.JTextField();
        txtValorLocacao = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnAlugar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código da Locação");

        jLabel2.setText("Nome do Cliente");

        jLabel4.setText("Placa do Carro");

        jLabel5.setText("Taxa de Locação (%)");

        jLabel6.setText("Valor por Km rodado");

        jLabel7.setText("Km Rodados");

        jLabel8.setText("Valor de Locação");

        JPanelTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Cliente"));

        btnGrpTipoCliente.add(rdbComum);
        rdbComum.setText("Comum");

        btnGrpTipoCliente.add(rdbPremium);
        rdbPremium.setText("Premium");

        javax.swing.GroupLayout JPanelTipoLayout = new javax.swing.GroupLayout(JPanelTipo);
        JPanelTipo.setLayout(JPanelTipoLayout);
        JPanelTipoLayout.setHorizontalGroup(
            JPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbComum)
                .addGap(18, 18, 18)
                .addComponent(rdbPremium)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelTipoLayout.setVerticalGroup(
            JPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTipoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbComum)
                    .addComponent(rdbPremium)))
        );

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlugar.setText("Alugar");
        btnAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarActionPerformed(evt);
            }
        });

        btnLiberar.setText("Liberar");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKmRodados, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtValorKmRodado)
                                    .addComponent(txtValorLocacao))))
                        .addGap(253, 253, 253))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlacaCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtTaxaLocacao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLiberar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JPanelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTaxaLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorKmRodado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtKmRodados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlugar)
                    .addComponent(btnLiberar)
                    .addComponent(btnSair))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    dispose ();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        int codigo = Integer.parseInt(txtCodigoLocacao.getText());
        locacao = dao.consultar(codigo);

    if (locacao != null) {

        txtNomeCliente.setText(locacao.getNomeCliente());
        txtPlacaCarro.setText(locacao.getPlacaCarro());
        txtTaxaLocacao.setText(String.valueOf(locacao.getTaxaLocacao()));

        if (locacao.getTipoCliente().equals("Premium")) {
            rdbPremium.setSelected(true);
        } else {
            rdbComum.setSelected(true);
        }

        txtValorKmRodado.setEnabled(true);
        txtKmRodados.setEnabled(true);
        btnLiberar.setEnabled(true);
        btnAlugar.setEnabled(false);

    } else {
        txtCodigoLocacao.setEnabled(false);
        txtNomeCliente.setEnabled(true);
        rdbComum.setEnabled(true);
        rdbPremium.setEnabled(true);
        txtPlacaCarro.setEnabled(true);
        txtTaxaLocacao.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnAlugar.setEnabled(true);
    }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarActionPerformed

        int codigo = Integer.parseInt(txtCodigoLocacao.getText());
        String nome = txtNomeCliente.getText();

        locacao = new LocacaoVeiculo(codigo, nome);
        locacao.setTipoCliente(rdbPremium.isSelected() ? "Premium" : "Comum");
        locacao.setPlacaCarro(txtPlacaCarro.getText());
        locacao.setTaxaLocacao(Double.parseDouble(txtTaxaLocacao.getText()));
        locacao.setKmRodados(0);

        dao.inserir(locacao);

        txtNomeCliente.setEnabled(false);
        rdbComum.setEnabled(false);
        rdbPremium.setEnabled(false);
        txtPlacaCarro.setEnabled(false);
        txtTaxaLocacao.setEnabled(false);
        btnAlugar.setEnabled(false);

        txtValorKmRodado.setEnabled(true);
        txtKmRodados.setEnabled(true);
        btnLiberar.setEnabled(true);
    }//GEN-LAST:event_btnAlugarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed

        double valorKm = Double.parseDouble(txtValorKmRodado.getText());
        int km = Integer.parseInt(txtKmRodados.getText());

        locacao.setKmRodados(km);
        double valorPagar = locacao.calcValorPagar(valorKm);

        dao.atualizar(locacao);

        DecimalFormat df = new DecimalFormat ("#,###.##");
        txtValorLocacao.setText(df.format(valorPagar));

        txtValorKmRodado.setEnabled(false);
        txtKmRodados.setEnabled(false);
        btnLiberar.setEnabled(false);
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("", "");
        prepCon.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
        prepCon.setConnectionString("jdbc:ucanaccess://C:\\Users\\willi\\OneDrive\\Documentos\\ANÁLISE E DESENVOLVIMENTO DE SISTEMAS\\4° SEMESTRE\\PROGRAMAÇÃO ORIENTADA A OBJETOS\\PROJETOS\\prjTrab2POOLeonidasCalielWilliamEstevam\\src\\fatec\\poo\\basedados\\DB_POO.accdb");
        dao = new DaoLocacaoVeiculo(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       prepCon.fecharConexao(); 
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(GuiLocacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLocacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLocacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLocacaoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLocacaoVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelTipo;
    private javax.swing.JButton btnAlugar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup btnGrpTipoCliente;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rdbComum;
    private javax.swing.JRadioButton rdbPremium;
    private javax.swing.JTextField txtCodigoLocacao;
    private javax.swing.JTextField txtKmRodados;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPlacaCarro;
    private javax.swing.JTextField txtTaxaLocacao;
    private javax.swing.JTextField txtValorKmRodado;
    private javax.swing.JTextField txtValorLocacao;
    // End of variables declaration//GEN-END:variables
    private LocacaoVeiculo locacao;
    private DaoLocacaoVeiculo dao;  
    private PreparaConexao prepCon;
}
