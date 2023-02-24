/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import User.Resident;
import User.VisitorPass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ResidentApplyVPass extends javax.swing.JFrame {

    /**
     * Creates new form ResidentApplyVPass
     */
    public ResidentApplyVPass() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vpassApply = new javax.swing.JLabel();
        vname = new javax.swing.JLabel();
        vnameTF = new javax.swing.JTextField();
        vic = new javax.swing.JLabel();
        vicTF = new javax.swing.JTextField();
        cpTF = new javax.swing.JTextField();
        cp = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        datePicker = new com.toedter.calendar.JDateChooser();
        submitBTN = new javax.swing.JButton();
        cancelBTN = new javax.swing.JButton();
        durationSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vpassApply.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        vpassApply.setText("Visitor Pass Application Form");

        vname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vname.setText("Visitor Name");

        vic.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        vic.setText("Visitor IC");

        cp.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cp.setText("Car Plate No.");

        date.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        date.setText("Date");

        duration.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        duration.setText("Duration (Hour)");

        submitBTN.setText("Submit");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });

        cancelBTN.setText("Cancel");
        cancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cpTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(vicTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vnameTF)
                            .addComponent(datePicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(duration)
                        .addGap(18, 18, 18)
                        .addComponent(durationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vpassApply))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBTN)
                .addGap(18, 18, 18)
                .addComponent(submitBTN)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(vpassApply, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vic, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vicTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBTN)
                    .addComponent(cancelBTN))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed

        String v_name = vnameTF.getText();
        String v_ic = vicTF.getText();
        String carp = cpTF.getText();
        Date d = datePicker.getDate();
        String sdate = DateFormat.getDateInstance().format(d);
        int dur = (Integer)durationSpinner.getValue();
        String durToString = Integer.toString(dur);
        
        if (!v_name.equals("") && !v_ic.equals("") && !carp.equals("") && 
                !sdate.equals("") && !durToString.equals("0")){
    //        Get to know current user
            String filePath = "database\\activeUser.txt";
            try{
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line = br.readLine();
                String[] activeUser = line.split(",");
                String uname = activeUser[0];
                String pw = activeUser[1];
                Resident res = new Resident(uname, pw);

    //            Pass current user into visitor pass constructor
                VisitorPass vp = new VisitorPass(res);
    //            Use VisitorPass class method addVisitorPass to add record into text file
    //            if () is used to check whether the method return true value
                if (vp.addVisitorPass(res, v_name, v_ic, carp, sdate, durToString)){
                    vp.setReferenceNum(res, res.getUnitNo(), sdate);
                    JOptionPane.showMessageDialog(this, 
                            "Visitor Pass Successfully Applied!");
                    this.setVisible(false);
                    new ResidentViewEditVPass().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this, 
                            "Errors occured, please try again.", "Error Message", 
                            JOptionPane.ERROR_MESSAGE);
                    this.setVisible(false);
                    new ResidentHomepage().setVisible(true);
                }
                
            } catch(IOException e){
                System.out.println("Exception Occurred" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                        "Please fill up every field.\n Duration should not be 0.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_submitBTNActionPerformed

    private void cancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTNActionPerformed
//        Ask user if they confirm cancel visitor pass application
        int cancel = JOptionPane.showConfirmDialog(null, 
                "Confirm to cancel application?", "Visitor Pass", 
                JOptionPane.YES_NO_OPTION);
        
//        If yes, back to resident homepage
        if (cancel == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new ResidentHomepage().setVisible(true);
        }
    }//GEN-LAST:event_cancelBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ResidentApplyVPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentApplyVPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentApplyVPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentApplyVPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ResidentApplyVPass().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBTN;
    private javax.swing.JLabel cp;
    private javax.swing.JTextField cpTF;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser datePicker;
    private javax.swing.JLabel duration;
    private javax.swing.JSpinner durationSpinner;
    private javax.swing.JButton submitBTN;
    private javax.swing.JLabel vic;
    private javax.swing.JTextField vicTF;
    private javax.swing.JLabel vname;
    private javax.swing.JTextField vnameTF;
    private javax.swing.JLabel vpassApply;
    // End of variables declaration//GEN-END:variables
}
