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
 * @author Asus
 */
public class Resident extends User {
    
    private String fullName;
    private String email;
    private String phoneNo;
    private String unitNo;
    
//    For existing resident
    public Resident(String username, String password) {
        super(username, password);
        
//        Read from Resident text file to get user's details
        String filePath = "database\\residentTenant.txt";
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] residentInfo = line.split(",");
//                Assign details into constructor
                if (residentInfo[0].equals(username)){
                    this.fullName = residentInfo[2];
                    this.email = residentInfo[3];
                    this.phoneNo = residentInfo[4];
                    this.unitNo = residentInfo[5];
                }
            }
                    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
//    For new resident
    public Resident(){
        fullName = "";
        email = "";
        phoneNo = "";
        unitNo = "";
    }
    
    @Override
    public String getUsername() {
        return super.username;
    }
    
    public String getPassword() {
        return super.password;
    }
    
    public void setFullName(String fname){
        this.fullName = fname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNo(String phone){
        this.phoneNo = phone;
    }
    
    public void setUnitNo(String unit) {
        this.unitNo = unit;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    public String getUnitNo(){
        return this.unitNo;
    }
    
}
