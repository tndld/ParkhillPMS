/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Resident;
import User.Vendor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ResidentViewInvoice extends getActiveUser {

    /**
     * Creates new form ResidentViewInvoice
     */
    public ResidentViewInvoice() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
//        setDefaultCloseOperation(ResidentViewInvoice.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e){
                dispose();
            }
        });

        setInvoiceTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bill = new javax.swing.JLabel();
        billtabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        invoice = new javax.swing.JLabel();
        due = new javax.swing.JLabel();
        issueDate = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        amount1 = new javax.swing.JLabel();
        amountTF1 = new javax.swing.JTextField();
        descTF1 = new javax.swing.JTextField();
        issueDateTF = new javax.swing.JTextField();
        dueTF = new javax.swing.JTextField();
        invoiceTF = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        statusTF = new javax.swing.JTextField();
        getInvoiceBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pendingTable = new javax.swing.JTable();
        invoice1 = new javax.swing.JLabel();
        due1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        amount2 = new javax.swing.JLabel();
        amountTF2 = new javax.swing.JTextField();
        descTF2 = new javax.swing.JTextField();
        issueDateTF1 = new javax.swing.JTextField();
        invoiceTF1 = new javax.swing.JTextField();
        paymentBTN = new javax.swing.JButton();
        issueDate1 = new javax.swing.JLabel();
        dueTF1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bill.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        bill.setText("My Bill");

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Issuance Date", "Description", "Amount (RM)", "Due", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invoiceTable.getTableHeader().setReorderingAllowed(false);
        invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(invoiceTable);

        invoice.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        invoice.setText("Invoice No.");

        due.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        due.setText("Due");

        issueDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        issueDate.setText("Date of Issuance");

        desc1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        desc1.setText("Description");

        amount1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        amount1.setText("Amount (RM)");

        amountTF1.setEditable(false);

        descTF1.setEditable(false);

        issueDateTF.setEditable(false);

        dueTF.setEditable(false);

        invoiceTF.setEditable(false);

        status.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        status.setText("Status");

        statusTF.setEditable(false);

        getInvoiceBTN.setText("Get Invoice");
        getInvoiceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInvoiceBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issueDate)
                            .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc1)
                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dueTF)
                                .addGap(18, 18, 18)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(statusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issueDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(getInvoiceBTN)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getInvoiceBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        billtabbedPane.addTab("My Bill", jPanel1);

        pendingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Issuance Date", "Description", "Amount (RM)", "Due"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pendingTable.getTableHeader().setReorderingAllowed(false);
        pendingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pendingTable);

        invoice1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        invoice1.setText("Invoice No.");

        due1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        due1.setText("Due");

        desc2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        desc2.setText("Description");

        amount2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        amount2.setText("Amount (RM)");

        amountTF2.setEditable(false);

        descTF2.setEditable(false);

        issueDateTF1.setEditable(false);

        invoiceTF1.setEditable(false);

        paymentBTN.setText("Add Payment");
        paymentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBTNActionPerformed(evt);
            }
        });

        issueDate1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        issueDate1.setText("Date of Issuance");

        dueTF1.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(due1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc2)
                                    .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(issueDate1)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invoiceTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(descTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(amountTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(issueDateTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(dueTF1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(paymentBTN)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoice1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueDateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(due1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dueTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentBTN))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        billtabbedPane.addTab("Oustanding Fee", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(billtabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(bill)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billtabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getInvoiceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInvoiceBTNActionPerformed
        
        if (!(invoiceTF.getText()).equals("")){
            int count = 0;
            String currentUser = "";
            String unit = "";

            String filePath = "database\\invoice.txt";
            String tempFile = "database\\tempInvItem.txt";
            String typeFile = "database\\userType.txt";
            try {
                BufferedReader bt = new BufferedReader(new FileReader(typeFile));
                String type = bt.readLine();
                if (type.equals("resident")){
                    Resident res = new Resident(getActiveUser()[0], getActiveUser()[1]);
                    currentUser = res.getFullName();
                    unit = res.getUnitNo();
                } else if (type.equals("vendor")){
                    Vendor ven = new Vendor(getActiveUser()[0], getActiveUser()[1]);
                    currentUser = ven.getFullName();
                    unit = ven.getLotNo();
                }
                bt.close();
            
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

                bw.write(invoiceTF.getText() + ":" + currentUser + ":" + unit 
                        + ":" + issueDateTF.getText() + "\n");
                String line;
                while ((line = br.readLine()) != null) {
                    String[] invInfo = line.split(":");

                    if (invInfo[0].equals(invoiceTF.getText())){
                        count += 1;
                        bw.write(count + ":" + invInfo[4] + ":" + invInfo[6] + ":" 
                                + invInfo[5] + "\n");
                    }
                }
                br.close();
                bw.close();

            } catch (IOException ex){
                System.out.println("Exception occur when getting invoice item: " + ex);
            } 

            new InvoicePage().setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Please select an invoice item from the table to view.", "Error Message", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_getInvoiceBTNActionPerformed

    private void paymentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBTNActionPerformed
        
        if (!(invoiceTF1.getText()).equals("")){
            String desc = descTF2.getText();

            String tempFile = "database\\tempPaymentInfo.txt";
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
                bw.write(invoiceTF1.getText() + ":" + desc + ":");
                bw.close();
            } catch (IOException ex) {
                System.out.println("Exception occur when payment button clicked: " + ex);
            }

            this.setVisible(false);
            new ResidentMakePayment().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, 
                    "Please select an invoice item from the table to update payment.", "Error Message", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_paymentBTNActionPerformed

    private void invoiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)invoiceTable.getModel();
        String invNo = model.getValueAt(invoiceTable.getSelectedRow(), 0).toString();
        String date = model.getValueAt(invoiceTable.getSelectedRow(), 1).toString();
        String desc = model.getValueAt(invoiceTable.getSelectedRow(), 2).toString();
        String amt = model.getValueAt(invoiceTable.getSelectedRow(), 3).toString();
        String dueD = model.getValueAt(invoiceTable.getSelectedRow(), 4).toString();
        String stat = model.getValueAt(invoiceTable.getSelectedRow(), 5).toString();
        
        invoiceTF.setText(invNo);
        issueDateTF.setText(date);
        descTF1.setText(desc);
        amountTF1.setText(amt);
        dueTF.setText(dueD);
        statusTF.setText(stat);
    }//GEN-LAST:event_invoiceTableMouseClicked

    private void pendingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingTableMouseClicked
        DefaultTableModel model2 = (DefaultTableModel)pendingTable.getModel();
        String invNo = model2.getValueAt(pendingTable.getSelectedRow(), 0).toString();
        String date = model2.getValueAt(pendingTable.getSelectedRow(), 1).toString();
        String desc = model2.getValueAt(pendingTable.getSelectedRow(), 2).toString();
        String amt = model2.getValueAt(pendingTable.getSelectedRow(), 3).toString();
        String due = model2.getValueAt(pendingTable.getSelectedRow(), 4).toString();
        
        invoiceTF1.setText(invNo);
        issueDateTF1.setText(date);
        descTF2.setText(desc);
        amountTF2.setText(amt);
        dueTF1.setText(due);
    }//GEN-LAST:event_pendingTableMouseClicked

    @Override
    public String[] getActiveUser(){
        String filePath = "database\\activeUser.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();
            String[] activeUser = line.split(",");           
            br.close();
            return activeUser;
        }catch(IOException e){
            System.out.println("Input Output Exception Occurred" + e);
            return null;
        }catch(Exception e) {
            System.out.println("Exception " + e);
            return null;
        }
    }
    
    private void setInvoiceTable(){
        
        
        String currentUser = "";
        
        String filePath = "database\\invoice.txt";
        String tempFile = "database\\tempActiveResInv.txt";
        String tempFile2 = "database\\tempUnpaidActiveResInv.txt";
        String typeFile = "database\\userType.txt";
        
        try {
            BufferedReader bt = new BufferedReader(new FileReader(typeFile));
            String type = bt.readLine();
            if (type.equals("resident")){
                Resident res = new Resident(getActiveUser()[0], getActiveUser()[1]);
                currentUser = res.getFullName();
            } else if (type.equals("vendor")){
                Vendor ven = new Vendor(getActiveUser()[0], getActiveUser()[1]);
                currentUser = ven.getFullName();
            }
            bt.close();
            
            if (currentUser != ""){
                BufferedReader br = new BufferedReader (new FileReader(filePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
                BufferedWriter bw2 = new BufferedWriter(new FileWriter(tempFile2));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] invInfo = line.split(":");
                    String user = invInfo[3];

                    if (user.equals(currentUser)){
                        bw.write(invInfo[0] + ":" + invInfo[1] + ":" + 
                                invInfo[4] + ":" + invInfo[5] + ":" + 
                                invInfo[6] + ":" + invInfo[7] + "\n");

                        if(invInfo[7].equals("Unpaid")) {
                            bw2.write(invInfo[0] + ":" + invInfo[1] + ":" + 
                                invInfo[4] + ":" + invInfo[5] + ":" + 
                                invInfo[6] + "\n");
                        }
    //                    
                    }
                }
                br.close();
                bw.close();
                bw2.close();

                BufferedReader br2 = new BufferedReader(new FileReader(tempFile));
                DefaultTableModel invoice = (DefaultTableModel)invoiceTable.getModel();
                Object[] record = br2.lines().toArray();
                for (int i = 0; i < record.length; i++){
                    String line2 = record[i].toString().trim();
                    String[] recInfo = line2.split(":");
                    invoice.addRow(recInfo);
                }
                br2.close();
                new File(tempFile).delete();

                BufferedReader br3 = new BufferedReader(new FileReader(tempFile2));
                DefaultTableModel pending = (DefaultTableModel)pendingTable.getModel();
                Object[] record2 = br3.lines().toArray();
                for (int i = 0; i < record2.length; i++){
                    String line3 = record2[i].toString().trim();
                    String[] recInfo = line3.split(":");
    //                String[] recInfo = Arrays.copyOfRange(info, 0, info.length-1);
                    pending.addRow(recInfo);
                }
                br3.close();
                new File(tempFile2).delete();
            } 
            
            
        } catch (IOException ex) {
            System.out.println("Exception occur: " + ex);
        }
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
            java.util.logging.Logger.getLogger(ResidentViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentViewInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentViewInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount1;
    private javax.swing.JLabel amount2;
    private javax.swing.JTextField amountTF1;
    private javax.swing.JTextField amountTF2;
    private javax.swing.JLabel bill;
    private javax.swing.JTabbedPane billtabbedPane;
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JTextField descTF1;
    private javax.swing.JTextField descTF2;
    private javax.swing.JLabel due;
    private javax.swing.JLabel due1;
    private javax.swing.JTextField dueTF;
    private javax.swing.JTextField dueTF1;
    private javax.swing.JButton getInvoiceBTN;
    private javax.swing.JLabel invoice;
    private javax.swing.JLabel invoice1;
    private javax.swing.JTextField invoiceTF;
    private javax.swing.JTextField invoiceTF1;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel issueDate;
    private javax.swing.JLabel issueDate1;
    private javax.swing.JTextField issueDateTF;
    private javax.swing.JTextField issueDateTF1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton paymentBTN;
    private javax.swing.JTable pendingTable;
    private javax.swing.JLabel status;
    private javax.swing.JTextField statusTF;
    // End of variables declaration//GEN-END:variables
}
