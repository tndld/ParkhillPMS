/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.AdminExecutive;
import User.ManagerTeamStructureMgmt;
import User.Vendor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class ManageAdminExeStructure extends javax.swing.JFrame {

    /**
     * Creates new form ManageAccountExeStructure
     */
    public ManageAdminExeStructure() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        File file = new File("database\\adminExecutive.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine(); //read one line at a time
            DefaultTableModel model = (DefaultTableModel) structureTable.getModel();
            Object [] dataRows = br.lines().toArray();
            for (Object dataRow1 : dataRows) {
                String rec = dataRow1.toString();
                String [] dataRow = rec.split(",");
                ArrayList<String> newDataRow = new ArrayList<>();
                for (int j = 0; j < dataRow.length; j++) {
                    if (j != 1) { // skip the element with index 1, which is the password
                        newDataRow.add(dataRow[j]);
                    }
                }
                String[] newArray = newDataRow.toArray(String[]::new);
                model.addRow(newArray);
            }
        } catch (IOException ex) {
            Logger.getLogger(ManagerResidentTenantMgmt.class.getName()).log(Level.SEVERE, null, ex);
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

        homepageLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        structureTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        addNewAccExeBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homepageLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        homepageLabel.setText("Admin Executive Struture Page");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        structureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "EmpID", "Name", "IC", "Email", "Phone", "Address", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        structureTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(structureTable);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        addNewAccExeBtn.setText("Add");
        addNewAccExeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAccExeBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(294, 294, 294)
                            .addComponent(SearchBtn)
                            .addGap(18, 18, 18)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addNewAccExeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(homepageLabel))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homepageLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(addNewAccExeBtn)
                    .addComponent(SearchBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new ManagerTeamStructurePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        ManagerTeamStructureMgmt manager = new ManagerTeamStructureMgmt();
        
        // Get the selected row index
        int row = structureTable.getSelectedRow();
        
        //Check if a row is selected
        if (row < 0){
            JOptionPane.showMessageDialog(this, "Please select an admin to update.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Get the current resident info from the selected row
        String username = structureTable.getValueAt(row, 0).toString();
        String empID = structureTable.getValueAt(row, 1).toString();
        String name = structureTable.getValueAt(row, 2).toString();
        String ic = structureTable.getValueAt(row, 3).toString();
        String email = structureTable.getValueAt(row, 4).toString();
        String phoneNum = structureTable.getValueAt(row, 5).toString();
        String address = structureTable.getValueAt(row, 6).toString();
        String position = structureTable.getValueAt(row, 7).toString();

        File filePath = new File("database\\adminExecutive.txt");

        try {          
            String currentLine;

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while((currentLine = reader.readLine()) != null) {
                String[] adminInfo = currentLine.split(",");

                if(adminInfo[0].equals(username)){

                    // use the existing password
                    String pass = adminInfo[1];
                    AdminExecutive admin = new AdminExecutive(username,pass);
//                    admin.setFullName(fullName);
//                    admin.setEmail(email);
//                    admin.setPhone(phoneNo);
//                    admin.setLotNo(lotNum);
//                    admin = admin.getPassword();

                    if(manager.updateAdminTeam(username, adminInfo[0], empID, name, ic, email, phoneNum, address,position)){
                        JOptionPane.showMessageDialog(this, "Admin updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(this, "Failed to update admin information.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            reader.close();
            
        }catch (IOException e) {
                 System.out.println("Exception Occurred" + e);
            }        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addNewAccExeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewAccExeBtnActionPerformed
        // TODO add your handling code here:
        new ManagerAddNewEmp().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addNewAccExeBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        // Get the selected row index
        DefaultTableModel model = (DefaultTableModel) structureTable.getModel();
        int row = structureTable.getSelectedRow();

        //Check if a row is selected
        if (row < 0){
            JOptionPane.showMessageDialog(this, "Please select an admin to delete.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else {
            // Get the current resident info from the selected row
            String username = structureTable.getValueAt(row, 0).toString();
            //            String fullName = residentTenantTable.getValueAt(row, 1).toString();
            //            String email = residentTenantTable.getValueAt(row, 2).toString();
            //            String phoneNo = residentTenantTable.getValueAt(row, 3).toString();
            //            String unitNo = residentTenantTable.getValueAt(row, 4).toString();

            ManagerTeamStructureMgmt manage = new ManagerTeamStructureMgmt();
            if (manage.deleteAdminExe(username)){
                JOptionPane.showMessageDialog(this, "Admin deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                // remove the selected row in table
                model.removeRow(row);

            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete selected admin.\nPlease try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        new SearchTeam().setVisible(true);
    }//GEN-LAST:event_SearchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageAdminExeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdminExeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdminExeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdminExeStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdminExeStructure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton addNewAccExeBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable structureTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
