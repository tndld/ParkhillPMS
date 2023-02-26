/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Interface.BuildingExeHomepage;

/**
 *
 * @author Asus
 */
public class BuildingExecutive extends User {
    
    public BuildingExecutive(String username, String password) {
        super(username, password);
    }
    
    public void buildingExeMenu(){
        new BuildingExeHomepage().setVisible(true);
    }
}
