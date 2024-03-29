/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

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

        ApplyVPassBTN = new javax.swing.JButton();
        viewVPassBTN = new javax.swing.JButton();
        residentUsernameLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        account = new javax.swing.JLabel();
        resAccTitle = new javax.swing.JLabel();
        setting = new javax.swing.JComboBox<>();
        billBTN = new javax.swing.JButton();
        paymentBTN = new javax.swing.JButton();
        receiptBTN = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        booking = new javax.swing.JLabel();
        viewBookingBTN = new javax.swing.JButton();
        complaint = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        viewComplaintBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ApplyVPassBTN.setText("Apply New Pass");
        ApplyVPassBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyVPassBTNActionPerformed(evt);
            }
        });

        viewVPassBTN.setText("View My Pass");
        viewVPassBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVPassBTNActionPerformed(evt);
            }
        });

        residentUsernameLabel.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        residentUsernameLabel.setText("My Visitor Pass");

        account.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        account.setText("Account");

        resAccTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        resAccTitle.setText("Resident Homepage");

        setting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setting", "User Profile", "Log Out" }));
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });

        billBTN.setText("Bill");
        billBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billBTNActionPerformed(evt);
            }
        });

        paymentBTN.setText("My Payment");
        paymentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBTNActionPerformed(evt);
            }
        });

        receiptBTN.setText("My Receipt");
        receiptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptBTNActionPerformed(evt);
            }
        });

        booking.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        booking.setText("Facility Booking");

        viewBookingBTN.setText("View and Add Booking");
        viewBookingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingBTNActionPerformed(evt);
            }
        });

        complaint.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        complaint.setText("Complaint");

        viewComplaintBTN.setText("View and Add Complain");
        viewComplaintBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComplaintBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(residentUsernameLabel)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewVPassBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ApplyVPassBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resAccTitle)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(booking)
                        .addGap(183, 183, 183))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(billBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(paymentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(receiptBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(account))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(viewBookingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(viewComplaintBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(complaint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(resAccTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiptBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(residentUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewVPassBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApplyVPassBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewBookingBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complaint, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewComplaintBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApplyVPassBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyVPassBTNActionPerformed
        applyVisitorType();
    }//GEN-LAST:event_ApplyVPassBTNActionPerformed

    private void viewVPassBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVPassBTNActionPerformed
        this.setVisible(false);
        new ResidentViewEditVPass().setVisible(true);
    }//GEN-LAST:event_viewVPassBTNActionPerformed

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        int selected = setting.getSelectedIndex();
        if (selected == 1){
            this.setVisible(false);
            new ResidentUserProfile().setVisible(true);
        }else if (selected == 2){
            logout();
        }
    }//GEN-LAST:event_settingActionPerformed

    private void viewBookingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingBTNActionPerformed
        // TODO add your handling code here:
        new AdminFacilityBookingManagement().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewBookingBTNActionPerformed

    private void paymentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBTNActionPerformed
        new ResidentViewPayment().setVisible(true);
    }//GEN-LAST:event_paymentBTNActionPerformed

    private void billBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billBTNActionPerformed
        new ResidentViewInvoice().setVisible(true);
    }//GEN-LAST:event_billBTNActionPerformed

    private void receiptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptBTNActionPerformed
        new ResidentViewReceipt().setVisible(true);
    }//GEN-LAST:event_receiptBTNActionPerformed

    private void viewComplaintBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComplaintBTNActionPerformed
        // TODO add your handling code here:
        new UserComplainList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewComplaintBTNActionPerformed

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
            user.logout2("database\\activeUser", "database\\userType.txt");
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
    private javax.swing.JLabel account;
    private javax.swing.JButton billBTN;
    private javax.swing.JLabel booking;
    private javax.swing.JLabel complaint;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton paymentBTN;
    private javax.swing.JButton receiptBTN;
    private javax.swing.JLabel resAccTitle;
    private javax.swing.JLabel residentUsernameLabel;
    private javax.swing.JComboBox<String> setting;
    private javax.swing.JButton viewBookingBTN;
    private javax.swing.JButton viewComplaintBTN;
    private javax.swing.JButton viewVPassBTN;
    // End of variables declaration//GEN-END:variables
}
