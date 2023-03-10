/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.AdminExecutive;
import User.AssignedTask;
import User.Facility;
import User.FacilityBooking;
import User.Resident;
import User.Vendor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AdminFacilityBookingManagement extends javax.swing.JFrame {
    String fileGym = "database\\gymBooking.txt";
    String fileFunction = "database\\functionBooking.txt";
    int id = 1;

    /**
     * Creates new form AdminFacilityBookingManagement
     */
    public AdminFacilityBookingManagement() {
        initComponents();
        // make the page to the middle
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        String activeUserFile = "database\\activeUser.txt";
        String userFile = "database\\residentTenant.txt";
        try {
            BufferedReader ar = new BufferedReader(new FileReader(activeUserFile));
            String lineA = ar.readLine();
            String[] activeUsers = lineA.split(",");
            String uname = activeUsers[0];
            String pw = activeUsers[1];
            Resident res = new Resident(uname, pw);
            AdminExecutive admin = new AdminExecutive(uname, pw);
            
            if ((res.getFullName() != null )) {
//                new ResidentFacilityBookingManagement().setVisible(true);
                try{
                    BufferedReader br = new BufferedReader(new FileReader(fileGym));
                    String firstLine = br.readLine().trim();
                    String[] columnsName = firstLine.split(";");
                    DefaultTableModel model = (DefaultTableModel)gymTable.getModel();
                    model.setColumnIdentifiers(columnsName);
                    Object[] tableLines = br.lines().toArray();

                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(";");
                        if (dataRow[1].toLowerCase().equals(res.getFullName().toLowerCase())) {
                            model.addRow(dataRow);
                        }
                    }

                    BufferedReader br2 = new BufferedReader(new FileReader(fileFunction));
                    String firstLine2 = br2.readLine().trim();
                    String[] columnName = firstLine2.split(";");
                    DefaultTableModel model2 = (DefaultTableModel)fhallTable.getModel();
                    model2.setColumnIdentifiers(columnName);
                    Object[] tableLine = br2.lines().toArray();

                    for (int i = 0; i < tableLine.length; i++) {
                        String line1 = tableLine[i].toString().trim();
                        String[] data = line1.split(";");
                        if (data[1].toLowerCase().equals(res.getFullName().toLowerCase())) {
                            model2.addRow(data);
                        }
                    }
                }catch(IOException e){
                    System.out.println("Exception Occurred" + e);
                }
            } else if ((admin.getUsername() != null )) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(fileGym));
                    String firstLine = br.readLine().trim();
                    String[] columnsName = firstLine.split(";");
                    DefaultTableModel model = (DefaultTableModel)gymTable.getModel();
                    model.setColumnIdentifiers(columnsName);
                    Object[] tableLines = br.lines().toArray();

                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(";");
                        model.addRow(dataRow);
                    }

                    BufferedReader br2 = new BufferedReader(new FileReader(fileFunction));
                    String firstLine2 = br2.readLine().trim();
                    String[] columnName = firstLine2.split(";");
                    DefaultTableModel model2 = (DefaultTableModel)fhallTable.getModel();
                    model2.setColumnIdentifiers(columnName);
                    Object[] tableLine = br2.lines().toArray();

                    for (int i = 0; i < tableLine.length; i++) {
                        String line1 = tableLine[i].toString().trim();
                        String[] data = line1.split(";");
                        model2.addRow(data);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(GymRoomManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
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

        adminFaciBookingLB = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fhallTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gymTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminFaciBookingLB.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        adminFaciBookingLB.setText("Facility Booking Management");

        tabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));

        fhallTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fhallTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(fhallTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Function Hall  Slot", jPanel2);

        gymTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gymTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Gym Room Slot", jPanel1);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
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
                .addGap(85, 85, 85)
                .addComponent(tabbedPane)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminFaciBookingLB, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(adminFaciBookingLB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
            if (tabbedPane.getSelectedIndex() == 0) {
//                String typeOfFacility = "function";
                int selectedFunctionRow = fhallTable.getSelectedRow();
                if (selectedFunctionRow != -1){
                    DefaultTableModel model = (DefaultTableModel) fhallTable.getModel();
                    // Get the selected row data as an array of objects
                    Object[] rowData = new Object[model.getColumnCount()];
                    for (int i = 0; i < model.getColumnCount(); i++) {
                        rowData[i] = model.getValueAt(selectedFunctionRow, i);
                    }
                String typeOfFac = "Function";
                new EditBookingForm(rowData, typeOfFac).setVisible(true);
                this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this,"Please select a row!");
                } 
            } else 
                
            if (tabbedPane.getSelectedIndex() == 1) {
//                String typeOfFacility = "gym";&
                int selectedGymRow = gymTable.getSelectedRow();
                if (selectedGymRow != -1){
                    DefaultTableModel model = (DefaultTableModel) gymTable.getModel();
                    // Get the selected row data as an array of objects
                    Object[] gymData = new Object[model.getColumnCount()];
                    for (int i = 0; i < model.getColumnCount(); i++) {
                        gymData[i] = model.getValueAt(selectedGymRow, i);
                    }
                // Pass the row data to the EditUnitDetail JFrame
                String typeOfFac = "Gym";
                new EditBookingForm(gymData, typeOfFac).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this,"Please select a row!");
            }
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
            if (tabbedPane.getSelectedIndex() == 0) {
                String typeOfFac = "function";
                int selectedFunctionRow = fhallTable.getSelectedRow();
                if (selectedFunctionRow != -1){
                    DefaultTableModel model = (DefaultTableModel) fhallTable.getModel();
                    // Get the selected row data as an array of objects
                    Object[] rowData = new Object[model.getColumnCount()];
                    for (int i = 0; i < model.getColumnCount(); i++) {
                        rowData[i] = model.getValueAt(selectedFunctionRow, i);
                    }
                    id = Integer.parseInt(rowData[0].toString());
                    FacilityBooking book = new FacilityBooking();
                    String fileLoc = "database\\" + typeOfFac +"Booking.txt";
                    if (book.deleteBooking(id, fileLoc)){
                        JOptionPane.showMessageDialog(this, "Booking Successfully Deleted");
                    } else {
                        JOptionPane.showMessageDialog(this,"Booking does Not Exist, Delete Failed");
                    }
                } else {
                    JOptionPane.showMessageDialog(this,"Please select a row!");
                } 
            } else 
            if (tabbedPane.getSelectedIndex() == 1) {
                String typeOfFac = "gym";
                int selectedGymRow = gymTable.getSelectedRow();
                if (selectedGymRow != -1){
                    DefaultTableModel model = (DefaultTableModel) gymTable.getModel();
                    // Get the selected row data as an array of objects
                    Object[] gymData = new Object[model.getColumnCount()];
                    for (int i = 0; i < model.getColumnCount(); i++) {
                        gymData[i] = model.getValueAt(selectedGymRow, i);
                    }
                id = Integer.parseInt(gymData[0].toString());
                FacilityBooking book = new FacilityBooking();
                String fileLoc = "database\\" + typeOfFac +"Booking.txt";
                if (book.deleteBooking(id, fileLoc)){
                    JOptionPane.showMessageDialog(this,  "Booking Successfully Deleted");
                } else {
                    JOptionPane.showMessageDialog(this, "Booking Does Not Exist, Delete Failed");
                }
            } else {
                JOptionPane.showMessageDialog(this,"Please select a row!");
            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        if (tabbedPane.getSelectedIndex() == 0) {
            String typeOfFacility = "function";
            new AddFacilityBookingForm(typeOfFacility).setVisible(true);
            this.setVisible(false);
        } else if (tabbedPane.getSelectedIndex() == 1) {
            String typeOfFacility = "gym";
            new AddFacilityBookingForm(typeOfFacility).setVisible(true);
            this.setVisible(false);
        } 
        
//        new AddFacilityBookingForm(typeofFacility).setVisible(true);
//        this.setVisible(false);
        
        
    }//GEN-LAST:event_newBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        String activeUserFile = "database\\activeUser.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(activeUserFile));            
            String line = br.readLine();
            String[] activeUserB = line.split(",");
            String uname = activeUserB[0];
            String pw = activeUserB[1];
            Resident res = new Resident(uname, pw);
            AdminExecutive admin = new AdminExecutive(uname, pw);
            if ((res.getFullName() != null )) {
        //                new ResidentFacilityBookingManagement().setVisible(true);
                new ResidentHomepage().setVisible(true);
                this.setVisible(false);
            } else if ((admin.getUsername() != null )) {
                new AdminHomepage().setVisible(true);
                this.setVisible(false);
            }
        } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminFacilityBookingManagement.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(AdminFacilityBookingManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(AdminFacilityBookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFacilityBookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFacilityBookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFacilityBookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFacilityBookingManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminFaciBookingLB;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTable fhallTable;
    private javax.swing.JTable gymTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newBtn;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
