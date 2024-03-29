/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import User.AccountExecutive;
import User.AdminExecutive;
import User.BuildingExecutive;
import User.BuildingManager;
import User.MgmtLevelUser;
import User.User;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Asus
 */
public class LoginMgmt extends javax.swing.JFrame {

    /**
     * Creates new form LoginMgmt
     */
    public LoginMgmt() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        try {
                 // Open the file in write mode with "truncate" option to delete its content
                FileWriter fw = new FileWriter("database\\activeUser.txt", false);
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

        mgmtLoginPageLabel2 = new javax.swing.JLabel();
        mgmtUsernameLabel = new javax.swing.JLabel();
        mgmtPasswordLabel = new javax.swing.JLabel();
        mgmtUsernameTxtField = new javax.swing.JTextField();
        mgmtLoginBtn = new javax.swing.JButton();
        mgmtLoginPageLabel = new javax.swing.JLabel();
        mgmtLoginPageLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        logInLabel = new javax.swing.JLabel();
        loginOption = new javax.swing.JComboBox<>();
        passView = new javax.swing.JCheckBox();
        mgmtPassTxtField = new javax.swing.JPasswordField();

        mgmtLoginPageLabel2.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel2.setText("Login Page");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mgmtUsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mgmtUsernameLabel.setText("Username:");

        mgmtPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mgmtPasswordLabel.setText("Password:");

        mgmtUsernameTxtField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mgmtUsernameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgmtUsernameTxtFieldActionPerformed(evt);
            }
        });

        mgmtLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mgmtLoginBtn.setText("Login");
        mgmtLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgmtLoginBtnActionPerformed(evt);
            }
        });

        mgmtLoginPageLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel.setText("Management Login Page");

        mgmtLoginPageLabel3.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel3.setText("Parkhill Residence");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        logInLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logInLabel.setText("Log in as:");

        loginOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Building Manager", "Account Executive", "Admin Executive", "Building Executive" }));
        loginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginOptionActionPerformed(evt);
            }
        });

        passView.setFont(new java.awt.Font("Georgia", 0, 8)); // NOI18N
        passView.setText("Show Password");
        passView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 81, Short.MAX_VALUE)
                .addComponent(mgmtLoginPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(mgmtLoginPageLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passView)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mgmtPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mgmtUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mgmtUsernameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginOption, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                                    .addComponent(mgmtPassTxtField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(mgmtLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mgmtLoginPageLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mgmtLoginPageLabel)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginOption, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgmtUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgmtUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mgmtPassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mgmtPasswordLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passView)
                .addGap(18, 18, 18)
                .addComponent(mgmtLoginBtn)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgmtUsernameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgmtUsernameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgmtUsernameTxtFieldActionPerformed

    private void mgmtLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgmtLoginBtnActionPerformed
        String loginOptionStr = (String) loginOption.getSelectedItem();
        
        String username = mgmtUsernameTxtField.getText();
        String password = mgmtPassTxtField.getText();
        
        
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                        "Please fill in all the required information to log in.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
        }else {
            // Check user role
            if (loginOptionStr.equals("Building Manager")){
                String file = "database\\buildingManager.txt";
                BuildingManager BuildingManager = new BuildingManager(username,password);
                if (BuildingManager.login2(username, password, file)){
                    JOptionPane.showMessageDialog(this, "Login Successful.");
                    try {
                        FileWriter myWriter = new FileWriter("database\\activeUser.txt", true); //open the file
                        myWriter.write(username + "," + password);
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            
                    this.setVisible(false);
                    new BuildingManagerHomepage().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this,
                        "Wrong username or password. Please try again.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                }

            } else if (loginOptionStr.equals("Account Executive")) {
                String file = "database\\accountExecutive.txt";
                AccountExecutive account = new AccountExecutive(username,password);
                if (account.login2(username, password, file)){
                    JOptionPane.showMessageDialog(this, "Login Successful.");
                    
                    try {
                        FileWriter myWriter = new FileWriter("database\\activeUser.txt", true); //open the file
                        myWriter.write(username + "," + password);
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    this.setVisible(false);
                    new AccountExeHomepage().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this,
                        "Login Failed! \nIncorrect Username or Password.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                    mgmtUsernameTxtField.setText("");
                    mgmtPassTxtField.setText("");
                }

            } else if (loginOptionStr.equals("Admin Executive")) {
                String file = "database\\adminExecutive.txt";
                AdminExecutive admin = new AdminExecutive(username,password);
                if (admin.login2(username, password, file)){
                    JOptionPane.showMessageDialog(this, "Login Successful.");
                    
                    try {
                        FileWriter myWriter = new FileWriter("database\\activeUser.txt", true); //open the file
                        myWriter.write(username + "," + password);
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    this.setVisible(false);
                    new AdminHomepage().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this,
                        "Login Failed! \nIncorrect Username or Password.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                    mgmtUsernameTxtField.setText("");
                    mgmtPassTxtField.setText("");
                }

            } else if (loginOptionStr.equals("Building Executive")) {
                String file = "database\\buildingExecutive.txt";
                BuildingExecutive buildingExe = new BuildingExecutive(username,password);
                if (buildingExe.login2(username, password, file)){
                    JOptionPane.showMessageDialog(this, "Login Successful.");
                    
                    try {
                        FileWriter myWriter = new FileWriter("database\\activeUser.txt", true); //open the file
                        myWriter.write(username + "," + password);
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    this.setVisible(false);
                    new BuildingExeHomepage().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this,
                        "Login Failed! \nIncorrect Username or Password.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                    mgmtUsernameTxtField.setText("");
                    mgmtPassTxtField.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please select a role to login.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_mgmtLoginBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void loginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginOptionActionPerformed
        //         searchOption = new JComboBox<>(new String[]{"Username", "Unit No"});
        //         String selected = (String) searchOption.getSelectedItem();
    }//GEN-LAST:event_loginOptionActionPerformed

    private void passViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passViewActionPerformed

        if (passView.isSelected()){
            // Show the password
            mgmtPassTxtField.setEchoChar((char)0); // Set echo char to 0 to show the characters
        } else {
            // Hide the password
            mgmtPassTxtField.setEchoChar('*'); // Set echo char back to '*' to hide the characters
        }
    }//GEN-LAST:event_passViewActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMgmt().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel logInLabel;
    private javax.swing.JComboBox<String> loginOption;
    private javax.swing.JButton mgmtLoginBtn;
    private javax.swing.JLabel mgmtLoginPageLabel;
    private javax.swing.JLabel mgmtLoginPageLabel2;
    private javax.swing.JLabel mgmtLoginPageLabel3;
    private javax.swing.JPasswordField mgmtPassTxtField;
    private javax.swing.JLabel mgmtPasswordLabel;
    private javax.swing.JLabel mgmtUsernameLabel;
    private javax.swing.JTextField mgmtUsernameTxtField;
    private javax.swing.JCheckBox passView;
    // End of variables declaration//GEN-END:variables
}
