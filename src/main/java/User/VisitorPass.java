/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

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
    private LocalDateTime dateTimeApplied;
    private String ref;
    
    public VisitorPass(Resident user){
        resName = "";
        resPhone = "";
        resUnit = "";
        type = "";
        visitorName = "";
        visitorIC = "";
        visitorCarPlate = "";
        inDate = "";
        outDate = "";
        duration = "";
        dateTimeApplied = LocalDateTime.now();
        ref = "";
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
    
    public LocalDateTime getAppliedDate() {
        return this.dateTimeApplied;
    }
    
    public String getRef() {
        return this.ref;
    }
    
    public boolean addVisitorPass(Resident res, String name, String ic, String cp, String date, String hr) {
        
//        Assign into constructor
        VisitorPass vp = new VisitorPass(res);
        vp.resName = res.getFullName();
        vp.resPhone = res.getPhoneNo();
        vp.resUnit = res.getUnitNo();
        vp.type = "Visitor";
        vp.visitorName = name;
        vp.visitorIC = ic;
        vp.visitorCarPlate = cp;
        vp.inDate = date;
        vp.outDate = date;
        vp.duration = hr + " hour(s)";
        vp.dateTimeApplied = LocalDateTime.now();
        
//        Write into text file
        String filePath = "database\\visitorPass.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(vp.type + "," + vp.resUnit + "," + vp.resName + "," + 
                    vp.resPhone + "," + vp.visitorName + "," + vp.visitorIC 
                    + "," + vp.visitorCarPlate + "," + vp.inDate + "," + 
                    vp.outDate + "," + vp.duration + "," + vp.dateTimeApplied + ",");
            bw.close();
            return true;
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
            return false;
        }
    }
    
    public void setReferenceNum(Resident res, String unit, String date){
        VisitorPass vp = new VisitorPass(res);
        String filePath = "database\\visitorPass.txt";
        try {
            BufferedReader br = new BufferedReader (new FileReader(filePath));
            String line;
            int i = 0;
            
//            Check the records of the unit on that day
            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");
                if (record[1].equals(unit) && record[7].equals(date)){
                    i+=1;
                }
            }
            
//            Generate Reference Number
            String refNo = res.username + vp.dateTimeApplied + Integer.toString(i);
//            Append into text file
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(refNo + "\n");
            
            br.close();
            bw.close();
            
//            Assign into constructor
            vp.ref = refNo;
            
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
        }
    }
    
    public boolean addOvernightPass(Resident res, String name, String ic, 
            String cp, String inDate, String outDate) {
        
//        Assign into constructor
        VisitorPass vp = new VisitorPass(res);
        vp.resName = res.getFullName();
        vp.resPhone = res.getPhoneNo();
        vp.resUnit = res.getUnitNo();
        vp.type = "Overnight";
        vp.visitorName = name;
        vp.visitorIC = ic;
        vp.visitorCarPlate = cp;
        vp.inDate = inDate;
        vp.outDate = outDate;
        String[] date1 = inDate.split(" ");
        String[] date2 = outDate.split(" ");
        int dur = Integer.parseInt(date2[0]) - Integer.parseInt(date1[0]);
        vp.duration = Integer.toString(dur) + " day(s)";
        vp.dateTimeApplied = LocalDateTime.now();
        
//        Write into text file
        String filePath = "database\\visitorPass.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(vp.type + "," + vp.resUnit + "," + vp.resName + "," + 
                    vp.resPhone + "," + vp.visitorName + "," + vp.visitorIC 
                    + "," + vp.visitorCarPlate + "," + vp.inDate + "," + 
                    vp.outDate + "," + vp.duration + "," + vp.dateTimeApplied + ",");
            bw.close();
            return true;
        } catch(IOException e){
            System.out.println("Exception Occurred" + e);
            return false;
        }
    }
}
