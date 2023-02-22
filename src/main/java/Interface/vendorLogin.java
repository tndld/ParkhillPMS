/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.User;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class vendorLogin extends javax.swing.JFrame {

    /**
     * Creates new form vendorLogin
     */
    public vendorLogin() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        try {
                 // Open the file in write mode with "truncate" option to delete its content
                FileWriter fw = new FileWriter("database\\vendorActive.txt", false);
                PrintWriter pw = new PrintWriter(fw, false);
                
                // Write an empty string to the file to clear its content
                pw.flush();
                
                // Close the writers to release resources
                pw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
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

        vendorUsernameLabel = new javax.swing.JLabel();
        vendorUsernameTxtField = new javax.swing.JTextField();
        vendorPassLabel = new javax.swing.JLabel();
        vendorPassTxtField = new javax.swing.JTextField();
        vendorLoginBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        parkhillTitleLabel = new javax.swing.JLabel();
        vendorLoginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vendorUsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorUsernameLabel.setText("Username:");

        vendorUsernameTxtField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorUsernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorUsernameTxtFieldActionPerformed(evt);
            }
        });

        vendorPassLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorPassLabel.setText("Password:");

        vendorPassTxtField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorPassTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorPassTxtFieldActionPerformed(evt);
            }
        });

        vendorLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorLoginBtn.setText("Login");
        vendorLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorLoginBtnActionPerformed(evt);
            }
        });
        vendorLoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vendorLoginBtnKeyPressed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        parkhillTitleLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        parkhillTitleLabel.setText("Parkhill Residence");

        vendorLoginLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        vendorLoginLabel.setText("Vendor Login Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vendorLoginLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(vendorPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(vendorPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(vendorUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(vendorUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(parkhillTitleLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(vendorLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(37, 37, 37)
                .addComponent(parkhillTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendorLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorPassLabel)
                    .addComponent(vendorPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(vendorLoginBtn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendorUsernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorUsernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorUsernameTxtFieldActionPerformed

    private void vendorPassTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorPassTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorPassTxtFieldActionPerformed

    private void vendorLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorLoginBtnActionPerformed
        login();
    }//GEN-LAST:event_vendorLoginBtnActionPerformed

    private void vendorLoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendorLoginBtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_vendorLoginBtnKeyPressed

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
            java.util.logging.Logger.getLogger(vendorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendorLogin().setVisible(true);
            }
        });
    }
    
    public void login(){
        
        String userName;
        String pass;
        String file;
        
        // get the username & password typed from text field
        userName = vendorUsernameTxtField.getText();
        pass = vendorPassTxtField.getText();
        
        file = "database\\vendor.txt";
        
        User user = new User(userName,pass);
        if(user.login2(userName, pass, file)){
            JOptionPane.showMessageDialog(this, "Login Successful.");
            
            // save the username into the activeUser.txt
            try {
                FileWriter myWriter = new FileWriter("database\\vendorActive.txt", true); //open the file
                myWriter.write(userName);
                myWriter.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }

            this.setVisible(false);
            new VendorHomepage().setVisible(true);
            
        }else {
            JOptionPane.showMessageDialog(this,
                    "Login Failed! \nIncorrect Username or Password.",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            vendorUsernameTxtField.setText("");
            vendorPassTxtField.setText("");
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel parkhillTitleLabel;
    private javax.swing.JButton vendorLoginBtn;
    private javax.swing.JLabel vendorLoginLabel;
    private javax.swing.JLabel vendorPassLabel;
    private javax.swing.JTextField vendorPassTxtField;
    private javax.swing.JLabel vendorUsernameLabel;
    private javax.swing.JTextField vendorUsernameTxtField;
    // End of variables declaration//GEN-END:variables
}
