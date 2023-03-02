/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Invoice;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class InvoicePage extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public InvoicePage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        CusName.setBackground(new java.awt.Color(0,0,0,1));
        unit.setBackground(new java.awt.Color(0,0,0,1));
        invoiceTF.setBackground(new java.awt.Color(0,0,0,1));
        dateTF.setBackground(new java.awt.Color(0,0,0,1));
        note.setBackground(new java.awt.Color(0,0,0,1));
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e){
                dispose();
            }
        });
        
        printInvoice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        condoName = new javax.swing.JLabel();
        condoAddress = new javax.swing.JLabel();
        condoContact = new javax.swing.JLabel();
        CustomerPanel = new javax.swing.JPanel();
        CusName = new javax.swing.JTextField();
        unit = new javax.swing.JTextField();
        jalan = new javax.swing.JLabel();
        taman = new javax.swing.JLabel();
        postcode = new javax.swing.JLabel();
        area = new javax.swing.JLabel();
        jalan1 = new javax.swing.JLabel();
        InvoiceTitle = new javax.swing.JLabel();
        invoiceTF = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        currentCharges = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chargesTable = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        totalTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        title.setText("Invoice");

        condoName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        condoName.setText("Parkhill Residence");

        condoAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        condoAddress.setText("No. 27, Jalan 3/88, Technology Park, 57000 Kuala Lumpur, WP Kuala Lumpur.");

        condoContact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        condoContact.setText("Tel: 03-2257683    Email: mo.phmc2023@gmail.com");

        CustomerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CusName.setEditable(false);
        CusName.setBackground(new java.awt.Color(255, 255, 255));
        CusName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CusName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CusName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CusName.setFocusable(false);
        CusName.setOpaque(false);
        CusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameActionPerformed(evt);
            }
        });

        unit.setEditable(false);
        unit.setBackground(new java.awt.Color(255, 255, 255));
        unit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        unit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        unit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        unit.setFocusable(false);
        unit.setOpaque(false);
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });

        jalan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jalan.setText("No. 27, Jalan 3/88,");

        taman.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        taman.setText("Technology Park,");

        postcode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        postcode.setText("57000 Kuala Lumpur,");

        area.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        area.setText("WP Kuala Lumpur.");

        jalan1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jalan1.setText(", Parkhill Residence,");

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CusName)
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jalan)
                            .addComponent(postcode)
                            .addComponent(area)
                            .addComponent(taman)
                            .addGroup(CustomerPanelLayout.createSequentialGroup()
                                .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jalan1)))
                        .addGap(0, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CusName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jalan1))
                .addGap(2, 2, 2)
                .addComponent(jalan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(area)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        InvoiceTitle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        InvoiceTitle.setText("Invoice No.: ");

        invoiceTF.setBackground(new java.awt.Color(255, 255, 255));
        invoiceTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        invoiceTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        invoiceTF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        invoiceTF.setFocusable(false);
        invoiceTF.setOpaque(false);
        invoiceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceTFActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date.setText("Date: ");

        dateTF.setEditable(false);
        dateTF.setBackground(new java.awt.Color(255, 255, 255));
        dateTF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dateTF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dateTF.setFocusable(false);
        dateTF.setOpaque(false);
        dateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTFActionPerformed(evt);
            }
        });

        currentCharges.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        currentCharges.setForeground(new java.awt.Color(51, 51, 51));
        currentCharges.setText("Current Charges");

        chargesTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chargesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Description", "Due", "Amount (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        chargesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(chargesTable);

        total.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        total.setText("Total Current Charges (RM)");

        totalTF.setEditable(false);
        totalTF.setBackground(new java.awt.Color(255, 255, 255));
        totalTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalTF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        totalTF.setFocusable(false);
        totalTF.setOpaque(false);
        totalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTFActionPerformed(evt);
            }
        });

        note.setEditable(false);
        note.setColumns(20);
        note.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        note.setRows(5);
        note.setText("    Note:\n    1)   All payments should be made payable to \"Parkhill Residence Management Corporation\".\n    2)   Please indicate your NAME, UNIT No., and CONTACT NO. on your payment.\n    3)   Payment to be made to:\n              Bank: Hong Leong Bank Berhad\n              Account Name: Parkhill Residence Management Corporation\n              Account No.: 12345678900\n    4)   Please submit your payment receipt in the system for verification purpose. ");
        note.setBorder(null);
        note.setFocusable(false);
        note.setOpaque(false);
        jScrollPane2.setViewportView(note);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(InvoiceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateTF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(invoiceTF)))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currentCharges)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title)
                                .addGap(300, 300, 300))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(condoAddress)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(condoName)
                                .addGap(256, 256, 256))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(condoContact)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(condoName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(condoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(condoContact)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceTitle)
                            .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date)))
                    .addComponent(CustomerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(currentCharges)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusNameActionPerformed

    private void invoiceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceTFActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void dateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTFActionPerformed

    private void totalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTFActionPerformed

    private void printInvoice(){
        
        String tempFile = "database\\tempInvItem.txt";
        try {
            BufferedReader br2 = new BufferedReader(new FileReader(tempFile));
            String line = br2.readLine();
            String[] general = line.split(":");
            invoiceTF.setText(general[0]);
            CusName.setText(general[1]);
            unit.setText(general[2]);
            dateTF.setText(general[3]);
            
            DefaultTableModel invoice = (DefaultTableModel)chargesTable.getModel();
            Object[] record = br2.lines().toArray();
            for (int i = 0; i < record.length; i++){
                String line2 = record[i].toString().trim();
                String[] recInfo = line2.split(":");
                invoice.addRow(recInfo);
            }
            br2.close();
        } catch (IOException ex){
            System.out.println("Exception occur when getting invoice item: " + ex);
        }
        
        Invoice inv = new Invoice(invoiceTF.getText());
        String total = String.valueOf(inv.calTotal());
        totalTF.setText(total);
    }
            
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
            java.util.logging.Logger.getLogger(InvoicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoicePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CusName;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JLabel InvoiceTitle;
    private javax.swing.JLabel area;
    private javax.swing.JTable chargesTable;
    private javax.swing.JLabel condoAddress;
    private javax.swing.JLabel condoContact;
    private javax.swing.JLabel condoName;
    private javax.swing.JLabel currentCharges;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField invoiceTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jalan;
    private javax.swing.JLabel jalan1;
    private javax.swing.JTextArea note;
    private javax.swing.JLabel postcode;
    private javax.swing.JLabel taman;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totalTF;
    private javax.swing.JTextField unit;
    // End of variables declaration//GEN-END:variables
}
