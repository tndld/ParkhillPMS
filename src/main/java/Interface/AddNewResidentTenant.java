/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.AdminExecutive;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AddNewResidentTenant extends javax.swing.JFrame {

    /**
     * Creates new form newResidentTenant
     */
    public AddNewResidentTenant() {
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

        mgmtLoginPageLabel4 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        residentFullNameLabel = new javax.swing.JLabel();
        residentEmailLabel = new javax.swing.JLabel();
        residentPhoneLabel = new javax.swing.JLabel();
        residentUnitLabel = new javax.swing.JLabel();
        residentPasswordLabel = new javax.swing.JLabel();
        pwTF = new javax.swing.JPasswordField();
        unitNoTF = new javax.swing.JTextField();
        residentPhoneTF = new javax.swing.JTextField();
        residentEmailTF = new javax.swing.JTextField();
        residentUsernameLabel = new javax.swing.JLabel();
        residentFullNameTF = new javax.swing.JTextField();
        addTenantBtn = new javax.swing.JButton();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPwTF = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mgmtLoginPageLabel4.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel4.setText("Add Resident/ Tenant Page");

        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        residentFullNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentFullNameLabel.setText("Full Name");

        residentEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentEmailLabel.setText("Email");

        residentPhoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentPhoneLabel.setText("Phone");

        residentUnitLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentUnitLabel.setText("Unit No.");

        residentPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentPasswordLabel.setText("Password");

        unitNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitNoTFActionPerformed(evt);
            }
        });

        residentUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentUsernameLabel.setText("Username");

        addTenantBtn.setText("Add");
        addTenantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTenantBtnActionPerformed(evt);
            }
        });

        confirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        confirmPasswordLabel.setText("ConfirmPassword");

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
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mgmtLoginPageLabel4)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(confirmPwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residentPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unitNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residentUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentFullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residentFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(addTenantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mgmtLoginPageLabel4)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentFullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentUnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addTenantBtn)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitNoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitNoTFActionPerformed

    private void addTenantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTenantBtnActionPerformed
        AdminExecutive admin = new AdminExecutive(null,null);
        
        if (usernameTF.getText().isEmpty() || residentFullNameTF.getText().isEmpty() || residentEmailTF.getText().isEmpty() ||
               residentPhoneTF.getText().isEmpty() || unitNoTF.getText().isEmpty() || pwTF.getText().isEmpty() || confirmPwTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please insert all the required information!", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            
            try {
                String username = usernameTF.getText();
                
                // check username whether already exist
                if(admin.checkUsernameExists(username)){
                    JOptionPane.showMessageDialog(this, "Username already exist.\nPlease use another username.", "Error", JOptionPane.ERROR_MESSAGE);
                    usernameTF.setText("");

                } else {
                    
                    String fullName = residentFullNameTF.getText();
                    String email = residentEmailTF.getText();
                    String phoneNum = residentPhoneTF.getText();
                    String unitNo = unitNoTF.getText();
                    
                    String password1 = pwTF.getText();
                    String confirmPass = confirmPwTF.getText();
                    
                    if (password1.equals(confirmPass)){
                        String finalPassword = confirmPass;
                        if(admin.addResident(username, password1, fullName, email, phoneNum, unitNo)){
                            JOptionPane.showMessageDialog(this, "Resident added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            usernameTF.setText("");
                            residentFullNameTF.setText("");
                            residentEmailTF.setText("");
                            residentPhoneTF.setText("");
                            unitNoTF.setText("");
                            pwTF.setText("");
                            confirmPwTF.setText("");
                        }else {
                            JOptionPane.showMessageDialog(this, "Failed to add new resident. Please try again", "Error", JOptionPane.ERROR_MESSAGE);
                            usernameTF.setText("");
                            residentFullNameTF.setText("");
                            residentEmailTF.setText("");
                            residentPhoneTF.setText("");
                            unitNoTF.setText("");
                            pwTF.setText("");
                            confirmPwTF.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Your passwords are different!", "Error", JOptionPane.ERROR_MESSAGE);
                        pwTF.setText("");
                        confirmPwTF.setText("");
                    }
                }    
            } catch (IOException ex) {
                Logger.getLogger(AddNewResidentTenant.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }//GEN-LAST:event_addTenantBtnActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new AdminResidentTenantMgmt().setVisible(true);
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
            java.util.logging.Logger.getLogger(AddNewResidentTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewResidentTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewResidentTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewResidentTenant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewResidentTenant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTenantBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPwTF;
    private javax.swing.JLabel mgmtLoginPageLabel4;
    private javax.swing.JPasswordField pwTF;
    private javax.swing.JLabel residentEmailLabel;
    private javax.swing.JTextField residentEmailTF;
    private javax.swing.JLabel residentFullNameLabel;
    private javax.swing.JTextField residentFullNameTF;
    private javax.swing.JLabel residentPasswordLabel;
    private javax.swing.JLabel residentPhoneLabel;
    private javax.swing.JTextField residentPhoneTF;
    private javax.swing.JLabel residentUnitLabel;
    private javax.swing.JLabel residentUsernameLabel;
    private javax.swing.JTextField unitNoTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
