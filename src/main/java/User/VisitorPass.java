/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author user
 */
public class VisitorPass {
    
    private Resident user;
    private String type;
    private String visitorName;
    private String visitorIC;
    private String visitorCarPlate;
    private LocalDate date;
    private String duration;
    private LocalDateTime dateTimeApplied;
    
    public VisitorPass(Resident user){
        type = "";
        visitorName = "";
        visitorIC = "";
        visitorCarPlate = "";
        date = LocalDate.now();
        duration = "";
        dateTimeApplied = LocalDateTime.now();
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
    
    public void setDate (LocalDate date){
        this.date = date;
    }
    
    public void setDuration (String duration){
        this.duration = duration;
    }
    
    public Resident getUser() {
        return this.user;
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
    
    public LocalDate getDate() {
        return this.date;
    }
    
    public String getDuration() {
        return this.duration;
    }
    
    public LocalDateTime getAppliedDate() {
        return this.dateTimeApplied;
    }
}
