/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author user
 */
public abstract class UserCommon {
    public abstract String getUsername();
    public abstract String getPassword();
    public abstract void changePassword(String uname, String pw, String newPW);
    
    public abstract boolean login2(String username, String pasword, String filename);
}
