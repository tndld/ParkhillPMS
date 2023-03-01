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
    
}
