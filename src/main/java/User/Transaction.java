/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.awt.image.SampleModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.xml.crypto.dsig.Transform;

/**
 *
 * @author user
 */
public class Transaction {
    
    private String invoiceNo;
    private String unit;
    private String fullName;
    private Date date;
    
    public Transaction(String unit, String name, Date recDate) {
        this.setInvNo(recDate);
        this.unit = unit;
        this.fullName = name;
        this.date = recDate;
    }
    
    public void setInvNo(Date d){
//        Declare date format
        SimpleDateFormat dformater = new SimpleDateFormat("dd MMM yyyy");
        Date date;
        
        try {
//            Open calendar select the converted date
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
//            get the year and month integer
            int year = cal.get(Calendar.YEAR);
            int mon = cal.get(Calendar.MONTH) + 1;
            
//            Check how many record in the file is in the same month already
            String filePath = "database\\resInvoice.txt";
            int count = 0;
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null){
                String[] invInfo = line.split(":");
////              Convert string to date
                date = dformater.parse(invInfo[1]);
                cal.setTime(date);
                int getYear = cal.get(Calendar.YEAR);
                int getMon = cal.get(Calendar.MONTH) + 1;
                if ((mon == getMon) && (year == getYear)){
                    count++;
                }
            }
            br.close();
            int thisRec = count + 1;
            
//            Build the string
            String invNo = String.format("Inv%d%d-%d", year, mon, thisRec);
//            Assign it as Invoice No.
            this.invoiceNo = invNo;
            
        } catch (ParseException e){
            System.out.println("Error passing date: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Input/Output Exception Occur: " + e);
        } catch (Exception e){
            System.out.println("Exception occur: " + e);
        }
    }
    
    public void setName(String n){
        this.fullName = n;
    }
    
    public void setUnit(String u){
        this.unit = u;
    }
    
    public void setIssSubDate(Date d){
        this.date = d;
    }
    
    public String getName(){
        return this.fullName;
    }
    
    public String getUnit(){
        return this.unit;
    }
    
    public String getInvNo(){
        return this.invoiceNo;
    }
    
    public Date getIssSubDate(){
        return this.date;
    }
}
