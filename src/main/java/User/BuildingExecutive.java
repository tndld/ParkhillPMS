/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.AccountExeHomepage;
import Interface.BuildingExeHomepage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class BuildingExecutive extends User {
    private String empID;
    private String name;
    private String ic;
    private String email;
    private String phoneNo;
    private String address;
    private String position;
    
    public BuildingExecutive(String username, String password) {
        super(username, password);
        
        //        Read from Resident text file to get user's details
        String filePath = "database\\buildingExecutive.txt";
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                String[] buildingInfo = line.split(",");
//                Assign details into constructor
                if (buildingInfo[0].equals(username)){
                    this.empID = buildingInfo[2];
                    this.name = buildingInfo[3];
                    this.ic = buildingInfo[4];
                    this.email = buildingInfo[5];
                    this.phoneNo = buildingInfo[6];
                    this.address =  buildingInfo[7];
                    this.position = buildingInfo[8];
                }
            }
                    
            br.close();
            fr.close();
            
        } catch(IOException e){
            System.out.println("Input/Output Exception : " + e);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    public void buildingExeMenu(){
        new BuildingExeHomepage().setVisible(true);
    }
    
    public void accountExeMenu(){
        new AccountExeHomepage().setVisible(true);
    }
    
    public String getUsername(){
        return super.username;
    }
    
    public String getpassword(){
        return super.password;
    }
    
    public String getEmpID(){
        return this.empID;
    }
    
    public String getname(){
        return this.name;
    }
    
    public String getIc(){
        return this.ic;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    public String getAddress(){
        return this.address;
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
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
    
    public void setNewUsername(String username){
        this.username = username;
    }
    
    public void setNewPass(String password){
        this.password = password;
    }
}
