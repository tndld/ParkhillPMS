/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Receipt extends Transaction{
    
    private String receiptNo;
    private String description;
    private double total;
    private String issueBy;
    public String paymentNo;
    
    public Receipt(String invNo, String day, String paymentNo, String desc, String issuer) {
        super(invNo);
        super.setDocDate(day);
        setDocNo();
        this.paymentNo = paymentNo;
        this.description = desc;
        Payment pym = new Payment(invNo, paymentNo, desc);
        this.total = pym.getAmt();
        this.issueBy = issuer;
    }
    
    public Receipt(String invNo, String rcpNo, String desc){
        super(invNo);
        this.receiptNo = rcpNo;
        
        String filePath = "database\\receipt.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] rcpInfo = line.split(":");
                String rcp = rcpInfo[0];
                String description = rcpInfo[6];
                if (rcp.equals(rcpNo) && (description.equals(desc))){
                    super.setDocDate(rcpInfo[1]);
                    this.paymentNo = rcpInfo[2];
                    this.description = rcpInfo[6];
                    this.total = Double.parseDouble(rcpInfo[7]);
                    this.issueBy = rcpInfo[8];
                }    
            }
            br.close();
            
        } catch(IOException ex){
            System.out.println("Exception occurs when retrieving payment info: " + ex);
        }
    }
    
    public void setRcpNo(String rcp){
        this.receiptNo = rcp;
    }
    
    public void setIssuer(String accExe){
        this.issueBy = accExe;
    }
    
    public void setPaymentNo(String pym){
        this.paymentNo = pym;
    }
    
    public void setDesc(String desc){
        this.description = desc;
    }
    
    public String getRcpNo(){
        return this.receiptNo;
    }
    
    public double getAmount(){
        return this.total;
    }
    
    public String getIssuer(){
        return this.issueBy;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getPaymentNo() {
        return this.paymentNo;
    }
    
    public boolean addReceipt(){
        
        Payment pym = new Payment(this.getInvNo(), this.paymentNo, this.description);
        Invoice inv = new Invoice(this.getInvNo(), this.description);
        if (pym.updatePaymentStatus("Approve") && inv.updateInvoiceStatus("Paid")){
            String filePath = "database\\receipt.txt";
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
                bw.write(this.receiptNo + ":" + this.getDocDate() + ":" + this.paymentNo + ":" + 
                        this.getInvNo()+ ":" + this.getUnit() + ":" + this.getName() + ":" + 
                        this.description + ":" + this.total + ":" + this.issueBy + "\n");
                bw.close();
                return true;
            } catch(IOException ex) {
                System.out.println("Exception occurred when submitting payment: " + ex);
                return false;
            }
        } else{
            return false;
        }
    }
    
    @Override
    public void setDocNo(){
        String filePath = "database\\receipt.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            int count = 0;
            String line;
            String year = DateFormat.getDateInstance().format(new Date()).split(" ")[2];
            while ((line = br.readLine()) != null){
                String[] rcpInfo = line.split(":");
                String current = rcpInfo[0];
                String[] idInfo = current.split("-R");
                int num = Integer.parseInt(idInfo[1]);
                count = num;
            }
            br.close();
            int next = count + 1;
            String newNo = "PH" + year + "-R" + String.valueOf(next);
            
            this.setRcpNo(newNo);
            
        } catch (IOException ex) {
            System.out.println("IO Exception on set new receipt no.: " + ex);
            
        } catch(Exception ex) {
            System.out.println("Exception occur when setting new receipt no. " + ex);
        }
    }
}
