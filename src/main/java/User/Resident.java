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
                    
            br.close();
            fr.close();
            
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
        
    @Override
    public String getUsername() {
        return super.username;
    }
    
    @Override
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
    
    public void setNewUsername(String username){
        this.username = username;
        /*<<<<<<< HEAD
        //        return null;
        =======
        stash<= >>>>>>
        }*/
    }
    
    public void setNewPass(String password){
        this.password = password;
//        return null;
    }
    
//    public void updateResident(String username, String fullName, String email, String phone, String unitNum){
//        Resident res = new Resident(username, password);
//        res.fullName = fullName;
//        res.email = email;
//        res.phoneNo = phone;
//        res.unitNo = unitNum;
//    }
//    
    public void editDetails(String uname, String pw, String fname, String email, String phone){
        
//        Change value in constructor
        Resident res = new Resident(uname, pw);
        res.setFullName(fname);
        res.setEmail(email);
        res.setPhoneNo(phone);
        
//        Original data path
        String filePath = "database\\residentTenant.txt";
//        Temporary file to write new data
        String tempFile = "database\\tempResident.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            PrintWriter p = new PrintWriter(bw);
            
            String line;
            while ((line = br.readLine()) != null){
                String[] resInfo = line.split(",");
                if (!resInfo[0].equals(uname)){
//                    If username not equals to logged in username, write original data
                    p.println(line);
                }else{
//                    If username equals to logged in username, write edited data
                    p.println(res.username + "," + res.password + "," + 
                            res.fullName + "," + res.email + "," + res.phoneNo 
                            + "," + res.unitNo + ",");
                }
            }
            
            br.close();
            p.flush();
            p.close();
            
            BufferedReader br2 = new BufferedReader (new FileReader(tempFile));
            PrintWriter p2 = new PrintWriter (new BufferedWriter(new FileWriter(filePath)));
            String copy;
//            Write back all data into original file
            while ((copy = br2.readLine()) != null){
                p2.println(copy);
            }
            br2.close();
            p2.close();
//            Delete temporary file
            File f = new File(tempFile);
            f.delete();
                                
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    @Override
    public void changePassword(String uname, String pw, String newPW){
        Resident res = new Resident(uname, pw);
        res.setNewPass(newPW);
        String filePath = "database\\residentTenant.txt";
        String tempFile = "database\\tempResident.txt";
        String auFilePath = "database\\activeUser.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
            PrintWriter p = new PrintWriter(bw);
            
            String line;
            while ((line = br.readLine()) != null){
                String[] resInfo = line.split(",");
                if (!resInfo[0].equals(uname)){
                    p.println(line);
                }else{
                    p.println(res.username + "," + res.password + "," + 
                            res.fullName + "," + res.email + "," + res.phoneNo + 
                            "," + res.unitNo);
                }
            }
            br.close();
            p.flush();
            p.close();
            
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
            
//        Change password in active user text file
            FileWriter fw = new FileWriter(auFilePath, false);
            fw.write(uname + "," + newPW);
            fw.close();
            
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    
    
}
