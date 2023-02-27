/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.ManagerResidentTenantMgmt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class ManagerTeamStrutureMgmt extends TeamManagement {

    private String role;
    private String file;
    
    public void setRole(String role){
        this.role = role;
    }
    
    public String getRole(){
        return this.getRole();
    }
    
    @Override
    public boolean updateAdminTeam(String username, String password, String empID, String fname, String ic, String email, String phoneNum, String address, String position){
        AdminExecutive admin = new AdminExecutive(username, password);
        
        boolean success = true;
    
//        update cons
        admin.setName(fname);
        admin.setEmail(email);
        admin.setIC(ic);
        admin.setEmail(email);
        admin.setPhoneNo(phoneNum);
        admin.setAddress(address);
        admin.setPosition(position);
        
        try {
            String filePath = "database\\adminExecutive.txt";
            File inputFile = new File("database\\adminExecutive.txt");
            File tempFile = new File("database\\adminExecutiveTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] adminInfo = currentLine.split(",");
                if(adminInfo[0].equals(username)){
                    // use the existing password

                    writer.write(adminInfo[0] + "," + adminInfo[1] + "," +adminInfo[2] + "," + fname + "," + ic + "," + email + "," + phoneNum + "," + address + "," + position);
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
          
            String temp = "database\\adminExecutiveTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
    
    
    @Override
    public boolean updateAccountTeam(String username, String password, String empID, String fname, String IC, String email, String phoneNum, String address, String position){
        AccountExecutive acc = new AccountExecutive(username, password);
        
        boolean success = true;
    
//        update cons
        acc.setName(fname);
        acc.setIC(IC);
        acc.setEmail(email);
        acc.setPhoneNo(phoneNum);
        acc.setAddress(address);
        acc.setPosition(position);
        
        try {
            String filePath = "database\\accountExecutive.txt";
            File inputFile = new File("database\\accountExecutive.txt");
            File tempFile = new File("database\\accountExecutiveTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] accInfo = currentLine.split(",");
                if(accInfo[0].equals(username)){
                    // use the existing password

                    writer.write(accInfo[0] + "," + accInfo[1] + "," + fname + "," + email + "," + phoneNum + "," + address + "," + position);
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
          
            String temp = "database\\accountExecutiveTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
     }
    
    @Override
    public boolean updateBuildingExeTeam(String username, String password, String empID, String fname, String IC, String email, String phoneNum, String address, String position){
        BuildingExecutive build = new BuildingExecutive(username, password);
        
        boolean success = true;
    
//        update cons
        build.setName(fname);
        build.setIC(IC);
        build.setEmail(email);
        build.setPhoneNo(phoneNum);
        build.setAddress(address);
        build.setPosition(position);
        
        try {
            String filePath = "database\\buildingExecutive.txt";
            File inputFile = new File("database\\buildingExecutive.txt");
            File tempFile = new File("database\\buildingExecutiveTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] accInfo = currentLine.split(",");
                if(accInfo[0].equals(username)){
                    // use the existing password and username

                    writer.write(accInfo[0] + "," + accInfo[1] + "," + fname + "," + email + "," + phoneNum + "," + address + "," + position);
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
          
            String temp = "database\\buildingExecutiveTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
  
    
}
