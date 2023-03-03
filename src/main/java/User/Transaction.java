/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public abstract class Transaction {
    private String invoiceNo;
    private String unit;
    private String name;
    private String docDate;
    
    public Transaction(String unit, String name, String date){
        this.unit = unit;
        this.name = name;
        this.docDate = date;
    }
    
    public Transaction(String invNo){
        this.invoiceNo = invNo;
        
        String filePath = "database\\invoice.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] info = line.split(":");
                if (info[0].equals(invNo)){
                    this.unit = info[2];
                    this.name = info[3];
                    break;
                }
            }
            br.close();
        } catch (IOException ex){
            System.out.println("Exception Occur :" + ex);
        }
    }
    
    public void setExistInvNo(String inv) {
        this.invoiceNo = inv;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public void setDocDate (String date) {
        this.docDate = date;
    }
    
    public String getInvNo(){
        return this.invoiceNo;
    }
    
    public String getUnit(){
        return this.unit;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDocDate(){
        return this.docDate;
    }
    
//    public abstract double calTotal();
    public abstract void setDocNo();
}
