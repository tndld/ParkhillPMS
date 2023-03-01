/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.ManagerResidentTenantMgmt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AdminExecutive extends MgmtLevelUser {
    
    private String empID;
    private String name;
    private String ic; 
    private String email;
    private String phoneNo;
    private String address;
    private String position;
    
    public AdminExecutive(String username, String password) {
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
    
    public void setNewUsername(String username){
        this.username = username;
    }
    
    public void setNewPass(String password){
        this.password = password;
    }
    
    public boolean checkUsernameExists(String username) throws IOException {
        boolean usernameExists = false;
  
        String filePath = "database\\residentTenant.txt";

        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while((line = reader.readLine()) != null) {
                String[] residentInfo = line.split(",");
                if (residentInfo[0].equals(username)) {
                    usernameExists = true;
                    break;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
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
            String temp = "database\\residentTenantTemp.txt";
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
    
    public boolean addEmp(String empID, String name, String ic, String phoneNum, String position) {
        Employee emp = new Employee();
        
        boolean success =  true;

        emp.setEmpID(empID);
        emp.setName(name);
        emp.setPhoneNo(phoneNum);
        emp.setPosition(position);
        
        
        try {
                String filePath = "database\\employee.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(empID + ";"+ name + ";"+ ic + ";" + phoneNum + ";" + position + ";\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
    
     public boolean deleteEmp(String empID) {
        boolean success = false;
        
        String filePath = "database\\employee.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\employeeTemp.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] residentInfo = currentLine.split(";");
                if (!residentInfo[0].equals(empID)) {
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
          
            String temp = "database\\employeeTemp.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
     
     public boolean updateEmp(String empID, String name, String ic, String phoneNum, String position){
        Employee emp = new Employee();
        
        boolean success = true;
        
        emp.setName(name);
        emp.setIC(ic);
        emp.setPhoneNo(phoneNo);
        emp.setPosition(position);
        
        
        try {
            String filePath = "database\\employee.txt";
            File inputFile = new File("database\\employee.txt");
            File tempFile = new File("database\\employeeTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] empInfo = currentLine.split(";");
                if(empInfo[0].equals(empID)){
                    // use the existing password
                    writer.write(empInfo[0] + ";" + name + ";" + ic + ";" + phoneNum + ";" + position + ";\n");
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
          
            String temp = "database\\employeeTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
}
