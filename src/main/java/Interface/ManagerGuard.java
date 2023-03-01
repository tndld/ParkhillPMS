/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.BuildingManager;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ManagerGuard extends javax.swing.JFrame {

    /**
     * Creates new form ManagerGuard
     */
    public ManagerGuard() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        File file = new File("database\\guard.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            Object [] items = br.lines().toArray();
            for (int i = 1; i < items.length; i++) {
                String [] rec = items[i].toString().trim().split(",");
                if (i >= 0){
                    usernameTF.setText(rec[0]);
                    passwordTF.setText(rec[1]);
                    confirmPasswordTF.setText("");
                }
            }            
        } catch (IOException ex) {
            Logger.getLogger(ManagerGuard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VendorProfileTitle = new javax.swing.JLabel();
        confirmPasswordTF = new javax.swing.JTextField();
        usernameLB = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwordLB = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        confirmPasswordLB = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VendorProfileTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        VendorProfileTitle.setText("Guard Account");

        confirmPasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTFActionPerformed(evt);
            }
        });

        usernameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        usernameLB.setText("Username");

        usernameTF.setEditable(false);
        usernameTF.setBackground(new java.awt.Color(204, 204, 204));

        passwordLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        passwordLB.setText("Password");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        confirmPasswordLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        confirmPasswordLB.setText("Confirm Password");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(VendorProfileTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmPasswordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(updateBtn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordTF)
                            .addComponent(confirmPasswordTF)
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(9, 9, 9)
                .addComponent(VendorProfileTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(confirmPasswordLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addComponent(updateBtn)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordTFActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String username = usernameTF.getText();
        String newPass = passwordTF.getText();
        String confirmPass = confirmPasswordTF.getText();
        
        if (passwordTF.getText().isEmpty() || confirmPasswordTF.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Please insert all the required information!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (newPass.equals(confirmPass)){
                String finalPass = confirmPass;
                BuildingManager manager = new BuildingManager(null,null);
                if (manager.updateGuard(username, finalPass)){
                    JOptionPane.showMessageDialog(this, "Guard account updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    confirmPasswordTF.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update guard profile.", "Error", JOptionPane.ERROR_MESSAGE);
                    confirmPasswordTF.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Password not same.", "Error", JOptionPane.ERROR_MESSAGE);
                    passwordTF.setText("");
                    confirmPasswordTF.setText("");
            }
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new ManagerUserMgmt().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerGuard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerGuard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerGuard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerGuard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerGuard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VendorProfileTitle;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel confirmPasswordLB;
    private javax.swing.JTextField confirmPasswordTF;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel usernameLB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}