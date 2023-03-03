/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.BuildingManager;
import User.Guard;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class GuardHomepage extends javax.swing.JFrame {

    /**
     * Creates new form GuardHomepage
     */
    public GuardHomepage() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mgmtLoginPageLabel = new javax.swing.JLabel();
        accExeLogoutBtn = new javax.swing.JToggleButton();
        viewVisitorPassBtn = new javax.swing.JButton();
        insidentBtn = new javax.swing.JButton();
        checkpointBtn = new javax.swing.JButton();
        updateVisitorEntryBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mgmtLoginPageLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel.setText("Guard  Homepage");

        accExeLogoutBtn.setText("Log Out");
        accExeLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accExeLogoutBtnActionPerformed(evt);
            }
        });

        viewVisitorPassBtn.setText("View Visitor Pass");
        viewVisitorPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVisitorPassBtnActionPerformed(evt);
            }
        });

        insidentBtn.setText("Incident");

        checkpointBtn.setText("Checkpoint");
        checkpointBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpointBtnActionPerformed(evt);
            }
        });

        updateVisitorEntryBtn.setText("Update Visitor Entry");
        updateVisitorEntryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVisitorEntryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkpointBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insidentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(accExeLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(updateVisitorEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(viewVisitorPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(183, 183, 183)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(mgmtLoginPageLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accExeLogoutBtn)
                .addGap(18, 18, 18)
                .addComponent(mgmtLoginPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(viewVisitorPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateVisitorEntryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(insidentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkpointBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accExeLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accExeLogoutBtnActionPerformed
        logout();
    }//GEN-LAST:event_accExeLogoutBtnActionPerformed

    private void viewVisitorPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVisitorPassBtnActionPerformed
        // TODO add your handling code here:
        new GuardViewVisitorPass().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewVisitorPassBtnActionPerformed

    private void checkpointBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpointBtnActionPerformed
        // TODO add your handling code here:
        new GuardCheckpoint().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkpointBtnActionPerformed

    private void updateVisitorEntryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVisitorEntryBtnActionPerformed
        // TODO add your handling code here:
        new ViewVisitorEntry().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateVisitorEntryBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GuardHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardHomepage().setVisible(true);
            }
        });
    }
    
    public void logout(){
        Guard guard = new Guard(null, null);
        int confirmLogout = JOptionPane.showConfirmDialog(null, 
                "Are you sure want to log out?", "Logout", 
                JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            guard.logout("database\\activeUser");
            new GuardLogin().setVisible(true);
            this.setVisible(false);
        }else{
            this.setVisible(true);
        }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton accExeLogoutBtn;
    private javax.swing.JButton checkpointBtn;
    private javax.swing.JButton insidentBtn;
    private javax.swing.JLabel mgmtLoginPageLabel;
    private javax.swing.JButton updateVisitorEntryBtn;
    private javax.swing.JButton viewVisitorPassBtn;
    // End of variables declaration//GEN-END:variables
}
