/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.MainMenu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class User extends UserCommon{
    protected String username;
    protected String password;
    protected boolean isLoggedIn;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    @Override
    public String getUsername(){
        return this.username;
    }
    
    @Override
    public String getPassword(){
        return this.username;
    }
    
    @Override
    public void changePassword(String uname, String currentPW, String newPW){
        this.password = newPW;
    }
    
    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }
    
    @Override
    public boolean login2(String username, String pasword, String filename){
        try{
            
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                String[] residentInfo = line.split(",");
                if (residentInfo[0].equals(username) && residentInfo[1].equals(password)){
                    this.isLoggedIn = true;
                    return true;
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
             System.out.println("Exception Occurred" + e);
        }
        return false;
    }
        
    public void logout2(String filename, String file2){
        try {
            // Open the file in write mode with "truncate" option to delete its content
            FileWriter fw = new FileWriter(filename, false);
            PrintWriter pw = new PrintWriter(fw, false);
                
            FileWriter fw2 = new FileWriter(file2, false);
            PrintWriter pw2 = new PrintWriter(fw2, false);
                
            // Write an empty string to the file to clear its content
            pw.flush();
            pw2.flush();
                
            // Close the writers to release resources
            pw.close();
            fw.close();
                
            pw2.close();
            fw2.close();
                
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
     }
    
    public void logout(String filename){
        try {
            // Open the file in write mode with "truncate" option to delete its content
            FileWriter fw = new FileWriter(filename, false);
            PrintWriter pw = new PrintWriter(fw, false);
                
            // Close the writers to release resources
            pw.close();
            fw.close();
                
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
     }
    
    public boolean isLoggedIn(){
        return this.isLoggedIn();
    }
    
}
