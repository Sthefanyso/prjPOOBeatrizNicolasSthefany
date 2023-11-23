
package fatec.poo.view;

import fatec.poo.model.Recepcionista;
import fatec.poo.control.Conexao;
import fatec.poo.control.DaoRecepcionista;
import javax.swing.JOptionPane;
/**
 *
 * @author Sthefany, Nicolas e Beatriz
 */
public class CadastroRecepcionista extends javax.swing.JFrame {

    public CadastroRecepcionista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabelRegFuncionalCadastroRecepcionista = new javax.swing.JLabel();
        jLabelNomeCadastroRecepcionista = new javax.swing.JLabel();
        txtRegFuncional = new javax.swing.JTextField();
        jPanel = new javax.swing.JPanel();
        rdbManha = new javax.swing.JRadioButton();
        rdbTarde = new javax.swing.JRadioButton();
        rdbNoite = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabelEnderecoCadastroRecepcionista = new javax.swing.JLabel();
        jLabelTelefoneCadastroRecepcionista = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelRegFuncionalCadastroRecepcionista.setText("Registro Funcional");

        jLabelNomeCadastroRecepcionista.setText("Nome");

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        buttonGroup2.add(rdbManha);
        rdbManha.setSelected(true);
        rdbManha.setText("Manhã");
        rdbManha.setEnabled(false);
        rdbManha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbManhaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdbTarde);
        rdbTarde.setText("Tarde");
        rdbTarde.setEnabled(false);

        buttonGroup2.add(rdbNoite);
        rdbNoite.setText("Noite");
        rdbNoite.setEnabled(false);
        rdbNoite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNoiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(rdbManha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbNoite)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbManha)
                    .addComponent(rdbTarde)
                    .addComponent(rdbNoite))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

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

        jLabelEnderecoCadastroRecepcionista.setText("Endereço");

        jLabelTelefoneCadastroRecepcionista.setText("Telefone");

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelRegFuncionalCadastroRecepcionista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeCadastroRecepcionista)
                            .addComponent(jLabelEnderecoCadastroRecepcionista)
                            .addComponent(jLabelTelefoneCadastroRecepcionista))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(txtEndereco))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addGap(0, 129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegFuncionalCadastroRecepcionista)
                    .addComponent(txtRegFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCadastroRecepcionista)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoCadastroRecepcionista)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefoneCadastroRecepcionista)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void rdbManhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbManhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbManhaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void rdbNoiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNoiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbNoiteActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       try{
        recepcionista = null;
       recepcionista = daoRecepcionista.consultar(Integer.parseInt(txtRegFuncional.getText()));
       
       if (recepcionista == null){
           txtRegFuncional.setEnabled(false);
           txtNome.setEnabled(true);
           txtNome.requestFocus();
           txtEndereco.setEnabled(true);
           txtTelefone.setEnabled(true);
           rdbManha.setEnabled(true);
           rdbTarde.setEnabled(true);
           rdbNoite.setEnabled(true);

 
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
           
  
       }
       else{
          txtNome.setText(recepcionista.getNome());
          txtEndereco.setText(recepcionista.getEndereco());
          txtTelefone.setText(recepcionista.getTelefone());
       
          txtRegFuncional.setEnabled(false); 
          txtNome.setEnabled(true);
          txtNome.requestFocus();
          txtEndereco.setEnabled(true);
          txtTelefone.setEnabled(true);
          rdbManha.setEnabled(true);
          rdbTarde.setEnabled(true);
          rdbNoite.setEnabled(true);
          
          btnConsultar.setEnabled(false);
          btnInserir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
          
               switch (recepcionista.getTurno()) {
               case "M":          
                   rdbManha.setSelected(true);
                   break;
               case "T":
                   rdbTarde.setSelected(true);
                   break;
               case "N":
                   rdbNoite.setSelected(true);
                   break;
                   
           }
       }    
        }catch(NumberFormatException e){
            txtRegFuncional.requestFocus();
            JOptionPane.showMessageDialog(null, "Digite um valor numérico.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
     
    }//GEN-LAST:event_btnConsultarActionPerformed

    
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        recepcionista = new Recepcionista(Integer.parseInt(txtRegFuncional.getText()), txtNome.getText());
        recepcionista.setEndereco(txtEndereco.getText());
        recepcionista.setTelefone(txtTelefone.getText());
        
           if(rdbManha.isSelected()){
               recepcionista.setTurno("M");
           }
           if(rdbTarde.isSelected()){
               recepcionista.setTurno("T");
           }
           if(rdbNoite.isSelected()){
               recepcionista.setTurno("N");
           }
        daoRecepcionista.inserir(recepcionista);
        

         
        txtRegFuncional.setText("");
        txtNome.setText("");    
        txtEndereco.setText("");      
        txtTelefone.setText("");        
        rdbManha.setSelected(true);
        
              
        btnInserir.setEnabled(false);
        txtRegFuncional.setEnabled(true);
        txtNome.setEnabled(false);
        txtRegFuncional.requestFocus();
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
                  rdbManha.setEnabled(false);
          rdbTarde.setEnabled(false);
          rdbNoite.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){//Sim
           recepcionista.setNome(txtNome.getText());
           recepcionista.setEndereco(txtEndereco.getText());
           recepcionista.setTelefone(txtTelefone.getText());
            if(rdbManha.isSelected()){
               recepcionista.setTurno("M");
           }
           if(rdbTarde.isSelected()){
               recepcionista.setTurno("T");
           }
           if(rdbNoite.isSelected()){
               recepcionista.setTurno("N");
           }
           daoRecepcionista.alterar(recepcionista);
        } 
        
        txtRegFuncional.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        rdbManha.setSelected(true);
        txtRegFuncional.setEnabled(true); 
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtRegFuncional.requestFocus();
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
          rdbManha.setEnabled(false);
          rdbTarde.setEnabled(false);
          rdbNoite.setEnabled(false);
        btnExcluir.setEnabled(false);    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
      if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoRecepcionista.excluir(recepcionista); 
            
            txtRegFuncional.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            rdbManha.setSelected(true);
            txtRegFuncional.setEnabled(true); 
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtRegFuncional.requestFocus();
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            rdbManha.setEnabled(false);
            rdbTarde.setEnabled(false);
            rdbNoite.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("","");
        
        conexao.setDriver("net.ucanaccess.jdbc.UcanaccessDriver");

        conexao.setConnectionString("jdbc:ucanaccess://C:\\Users\\Sthefany\\Desktop\\Sthefany\\faculdade\\poo\\projpoo\\prjPOOBeatrizNicolasSthefany\\prjPOOBeatrizNicolasSthefany\\src\\fatec\\poo\\basedados\\dbHotel.accdb");
                
        daoRecepcionista = new DaoRecepcionista(conexao.conectar());    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
      
           }//GEN-LAST:event_formWindowClosed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabelEnderecoCadastroRecepcionista;
    private javax.swing.JLabel jLabelNomeCadastroRecepcionista;
    private javax.swing.JLabel jLabelRegFuncionalCadastroRecepcionista;
    private javax.swing.JLabel jLabelTelefoneCadastroRecepcionista;
    private javax.swing.JPanel jPanel;
    private javax.swing.JRadioButton rdbManha;
    private javax.swing.JRadioButton rdbNoite;
    private javax.swing.JRadioButton rdbTarde;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRegFuncional;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoRecepcionista daoRecepcionista=null;
    private Recepcionista recepcionista=null;
    private Conexao conexao=null;

}
