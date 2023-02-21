/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.LoginMgmt;
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
    
    public void logout(){
        int confirmLogout = JOptionPane.showConfirmDialog(null, 
                "Are you sure want to log out?", "Logout", 
                JOptionPane.YES_NO_OPTION);
        if(confirmLogout == JOptionPane.YES_OPTION){
            this.isLoggedIn = false;
            JOptionPane.showMessageDialog(null, "You have been logged out.", 
                    "Logout", JOptionPane.INFORMATION_MESSAGE);
            // ALERT!!! Change to general menu page later
            new LoginMgmt().setVisible(true);
        }
    }
    
    public boolean isLoggedIn(){
        return this.isLoggedIn();
    }
}
