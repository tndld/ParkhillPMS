/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.ManagerTeamStructureMgmt;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

/**
 *
 * @author Asus
 */
public class ManagerTeamStructurePage extends javax.swing.JFrame {

    /**
     * Creates new form TeamStructurePage
     */
    public ManagerTeamStructurePage() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        ManagerTeamStructureMgmt manage = new ManagerTeamStructureMgmt();
        
        // calculate anoumt of building manager";
        buildingManagerAmountTF.setText(manage.showManagerStructure(null));
        
        // calculate anoumt of account executive
        accExeAmountTF.setText(manage.showAccountStructure(null));
        
        // calculate anoumt of admin executive
        adminExeAmountTF.setText(manage.showAdminStructure(null));
        
        // calculate anoumt of building executive
        buildingExeAmountTF.setText(manage.showBuildingExeStructure(null));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receipt = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();
        buildingMngBtn = new javax.swing.JButton();
        accountExecutiveBtn = new javax.swing.JButton();
        adminExecutiveBtn = new javax.swing.JButton();
        buildingExecutiveBtn = new javax.swing.JButton();
        teamLabel = new javax.swing.JLabel();
        teamLabel1 = new javax.swing.JLabel();
        teamLabel2 = new javax.swing.JLabel();
        teamLabel3 = new javax.swing.JLabel();
        teamLabel4 = new javax.swing.JLabel();
        buildingManagerAmountTF = new javax.swing.JTextField();
        accExeAmountTF = new javax.swing.JTextField();
        adminExeAmountTF = new javax.swing.JTextField();
        buildingExeAmountTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receipt.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        receipt.setText("Team Management Page");

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        buildingMngBtn.setText("Building Manager");
        buildingMngBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingMngBtnActionPerformed(evt);
            }
        });

        accountExecutiveBtn.setText("Account Executive");
        accountExecutiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountExecutiveBtnActionPerformed(evt);
            }
        });

        adminExecutiveBtn.setText("Admin Executive");
        adminExecutiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminExecutiveBtnActionPerformed(evt);
            }
        });

        buildingExecutiveBtn.setText("Building Executive");
        buildingExecutiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingExecutiveBtnActionPerformed(evt);
            }
        });

        teamLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        teamLabel.setText("Team Structure:");

        teamLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        teamLabel1.setText("Building Manager:");

        teamLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        teamLabel2.setText("Account Executive:");

        teamLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        teamLabel3.setText("Admin Executive:");

        teamLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        teamLabel4.setText("Building Executive:");

        buildingManagerAmountTF.setEditable(false);
        buildingManagerAmountTF.setBackground(new java.awt.Color(204, 204, 204));
        buildingManagerAmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingManagerAmountTFActionPerformed(evt);
            }
        });

        accExeAmountTF.setEditable(false);
        accExeAmountTF.setBackground(new java.awt.Color(204, 204, 204));

        adminExeAmountTF.setEditable(false);
        adminExeAmountTF.setBackground(new java.awt.Color(204, 204, 204));

        buildingExeAmountTF.setEditable(false);
        buildingExeAmountTF.setBackground(new java.awt.Color(204, 204, 204));
        buildingExeAmountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingExeAmountTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(buildingManagerAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(teamLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminExeAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accExeAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(teamLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(buildingExeAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminExecutiveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buildingMngBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountExecutiveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buildingExecutiveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(receipt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBTN)
                .addGap(10, 10, 10)
                .addComponent(receipt)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buildingMngBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(adminExecutiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buildingExecutiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teamLabel4)
                                    .addComponent(buildingExeAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(accountExecutiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamLabel)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamLabel1)
                            .addComponent(buildingManagerAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamLabel2)
                            .addComponent(accExeAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teamLabel3)
                            .addComponent(adminExeAmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        this.setVisible(false);
        new BuildingManagerHomepage().setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void accountExecutiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountExecutiveBtnActionPerformed
        // TODO add your handling code here:
         new ManageAccountExeStructure().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_accountExecutiveBtnActionPerformed

    private void buildingExeAmountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingExeAmountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingExeAmountTFActionPerformed

    private void buildingManagerAmountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingManagerAmountTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buildingManagerAmountTFActionPerformed

    private void buildingMngBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingMngBtnActionPerformed
        // TODO add your handling code here:
        new ManageBuildingManagerStructure().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buildingMngBtnActionPerformed

    private void adminExecutiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminExecutiveBtnActionPerformed
        // TODO add your handling code here:
         new ManageAdminExeStructure().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_adminExecutiveBtnActionPerformed

    private void buildingExecutiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingExecutiveBtnActionPerformed
        // TODO add your handling code here:
         new ManageBuildingExeStructure().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_buildingExecutiveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerTeamStructurePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerTeamStructurePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerTeamStructurePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerTeamStructurePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerTeamStructurePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accExeAmountTF;
    private javax.swing.JButton accountExecutiveBtn;
    private javax.swing.JTextField adminExeAmountTF;
    private javax.swing.JButton adminExecutiveBtn;
    private javax.swing.JButton backBTN;
    private javax.swing.JTextField buildingExeAmountTF;
    private javax.swing.JButton buildingExecutiveBtn;
    private javax.swing.JTextField buildingManagerAmountTF;
    private javax.swing.JButton buildingMngBtn;
    private javax.swing.JLabel receipt;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JLabel teamLabel1;
    private javax.swing.JLabel teamLabel2;
    private javax.swing.JLabel teamLabel3;
    private javax.swing.JLabel teamLabel4;
    // End of variables declaration//GEN-END:variables
}
