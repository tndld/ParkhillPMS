/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.BuildingManager;
import User.ManagerTeamStructureMgmt;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ManagerAddNewEmp extends javax.swing.JFrame {

    /**
     * Creates new form newResidentTenant
     */
    public ManagerAddNewEmp() {
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
        fullNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        lotNoLabel = new javax.swing.JLabel();
        residentPasswordLabel = new javax.swing.JLabel();
        pwTF = new javax.swing.JPasswordField();
        addressTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        fullNameTF = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPwTF = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        shopNameLabel = new javax.swing.JLabel();
        positionTF = new javax.swing.JTextField();
        shopNameLabel1 = new javax.swing.JLabel();
        roleOption = new javax.swing.JComboBox<>();
        icLabel = new javax.swing.JLabel();
        icTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mgmtLoginPageLabel4.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtLoginPageLabel4.setText("Add Team Member Page");

        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        fullNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        fullNameLabel.setText("Full Name");

        emailLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        emailLabel.setText("Email");

        PhoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        PhoneLabel.setText("Phone");

        lotNoLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lotNoLabel.setText("Address");

        residentPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        residentPasswordLabel.setText("Password");

        addressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        usernameLabel.setText("Username");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        confirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        shopNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        shopNameLabel.setText("Role");

        positionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionTFActionPerformed(evt);
            }
        });

        shopNameLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        shopNameLabel1.setText("Position");

        roleOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Building Manager", "Account Executive", "Admin Executive", "Building Executive" }));
        roleOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleOptionActionPerformed(evt);
            }
        });

        icLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        icLabel.setText("IC");

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
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lotNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shopNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(shopNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(residentPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roleOption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positionTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmPwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(mgmtLoginPageLabel4)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(14, 14, 14)
                .addComponent(mgmtLoginPageLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(icLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lotNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(roleOption, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shopNameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(positionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(residentPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(addBtn)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTFActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        BuildingManager manager = new BuildingManager(null,null);
        ManagerTeamStructureMgmt manage = new ManagerTeamStructureMgmt();
        
        String username = usernameTF.getText();
        String name = fullNameTF.getText();
        String ic = icTF.getText();
        String email = emailTF.getText();
        String phoneNum = phoneTF.getText();
        String address = addressTF.getText();
        String position = positionTF.getText();
                    
        String password1 = pwTF.getText();
        String confirmPass = confirmPwTF.getText();
        
        if (usernameTF.getText().isEmpty() || fullNameTF.getText().isEmpty() || emailTF.getText().isEmpty() ||
               phoneTF.getText().isEmpty() || addressTF.getText().isEmpty() || positionTF.getText().isEmpty() || pwTF.getText().isEmpty() || confirmPwTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please insert all the required information!", "Error", JOptionPane.ERROR_MESSAGE);
        
        }else {
            String roleOptionStr = (String) roleOption.getSelectedItem();
            if (roleOptionStr.equals("Building Manager")){
                try {
                String file = "database\\buildingManager.txt";
                // check username whether already exist
                if(manager.checkUsernameExists(username, file)){
                    JOptionPane.showMessageDialog(this, "Username already exist.\nPlease use another username.", "Error", JOptionPane.ERROR_MESSAGE);
                    usernameTF.setText("");

                } else {
                    if (password1.equals(confirmPass)){
                        String finalPassword = confirmPass;
                        int count = 0;
                        try {
                            File filePath = new File("database\\buildingManager.txt");
                            Scanner sc = new Scanner(filePath);

                            while(sc.hasNextLine()) {
                                sc.nextLine();
                                count++;
                            }
                            String i = Integer.toString(count);
                            sc.close();
                        } catch (Exception e) {
                            e.getStackTrace();
                        }
                        String id = "M" + count;
                        if(manage.addManager(username, finalPassword, id, name, ic, email, phoneNum, address, position)){
                            JOptionPane.showMessageDialog(this, "Buiding Manager added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
                            positionTF.setText("");
                            pwTF.setText("");
                            confirmPwTF.setText("");
                        }else {
                            JOptionPane.showMessageDialog(this, "Failed to add new building manager.", "Error", JOptionPane.ERROR_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
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
                    Logger.getLogger(ManagerAddNewEmp.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (roleOptionStr.equals("Admin Executive")){
                try {
                String file = "database\\adminExecutive.txt";
                // check username whether already exist
                if(manager.checkUsernameExists(username, file)){
                    JOptionPane.showMessageDialog(this, "Username already exist.\nPlease use another username.", "Error", JOptionPane.ERROR_MESSAGE);
                    usernameTF.setText("");

                } else {
                   
                    if (password1.equals(confirmPass)){
                        String finalPassword = confirmPass;
                        int count = 0;
                        try {
                            File filePath = new File("database\\adminExecutive.txt");
                            Scanner sc = new Scanner(filePath);

                            while(sc.hasNextLine()) {
                                sc.nextLine();
                                count++;
                            }
                            String i = Integer.toString(count);
                            sc.close();
                        } catch (Exception e) {
                            e.getStackTrace();
                        }
                        String id = "AD" + count;
                        if(manage.addAdmin(username, finalPassword, id, name, ic, email, phoneNum, address, position)){
                            JOptionPane.showMessageDialog(this, "Admin added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
                            positionTF.setText("");
                            pwTF.setText("");
                            confirmPwTF.setText("");
                        }else {
                            JOptionPane.showMessageDialog(this, "Failed to add new admin.", "Error", JOptionPane.ERROR_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
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
                Logger.getLogger(ManagerAddNewEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (roleOptionStr.equals("Account Executive")){
            try {
                String file = "database\\accountExecutive.txt";
                // check username whether already exist
                if(manager.checkUsernameExists(username, file)){
                    JOptionPane.showMessageDialog(this, "Username already exist.\nPlease use another username.", "Error", JOptionPane.ERROR_MESSAGE);
                    usernameTF.setText("");

                } else {
                   
                    if (password1.equals(confirmPass)){
                        String finalPassword = confirmPass;
                        int count = 0;
                        try {
                            File filePath = new File("database\\accountExecutive.txt");
                            Scanner sc = new Scanner(filePath);

                            while(sc.hasNextLine()) {
                                sc.nextLine();
                                count++;
                            }
                            String i = Integer.toString(count);
                            sc.close();
                        } catch (Exception e) {
                            e.getStackTrace();
                        }
                        String id = "AC" + count;
                        if(manage.addAccount(username, finalPassword, id, name, ic, email, phoneNum, address, position)){
                            JOptionPane.showMessageDialog(this, "Account Executive added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
                            positionTF.setText("");
                            pwTF.setText("");
                            confirmPwTF.setText("");
                        }else {
                            JOptionPane.showMessageDialog(this, "Failed to add new account executive.", "Error", JOptionPane.ERROR_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
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
                Logger.getLogger(ManagerAddNewEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (roleOptionStr.equals("Building Executive")){
            try {
                String file = "database\\buildingExecutive.txt";
                // check username whether already exist
                if(manager.checkUsernameExists(username, file)){
                    JOptionPane.showMessageDialog(this, "Username already exist.\nPlease use another username.", "Error", JOptionPane.ERROR_MESSAGE);
                    usernameTF.setText("");

                } else {
                   
                    if (password1.equals(confirmPass)){
                        String finalPassword = confirmPass;
                        int count = 0;
                        try {
                            File filePath = new File("database\\buildingExecutive.txt");
                            Scanner sc = new Scanner(filePath);

                            while(sc.hasNextLine()) {
                                sc.nextLine();
                                count++;
                            }
                            String i = Integer.toString(count);
                            sc.close();
                        } catch (Exception e) {
                            e.getStackTrace();
                        }
                        String id = "BE" + count;
                        if(manage.addBuildingExe(username, finalPassword, id, name, ic, email, phoneNum, address, position)){
                            JOptionPane.showMessageDialog(this, "Building executive added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
                            positionTF.setText("");
                            pwTF.setText("");
                            confirmPwTF.setText("");
                        }else {
                            JOptionPane.showMessageDialog(this, "Failed to add new building executive.", "Error", JOptionPane.ERROR_MESSAGE);
                            usernameTF.setText("");
                            fullNameTF.setText("");
                            icTF.setText("");
                            emailTF.setText("");
                            phoneTF.setText("");
                            addressTF.setText("");
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
                Logger.getLogger(ManagerAddNewEmp.class.getName()).log(Level.SEVERE, null, ex);
            }       
        }
        }  
    }//GEN-LAST:event_addBtnActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new ManagerTeamStructurePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void positionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionTFActionPerformed

    private void roleOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleOptionActionPerformed
        //         searchOption = new JComboBox<>(new String[]{"Username", "Unit No"});
        //         String selected = (String) searchOption.getSelectedItem();
    }//GEN-LAST:event_roleOptionActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerAddNewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerAddNewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerAddNewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerAddNewEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagerAddNewEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPwTF;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameTF;
    private javax.swing.JLabel icLabel;
    private javax.swing.JTextField icTF;
    private javax.swing.JLabel lotNoLabel;
    private javax.swing.JLabel mgmtLoginPageLabel4;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField positionTF;
    private javax.swing.JPasswordField pwTF;
    private javax.swing.JLabel residentPasswordLabel;
    private javax.swing.JComboBox<String> roleOption;
    private javax.swing.JLabel shopNameLabel;
    private javax.swing.JLabel shopNameLabel1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
