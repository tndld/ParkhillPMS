/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author Asus
 */
public class Employee {
    private String empID;
    private String name;
    private String ic;
    private String phoneNo;
    private String position;
    
    
    public String getEmpID(){
        return this.empID;
    }
    
    public String getname(){
        return this.name;
    }
    
    public String getIc(){
        return this.ic;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
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
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
}
