/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Invoice;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AccIssueResInvoice extends javax.swing.JFrame {

    /**
     * Creates new form AccIssueResInvoice
     */
    public AccIssueResInvoice() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
//        Set spinner accept double
        SpinnerNumberModel interval = new SpinnerNumberModel(0.01, 0.01, 10000.00, 0.01);
        amountSpinner.setModel(interval);
        
//        By default choose today, then limit to select today and future only
        dueDateChooser.setDate(new Date());
        ZoneId def = ZoneId.systemDefault();
        LocalDate local = LocalDate.now();
        Date d = Date.from(local.atStartOfDay(def).toInstant());
        dueDateChooser.setMinSelectableDate(d);
        
//        Set option in the unit drop down combo box
        DefaultComboBoxModel unitOpt = (DefaultComboBoxModel)unitCombo.getModel();
        String filePath = "database\\residentTenant.txt";
        String filePath2 = "database\\vendor.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedReader br2 = new BufferedReader(new FileReader(filePath2));
            String line;
            String line2;
            br.readLine();
            br2.readLine();
            while ((line = br.readLine())!= null){
                String[] resInfo = line.split(",");
                String opt = resInfo[5] + " : " + resInfo[2];
                unitOpt.addElement(opt);
            }
            while ((line2 = br2.readLine())!= null){
                String[] venInfo = line2.split(",");
                String opt = venInfo[5] + " : " + venInfo[2];
                unitOpt.addElement(opt);
            }
            
        }catch(IOException e){
            System.out.println("Input Output Exception Occurred" + e);
        }catch(Exception e) {
            System.out.println("Exception " + e);
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

        monthCombo = new javax.swing.JComboBox<>();
        issueInvoiceTitle = new javax.swing.JLabel();
        homepageBTN = new javax.swing.JButton();
        unit = new javax.swing.JLabel();
        monthLB = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        due = new javax.swing.JLabel();
        unitCombo = new javax.swing.JComboBox<>();
        amountSpinner = new javax.swing.JSpinner();
        addItemBTN = new javax.swing.JButton();
        issueBTN = new javax.swing.JButton();
        descCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        dltBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        monthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        issueInvoiceTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        issueInvoiceTitle.setText("Invoice Issuance");

        homepageBTN.setText("Back");
        homepageBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageBTNActionPerformed(evt);
            }
        });

        unit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        unit.setText("Unit No.");

        monthLB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        monthLB.setText("Month");

        desc.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        desc.setText("Description");

        amount.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        amount.setText("Amount (RM)");

        due.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        due.setText("Due");

        unitCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitComboActionPerformed(evt);
            }
        });

        addItemBTN.setText("Add Item");
        addItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBTNActionPerformed(evt);
            }
        });

        issueBTN.setText("Issue");
        issueBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBTNActionPerformed(evt);
            }
        });

        descCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Water Bill", "Management Fee", "Sinking Fund", "Insurance", "Late Interest Payment", "Replacement Card", "Car Park Rental", "Shop Lot Rental", "Electricity Bill", "Clamping Charges", "Other" }));
        descCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descComboActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemTable);

        dltBTN.setText("Delete Item");
        dltBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(due)
                                    .addComponent(amount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(amountSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(dueDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthLB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(monthCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(unitCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 272, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homepageBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(issueInvoiceTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(dltBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addItemBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(issueBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homepageBTN)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(issueInvoiceTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthLB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemBTN)
                    .addComponent(issueBTN)
                    .addComponent(dltBTN))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homepageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageBTNActionPerformed
        this.setVisible(false);
        new AccountManageResident().setVisible(true);
    }//GEN-LAST:event_homepageBTNActionPerformed

    private void addItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBTNActionPerformed
//        Get the description and amount
        String item = (String)descCombo.getSelectedItem();
        Double amt = (Double)amountSpinner.getValue();
        String amtToString = Double.toString(amt);
        
//        put them in table
        DefaultTableModel model = (DefaultTableModel)itemTable.getModel();
        model.addRow(new Object[] {item, amt});
        descCombo.setSelectedIndex(0);
        amountSpinner.setValue(0.01);
    }//GEN-LAST:event_addItemBTNActionPerformed

    private void issueBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBTNActionPerformed
//        Get selected unit and resident name
        String getUnitOpt = (String)unitCombo.getSelectedItem();
        String unit = getUnitOpt.split(" : ")[0];
        String name = getUnitOpt.split(" : ")[1];
        
//        Get selected month, due, issue date
        String month = (String)monthCombo.getSelectedItem();
        Date d = dueDateChooser.getDate();
        String dueDate = DateFormat.getDateInstance().format(d);
        Date today = new Date();
        String issueDate = DateFormat.getDateInstance().format(today);
        
        String tempFile = "database\\tempInvFile.txt";
        try {
            PrintWriter pw = new PrintWriter(new File(tempFile));
//            Get item record in table
            DefaultTableModel model = (DefaultTableModel)itemTable.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    pw.print(model.getValueAt(i, j));
                    pw.print(",");
                }
                pw.println();
            }
            pw.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + ex);
        } catch (Exception ex) {
            System.out.println("Exception occur when getting issuance form data : " + ex);
        }
        
        Invoice inv = new Invoice(unit, name, issueDate, month, dueDate);
        if (inv.addInvoice()) {
            JOptionPane.showMessageDialog(this, 
                        "Invoice Successfully Issued!");
        } else {
            JOptionPane.showMessageDialog(this, 
                        "Errors occured, please try again.", "Error Message", 
                        JOptionPane.ERROR_MESSAGE);
        }

        this.setVisible(false);
        new AccountManageResident().setVisible(true);

    }//GEN-LAST:event_issueBTNActionPerformed

    private void unitComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitComboActionPerformed

    private void descComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descComboActionPerformed

    private void dltBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBTNActionPerformed
        int selectedRow = itemTable.getSelectedRow();
        if (selectedRow != -1){
            DefaultTableModel model = (DefaultTableModel)itemTable.getModel();
            model.removeRow(selectedRow);
        }
        
        
    }//GEN-LAST:event_dltBTNActionPerformed
    
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
            java.util.logging.Logger.getLogger(AccIssueResInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccIssueResInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccIssueResInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccIssueResInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccIssueResInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBTN;
    private javax.swing.JLabel amount;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JLabel desc;
    private javax.swing.JComboBox<String> descCombo;
    private javax.swing.JButton dltBTN;
    private javax.swing.JLabel due;
    private com.toedter.calendar.JDateChooser dueDateChooser;
    private javax.swing.JButton homepageBTN;
    private javax.swing.JButton issueBTN;
    private javax.swing.JLabel issueInvoiceTitle;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthCombo;
    private javax.swing.JLabel monthLB;
    private javax.swing.JLabel unit;
    private javax.swing.JComboBox<String> unitCombo;
    // End of variables declaration//GEN-END:variables
}
