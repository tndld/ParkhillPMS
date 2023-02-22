/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.LoginMgmt;
import Interface.MainMenu;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class User {
    private String username;
    private String password;
    private boolean isLoggedIn;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return username;
    }
    
    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }
    
    //add
    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
        this.isLoggedIn = true;
        return true;
    }else {
            return false;
        }
    }
    
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
            e.printStackTrace();
        }
        return false;
    }
    
    
    // log out function for management level account
    public void logout(){
        int confirmLogout = JOptionPane.showConfirmDialog(null, 
                "Are you sure want to log out?", "Logout", 
                JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            this.isLoggedIn = false;
            
            JOptionPane.showMessageDialog(null, "You have been logged out.", 
                    "Logout", JOptionPane.INFORMATION_MESSAGE);
            
            new LoginMgmt().setVisible(true);
        }
    }
        
        // log out function for residents, tenants, and guardss
        public void logout2(String filename){
        int confirmLogout = JOptionPane.showConfirmDialog(null, 
                "Are you sure want to log out?", "Logout", 
                JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            this.isLoggedIn = false;
            try {
                 // Open the file in write mode with "truncate" option to delete its content
                FileWriter fw = new FileWriter(filename, false);
                PrintWriter pw = new PrintWriter(fw, false);
                
                // Write an empty string to the file to clear its content
                pw.flush();
                
                // Close the writers to release resources
                pw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "You have been logged out.", 
                    "Logout", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public boolean isLoggedIn(){
        return this.isLoggedIn();
    }
}
