/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.AdminExecutive;
import User.BuildingManager;
import User.Resident;
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
public class ManagerResidentTenantMgmt extends javax.swing.JFrame {

    /**
     * Creates new form ResidentTenantMgmt
     */
    public ManagerResidentTenantMgmt() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        File file = new File("database\\residentTenant.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine(); //read one line at a time
            DefaultTableModel model = (DefaultTableModel) residentTenantTable.getModel();
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

        residentTenantTitle = new javax.swing.JLabel();
        mgmtPageTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        residentTenantTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        residentTenantTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        residentTenantTitle.setText("Resident/ Tenant");

        mgmtPageTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        mgmtPageTitle.setText("Management Page");

        residentTenantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Email", "Phone", "Unit No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        residentTenantTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(residentTenantTable);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mgmtPageTitle)
                            .addComponent(residentTenantTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(4, 4, 4)
                .addComponent(residentTenantTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mgmtPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(SearchBtn)
                    .addComponent(deleteBtn))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        BuildingManager manager = new BuildingManager(null, null);

        // Get the selected row index
        int row = residentTenantTable.getSelectedRow();
        
        //Check if a row is selected
        if (row < 0){
            JOptionPane.showMessageDialog(this, "Please select a resident to update.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Get the current resident info from the selected row
        String username = residentTenantTable.getValueAt(row, 0).toString();
        String fullName = residentTenantTable.getValueAt(row, 1).toString();
        String email = residentTenantTable.getValueAt(row, 2).toString();
        String phoneNo = residentTenantTable.getValueAt(row, 3).toString();
        String unitNo = residentTenantTable.getValueAt(row, 4).toString();

        File filePath = new File("database\\residentTenant.txt");

        try {          
            String currentLine;

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while((currentLine = reader.readLine()) != null) {
                String[] residentInfo = currentLine.split(",");

                if(residentInfo[0].equals(username)){

                    // use the existing password
                    String pass = residentInfo[1];
                    Resident res = new Resident(username, pass);
                    res.setFullName(fullName);
                    res.setEmail(email);
                    res.setPhoneNo(phoneNo);
                    res.setUnitNo(unitNo);
                    pass = res.getPassword();

                    manager.updateResident(username, pass, fullName, email, phoneNo, unitNo);
                    if(manager.updateResident(username, pass, fullName, email, phoneNo, unitNo)){
                        JOptionPane.showMessageDialog(this, "Resident updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(this, "Failed to update resident information.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            reader.close();
            
        }catch (IOException e) {
                 System.out.println("Exception Occurred" + e);
            }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        new ManagerAddNewResidentTenant().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new ManagerUserMgmt().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        new ManagerSearchResident().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        // Get the selected row index
        DefaultTableModel model = (DefaultTableModel) residentTenantTable.getModel();
        int row = residentTenantTable.getSelectedRow();
        
        //Check if a row is selected
        if (row < 0){
            JOptionPane.showMessageDialog(this, "Please select a resident to delete.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            // Get the current resident info from the selected row
            String username = residentTenantTable.getValueAt(row, 0).toString();
//            String fullName = residentTenantTable.getValueAt(row, 1).toString();
//            String email = residentTenantTable.getValueAt(row, 2).toString();
//            String phoneNo = residentTenantTable.getValueAt(row, 3).toString();
//            String unitNo = residentTenantTable.getValueAt(row, 4).toString();
            
            BuildingManager manager = new BuildingManager(null,null);
            if (manager.deleteResident(username)){
                JOptionPane.showMessageDialog(this, "Resident deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                // remove the selected row in table
                model.removeRow(row);
                
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete selected resident.\nPlease try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerResidentTenantMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerResidentTenantMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerResidentTenantMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerResidentTenantMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagerResidentTenantMgmt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mgmtPageTitle;
    private javax.swing.JTable residentTenantTable;
    private javax.swing.JLabel residentTenantTitle;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}