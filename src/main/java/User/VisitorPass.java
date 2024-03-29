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
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class VisitorPass {
    
    private String resName;
    private String resPhone;
    private String resUnit;
    private String type;
    private String visitorName;
    private String visitorIC;
    private String visitorCarPlate;
    private String inDate;
    private String outDate;
    private String duration;
    private String ref;
    
    public VisitorPass(Resident user, String ref){
        
        String filePath = "database\\visitorPass.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] passInfo = line.split(",");
                if (passInfo[10].equals(ref)){
                    this.type = passInfo[0];
                    this.resUnit = passInfo[1];
                    this.resName = passInfo[2];
                    this.resPhone = passInfo[3];
                    this.visitorName = passInfo[4];
                    this.visitorIC = passInfo[5];
                    this.visitorCarPlate = passInfo[6];
                    this.inDate = passInfo[7];
                    this.outDate = passInfo[8];
                    this.duration = passInfo[9];
                    this.ref = passInfo[10];
                }
            }
            br.close();
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
        }
    }
    
    public VisitorPass(Resident res){
        this.resName = res.getFullName();
        this.resUnit = res.getUnitNo();
        this.resPhone = res.getPhoneNo();
        this.ref = res.username + LocalDateTime.now();
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setName (String name){
        this.visitorName = name;
    }
    
    public void setIC (String ic){
        this.visitorIC = ic;
    }
    
    public void setCarPlate (String cp){
        this.visitorCarPlate = cp;
    }
    
    public void setInDate (String date){
        this.inDate = date;
    }
    
    public void setOutDate (String date){
        this.outDate = date;
    }
    
    public void setDuration (String duration){
        this.duration = duration;
    }
    
    public String getResName() {
        return this.resName;
    }
    
    public String getResPhone() {
        return this.resPhone;
    }
    
    public String getResUnit() {
        return this.resUnit;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getVName() {
        return this.visitorName;
    }
    
    public String getVIC() {
        return this.visitorIC;
    }
    
    public String getCarPlate() {
        return this.visitorCarPlate;
    }
    
    public String getInDate() {
        return this.inDate;
    }
    
    public String getOutDate() {
        return this.outDate;
    }
    
    public String getDuration() {
        return this.duration;
    }
    
    public String getRef() {
        return this.ref;
    }
    
    public boolean addVisitorPass(Resident res, String name, String ic, 
            String cp, String date, String hr) {
        
//        Assign into constructor
        VisitorPass vp = new VisitorPass(res);
        vp.type = "Visitor";
        vp.visitorName = name;
        vp.visitorIC = ic;
        vp.visitorCarPlate = cp;
        vp.inDate = date;
        vp.outDate = date;
        vp.duration = hr + " hour(s)";
        
//        Write into text file
        String filePath = "database\\visitorPass.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(vp.type + "," + vp.resUnit + "," + vp.resName + "," + 
                    vp.resPhone + "," + vp.visitorName + "," + vp.visitorIC 
                    + "," + vp.visitorCarPlate + "," + vp.inDate + "," + 
                    vp.outDate + "," + vp.duration + "," + vp.ref + "\n");            
            bw.close();
            return true;
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
            return false;
        }
    }

    public boolean addOvernightPass(Resident res, String name, String ic, 
            String cp, String inDate, String outDate, String day) {
        
        VisitorPass vp = new VisitorPass(res);
        vp.type = "Overnight";
        vp.visitorName = name;
        vp.visitorIC = ic;
        vp.visitorCarPlate = cp;
        vp.inDate = inDate;
        vp.outDate = outDate;
        vp.duration = day + " day(s)";
        
        String filePath = "database\\visitorPass.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(vp.type + "," + vp.resUnit + "," + vp.resName + "," + 
                    vp.resPhone + "," + vp.visitorName + "," + vp.visitorIC 
                    + "," + vp.visitorCarPlate + "," + vp.inDate + "," + 
                    vp.outDate + "," + vp.duration + "," + vp.ref + "\n");
            bw.close();
            return true;
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
            return false;
        }
    }
    
    public void viewActiveResVisitorPass(String fname){
        
        String readFile = "database\\visitorPass.txt";
        String writeFile = "database\\activeResidentVisitorPass.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(readFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));
            bw.write("Reference No:Type:Date:Estimate Duration:Visitor Name:Visitor IC:Car Plate:\n");
            String line;
            while ((line = br.readLine()) != null) {
                String[] passInfo = line.split(",");
                if (passInfo[2].equals(fname)){
                    bw.write(passInfo[10] + "," + passInfo[0] + "," + 
                            passInfo[7] + "," + passInfo[9] + "," + 
                            passInfo[4] + "," + passInfo[5] + "," + 
                            passInfo[6] + "\n");
                } 
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
    }
    
    public boolean editVisitorPass(String ref, String name, String ic, String car) {
        
        String filePath = "database\\visitorPass.txt";
        String tempFile = "database\\tempVisitorPass.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
            
            String line;
            while((line = br.readLine()) != null){
                String[] passInfo = line.split(",");
                if (!passInfo[10].equals(ref)){
                    pw.println(line);
                } else {
                    pw.println(passInfo[0] + "," + passInfo[1] + "," + 
                            passInfo[2] + "," + passInfo[3] + "," + name + "," 
                            + ic + "," + car + "," + passInfo[7] + "," + 
                            passInfo[8] + "," + passInfo[9] + "," + passInfo[10]);
                }
            }
            
            br.close();
            pw.flush();
            pw.close();
            
            new File(filePath).delete();
            File dump = new File(filePath);
            new File(tempFile).renameTo(dump);
            return true;
            
        } catch (IOException e){
            System.out.println("Input/Output Exception occur: " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Exception occur: " + e);
            return false;
        }
    }
    
    public boolean deleteVisitorPass(String ref){
        
        String filePath = "database\\visitorPass.txt";
        String tempFile = "database\\tempVisitorPass.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(tempFile)));
            
            String line;
            while ((line = br.readLine()) != null){
                String[] passInfo = line.split(",");
                if (!passInfo[10].equals(ref)) pw.println(line);
            }
            pw.flush();
            pw.close();
            br.close();
            
            new File(filePath).delete();
            File dump = new File(filePath);
            new File(tempFile).renameTo(dump);
            
            return true;
            
        } catch (IOException e){
            System.out.println("Input/Output Exception occur: " + e);
            return false;
        } catch (Exception e) {
            System.out.println("Exception occur: " + e);
            return false;
        }
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
}