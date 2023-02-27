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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public abstract class MgmtLevelUser {
    protected String username;
    protected String password;
    private boolean isLoggedIn;
    
    public MgmtLevelUser(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.username;
    }
    
    public void changePassword(String uname, String currentPW, String newPW){
        this.password = newPW;
    }
    
    public boolean verifyPassword(String password){
        return this.password.equals(password);
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
             System.out.println("Exception Occurred" + e);
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
            
            new MainMenu().setVisible(true);
        }
    }
    
            public void logout2(String filename){
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
                 System.out.println("Exception Occurred" + e);
            }
            JOptionPane.showMessageDialog(null, "You have been logged out.", 
                    "Logout", JOptionPane.INFORMATION_MESSAGE);
            this.isLoggedIn = false;
    }
    
    public boolean isLoggedIn(){
        return this.isLoggedIn();
    }
    
    public abstract boolean addResident(String username, String password, String fname, String email, String phoneNum, String unitNo);
    
    public abstract boolean updateResident(String username, String pw, String fname, String email, String phoneNum, String unitNo);
    
    public abstract DefaultTableModel searchResultTable(String username, String unitNo);
}
