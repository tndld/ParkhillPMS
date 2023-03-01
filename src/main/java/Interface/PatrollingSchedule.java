/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class PatrollingSchedule extends javax.swing.JFrame {

    /**
     * Creates new form PatrollingSchedule
     */
    public PatrollingSchedule() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
//        File file = new File("database\\patrollingSchedule.txt");
        String file = "database\\patrollingSchedule.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine(); //read one line at a time
            String [] colHeadings = line.trim().split(";");
            
            DefaultTableModel model = (DefaultTableModel) patrollingScheduleTable.getModel();
            model.setColumnIdentifiers(colHeadings);
            
            // read all the lines and convert into array
            Object [] dataRows = br.lines().toArray();
            for (int i=0; i<dataRows.length; i++){
                String rec = dataRows[i].toString();
                String [] dataRow = rec.split(";");
                model.addRow(dataRow);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(PatrollingSchedule.class.getName()).log(Level.SEVERE, null, ex);
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

        patrollingScheduleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patrollingScheduleTable = new javax.swing.JTable();
        setUpBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        modifyBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patrollingScheduleLabel.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        patrollingScheduleLabel.setText("Patrolling Schedule ");

        patrollingScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Checkpoint", "Type", "Start Time", "End Time", "Status"
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
        patrollingScheduleTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(patrollingScheduleTable);

        setUpBtn.setText("Set Up");
        setUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setUpBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(patrollingScheduleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(13, 13, 13)
                .addComponent(patrollingScheduleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyBtn)
                    .addComponent(setUpBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        // Get the selected row index
        DefaultTableModel model = (DefaultTableModel) patrollingScheduleTable.getModel();
        int row = patrollingScheduleTable.getSelectedRow();

        //Check if a row is selected
        if (row < 0){
            JOptionPane.showMessageDialog(this, "Please select a resident to delete.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else {
            // Get the current resident info from the selected row
            String checkpoint = patrollingScheduleTable.getValueAt(row, 0).toString();
            //            String fullName = residentTenantTable.getValueAt(row, 1).toString();
            //            String email = residentTenantTable.getValueAt(row, 2).toString();
            //            String phoneNo = residentTenantTable.getValueAt(row, 3).toString();
            //            String unitNo = residentTenantTable.getValueAt(row, 4).toString();


            User.PatrollingSchedule ps = new User.PatrollingSchedule(checkpoint);
            if (ps.deleteSchedule(checkpoint)){
                JOptionPane.showMessageDialog(this, "Schedule deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                // remove the selected row in table
                model.removeRow(row);

            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete selected schedule.\nPlease try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed

        
        // Get the selected row index
        int row = patrollingScheduleTable.getSelectedRow();

        //Check if a row is selected
        if (row < 0){
            JOptionPane.showMessageDialog(this, "Please select a schedule to update.", "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the current resident info from the selected row
        String checkpoint = patrollingScheduleTable.getValueAt(row, 0).toString();
        String type = patrollingScheduleTable.getValueAt(row, 1).toString();
        String timeStart = patrollingScheduleTable.getValueAt(row, 2).toString();
        String timeEnd = patrollingScheduleTable.getValueAt(row, 3).toString();
        String status = patrollingScheduleTable.getValueAt(row, 4).toString();
        
        User.PatrollingSchedule ps = new User.PatrollingSchedule(checkpoint);


        File filePath = new File("database\\patrollingSchedule.txt");

        try {
            String currentLine;

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            while((currentLine = reader.readLine()) != null) {
                String[] residentInfo = currentLine.split(";");

                if(residentInfo[0].equals(checkpoint)){

                    ps.setCheckpoint(checkpoint);
                    ps.setType(type);
                    ps.setTimeStart(timeStart);
                    ps.setTimeEnd(timeEnd);
                    ps.setStatus(status);

                    if(ps.updateSchedule(checkpoint, type, timeStart, timeEnd, status)){
                        JOptionPane.showMessageDialog(this, "Schedule updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(this, "Failed to update schedule information.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            reader.close();

        }catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }

    }//GEN-LAST:event_modifyBtnActionPerformed

    private void setUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setUpBtnActionPerformed
        // TODO add your handling code here:
        new AddPatrollingSchedule().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_setUpBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new BuildingExeHomepage().setVisible(true);
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
            java.util.logging.Logger.getLogger(PatrollingSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatrollingSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatrollingSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatrollingSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatrollingSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel patrollingScheduleLabel;
    private javax.swing.JTable patrollingScheduleTable;
    private javax.swing.JButton setUpBtn;
    // End of variables declaration//GEN-END:variables
}