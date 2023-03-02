/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Receipt extends Transaction{
    
    private String receiptNo;
    private double total;
    private String issueBy;
    
    public Receipt(String invNo, String day, String paymentNo, String issuer) {
        super(invNo);
        super.setDocDate(day);
        setDocNo();
        Payment pym = new Payment(invNo, paymentNo);
        this.total = pym.getAmt();
        this.issueBy = issuer;
    }
    
    public Receipt(String invNo, String rcpNo){
        super(invNo);
        this.receiptNo = rcpNo;
        
        String filePath = "database\\receipt.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] rcpInfo = line.split(":");
                String rcp = rcpInfo[0];
                if (rcp.equals(rcpNo)){
                    super.setDocDate(rcpInfo[1]);
                    this.total = Double.parseDouble(rcpInfo[5]);
                    this.issueBy = rcpInfo[6];
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
    
    public String getRcpNo(){
        return this.receiptNo;
    }
    
    public double getAmount(){
        return this.total;
    }
    
    public String getIssuer(){
        return this.issueBy;
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
                String[] idInfo = current.split("-");
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
