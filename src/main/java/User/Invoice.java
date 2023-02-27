/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class Invoice extends Transaction {
    
    private Date due;
    private String desc;
    private double amount;
    private String status;
    
    public Invoice(String inv){
//        Go text file search based on invoice number
    }
    
    public Invoice(String unit, String name, Date recDate, String description, double amount){
        super(unit, name, recDate);
        super.setInvNo(recDate);
        this.desc = description;
        this.amount = amount;
        this.status = "Unpaid";
        this.setDue(recDate);
    }
    
    public void setDue(Date issueDate){
        Calendar cal = Calendar.getInstance();
        cal.setTime(issueDate);
        cal.add(Calendar.DAY_OF_YEAR, 14);
        this.due = cal.getTime();
    }
    
//    public static void main(String[] args) {
//        SimpleDateFormat dformater = new SimpleDateFormat("dd MMM yyyy");
//        
//        try{
//            Invoice inv = new Invoice("B-7-1", "Low Jye Shan", dformater.parse("01 Feb 2023"), "Water Bill - Jan", 20.00);
//            System.out.println(inv.due);
//            
//        } catch (ParseException e){
//            System.out.println("Error passing date: " + e.getMessage());
//        }
//    }
    
}
