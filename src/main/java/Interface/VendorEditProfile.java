/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author user
 */
public class VendorEditProfile extends javax.swing.JFrame {

    /**
     * Creates new form VendorProfile
     */
    public VendorEditProfile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        residentUsernameLabel = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        residentFullNameLabel = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        residentEmailLabel = new javax.swing.JLabel();
        unitNoTF = new javax.swing.JTextField();
        residentPhoneLabel = new javax.swing.JLabel();
        residentRoleLabel = new javax.swing.JLabel();
        changePwButton = new javax.swing.JButton();
        residentUnitLabel = new javax.swing.JLabel();
        homepageBTN = new javax.swing.JButton();
        residentPasswordLabel = new javax.swing.JLabel();
        UserProfileTitle = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        usernameTF = new javax.swing.JTextField();
        fullNameTF = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        vendorUsernameLB = new javax.swing.JLabel();
        vendorPhoneTF = new javax.swing.JTextField();
        vendorNameLB = new javax.swing.JLabel();
        vendorEmailLB = new javax.swing.JLabel();
        lotTF = new javax.swing.JTextField();
        vendorPhoneLB = new javax.swing.JLabel();
        changePwButton1 = new javax.swing.JButton();
        vendorLotLB = new javax.swing.JLabel();
        vendorPWLB = new javax.swing.JLabel();
        UserProfileTitle1 = new javax.swing.JLabel();
        vendorUsernameTF = new javax.swing.JTextField();
        vendorFullNameTF = new javax.swing.JTextField();
        vendorEmailTF = new javax.swing.JTextField();
        shopNameTF = new javax.swing.JTextField();
        shopNameLB = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();

        residentUsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentUsernameLabel.setText("Username");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 204, 204));

        residentFullNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentFullNameLabel.setText("Full Name");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 204, 204));

        residentEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentEmailLabel.setText("Email");

        unitNoTF.setEditable(false);
        unitNoTF.setBackground(new java.awt.Color(204, 204, 204));
        unitNoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitNoTFActionPerformed(evt);
            }
        });

        residentPhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentPhoneLabel.setText("Phone");

        residentRoleLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentRoleLabel.setText("Role");

        changePwButton.setText("Change Pasword");
        changePwButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePwButtonActionPerformed(evt);
            }
        });

        residentUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentUnitLabel.setText("Unit No.");

        homepageBTN.setText("Homepage");
        homepageBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageBTNActionPerformed(evt);
            }
        });

        residentPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        residentPasswordLabel.setText("Password");

        UserProfileTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        UserProfileTitle.setText("User Profile");

        editButton.setText("Edit Profile");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        usernameTF.setEditable(false);
        usernameTF.setBackground(new java.awt.Color(204, 204, 204));

        fullNameTF.setEditable(false);
        fullNameTF.setBackground(new java.awt.Color(204, 204, 204));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vendorUsernameLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorUsernameLB.setText("Username");

        vendorNameLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorNameLB.setText("Full Name");

        vendorEmailLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorEmailLB.setText("Email");

        lotTF.setEditable(false);
        lotTF.setBackground(new java.awt.Color(204, 204, 204));
        lotTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lotTFActionPerformed(evt);
            }
        });

        vendorPhoneLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorPhoneLB.setText("Phone");

        changePwButton1.setText("Change Pasword");
        changePwButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePwButton1ActionPerformed(evt);
            }
        });

        vendorLotLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorLotLB.setText("Lot No.");

        vendorPWLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendorPWLB.setText("Password");

        UserProfileTitle1.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        UserProfileTitle1.setText("Vendor Profile");

        vendorUsernameTF.setBackground(new java.awt.Color(204, 204, 204));

        vendorFullNameTF.setEditable(false);
        vendorFullNameTF.setBackground(new java.awt.Color(204, 204, 204));

        shopNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopNameTFActionPerformed(evt);
            }
        });

        shopNameLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        shopNameLB.setText("Shop Name");

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
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shopNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shopNameTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorLotLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lotTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorPWLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changePwButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorPhoneLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vendorPhoneTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorEmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vendorEmailTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vendorNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vendorFullNameTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendorUsernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vendorUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UserProfileTitle1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addGap(199, 199, 199))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(UserProfileTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorUsernameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorFullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(shopNameLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendorPWLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePwButton1))
                .addGap(27, 27, 27)
                .addComponent(saveBtn)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitNoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitNoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitNoTFActionPerformed

    private void changePwButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePwButtonActionPerformed
        this.setVisible(false);
        new ResidentChangePassword().setVisible(true);
    }//GEN-LAST:event_changePwButtonActionPerformed

    private void homepageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageBTNActionPerformed
        this.setVisible(false);
        new ResidentTenantHomepage().setVisible(true);
    }//GEN-LAST:event_homepageBTNActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        this.setVisible(false);
        new ResidentEditProfile().setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void lotTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lotTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lotTFActionPerformed

    private void changePwButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePwButton1ActionPerformed
        this.setVisible(false);
        new VendorChangePassword().setVisible(true);
    }//GEN-LAST:event_changePwButton1ActionPerformed

    private void shopNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shopNameTFActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        this.setVisible(false);
        new VendorProfile().setVisible(true);
    }//GEN-LAST:event_saveBtnActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorEditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserProfileTitle;
    private javax.swing.JLabel UserProfileTitle1;
    private javax.swing.JButton changePwButton;
    private javax.swing.JButton changePwButton1;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField fullNameTF;
    private javax.swing.JButton homepageBTN;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lotTF;
    private javax.swing.JLabel residentEmailLabel;
    private javax.swing.JLabel residentFullNameLabel;
    private javax.swing.JLabel residentPasswordLabel;
    private javax.swing.JLabel residentPhoneLabel;
    private javax.swing.JLabel residentRoleLabel;
    private javax.swing.JLabel residentUnitLabel;
    private javax.swing.JLabel residentUsernameLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel shopNameLB;
    private javax.swing.JTextField shopNameTF;
    private javax.swing.JTextField unitNoTF;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JLabel vendorEmailLB;
    private javax.swing.JTextField vendorEmailTF;
    private javax.swing.JTextField vendorFullNameTF;
    private javax.swing.JLabel vendorLotLB;
    private javax.swing.JLabel vendorNameLB;
    private javax.swing.JLabel vendorPWLB;
    private javax.swing.JLabel vendorPhoneLB;
    private javax.swing.JTextField vendorPhoneTF;
    private javax.swing.JLabel vendorUsernameLB;
    private javax.swing.JTextField vendorUsernameTF;
    // End of variables declaration//GEN-END:variables
}
