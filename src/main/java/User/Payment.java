/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author user
 */
public class Payment extends Transaction{
    
    private String bank;
    private String desc;
    private double amount;
    private String evidence;
    private String status;
    private String paymentNo;
    
    public Payment(String invNo, String item, String day, String bank, double amt, String evi){
        super(invNo);
        this.desc = item;
        this.setDocNo();
        super.setDocDate(day);
        this.bank = bank;
        this.amount = amt;
        this.evidence = evi;
        this.status = "Pending";
    }
    
//    public Payment(String unit, String invNo, String name, 
//            String day, String bank, double amt, String evi){
//        super(unit, invNo);
//        super.setName(name);
//        super.setDocDate(day);
//        this.bank = bank;
//        this.amount = amt;
//        this.evidence = evi;
//        this.status = "Pending";
//    }
    
    public Payment(String invNo, String docNo, String desc){
        super(invNo);
        this.paymentNo = docNo;
        this.desc = desc;
        
        String filePath = "database\\payment.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] pymInfo = line.split(":");
                String inv = pymInfo[0];
                if (inv.equals(invNo)){
                    super.setDocDate(pymInfo[1]);
//                    super.setUnit(pymInfo[2]);
//                    super.setName(pymInfo[3]);
                    this.bank = pymInfo[4];
                    this.amount = Double.parseDouble(pymInfo[6]);
                    this.evidence = pymInfo[7];
                    this.status = pymInfo[8];
                }    
            }
            br.close();
            
        } catch(IOException ex){
            System.out.println("Exception occurs when retrieving payment info: " + ex);
        }
    }
    
//    public Payment(String invNo){
//        super("", invNo);
//        
//        String filePath = "database\\payment.txt";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(filePath));
//            String line;
//            while ((line = br.readLine()) != null){
//                String[] pymInfo = line.split(":");
//                String inv = pymInfo[0];
//                if (inv.equals(invNo)){
//                    super.setDocDate(pymInfo[1]);
//                    super.setUnit(pymInfo[2]);
//                    super.setName(pymInfo[3]);
//                    this.bank = pymInfo[4];
//                    this.amount = Double.parseDouble(pymInfo[5]);
//                    this.evidence = pymInfo[6];
//                    this.status = pymInfo[7];
//                }    
//            }
//            br.close();
//            
//        } catch(IOException ex){
//            System.out.println("Exception occurs when retrieving payment info: " + ex);
//        }
//    }
    
    public String getBank() {
        return this.bank;
    }
    
    public String getItem() {
        return this.desc;
    }
    
    public double getAmt() {
        return this.amount;
    }
    
    public String getEvi(){
        return this.evidence;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public String getDocNo() {
        return this.paymentNo;
    }
    
    public void setStatus(String stat) {
        this.status = stat;
    }
    
    public void setAmt(double amt){
        this.amount = amt;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    
    public void setEvi (String evi) {
        this.evidence = evi;
    }
    
    public void setPaymentNo (String pmNo){
        this.paymentNo = pmNo;
    }
    
    public boolean addPayment(){
        
        Invoice inv = new Invoice(this.getInvNo(), this.getItem());
        if (inv.updateInvoiceStatus("Pending")){
            String filePath = "database\\payment.txt";
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
                bw.write(this.getInvNo() + ":" + this.getDocDate() + ":" + 
                        this.getUnit() + ":" + this.getName() + ":" + this.bank + ":" +
                        this.desc + ":" + this.amount + ":" + this.evidence + ":" + this.status + ":" 
                        + this.paymentNo + "\n");
                bw.close();
                return true;
            } catch(IOException ex) {
                    System.out.println("Exception occurred when submitting payment: " + ex);
                    return false;
            }
        } else {
            return false;
        }
        
    }
    
    public boolean updatePaymentStatus(String stat){
        String filePath = "database\\payment.txt";
        String tempFile = "database\\tempPayment.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
            String line;
            while ((line = br.readLine()) != null){
                String[] pymInfo = line.split(":");
                String invNo = pymInfo[0];
                String item = pymInfo[5];
                String rcpNo = pymInfo[9];
                if (invNo.equals(this.getInvNo()) && item.equals(this.getItem()) && rcpNo.equals(this.getDocNo())){
                    this.setStatus(stat);
                    pw.println(this.getInvNo() + ":" + this.getDocDate() + ":" + 
                        this.getUnit() + ":" + this.getName() + ":" + 
                        this.bank + ":" + this.desc + ":" + this.amount + ":" +
                        this.evidence + ":" + this.status + ":" + this.paymentNo);
                } else {
                    pw.println(line);
                }
            }
            br.close();
            pw.flush();
            pw.close();
            
            BufferedReader br2 = new BufferedReader (new FileReader(tempFile));
            PrintWriter p2 = new PrintWriter (new BufferedWriter(new FileWriter(filePath)));
            String copy;
            while ((copy = br2.readLine()) != null){
                p2.println(copy);
            }
            br2.close();
            p2.close();
            File f = new File(tempFile);
            f.delete();
            return true;
            
        } catch(IOException ex){
            System.out.println("Exception occurs when updating invoice status: " + ex);
            return false;
        }
        
    }
    
//    public boolean updatePaymentStatus(String invNo){
//        String filePath = "database\\payment.txt";
//        String tempFile = "database\\tempPayment.txt";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(filePath));
//            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
//            String line;
//            while ((line = br.readLine()) != null){
//                String[] pymInfo = line.split(":");
//                String inv = pymInfo[0];
//                if (inv.equals(invNo)){
//                    pw.println(super.getInvNo() + ":" + super.getDocDate() 
//                            + ":" + super.getUnit() + ":" + super.getName() 
//                            + ":" + this.bank + ":" + this.desc + ":" + this.amount + ":" 
//                            + this.evidence + ":" + this.status + ":" + this.paymentNo);
//                } else {
//                    pw.println(line);
//                }
//            }
//            br.close();
//            pw.flush();
//            pw.close();
//            
//            BufferedReader br2 = new BufferedReader (new FileReader(tempFile));
//            PrintWriter p2 = new PrintWriter (new BufferedWriter(new FileWriter(filePath)));
//            String copy;
//            while ((copy = br2.readLine()) != null){
//                p2.println(copy);
//            }
//            br2.close();
//            p2.close();
//            File f = new File(tempFile);
//            f.delete();
//            
//            return true;
//            
//        } catch(IOException ex){
//            System.out.println("Exception occurs when retrieving payment info: " + ex);
//            return false;
//        }
//    }
    
    @Override
    public void setDocNo(){
        String filePath = "database\\payment.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            int count = 0;
            String line;
            String year = DateFormat.getDateInstance().format(new Date()).split(" ")[2];
            while ((line = br.readLine()) != null){
                String[] pymInfo = line.split(":");
                String current = pymInfo[9];
                String[] idInfo = current.split("-");
                int num = Integer.parseInt(idInfo[1]);
                count = num;
            }
            br.close();
            int next = count + 1;
            String newNo = "P" + year + "-" + String.valueOf(next);
            
            this.setPaymentNo(newNo);
            
        } catch (IOException ex) {
            System.out.println("IO Exception on set new payment no.: " + ex);
            
        } catch(Exception ex) {
            System.out.println("Exception occur when setting new payment no. " + ex);
        }
    }
}
