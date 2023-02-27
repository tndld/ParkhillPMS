/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author Asus
 */
public abstract class TeamManagement {
    
    public abstract boolean updateAdminTeam(String username, String password, String empID, String fname, String IC, String email, String phoneNum, String address, String position);
    public abstract boolean updateAccountTeam(String username, String password, String empID, String fname, String IC, String email, String phoneNum, String address, String position);
    public abstract boolean updateBuildingExeTeam(String username, String password, String empID, String fname, String IC, String email, String phoneNum, String address, String position);
}
