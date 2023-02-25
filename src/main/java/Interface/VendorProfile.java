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
public class VendorProfile extends getActiveVendor {

    /**
     * Creates new form VendorProfile
     */
    public VendorProfile() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        Vendor ven = new Vendor(getActiveVendor()[0], getActiveVendor()[1]);
        vendorUnameTF.setText(ven.getUsername());
        vendorFnameTF.setText(ven.getFullName());
        vendorEmailTF.setText(ven.getEmail());
        vendorPhoneTF.setText(ven.getPhone());
        lotTF.setText(ven.getLotNo());
        shopNameTF.setText(ven.getSName());
        vendorPWTF.setText(ven.getPassword());
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
        vendorPWTF = new javax.swing.JPasswordField();
        shopNameTF = new javax.swing.JTextField();
        vendorPhoneTF = new javax.swing.JTextField();
        lotTF = new javax.swing.JTextField();
        homeBTN = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VendorProfileTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        VendorProfileTitle.setText("Vendor Profile");

        vendorUsernameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorUsernameLB.setText("Username");

        vendorUnameTF.setEditable(false);
        vendorUnameTF.setBackground(new java.awt.Color(204, 204, 204));

        vendorFullNameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorFullNameLB.setText("Full Name");

        vendorFnameTF.setEditable(false);
        vendorFnameTF.setBackground(new java.awt.Color(204, 204, 204));

        vendorEmailLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorEmailLB.setText("Email");

        vendorEmailTF.setEditable(false);
        vendorEmailTF.setBackground(new java.awt.Color(204, 204, 204));

        vendorPhoneLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorPhoneLB.setText("Phone");

        vendorLotLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorLotLB.setText("Lot No.");

        vendorShopNameLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorShopNameLB.setText("Shop Name");

        vendorPWLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vendorPWLB.setText("Password");

        vendorPWTF.setEditable(false);
        vendorPWTF.setBackground(new java.awt.Color(204, 204, 204));

        shopNameTF.setEditable(false);
        shopNameTF.setBackground(new java.awt.Color(204, 204, 204));
        shopNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopNameTFActionPerformed(evt);
            }
        });

        vendorPhoneTF.setEditable(false);
        vendorPhoneTF.setBackground(new java.awt.Color(204, 204, 204));

        lotTF.setEditable(false);
        lotTF.setBackground(new java.awt.Color(204, 204, 204));
        lotTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotTFActionPerformed(evt);
            }
        });

        homeBTN.setText("Homepage");
        homeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTNActionPerformed(evt);
            }
        });

        editBTN.setText("Edit Profile");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(VendorProfileTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(homeBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendorFullNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorEmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorPhoneLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorLotLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorShopNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorPWLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorUsernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shopNameTF)
                            .addComponent(lotTF)
                            .addComponent(vendorPWTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendorPhoneTF)
                            .addComponent(vendorEmailTF)
                            .addComponent(vendorFnameTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vendorUnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(VendorProfileTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorUsernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorUnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorFullNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorFnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorEmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(vendorPWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBTN)
                    .addComponent(homeBTN))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shopNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopNameTFActionPerformed

    private void lotTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotTFActionPerformed

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
        this.setVisible(false);
        new VendorHomepage().setVisible(true);
    }//GEN-LAST:event_homeBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
        this.setVisible(false);
        new VendorEditProfile().setVisible(true);
    }//GEN-LAST:event_editBTNActionPerformed

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
            java.util.logging.Logger.getLogger(VendorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorProfile().setVisible(true);
            }
        });
    }
    
    @Override
    public String[] getActiveVendor(){
        String filePath = "database\\vendorActive.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            String[] activeUser = line.split(",");           
            br.close();
            return activeUser;
        }catch(IOException e){
            System.out.println("Input Output Exception Occurred" + e);
            return null;
        }catch(Exception e) {
            System.out.println("Exception " + e);
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VendorProfileTitle;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton homeBTN;
    private javax.swing.JTextField lotTF;
    private javax.swing.JTextField shopNameTF;
    private javax.swing.JLabel vendorEmailLB;
    private javax.swing.JTextField vendorEmailTF;
    private javax.swing.JTextField vendorFnameTF;
    private javax.swing.JLabel vendorFullNameLB;
    private javax.swing.JLabel vendorLotLB;
    private javax.swing.JLabel vendorPWLB;
    private javax.swing.JPasswordField vendorPWTF;
    private javax.swing.JLabel vendorPhoneLB;
    private javax.swing.JTextField vendorPhoneTF;
    private javax.swing.JLabel vendorShopNameLB;
    private javax.swing.JTextField vendorUnameTF;
    private javax.swing.JLabel vendorUsernameLB;
    // End of variables declaration//GEN-END:variables
}
