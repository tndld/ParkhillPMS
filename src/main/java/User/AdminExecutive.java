/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author Asus
 */
public class AdminExecutive extends User {
    
    public AdminExecutive(String username, String password) {
        super(username, password);
    }
    
    public void adminMenu(){
        System.out.println("Admin Page");
    }
}
