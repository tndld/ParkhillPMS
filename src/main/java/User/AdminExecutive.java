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
public class AdminExecutive extends User {
    
    private String filePath = "database//residentTeant.txt";
    
    public AdminExecutive(String username, String password) {
        super(username, password);
    }
    
    public void adminMenu(){
        System.out.println("Admin Page");
    }
    
    public void addResident(Resident res) {
        
        try {
                FileWriter myWriter = new FileWriter(filePath, true); //open the file
                myWriter.write(res.getFullName()+ ","+ res.getPassword()+ ","+ res.getEmail()+ ","+res.getPhoneNo()+ ","+res.getUnitNo()+ ",");
                myWriter.close();
                
            } catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                
            }
    }
    
    public void updateResident(String username, Resident newResident){
        try {
            File inputFile = new File(filePath);
            File tempFile = new File("database//residentTemp.txt");
            
            String currentLine;
            
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            while((currentLine = reader.readLine()) != null) {
                String[] residentInfo = currentLine.split(",");
                if(residentInfo[0].equals(username)){
                    String pass = residentInfo[1];
                    writer.write(newResident.getUsername()+ "," + pass + "," + newResident.getFullName() + "," + newResident.getEmail()+ "," + newResident.getPhoneNo() + "," + newResident.getUnitNo()+ ",");
                } else {
                    writer.write(currentLine + "\n");
                }
            }
            writer.close();
            reader.close();
            
            inputFile.delete();
            tempFile.renameTo(inputFile);
            
        }catch (IOException e) {
                System.out.println("Exception Occurred" + e);
                
            }
    }
}
