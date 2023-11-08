package fatec.poo.view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beavi
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
        txtHospede = new javax.swing.JTextField();
        txtNumQuarto = new javax.swing.JTextField();
        ftxtDataEntrada = new javax.swing.JFormattedTextField();
        ftxtDataSaida = new javax.swing.JFormattedTextField();
        lblValorHospedagem = new javax.swing.JLabel();
        btnRegistroFunc = new javax.swing.JButton();
        btnHospede = new javax.swing.JButton();
        jLabelSituacao = new javax.swing.JLabel();
        btnSituacaoQuarto = new javax.swing.JButton();
        lblCPFHospede = new javax.swing.JLabel();
        lblRegistroFunc = new javax.swing.JLabel();
        lblSituacaoQuarto = new javax.swing.JLabel();

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

        txtHospede.setEnabled(false);

        txtNumQuarto.setEnabled(false);

        ftxtDataEntrada.setEnabled(false);

        ftxtDataSaida.setEnabled(false);

        lblValorHospedagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnRegistroFunc.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistroFunc.setText("...");

        btnHospede.setBackground(new java.awt.Color(255, 255, 255));
        btnHospede.setText("...");

        jLabelSituacao.setText("Situação");

        btnSituacaoQuarto.setBackground(new java.awt.Color(255, 255, 255));
        btnSituacaoQuarto.setText("...");

        lblCPFHospede.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblRegistroFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblSituacaoQuarto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

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
                            .addComponent(ftxtDataEntrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegFuncional, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(ftxtDataSaida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSituacao, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(lblValorHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRegistroFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(lblCPFHospede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
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
                    .addComponent(lblRegistroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPFHospede)
                    .addComponent(btnHospede)
                    .addComponent(lblCPFHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNumQuarto)
                    .addComponent(txtNumQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSituacao)
                    .addComponent(btnSituacaoQuarto)
                    .addComponent(lblSituacaoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataEntrada)
                    .addComponent(ftxtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataSaida)
                    .addComponent(ftxtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelValorHosp)
                    .addComponent(lblValorHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formatarCampos(){
        try {
            MaskFormatter data = new MaskFormatter("##/##/####");
            data.install(ftxtDataSaida);
            data.install(ftxtDataEntrada);
        } catch (ParseException ex) {
        }
    }
    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospede;
    private javax.swing.JButton btnRegistroFunc;
    private javax.swing.JButton btnSituacaoQuarto;
    private javax.swing.JFormattedTextField ftxtDataEntrada;
    private javax.swing.JFormattedTextField ftxtDataSaida;
    private javax.swing.JLabel jLabelCPFHospede;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDataEntrada;
    private javax.swing.JLabel jLabelDataSaida;
    private javax.swing.JLabel jLabelNumQuarto;
    private javax.swing.JLabel jLabelRegistroFunc;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JLabel jLabelValorHosp;
    private javax.swing.JLabel lblCPFHospede;
    private javax.swing.JLabel lblRegistroFunc;
    private javax.swing.JLabel lblSituacaoQuarto;
    private javax.swing.JLabel lblValorHospedagem;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHospede;
    private javax.swing.JTextField txtNumQuarto;
    private javax.swing.JTextField txtRegFuncional;
    // End of variables declaration//GEN-END:variables
}
