/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Vendor extends User {
    private String fullName;
    private String workEmail;
    private String workPhone;
    private String lotNo;
    private String shopName;
    
//    For existing vendor, retrieve information from database
    public Vendor(String username, String password) throws FileNotFoundException {
        super(username, password);
        
        String filePath = "database\\vendor.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] vendorInfo = line.split(",");
                if (vendorInfo[0].equals(username)){
                    this.fullName = vendorInfo[2];
                    this.workEmail = vendorInfo[3];
                    this.workPhone = vendorInfo[4];
                    this.lotNo = vendorInfo[5];
                    this.shopName = vendorInfo[6];
                }
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
//    For new vendor
    public Vendor() {
        fullName = "";
        workEmail = "";
        workPhone = "";
        lotNo = "";
        shopName = "";
    }
    
    @Override
    public String getUsername(){
        return super.username;
    }
    
    @Override
    public String getPassword(){
        return super.password;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public String getEmail(){
        return this.workEmail;
    }
    
    public String getPhone(){
        return this.workPhone;
    }
    
    public String getLotNo(){
        return this.lotNo;
    }
    
    public String getSName(){
        return this.shopName;
    }
    
    public void setFullName(String fname){
        this.fullName = fname;
    }
    
    public void setEmail(String email){
        this.workEmail = email;
    }
    
    public void setPhone(String phone){
        this.workPhone = phone;
    }
    
    public void setLotNo(String lot){
        this.lotNo = lot;
    }
    
    public void setShopName(String sname){
        this.shopName = sname;
    }
}
