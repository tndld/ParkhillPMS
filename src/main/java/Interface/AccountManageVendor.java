/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AccountManageVendor extends javax.swing.JFrame {

    /**
     * Creates new form AccountManageResident
     */
    public AccountManageVendor() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        DefaultTableModel invoice = (DefaultTableModel)invoiceTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resAccTitle = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        allInvoicePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        vInvoiceBTN = new javax.swing.JButton();
        allReceiptPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        receiptTable = new javax.swing.JTable();
        vreceiptBTN = new javax.swing.JButton();
        oustandingPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outstandingTable = new javax.swing.JTable();
        amountTF1 = new javax.swing.JTextField();
        descTF1 = new javax.swing.JTextField();
        issueDateTF = new javax.swing.JTextField();
        invoiceTF = new javax.swing.JTextField();
        invoiceBTN = new javax.swing.JButton();
        invoice = new javax.swing.JLabel();
        unit2 = new javax.swing.JLabel();
        issueDate = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        amount1 = new javax.swing.JLabel();
        unitTF2 = new javax.swing.JTextField();
        due = new javax.swing.JLabel();
        dueTF = new javax.swing.JTextField();
        paymentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        approveBTN = new javax.swing.JButton();
        invoice2 = new javax.swing.JLabel();
        invoiceTF2 = new javax.swing.JTextField();
        resTF = new javax.swing.JTextField();
        resident = new javax.swing.JLabel();
        paymentDateTF = new javax.swing.JTextField();
        paymentDate = new javax.swing.JLabel();
        bank = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        rejectBTN = new javax.swing.JButton();
        bankTF = new javax.swing.JTextField();
        desc = new javax.swing.JLabel();
        descTF = new javax.swing.JTextField();
        due2 = new javax.swing.JLabel();
        dueTF2 = new javax.swing.JTextField();
        homepageBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resAccTitle.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        resAccTitle.setText("Resident Account");

        Tab.setBackground(new java.awt.Color(204, 204, 255));
        Tab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tab.setForeground(new java.awt.Color(51, 51, 51));
        Tab.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Unit No.", "Description", "Issuance Date", "Due Date", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(invoiceTable);

        vInvoiceBTN.setText("View Invoice");
        vInvoiceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vInvoiceBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout allInvoicePanelLayout = new javax.swing.GroupLayout(allInvoicePanel);
        allInvoicePanel.setLayout(allInvoicePanelLayout);
        allInvoicePanelLayout.setHorizontalGroup(
            allInvoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allInvoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allInvoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allInvoicePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vInvoiceBTN)))
                .addContainerGap())
        );
        allInvoicePanelLayout.setVerticalGroup(
            allInvoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allInvoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vInvoiceBTN)
                .addContainerGap())
        );

        Tab.addTab("All Invoice", allInvoicePanel);

        receiptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No.", "Unit No.", "Received From", "Description", "Issuance Date", "Amount", "Bank"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(receiptTable);

        vreceiptBTN.setText("View Receipt");
        vreceiptBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vreceiptBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout allReceiptPanelLayout = new javax.swing.GroupLayout(allReceiptPanel);
        allReceiptPanel.setLayout(allReceiptPanelLayout);
        allReceiptPanelLayout.setHorizontalGroup(
            allReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allReceiptPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vreceiptBTN)))
                .addContainerGap())
        );
        allReceiptPanelLayout.setVerticalGroup(
            allReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vreceiptBTN)
                .addContainerGap())
        );

        Tab.addTab("All Receipt", allReceiptPanel);

        outstandingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Unit No.", "Description", "Amount", "Date of Issuance", "Due"
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
        outstandingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(outstandingTable);

        amountTF1.setEditable(false);

        descTF1.setEditable(false);

        issueDateTF.setEditable(false);

        invoiceTF.setEditable(false);

        invoiceBTN.setText("Issue New Invoice");
        invoiceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBTNActionPerformed(evt);
            }
        });

        invoice.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        invoice.setText("Invoice No.");

        unit2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        unit2.setText("Unit No.");

        issueDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        issueDate.setText("Date of Issuance");

        desc1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        desc1.setText("Description");

        amount1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        amount1.setText("Amount (RM)");

        unitTF2.setEditable(false);

        due.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        due.setText("Due");

        dueTF.setEditable(false);

        javax.swing.GroupLayout oustandingPanelLayout = new javax.swing.GroupLayout(oustandingPanel);
        oustandingPanel.setLayout(oustandingPanelLayout);
        oustandingPanelLayout.setHorizontalGroup(
            oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oustandingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oustandingPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unit2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issueDate)
                            .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc1)
                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(oustandingPanelLayout.createSequentialGroup()
                                .addComponent(unitTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dueTF))
                            .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issueDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(invoiceBTN)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        oustandingPanelLayout.setVerticalGroup(
            oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oustandingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oustandingPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(invoiceBTN))
                    .addGroup(oustandingPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unit2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dueTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(issueDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(oustandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Tab.addTab("Outstanding Fee", oustandingPanel);

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Received From", "Submission Date", "Bank", "Description", "Amount", "Bill Due"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        paymentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(paymentTable);

        approveBTN.setText("Approve");
        approveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBTNActionPerformed(evt);
            }
        });

        invoice2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        invoice2.setText("Invoice No.");

        invoiceTF2.setEditable(false);

        resTF.setEditable(false);

        resident.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        resident.setText("Received From");

        paymentDateTF.setEditable(false);

        paymentDate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        paymentDate.setText("Payment Date");

        bank.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bank.setText("Bank");

        amount.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        amount.setText("Amount (RM)");

        amountTF.setEditable(false);

        rejectBTN.setText("Reject");

        bankTF.setEditable(false);

        desc.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        desc.setText("Description");

        descTF.setEditable(false);

        due2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        due2.setText("Bill Due");

        dueTF2.setEditable(false);

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resident, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paymentPanelLayout.createSequentialGroup()
                                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paymentPanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(paymentDate))
                                    .addComponent(invoice2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc)
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(descTF)
                                    .addGroup(paymentPanelLayout.createSequentialGroup()
                                        .addComponent(invoiceTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bankTF))
                                    .addComponent(resTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(amountTF)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                                        .addComponent(paymentDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(due2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dueTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rejectBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(approveBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoice2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bank, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resident, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(due2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dueTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(approveBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rejectBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Tab.addTab("Payment Approval", paymentPanel);

        homepageBTN.setText("Back");
        homepageBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tab)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homepageBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(resAccTitle)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homepageBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resAccTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homepageBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageBTNActionPerformed
        this.setVisible(false);
        new AccountExeHomepage().setVisible(true);
    }//GEN-LAST:event_homepageBTNActionPerformed

    private void invoiceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBTNActionPerformed
        this.setVisible(false);
        new AccIssueResInvoice().setVisible(true);
    }//GEN-LAST:event_invoiceBTNActionPerformed

    private void approveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBTNActionPerformed
        this.setVisible(false);
        new AccGenerateReceipt().setVisible(true);
    }//GEN-LAST:event_approveBTNActionPerformed

    private void vInvoiceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vInvoiceBTNActionPerformed
        this.setVisible(false);
        new InvoicePage().setVisible(true);
    }//GEN-LAST:event_vInvoiceBTNActionPerformed

    private void vreceiptBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vreceiptBTNActionPerformed
        this.setVisible(false);
        new ReceiptPage().setVisible(true);
    }//GEN-LAST:event_vreceiptBTNActionPerformed

    private void setInvoiceTable(){
        
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
            java.util.logging.Logger.getLogger(AccountManageVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManageVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManageVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManageVendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountManageVendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JPanel allInvoicePanel;
    private javax.swing.JPanel allReceiptPanel;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel amount1;
    private javax.swing.JTextField amountTF;
    private javax.swing.JTextField amountTF1;
    private javax.swing.JButton approveBTN;
    private javax.swing.JLabel bank;
    private javax.swing.JTextField bankTF;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel desc1;
    private javax.swing.JTextField descTF;
    private javax.swing.JTextField descTF1;
    private javax.swing.JLabel due;
    private javax.swing.JLabel due2;
    private javax.swing.JTextField dueTF;
    private javax.swing.JTextField dueTF2;
    private javax.swing.JButton homepageBTN;
    private javax.swing.JLabel invoice;
    private javax.swing.JLabel invoice2;
    private javax.swing.JButton invoiceBTN;
    private javax.swing.JTextField invoiceTF;
    private javax.swing.JTextField invoiceTF2;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel issueDate;
    private javax.swing.JTextField issueDateTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel oustandingPanel;
    private javax.swing.JTable outstandingTable;
    private javax.swing.JLabel paymentDate;
    private javax.swing.JTextField paymentDateTF;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JTable paymentTable;
    private javax.swing.JTable receiptTable;
    private javax.swing.JButton rejectBTN;
    private javax.swing.JLabel resAccTitle;
    private javax.swing.JTextField resTF;
    private javax.swing.JLabel resident;
    private javax.swing.JLabel unit2;
    private javax.swing.JTextField unitTF2;
    private javax.swing.JButton vInvoiceBTN;
    private javax.swing.JButton vreceiptBTN;
    // End of variables declaration//GEN-END:variables
}