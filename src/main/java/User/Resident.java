/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author Asus
 */
public class Resident extends User {
    
    private String fullName;
    private String email;
    private String phoneNo;
    private String unitNo;
    
    public Resident(String username, String password) {
        super(username, password);
        fullName="";
        email="";
        phoneNo="";
        unitNo="";
    }
    
    public void setFullName(String fname){
        this.fullName = fname;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNo(String phone){
        this.phoneNo = phone;
    }
    
    public void setUnitNo(String unit) {
        this.unitNo = unit;
    }
    
    public String getFullName(){
        return this.fullName;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    public String getUnitNo(){
        return this.unitNo;
    }
    
}
