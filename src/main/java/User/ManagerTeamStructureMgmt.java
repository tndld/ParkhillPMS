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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class ManagerTeamStructureMgmt extends TeamManagement {

    private String role;
    private String file;
    
    public void setRole(String role){
        this.role = role;
    }
    
    public String getRole(){
        return this.getRole();
    }
    
    public String getFile(){
        return this.getFile();
    }
    
    public void setFile(String file){
        this.role = file;
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
    
    @Override
    public boolean updateManager(String username, String password, String empID, String fname, String IC, String email, String phoneNum, String address, String position){
        
        BuildingManager manager = new BuildingManager(username, password);
        
        boolean success = true;
    
//        update cons
        manager.setName(fname);
        manager.setIC(IC);
        manager.setEmail(email);
        manager.setPhoneNo(phoneNum);
        manager.setAddress(address);
        manager.setPosition(position);
        
        try {
            String filePath = "database\\buildingManager.txt";
            File inputFile = new File("database\\buildingManager.txt");
            File tempFile = new File("database\\buildingManagerTemp.txt");
            
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
          
            String temp = "database\\buildingManagerTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
    
    public boolean addAdmin(String username, String password, String empID, String fname, String ic, String email, String phoneNum, String address, String position) {
        AdminExecutive admin = new AdminExecutive(null,null);
        
        boolean success =  true;

        admin.setNewUsername(username);
        admin.setNewPass(password);
        admin.setName(fname);
        admin.setEmail(email);
        admin.setPhoneNo(phoneNum);
        admin.setAddress(address);
        
        //count the existing lines in text file to set the item code
        int count = 0;
        try {
            File file = new File("database\\adminExecutive.txt");
            Scanner sc = new Scanner(file);
            
            while(sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            String i = Integer.toString(count);
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        String id = "AD" + count;
        
        try {
                String filePath = "database\\adminExecutive.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(username+ ","+ password + ","+ id + "," + fname + ","+ ic + "," + email + ","+ phoneNum+ "," + address + "," + position + ",\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
  
    @Override
    public boolean addAccount(String username, String password, String empID, String fname, String ic, String email, String phoneNum, String address, String position) {
        AccountExecutive acc = new AccountExecutive(null,null);
        
        boolean success =  true;

        acc.setNewUsername(username);
        acc.setNewPass(password);
        acc.setName(fname);
        acc.setEmail(email);
        acc.setPhoneNo(phoneNum);
        acc.setAddress(address);
        
        try {
                String filePath = "database\\accountExecutive.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(username+ ","+ password + ","+ empID + "," + fname + ","+ ic + "," + email + ","+ phoneNum+ "," + address + "," + position + ",\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
    
    @Override
    public boolean addBuildingExe(String username, String password, String empID, String fname, String ic, String email, String phoneNum, String address, String position) {
        BuildingExecutive acc = new BuildingExecutive(null,null);
        
        boolean success =  true;

        acc.setNewUsername(username);
        acc.setNewPass(password);
        acc.setName(fname);
        acc.setEmail(email);
        acc.setPhoneNo(phoneNum);
        acc.setAddress(address);
        
        try {
                String filePath = "database\\buildingExecutive.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(username+ ","+ password + ","+ empID + "," + fname + ","+ ic + "," + email + ","+ phoneNum+ "," + address + "," + position + ",\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
    
    @Override
    public boolean addManager(String username, String password, String empID, String fname, String ic, String email, String phoneNum, String address, String position) {
        BuildingManager manager = new BuildingManager(null,null);
        
        boolean success =  true;

        manager.setNewUsername(username);
        manager.setNewPass(password);
        manager.setName(fname);
        manager.setEmail(email);
        manager.setPhoneNo(phoneNum);
        manager.setAddress(address);
        
        try {
                String filePath = "database\\buildingManager.txt";
                
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));
                bw.write(username+ ","+ password + ","+ empID + "," + fname + ","+ ic + "," + email + ","+ phoneNum+ "," + address + "," + position + ",\n");
                
                bw.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        return success;
    }
    
    public String showManagerStructure(String filePath){
        int count = 0;
        String i = null;

        File file = new File("database\\buildingManager.txt");
        try {
            try (java.util.Scanner sc = new Scanner(file)) {
                while(sc.hasNextLine()) {
                    sc.nextLine();
                    count++;
                }
            }
            i = String.valueOf(count);
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return i;
    }
    
    public String showAccountStructure(String filePath){
        int count = 0;
        String i = null;

        File file = new File("database\\accountExecutive.txt");
        try {
            try (java.util.Scanner sc = new Scanner(file)) {
                while(sc.hasNextLine()) {
                    sc.nextLine();
                    count++;
                }
            }
            i = String.valueOf(count);
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return i;
    }
    
    public String showAdminStructure(String filePath){
        int count = 0;
        String i = null;

        File file = new File("database\\adminExecutive.txt");
        try {
            try (java.util.Scanner sc = new Scanner(file)) {
                while(sc.hasNextLine()) {
                    sc.nextLine();
                    count++;
                }
            }
            i = String.valueOf(count);
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return i;
    }
    
    public String showBuildingExeStructure(String filePath){
        int count = 0;
        String i = null;

        File file = new File("database\\buildingExecutive.txt");
        try {
            try (java.util.Scanner sc = new Scanner(file)) {
                while(sc.hasNextLine()) {
                    sc.nextLine();
                    count++;
                }
            }
            i = String.valueOf(count);
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return i;
    }
    
    public boolean deleteManager(String username) {
        boolean success = false;
        
        String filePath = "database\\buildingManager.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\buildingManagerTemp.txt");

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
          
            String temp = "database\\buildingManagerTemp.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
    
    public boolean deleteAccountExe(String username) {
        boolean success = false;
        
        String filePath = "database\\accountExecutive.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\accountExecutiveTemp.txt");

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
          
            String temp = "database\\accountExecutiveTemp.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
    
    public boolean deleteAdminExe(String username) {
        boolean success = false;
        
        String filePath = "database\\adminExecutive.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\adminExecutiveTemp.txt");

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
          
            String temp = "database\\adminExecutiveTemp.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
    
    
    public boolean deleteBuildingExe(String username) {
        boolean success = false;
        
        String filePath = "database\\buildingExecutive.txt";
        File file = new File(filePath);
        File tempFile = new File("database\\buildingExecutiveTemp.txt");

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
          
            String temp = "database\\buildingExecutiveTemp.txt";
            File f = new File(temp);
            f.delete();

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
            success = false;
        }

        return success;
    }
    
    public DefaultTableModel searchTeam(String name, String empID, String filePath){
        String[] columnNames = {"Username","Password", "EmpID", "Name", "IC", "Email", "Phone No", "Address", "Position"};
        DefaultTableModel searchResultTable = new DefaultTableModel(columnNames, 0); 
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                Object [] info = currentLine.split(",");
                if ((name == null || info[3].equals(name)) 
                        && (empID == null) || info[2].equals(empID)){
                    String[] dataArray = {info[0].toString(),
                                      info[1].toString(),
                                      info[2].toString(),
                                      info[3].toString(),
                                      info[4].toString(),
                                      info[5].toString(),
                                      info[6].toString(),
                                      info[7].toString(),
                                      info[8].toString()};
                    searchResultTable.addRow(dataArray);
                } 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResultTable;
    }
}
