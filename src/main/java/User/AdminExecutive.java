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
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AdminExecutive extends User {
    
    
    public AdminExecutive(String username, String password) {
        super(username, password);
    }
    
    public void adminMenu(){
        System.out.println("Admin Page");
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
                    writer.write(residentInfo[0] + "," + pass + "," + fname + "," + email + "," + phoneNum + "," + unitNo + ",");
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
    
    public DefaultTableModel searchResultTable(String username, String unitNo){
        String[] columnNames = {"Username", "Name", "Email", "Phone No", "Unit No"};
        DefaultTableModel searchResultTable = new DefaultTableModel(columnNames, 0); 
        
        String filePath = "database\\residentTenant.txt";
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            System.out.println("1");
            while ((currentLine = reader.readLine()) != null) {
                System.out.println("2");
                Object [] residentInfo = currentLine.split(",");
                System.out.println("3");
                if ((username == null || residentInfo[0].equals(username)) 
                        && (unitNo == null) || residentInfo[5].equals(unitNo)){
                    System.out.println("4");
                    String[] dataArray = {residentInfo[0].toString(),
                                      residentInfo[2].toString(),
                                      residentInfo[3].toString(),
                                      residentInfo[4].toString(),
                                      residentInfo[5].toString()};
                    System.out.println("5");
                    searchResultTable.addRow(dataArray);
                    System.out.println("6");
                    System.out.println("7");
                } 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResultTable;
    }
}