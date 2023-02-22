/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Resident;
import User.User;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ResidentLogin extends javax.swing.JFrame {
  
    /**
     * Creates new form ResidentLogin
     */
    public ResidentLogin() {
        initComponents();
        
        // make the page to the middle
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

        mgmtLoginPageLabel1 = new javax.swing.JLabel();
        mgmtLoginPageLabel3 = new javax.swing.JLabel();
        mgmtLoginPageLabel = new javax.swing.JLabel();
        mgmtLoginPageLabel4 = new javax.swing.JLabel();
        residentUsernameLabel = new javax.swing.JLabel();
        residentPassLabel = new javax.swing.JLabel();
        residentUsernameTxtField = new javax.swing.JTextField();
        residentPassTxtField = new javax.swing.JTextField();
        residentLoginBtn = new javax.swing.JButton();
        passView = new javax.swing.JCheckBox();
        backBtn = new javax.swing.JButton();

        mgmtLoginPageLabel1.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel1.setText("Management Login Page");

        mgmtLoginPageLabel3.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel3.setText("Parkhill Residence");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mgmtLoginPageLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel.setText("Resident/ Tenant Login Page");

        mgmtLoginPageLabel4.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel4.setText("Parkhill Residence");

        residentUsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentUsernameLabel.setText("Username:");

        residentPassLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentPassLabel.setText("Password:");

        residentUsernameTxtField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentUsernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentUsernameTxtFieldActionPerformed(evt);
            }
        });

        residentPassTxtField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentPassTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentPassTxtFieldActionPerformed(evt);
            }
        });

        residentLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentLoginBtn.setText("Login");
        residentLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residentLoginBtnActionPerformed(evt);
            }
        });
        residentLoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                residentLoginBtnKeyPressed(evt);
            }
        });

        passView.setFont(new java.awt.Font("Georgia", 0, 8)); // NOI18N
        passView.setText("Show Password");
        passView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passViewActionPerformed(evt);
            }
        });

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
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mgmtLoginPageLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(mgmtLoginPageLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passView)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(residentPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(residentPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(residentUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(residentUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(residentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(mgmtLoginPageLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mgmtLoginPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residentUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentPassLabel)
                    .addComponent(residentPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(residentLoginBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void residentUsernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentUsernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residentUsernameTxtFieldActionPerformed

    private void residentPassTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentPassTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residentPassTxtFieldActionPerformed

    private void residentLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residentLoginBtnActionPerformed
        login();
    }//GEN-LAST:event_residentLoginBtnActionPerformed

    private void passViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passViewActionPerformed

    }//GEN-LAST:event_passViewActionPerformed

    private void residentLoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_residentLoginBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_residentLoginBtnKeyPressed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new MainMenu().setVisible(true);
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
            java.util.logging.Logger.getLogger(ResidentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentLogin().setVisible(true);
            }
        });
    }
    
    public void login(){
        
        String userName;
        String pass;
        String file;
        
        // get the username & password typed from text field
        userName = residentUsernameTxtField.getText();
        pass = residentPassTxtField.getText();
        
        file = "database\\residentTenant.txt";
        
        User user = new User(userName,pass);
        if(user.login2(userName, pass, file)){
            JOptionPane.showMessageDialog(this, "Login Successful.");
            
            // save the username into the activeUser.txt
            try {
                FileWriter myWriter = new FileWriter("database\\activeUser.txt", true); //open the file
                myWriter.write(userName);
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            this.setVisible(false);
            new ResidentHomepage().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this,
                    "Login Failed! \nIncorrect Username or Password.",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            residentUsernameTxtField.setText("");
            residentPassTxtField.setText("");
        }     
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel mgmtLoginPageLabel;
    private javax.swing.JLabel mgmtLoginPageLabel1;
    private javax.swing.JLabel mgmtLoginPageLabel3;
    private javax.swing.JLabel mgmtLoginPageLabel4;
    private javax.swing.JCheckBox passView;
    private javax.swing.JButton residentLoginBtn;
    private javax.swing.JLabel residentPassLabel;
    private javax.swing.JTextField residentPassTxtField;
    private javax.swing.JLabel residentUsernameLabel;
    private javax.swing.JTextField residentUsernameTxtField;
    // End of variables declaration//GEN-END:variables

    private String generateSessionID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
