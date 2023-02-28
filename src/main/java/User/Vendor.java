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
    public Vendor(String username, String password) {
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
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
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
    
    public void setNewUsername(String username){
        this.username = username;
    }
    
    public void setNewPass(String password){
        this.password = password;
    }
    
    public void edit(String uname, String pw, String fname, String email, String phone, String sname){
        
        Vendor ven = new Vendor(uname, pw);
        ven.fullName = fname;
        ven.workEmail = email;
        ven.workPhone = phone;
        ven.shopName = sname;
        
        String filePath = "database\\vendor.txt";
        String tempFile = "database\\tempVen.txt";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
            
            String line;
            while ((line = br.readLine()) != null){
                String[] venInfo = line.split(",");
                if (!venInfo[0].equals(uname)){
                    p.println(line);
                } else{
                    p.println(venInfo[0] + "," + venInfo[1] + "," + fname + "," + email + "," + phone + "," + venInfo[5] + "," + sname);
                }
            }
            
            br.close();
            p.flush();
            p.close();
            
            BufferedReader rc = new BufferedReader(new FileReader(tempFile));
            PrintWriter pc = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String copy;
            while ((copy = rc.readLine()) != null){
                pc.println(copy);
            }
            
            rc.close();
            pc.close();
            new File(tempFile).delete();
            
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    @Override
    public void changePassword(String uname, String pw, String newPW){
        Vendor ven = new Vendor(uname, pw);
        ven.password = newPW;
        String filePath = "database\\vendor.txt";
        String tempFile = "database\\tempVen.txt";
        String vaFile = "database\\activeUser.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
            
            String line;
            while ((line = br.readLine()) != null){
                String[] venInfo = line.split(",");
                if (!venInfo[0].equals(uname)){
                    p.println(line);
                }else{
                    p.println(venInfo[0] + "," + newPW + "," + venInfo[2] + "," + venInfo[3] + "," + venInfo[4] + "," + venInfo[5] + "," + venInfo[6]);
                }
            }
            br.close();
            p.flush();
            p.close();
            
            BufferedReader rc = new BufferedReader(new FileReader(tempFile));
            PrintWriter pc = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String copy;
            while ((copy = rc.readLine()) != null){
                pc.println(copy);
            }
            
            rc.close();
            pc.close();
            new File(tempFile).delete();
            
            FileWriter fw = new FileWriter(vaFile, false);
            fw.write(uname + "," + newPW);
            fw.close();
            
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
