/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.AccountExeHomepage;

/**
 *
 * @author Asus
 */
public class AccountExecutive extends User {
    
    public AccountExecutive(String username, String password) {
        super(username, password);
    }
    
    public void accountExeMenu(){
        new AccountExeHomepage().setVisible(true);
    }
}
