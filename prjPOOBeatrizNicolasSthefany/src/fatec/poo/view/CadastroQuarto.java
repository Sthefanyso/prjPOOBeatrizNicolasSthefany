/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoQuarto;
import fatec.poo.model.Quarto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Sthefany, Nicolas e Beatriz
 */
public class CadastroQuarto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroQuarto
     */
    public CadastroQuarto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelNCadastroQuarto = new javax.swing.JLabel();
        jLabelValorDCadastroQuarto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbSolteiro = new javax.swing.JRadioButton();
        rdbCasal = new javax.swing.JRadioButton();
        txtNQuarto = new javax.swing.JTextField();
        txtValorDiaria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Cadastro Quarto"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelNCadastroQuarto.setText("Nº Quarto");

        jLabelValorDCadastroQuarto.setText("Valor Diária");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(rdbSolteiro);
        rdbSolteiro.setSelected(true);
        rdbSolteiro.setText("Solteiro");
        rdbSolteiro.setEnabled(false);

        buttonGroup1.add(rdbCasal);
        rdbCasal.setText("Casal");
        rdbCasal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rdbSolteiro)
                .addGap(18, 18, 18)
                .addComponent(rdbCasal)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSolteiro)
                    .addComponent(rdbCasal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtValorDiaria.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelValorDCadastroQuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorDiaria))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNCadastroQuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNQuarto))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNCadastroQuarto)
                    .addComponent(txtNQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDCadastroQuarto)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
           String tipo = null;
           if(rdbSolteiro.isSelected()){
              tipo = "S";
           }
           if(rdbCasal.isSelected()){
               tipo = "D";
           }
        quarto = new Quarto(Integer.parseInt(txtNQuarto.getText()),tipo,Double.parseDouble(txtValorDiaria.getText()));
 
        daoQuarto.inserir(quarto);
         txtNQuarto.setText("");
        txtValorDiaria.setText("");    
        
        txtNQuarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
        rdbSolteiro.setSelected(true);
        txtNQuarto.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        quarto = null;
        quarto = daoQuarto.consultar(Integer. parseInt(txtNQuarto.getText()));
        
       if (quarto == null){
           
           
           txtNQuarto.setEnabled(false);
           txtValorDiaria.setEnabled(true);
           txtValorDiaria.requestFocus();
           rdbCasal.setEnabled(true);
           rdbSolteiro.setEnabled(true);
           
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{
          String val = Double.toString(quarto.getValorDiaria());
          txtValorDiaria.setText(val);
         
          switch(quarto.getTipo()) {
               case "S":

                   rdbSolteiro.setSelected(true);
                   rdbCasal.setSelected(false);

                   break;
               case "D":
                   rdbCasal.setSelected(true);
                   rdbSolteiro.setSelected(false);

                   break;
           }
       
          
       
          txtNQuarto.setEnabled(false); 
          txtValorDiaria.setEnabled(true);
          txtValorDiaria.requestFocus();
          rdbCasal.setEnabled(true);
          rdbSolteiro.setEnabled(true);
          
          
          
          btnConsultar.setEnabled(false);
          btnInserir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }    
       
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          conexao = new Conexao("","");
        
        conexao.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");
        conexao.setConnectionString("jdbc:ucanaccess://C:\\Users\\orion\\Downloads\\TrabalhoPOO_03\\prjPOOBeatrizNicolasSthefany\\prjPOOBeatrizNicolasSthefany\\src\\fatec\\poo\\basedados\\dbHotel.accdb");
                
        daoQuarto = new DaoQuarto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
          conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           String tipo = null;
           if(rdbSolteiro.isSelected()){
              tipo = "S";
           }
           if(rdbCasal.isSelected()){
               tipo = "D";
           }
           quarto.setValorDiaria(Double.parseDouble(txtValorDiaria.getText()));
           quarto.setTipo(tipo);
           daoQuarto.alterar(quarto);
        } 
        
         txtNQuarto.setText("");
        txtValorDiaria.setText("");    
        
        txtNQuarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
        rdbSolteiro.setSelected(true);
        txtNQuarto.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoQuarto.excluir(quarto); 
            
        txtNQuarto.setText("");
        txtValorDiaria.setText("");    
        
        txtNQuarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        rdbSolteiro.setEnabled(false);
        rdbCasal.setEnabled(false);
        rdbSolteiro.setSelected(true);
        txtNQuarto.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabelNCadastroQuarto;
    private javax.swing.JLabel jLabelValorDCadastroQuarto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbCasal;
    private javax.swing.JRadioButton rdbSolteiro;
    private javax.swing.JTextField txtNQuarto;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables

    private Conexao conexao=null;
    private DaoQuarto daoQuarto=null;
    private Quarto quarto=null;
}
