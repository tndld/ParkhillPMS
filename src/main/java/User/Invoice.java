/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
public class Invoice extends Transaction{
    
    private String desciption;
    private double amount;
    private String dueDate;
    private String status;
    
    public Invoice(String unit, String name, String date, String desc, String due){
        
        super(unit, name, date);
        
        this.setDocNo();
        this.desciption = desc;
        this.dueDate = due;
        this.status = "Unpaid";
    }
    
    public Invoice(String invNo) {
        super(invNo);
        String filePath = "database\\invoice.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null){
                String[] invInfo = line.split(":");
                if (invInfo[0].equals(invNo)){
                    super.setDocDate(invInfo[1]);
                    this.desciption = invInfo[4];
                    this.amount = Double.parseDouble(invInfo[5]);
                    this.dueDate = invInfo[6];
                    this.status = invInfo[7];
                }
            }
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    public Invoice(String invNo, String desc) {
        super(invNo);
        String filePath = "database\\invoice.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null){
                String[] invInfo = line.split(":");
                if (invInfo[0].equals(invNo) && invInfo[4].equals(desc)){
                    super.setDocDate(invInfo[1]);
                    this.desciption = invInfo[4];
                    this.amount = Double.parseDouble(invInfo[5]);
                    this.dueDate = invInfo[6];
                    this.status = invInfo[7];
                }
            }
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    public void setDesc(String desc) {
        this.desciption = desc;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void setDue(String due) {
        this.dueDate = due;
    }
    
    public void setStatus(String stat) {
        this.status = stat;
    }
    
    public String getDesc() {
        return this.desciption;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    public String getDue() {
        return this.dueDate;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public boolean addInvoice() {
        
        String tempFile = "database\\tempInvFile.txt";
        String filePath = "database\\invoice.txt";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(tempFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            
            String line;
            String month = this.desciption;
            while ((line = br.readLine()) != null){
                String[] item = line.split(",");
                this.desciption = item[0] + " - " + month;
                String amt = item[1];
                this.amount = Double.parseDouble(amt);

                bw.write(this.getInvNo() + ":" + this.getDocDate() + ":" + 
                        this.getUnit() + ":" + this.getName() + ":" + 
                        this.desciption + ":" + this.amount + ":" + 
                        this.dueDate + ":" + this.status + "\n");
            }
            br.close();
            bw.close();
            new File(tempFile).delete();
            return true;
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + ex);
            return false;
            
        } catch (Exception ex) {
            System.out.println("Exception occur when getting issuance form data : " + ex);
            return false;
        }
    }
    
    public boolean updateInvoiceStatus(String stat){
        String filePath = "database\\invoice.txt";
        String tempFile = "database\\tempInv.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
            String line;
            while ((line = br.readLine()) != null){
                String[] invInfo = line.split(":");
                String invNo = invInfo[0];
                String item = invInfo[4];
                if (invNo.equals(this.getInvNo()) && item.equals(this.getDesc())){
                    this.setStatus(stat);
                    pw.println(this.getInvNo() + ":" + this.getDocDate() + ":" + 
                        this.getUnit() + ":" + this.getName() + ":" + 
                        this.desciption + ":" + this.amount + ":" + 
                        this.dueDate + ":" + this.status);
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
    
    public double calTotal(){
        String filePath = "database\\tempInvItem.txt";
        double total = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] itemInfo = line.split(":");
                double amt = Double.parseDouble(itemInfo[3]);
                total += amt;
            }
            return total;
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + ex);
            return 0;
        } catch (Exception ex) {
            System.out.println("Exception occur when getting issuance form data : " + ex);
            return 0;
        }
    }
    
    @Override
    public void setDocNo(){
        String filePath = "database\\invoice.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            int count = 0;
            String line;
            String year = DateFormat.getDateInstance().format(new Date()).split(" ")[2];
            while ((line = br.readLine()) != null){
                String[] invInfo = line.split(":");
                String current = invInfo[0];
                year = invInfo[1].split(" ")[2];
                String[] idInfo = current.split("-");
                int no = Integer.parseInt(idInfo[1]);
                count = no;
            }
            br.close();
            int next = count + 1;
            String newNo = "Inv" + year + "-" + String.valueOf(next);
            
            super.setExistInvNo(newNo);
            
        } catch (IOException ex) {
            System.out.println("IO Exception on set new invoice no.: " + ex);
            
        } catch(Exception ex) {
            System.out.println("Exception occur when setting new invoice no. " + ex);
        }
    }
    
}
