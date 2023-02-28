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

/**
 *
 * @author user
 */
public class Invoice extends Transaction{
    
    private String desciption;
    private double amount;
    private String dueDate;
    private String status;
    
    public Invoice(String unit, String name, String date, String desc, 
            double amount, String due){
        
        super(unit, name, date);
        
        String[] dateInfo = date.split(" ");
        String year = dateInfo[2];
        super.setNewInvNo(year);
        
        this.desciption = desc;
        this.amount = amount;
        this.dueDate = due;
        this.status = "Unpaid";
    }
    
    public Invoice(String unit, String invNo) {
        super(unit, "", "");
        String filePath = "database\\invoice.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null){
                String[] invInfo = line.split(":");
                if (invInfo[0].equals(invNo)){
                    super.setExistInvNo(invInfo[0]);
                    super.setDocDate(invInfo[1]);
                    super.setUnit(invInfo[2]);
                    super.setName(invInfo[3]);
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
            
            String general = br.readLine();
            String[] generalInfo = general.split(",");
            String unit = generalInfo[0];
            String name = generalInfo[1];
            String month = generalInfo[2];
            String issueDate = generalInfo[3];
            String dueDate = generalInfo[4];
            
            String line;
            while ((line = br.readLine()) != null){
                String[] item = line.split(",");
                String desc = item[0];
                String amt = item[1];
                
                Invoice inv = new Invoice(unit, name, issueDate, desc, 
                        Double.parseDouble(amt), dueDate);
                
                bw.write(inv.getInvNo() + ":" + inv.getDocDate() + ":" + 
                        inv.getUnit() + ":" + inv.getName() + ":" + 
                        inv.desciption + " - " + month + ":" + inv.amount + ":" + inv.dueDate 
                        + ":" + inv.status + "\n");
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
    
    @Override
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
    
}
