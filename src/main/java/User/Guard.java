/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.ViewVisitorEntry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Guard extends User{
    
    private String checkpoint;
    private String type;
    private String timeStart;
    private String timeEnd;
    private String status;
    private String username;
    private String password;
    
    public Guard(String username, String password) {
        super(username, password);
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getCheckpoint(){
        return this.checkpoint;
    }
    
    
    public String getType(){
        return this.type;
    }
    
    public String gettimeStart(){
        return this.timeStart;
    }
    
    public String gettimeEnd(){
        return this.timeStart;
    }
    
    public String getstatus(){
        return this.status;
    }
    
    public void setCheckpoint(String checkpoint){
        this.checkpoint = checkpoint;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setTimeStart(String timeStart){
        this.timeStart = timeStart;
    }
    
    public void setTimeEnd(String timeEnd){
        this.timeEnd = timeEnd;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setNewPass(String password){
        this.password = password;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public boolean checkpoint(String checkpoint, String type, String timeStart, String timeEnd, String status){
        PatrollingSchedule ps = new PatrollingSchedule(checkpoint);
        
        boolean success = true;
    
//        update cons
        ps.setCheckpoint(checkpoint);
        ps.setType(type);
        ps.setTimeStart(timeStart);
        ps.setTimeEnd(timeEnd);
        ps.setStatus(status);
        
        try {
            String filePath = "database\\patrollingSchedule.txt";
            File inputFile = new File("database\\patrollingSchedule.txt");
            File tempFile = new File("database\\patrollingScheduleTemp.txt");
            
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) {
                String[] vendorInfo = currentLine.split(";");
                if(vendorInfo[0].equals(checkpoint)){
                    // use the existing password
                    String pass = vendorInfo[1];
                    writer.write(vendorInfo[0] + ";" + type + ";" + timeStart + ";" + timeEnd + ";" + status + ";\n");
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
          
            String temp = "database\\patrollingScheduleTemp.txt";
            File f = new File(temp);
            f.delete();
            
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                success = false;
            }
        
        return success;
    }
    
    public DefaultTableModel searchVisitorPass(String ref){
        String[] columnNames = {"Ref", "Type", "Unit No", "Resident Name", "Resident Phone", "Visitor Name", "Visitor IC", "Visitor Car Plate", "In Date", "Out Date","Duration"};
        DefaultTableModel searchResultTable = new DefaultTableModel(columnNames, 0); 
        
        String filePath = "database\\visitorPass.txt";
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                Object [] passInfo = currentLine.split(",");
                if (passInfo[10].equals(ref)){
                    String[] dataArray = {passInfo[10].toString(),
                                      passInfo[0].toString(),
                                      passInfo[1].toString(),
                                      passInfo[2].toString(),
                                      passInfo[3].toString(),
                                      passInfo[4].toString(),
                                      passInfo[5].toString(),
                                      passInfo[6].toString(),
                                      passInfo[7].toString(),
                                      passInfo[8].toString(),
                                      passInfo[9].toString()};
                    searchResultTable.addRow(dataArray);
                } 
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResultTable;
    }
    
    public boolean recordVisitorEntry(String ref, String inTime) {
        
        String filePath = "database\\visitorPass.txt";
        String recordFile = "database\\visitorEntryRecord.txt";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(recordFile,true));
            
            String line;
            while((line = br.readLine()) != null){
                String[] passInfo = line.split(",");
                if (passInfo[10].equals(ref)){
                    bw.write(passInfo[0] + "," + passInfo[1] + "," + 
                            passInfo[2] + "," + passInfo[3] + "," + passInfo[4] + "," 
                            + passInfo[5] + "," + passInfo[6] + "," + passInfo[7] + "," + 
                            passInfo[8] + "," + passInfo[9] + "," + passInfo[10] +"," + inTime + ",-,\n");
                }
            }
            
            br.close();
            bw.flush();
            bw.close();
            
            return true;
            
        } catch (IOException e){
            System.out.println("Input/Output Exception occur: " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Exception occur: " + e);
            return false;
        }
    }
    
    public boolean updateVisitorEntry(String ref, String outTime) {
        
        String filePath = "database\\visitorEntryRecord.txt";
        
        File tempFile = new File("database\\visitorEntryRecordTemp.txt");
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String currentLine;
            while((currentLine = br.readLine()) != null){
                String[] entryInfo = currentLine.split(",");
                if (entryInfo[10].equals(ref)){
                    writer.write(entryInfo[0] + "," + entryInfo[1] + "," + 
                            entryInfo[2] + "," + entryInfo[3] + "," + entryInfo[4] + "," 
                            + entryInfo[5] + "," + entryInfo[6] + "," + entryInfo[7] + "," + 
                            entryInfo[8] + "," + entryInfo[9] + "," + entryInfo[10] +"," + entryInfo[11] + "," + outTime + ",\n");
                } else {
                    writer.write(currentLine + "\n");
                }
            }
            
            br.close();
            writer.flush();
            writer.close();
            
            BufferedReader reader = new BufferedReader(new FileReader(tempFile));
            PrintWriter w = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));
            
            String line;
            // Read each line from the input file and write back to original file
            while((line = reader.readLine()) != null) {
                w.println(line);
                
            }
            // Close the input and output files
            reader.close();
            w.flush();
            w.close();
          
            String temp = "database\\visitorEntryRecordTemp.txt";
            File f = new File(temp);
            f.delete();
            
            return true;
            
        } catch (IOException e){
            System.out.println("Input/Output Exception occur: " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Exception occur: " + e);
            return false;
        }
    }
    
    public boolean checkVisitorEntryRecordExists(String ref){
        boolean usernameExists = false;
        
        String file = "database\\visitorEntryRecord.txt";

        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] entryInfo = line.split(",");
                if (entryInfo[10].equals(ref)) {
                    usernameExists = true;
                    break;
                }
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(ViewVisitorEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usernameExists;
    }
    
    public DefaultTableModel searchVisitorEntry(String ref){
        String[] columnNames = {"Reference", "Type", "Unit No", "Resident Name", "Resident Phone", "Visitor Name", "Visitor IC", "Visitor Car Plate", "In Date", "Out Date","Duration", "In Time", "Out Time"};
        DefaultTableModel searchResultTable = new DefaultTableModel(columnNames, 0); 
        
        String filePath = "database\\visitorEntryRecord.txt";
    
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                Object [] passInfo = currentLine.split(",");
                if (passInfo[10].equals(ref)){
                    String[] dataArray = {passInfo[10].toString(),
                                      passInfo[0].toString(),
                                      passInfo[1].toString(),
                                      passInfo[2].toString(),
                                      passInfo[3].toString(),
                                      passInfo[4].toString(),
                                      passInfo[5].toString(),
                                      passInfo[6].toString(),
                                      passInfo[7].toString(),
                                      passInfo[8].toString(),
                                      passInfo[9].toString(),
                                      passInfo[11].toString(),
                                      passInfo[12].toString()};
                    searchResultTable.addRow(dataArray);
                } 
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception occur: " + e);
        }
        return searchResultTable;
    }
    
}
