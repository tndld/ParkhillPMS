/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Resident;
import User.User;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ResidentHomepage extends javax.swing.JFrame {

    /**
     * Creates new form ResidentTenantHomepage
     */
    public ResidentHomepage() {
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

        userProfileBTN = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        ApplyVPassBTN = new javax.swing.JButton();
        viewVPassBTN = new javax.swing.JButton();
        residentUsernameLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userProfileBTN.setText("User Profile");
        userProfileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileBTNActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        ApplyVPassBTN.setText("Apply");
        ApplyVPassBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyVPassBTNActionPerformed(evt);
            }
        });

        viewVPassBTN.setText("View");
        viewVPassBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVPassBTNActionPerformed(evt);
            }
        });

        residentUsernameLabel.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        residentUsernameLabel.setText("My Visitor Pass");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userProfileBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(residentUsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(viewVPassBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApplyVPassBTN)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator3)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoutBtn)
                .addGap(29, 29, 29)
                .addComponent(userProfileBTN)
                .addGap(99, 99, 99)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewVPassBTN)
                    .addComponent(ApplyVPassBTN))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(228, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(129, 129, 129)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userProfileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileBTNActionPerformed
        this.setVisible(false);
        new ResidentUserProfile().setVisible(true);
    }//GEN-LAST:event_userProfileBTNActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
//        Resident resident = new Resident(null,null);
//        resident.logout2("database\\activeUser.txt");
//        this.setVisible(false);
//        new ResidentLogin().setVisible(true);
        logout();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void ApplyVPassBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyVPassBTNActionPerformed
        applyVisitorType();
    }//GEN-LAST:event_ApplyVPassBTNActionPerformed

    private void viewVPassBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVPassBTNActionPerformed
        this.setVisible(false);
        new ResidentViewEditVPass().setVisible(true);
    }//GEN-LAST:event_viewVPassBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentHomepage().setVisible(true);
            }
        });
    }
    
    public void logout(){
        User user = new User(null,null);
        int confirmLogout = JOptionPane.showConfirmDialog(null, 
                "Are you sure want to log out?", "Logout", 
                JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            user.logout2("database\\activeUser");
            new ResidentLogin().setVisible(true);
            this.setVisible(false);
        }else{
            this.setVisible(true);
        }
    }
    
    private void applyVisitorType() {
        
//        Options available
        String[] options = {"Visitor", "Overnight", "Cancel"};
        
//        Let user choose the type
        int type = JOptionPane.showOptionDialog(null, 
                "Which visitor pass do you want to apply?", 
                "Visitor Pass", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (type == 0){
            this.setVisible(false);
            new ResidentApplyVPass().setVisible(true);
        } else if(type == 1){
            this.setVisible(false);
            new ResidentApplyOvernight().setVisible(true);
        } else{
            this.setVisible(false);
            new ResidentHomepage().setVisible(true);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyVPassBTN;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel residentUsernameLabel;
    private javax.swing.JButton userProfileBTN;
    private javax.swing.JButton viewVPassBTN;
    // End of variables declaration//GEN-END:variables
}
