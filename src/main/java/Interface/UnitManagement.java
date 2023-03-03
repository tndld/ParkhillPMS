/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Unit;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoong
 */
public class UnitManagement extends javax.swing.JFrame {
    public String fileLoc = "database\\unitDetails.txt";
    /**
     * Creates new form UnitManagement
     */
    public UnitManagement() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        try {
            File file = new File(fileLoc);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(":");
            DefaultTableModel model = (DefaultTableModel)unitTable.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(":");
                model.addRow(dataRow);
            }
        } catch (IOException ex) {
            Logger.getLogger(GymRoomManagement.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        unitTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editUnitBtn = new javax.swing.JButton();
        addUnitBtn1 = new javax.swing.JButton();
        deleteUnitBtn2 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        unitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(unitTable);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        jLabel1.setText("Unit Management");

        editUnitBtn.setText("Edit");
        editUnitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUnitBtnActionPerformed(evt);
            }
        });

        addUnitBtn1.setText("New");
        addUnitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUnitBtn1ActionPerformed(evt);
            }
        });

        deleteUnitBtn2.setText("Delete");
        deleteUnitBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUnitBtn2ActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addUnitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(editUnitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(deleteUnitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editUnitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteUnitBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUnitBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editUnitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUnitBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = unitTable.getSelectedRow();
        if (selectedRow != -1){
            DefaultTableModel model = (DefaultTableModel) unitTable.getModel();
            // Get the selected row data as an array of objects
            Object[] rowData = new Object[model.getColumnCount()];
            for (int i = 0; i < model.getColumnCount(); i++) {
                rowData[i] = model.getValueAt(selectedRow, i);
            }
            // Pass the row data to the EditUnitDetail JFrame
            EditUnitDetail editFrame = new EditUnitDetail(rowData);
            editFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,"Please select a row!");
            return;
        }
        this.setVisible(false);
    }//GEN-LAST:event_editUnitBtnActionPerformed

    private void addUnitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUnitBtn1ActionPerformed
        // TODO add your handling code here:
        new AddUnitDetail().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addUnitBtn1ActionPerformed

    private void deleteUnitBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUnitBtn2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = unitTable.getSelectedRow();
        if (selectedRow != -1){
            DefaultTableModel model = (DefaultTableModel) unitTable.getModel();
            String unitNumber = (String) model.getValueAt(selectedRow, 0); // assuming unitNumber is at index 0 of the table
            Unit unit = new Unit();
            if (unit.deleteUnit(unitNumber, fileLoc)){
                JOptionPane.showMessageDialog(this,  unitNumber + " Successfully Deleted");
            } else {
                JOptionPane.showMessageDialog(this, unitNumber +  " Does Not Exist, Delete Failed");
            }
            unit.refreshTable(unitTable, model, fileLoc);
        } else {
            JOptionPane.showMessageDialog(this,"Please select a row!");
        }
    }//GEN-LAST:event_deleteUnitBtn2ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new AdminFacilityManagement().setVisible(true);
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
            java.util.logging.Logger.getLogger(UnitManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUnitBtn1;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteUnitBtn2;
    private javax.swing.JButton editUnitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable unitTable;
    // End of variables declaration//GEN-END:variables
}