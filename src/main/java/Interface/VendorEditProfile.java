/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Vendor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class VendorEditProfile extends javax.swing.JFrame {

    /**
     * Creates new form VendorEditProfile
     */
    public VendorEditProfile() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        String filePath = "database\\vendorActive.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            String[] activeVendor = line.split(",");
            String uname = activeVendor[0];
            String pw = activeVendor[1];
            
            Vendor ven = new Vendor(uname,pw);
            vendorUnameTF.setText(uname);
            vendorFnameTF.setText(ven.getFullName());
            vendorEmailTF.setText(ven.getEmail());
            vendorPhoneTF.setText(ven.getPhone());
            lotTF.setText(ven.getLotNo());
            shopNameTF.setText(ven.getSName());
            
            br.close();
            
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
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
        vendorUsernameLB = new javax.swing.JLabel();
        vendorUnameTF = new javax.swing.JTextField();
        vendorFullNameLB = new javax.swing.JLabel();
        vendorFnameTF = new javax.swing.JTextField();
        vendorEmailLB = new javax.swing.JLabel();
        vendorEmailTF = new javax.swing.JTextField();
        vendorPhoneLB = new javax.swing.JLabel();
        vendorLotLB = new javax.swing.JLabel();
        vendorShopNameLB = new javax.swing.JLabel();
        vendorPWLB = new javax.swing.JLabel();
        changePWBtn = new javax.swing.JButton();
        shopNameTF = new javax.swing.JTextField();
        lotTF = new javax.swing.JTextField();
        vendorPhoneTF = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VendorProfileTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        VendorProfileTitle.setText("Vendor Profile");

        vendorUsernameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorUsernameLB.setText("Username");

        vendorUnameTF.setEditable(false);
        vendorUnameTF.setBackground(new java.awt.Color(204, 204, 204));

        vendorFullNameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorFullNameLB.setText("Full Name");

        vendorEmailLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorEmailLB.setText("Email");

        vendorEmailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorEmailTFActionPerformed(evt);
            }
        });

        vendorPhoneLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorPhoneLB.setText("Phone");

        vendorLotLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorLotLB.setText("Lot No.");

        vendorShopNameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorShopNameLB.setText("Shop Name");

        vendorPWLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorPWLB.setText("Password");

        changePWBtn.setText("Change Pasword");
        changePWBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePWBtnActionPerformed(evt);
            }
        });

        shopNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopNameTFActionPerformed(evt);
            }
        });

        lotTF.setEditable(false);
        lotTF.setBackground(new java.awt.Color(204, 204, 204));
        lotTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotTFActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(saveBtn)
                            .addGap(136, 136, 136))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vendorFullNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(vendorFnameTF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vendorLotLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lotTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendorShopNameLB)
                                    .addComponent(vendorPhoneLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendorEmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendorPWLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(changePWBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vendorEmailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vendorPhoneTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(shopNameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorUsernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(vendorUnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(VendorProfileTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(VendorProfileTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorUsernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorUnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendorFullNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(vendorFnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorEmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorPhoneLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorPhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorLotLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lotTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorShopNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorPWLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePWBtn))
                .addGap(29, 29, 29)
                .addComponent(saveBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePWBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePWBtnActionPerformed
        this.setVisible(false);
        new VendorChangePassword().setVisible(true);
    }//GEN-LAST:event_changePWBtnActionPerformed

    private void shopNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopNameTFActionPerformed

    private void lotTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotTFActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String newFname = vendorFnameTF.getText();
        String newEmail = vendorEmailTF.getText();
        String newPhone = vendorPhoneTF.getText();
        String newSname = shopNameTF.getText();

        String filePath = "database\\vendorActive.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            String[] activeVendor = line.split(",");
            String uname = activeVendor[0];
            String pw = activeVendor[1];
            Vendor ven = new Vendor(uname, pw);

            ven.edit(uname, pw, newFname, newEmail, newPhone, newSname);
            br.close();

        }catch(IOException e){
            System.out.println("Exception Occurred" + e);
        }

        this.setVisible(false);
        new VendorProfile().setVisible(true);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void vendorEmailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorEmailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorEmailTFActionPerformed

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
            java.util.logging.Logger.getLogger(VendorEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorEditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorEditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VendorProfileTitle;
    private javax.swing.JButton changePWBtn;
    private javax.swing.JTextField lotTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField shopNameTF;
    private javax.swing.JLabel vendorEmailLB;
    private javax.swing.JTextField vendorEmailTF;
    private javax.swing.JTextField vendorFnameTF;
    private javax.swing.JLabel vendorFullNameLB;
    private javax.swing.JLabel vendorLotLB;
    private javax.swing.JLabel vendorPWLB;
    private javax.swing.JLabel vendorPhoneLB;
    private javax.swing.JTextField vendorPhoneTF;
    private javax.swing.JLabel vendorShopNameLB;
    private javax.swing.JTextField vendorUnameTF;
    private javax.swing.JLabel vendorUsernameLB;
    // End of variables declaration//GEN-END:variables
}
