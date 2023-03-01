/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.BuildingExeHomepage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class BuildingManager extends MgmtLevelUser {
    
    private String empID;
    private String name;
    private String ic;
    private String email;
    private String phoneNo;
    private String address;
    private String position;

    public BuildingManager(String username, String password) {
        super(username, password);
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getpassword(){
        return this.username;
    }
    
    public String getEmpID(){
        return this.empID;
    }
    
    public String getname(){
        return this.name;
    }
    
    public String getIc(){
        return this.ic;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    public String getAddress(){
        return this.address;
    }

    public String getPosition(){
        return this.position;
    }
    
    public void setPassword(String position){
        this.position = position;
    }
    
    public void setEmpID(String empID){
        this.empID = empID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setIC(String ic){
        this.ic = ic;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
    
    public void buidingManagerMenu(){
        System.out.println("Building Manager Page");
    }
    
    public void setNewUsername(String username){
        this.username = username;
    }
    
    public void setNewPass(String password){
        this.password = password;
    }
    
    public boolean checkUsernameExists(String username, String file) throws IOException {
        boolean usernameExists = false;

        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] residentInfo = line.split(",");
                if (residentInfo[0].equals(username)) {
                    usernameExists = true;
                    break;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
        return usernameExists;
}
    
    @Override
    public boolean addResident(String username, String password, String fname, String email, String phoneNum, String unitNo) {
        Resident res = new Resident(null,null);
        
        boolean success =  true;

        res.setNewUsername(username);
        res.setNewPass(password);
        res.setFullName(fname);
        res.setEmail(email);
        res.setPhoneNo(phoneNum);
        res.getUnitNo();
        
        
        try {
                String filePath = "database\\residentTenant.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(username+ ","+ password + ","+ fname + ","+ email + ","+ phoneNum+ "," + unitNo + ",\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
    
    @Override
    public boolean updateResident(String username, String pw, String fname, String email, String phoneNum, String unitNo){
        Resident res = new Resident(username, pw);
        
        boolean success = true;
    
//        update cons
        res.setFullName(fname);
        res.setEmail(email);
        res.setPhoneNo(phoneNum);
        res.getUnitNo();
        
        try {
            String filePath = "database\\residentTenant.txt";
  
            File inputFile = new File("database\\residentTenant.txt");
            File tempFile = new File("database\\residentTenantTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] residentInfo = currentLine.split(",");
                if(residentInfo[0].equals(username)){
                    // use the existing password
                    String pass = residentInfo[1];
                    writer.write(residentInfo[0] + "," + pass + "," + fname + "," + email + "," + phoneNum + "," + unitNo + ",\n");
                } else {
                    writer.write(currentLine + "\n");
                }
            }
            reader.close();
            writer.flush();
            writer.close();
            
            BufferedReader br = new BufferedReader(new FileReader(tempFile));
            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String line;
            // Read each line from the input file and write to the output file
            while((line = br.readLine()) != null) {
                w.println(line);
                
            }
            // Close the input and output files
            br.close();
            w.flush();
            w.close();
          
            String temp = "database\\residentTenantTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
    
    @Override
    public DefaultTableModel searchResultTable(String username, String unitNo){
        String[] columnNames = {"Username", "Name", "Email", "Phone No", "Unit No"};
        DefaultTableModel searchResultTable = new DefaultTableModel(columnNames, 0); 
        
        String filePath = "database\\residentTenant.txt";
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                Object [] residentInfo = currentLine.split(",");
                if ((username == null || residentInfo[0].equals(username)) 
                        && (unitNo == null) || residentInfo[5].equals(unitNo)){
                    String[] dataArray = {residentInfo[0].toString(),
                                      residentInfo[2].toString(),
                                      residentInfo[3].toString(),
                                      residentInfo[4].toString(),
                                      residentInfo[5].toString()};
                    searchResultTable.addRow(dataArray);
                } 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResultTable;
    }
    
    public boolean deleteResident(String username) {
        boolean success = false;
        
        String filePath = "database\\residentTenant.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\tempResidentTenant.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] residentInfo = currentLine.split(",");
                if (!residentInfo[0].equals(username)) {
                    pw.println(currentLine);
                } else {
                    success = true;
                }
            }
            pw.flush();
            pw.close();
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(tempFile));
            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String line;
            // Read each line from the input file and write to the output file
            while((line = br.readLine()) != null) {
                w.println(line);
                
            }
            // Close the input and output files
            br.close();
            w.flush();
            w.close();
          
            String temp = "database\\tempResidentTenant.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
    
    // Vendor
     public boolean addVendor(String username, String password, String fname, String email, String phoneNum, String lotNum, String shopName) {
        Vendor vendor = new Vendor(null,null);
        
        boolean success =  true;

        vendor.setNewUsername(username);
        vendor.setNewPass(password);
        vendor.setFullName(fname);
        vendor.setEmail(email);
        vendor.setPhone(phoneNum);
        vendor.setLotNo(lotNum);
        vendor.setShopName(shopName);
        
        
        try {
                String filePath = "database\\vendor.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(username+ ","+ password + ","+ fname + ","+ email + ","+ phoneNum+ "," + lotNum + "," + shopName+ ",\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
     
    public boolean updateVendor(String username, String password, String fname, String email, String phoneNum, String lotNum, String shopName){
        Vendor ven = new Vendor(username, password);
        
        boolean success = true;
    
//        update cons
        ven.setFullName(fname);
        ven.setEmail(email);
        ven.setPhone(phoneNum);
        ven.setLotNo(lotNum);
        ven.setShopName(shopName);
        
        try {
            String filePath = "database\\vendor.txt";
            File inputFile = new File("database\\vendor.txt");
            File tempFile = new File("database\\vendorTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] vendorInfo = currentLine.split(",");
                if(vendorInfo[0].equals(username)){
                    // use the existing password
                    String pass = vendorInfo[1];
                    writer.write(vendorInfo[0] + "," + pass + "," + fname + "," + email + "," + phoneNum + "," + lotNum + "," + shopName + ",\n");
                } else {
                    writer.write(currentLine + "\n");
                }
            }
            reader.close();
            writer.flush();
            writer.close();
            
            BufferedReader br = new BufferedReader(new FileReader(tempFile));
            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String line;
            // Read each line from the input file and write to the output file
            while((line = br.readLine()) != null) {
                w.println(line);
                
            }
            // Close the input and output files
            br.close();
            w.flush();
            w.close();
          
            String temp = "database\\vendorTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
     
    public boolean deleteVendor(String username) {
        boolean success = false;
        
        String filePath = "database\\vendor.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\vendorTemp.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            PrintWriter p = new PrintWriter(writer);

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] vendorInfo = currentLine.split(",");
                if (!vendorInfo[0].equals(username)) {
                    p.println(currentLine);
                } else {
                    success = true;
                }
            }

            writer.close();
            reader.close();

            BufferedReader br = new BufferedReader(new FileReader(tempFile));
            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String line;
            // Read each line from the input file and write to the output file
            while((line = br.readLine()) != null) {
                w.println(line);
                
            }
            // Close the input and output files
            br.close();
            w.flush();
            w.close();
          
            String temp = "database\\vendorTemp.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
     
    public DefaultTableModel searchVendor(String username, String lotNum){
        String[] columnNames = {"Username", "Name", "Email", "Phone No", "Lot Num", "Shop Name"};
        DefaultTableModel searchResultTable = new DefaultTableModel(columnNames, 0); 
        
        String filePath = "database\\vendor.txt";
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                Object [] vendorInfo = currentLine.split(",");
                if ((username == null || vendorInfo[0].equals(username)) 
                        && (lotNum == null) || vendorInfo[5].equals(lotNum)){
                    String[] dataArray = {vendorInfo[0].toString(),
                                      vendorInfo[2].toString(),
                                      vendorInfo[3].toString(),
                                      vendorInfo[4].toString(),
                                      vendorInfo[5].toString(),
                                      vendorInfo[6].toString()};
                    searchResultTable.addRow(dataArray);
                } 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResultTable;
    }
    
    public boolean updateGuard(String username, String password){
        Guard guard = new Guard(username, password);
        
        boolean success = true;
    
//        update cons

        guard.setNewPass(password);
        
        try {
            String filePath = "database\\guard.txt";
            File inputFile = new File("database\\guard.txt");
            File tempFile = new File("database\\guardTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] info = currentLine.split(",");
                if(info[0].equals(username)){
                    // use the existing password
                    writer.write(info[0] + "," + password + ",\n");
                } else {
                    writer.write(currentLine + "\n");
                }
            }
            reader.close();
            writer.flush();
            writer.close();
            
            BufferedReader br = new BufferedReader(new FileReader(tempFile));
            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String line;
            // Read each line from the input file and write to the output file
            while((line = br.readLine()) != null) {
                w.println(line);
                
            }
            // Close the input and output files
            br.close();
            w.flush();
            w.close();
          
            String temp = "database\\guardTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
     
    
}
