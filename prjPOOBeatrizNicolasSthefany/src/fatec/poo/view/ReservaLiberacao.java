package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoRegistro;
import fatec.poo.model.Registro;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beatriz/Nicolas/Sthefany
 */
public class ReservaLiberacao extends javax.swing.JFrame {

    /**
     * Creates new form ReservaLiberacao
     */
    public ReservaLiberacao() {
        initComponents();
        formatarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jLabelRegistroFunc = new javax.swing.JLabel();
        jLabelCPFHospede = new javax.swing.JLabel();
        jLabelNumQuarto = new javax.swing.JLabel();
        jLabelDataEntrada = new javax.swing.JLabel();
        jLabelDataSaida = new javax.swing.JLabel();
        jLabelValorHosp = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtRegFuncional = new javax.swing.JTextField();
        txtNumQuarto = new javax.swing.JTextField();
        txtDataEntrada = new javax.swing.JFormattedTextField();
        txtDataSaida = new javax.swing.JFormattedTextField();
        txtValorHospedagem = new javax.swing.JLabel();
        btnRegistroFunc = new javax.swing.JButton();
        btnHospede = new javax.swing.JButton();
        jLabelSituacao = new javax.swing.JLabel();
        btnSituacaoQuarto = new javax.swing.JButton();
        txtCPFHospede = new javax.swing.JLabel();
        txtRegFunc = new javax.swing.JLabel();
        txtSituacaoQuarto = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtHospede = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Hospedagem");

        jLabelCodigo.setText("Código");

        jLabelRegistroFunc.setText("Registro Funcional");

        jLabelCPFHospede.setText("CPF Hóspede");

        jLabelNumQuarto.setText("Nº Quarto");

        jLabelDataEntrada.setText("Data entrada");

        jLabelDataSaida.setText("Data saída");

        jLabelValorHosp.setText("Valor Hospedagem");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtRegFuncional.setEnabled(false);
        txtRegFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegFuncionalActionPerformed(evt);
            }
        });

        txtNumQuarto.setEnabled(false);

        txtDataEntrada.setEnabled(false);

        txtDataSaida.setEnabled(false);

        txtValorHospedagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnRegistroFunc.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistroFunc.setText("...");
        btnRegistroFunc.setEnabled(false);

        btnHospede.setBackground(new java.awt.Color(255, 255, 255));
        btnHospede.setText("...");
        btnHospede.setEnabled(false);

        jLabelSituacao.setText("Situação");

        btnSituacaoQuarto.setBackground(new java.awt.Color(255, 255, 255));
        btnSituacaoQuarto.setText("...");
        btnSituacaoQuarto.setEnabled(false);

        txtCPFHospede.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtRegFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtSituacaoQuarto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnReservar.setBackground(new java.awt.Color(255, 255, 255));
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);

        btnLiberar.setBackground(new java.awt.Color(255, 255, 255));
        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtHospede.setEnabled(false);

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setEnabled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelRegistroFunc)
                    .addComponent(jLabelCPFHospede)
                    .addComponent(jLabelDataEntrada)
                    .addComponent(jLabelNumQuarto)
                    .addComponent(jLabelDataSaida)
                    .addComponent(jLabelValorHosp))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDataEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtNumQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataSaida)
                            .addComponent(txtHospede)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtRegFuncional, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSituacao, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRegFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtCPFHospede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValorHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addComponent(btnReservar)
                .addGap(18, 18, 18)
                .addComponent(btnLiberar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelRegistroFunc)
                    .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroFunc)
                    .addComponent(txtRegFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCPFHospede)
                    .addComponent(btnHospede)
                    .addComponent(txtCPFHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNumQuarto)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSituacao)
                    .addComponent(btnSituacaoQuarto)
                    .addComponent(txtSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataEntrada)
                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataSaida)
                    .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelValorHosp)
                    .addComponent(txtValorHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnReservar)
                    .addComponent(btnSair)
                    .addComponent(btnLiberar)
                    .addComponent(btnConsultar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formatarCampos(){
        try {
            MaskFormatter dataFormat = new MaskFormatter("##/##/####");
            MaskFormatter CpfFormat = new MaskFormatter("###.###.###-##");
            dataFormat.install(txtDataSaida);
            dataFormat.install(txtDataEntrada);
            CpfFormat.install(txtHospede);
        } catch (ParseException ex) {
        }
    }
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtRegFuncionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegFuncionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegFuncionalActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnHospede;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnRegistroFunc;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSituacaoQuarto;
    private javax.swing.JLabel jLabelCPFHospede;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDataEntrada;
    private javax.swing.JLabel jLabelDataSaida;
    private javax.swing.JLabel jLabelNumQuarto;
    private javax.swing.JLabel jLabelRegistroFunc;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelValorHosp;
    private javax.swing.JLabel txtCPFHospede;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataEntrada;
    private javax.swing.JFormattedTextField txtDataSaida;
    private javax.swing.JFormattedTextField txtHospede;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JLabel txtRegFunc;
    private javax.swing.JTextField txtRegFuncional;
    private javax.swing.JLabel txtSituacaoQuarto;
    private javax.swing.JLabel txtValorHospedagem;
    // End of variables declaration//GEN-END:variables
    private Conexao conexao=null;
    private DaoRegistro daoRegistro=null;
    private Registro registro=null;

}
