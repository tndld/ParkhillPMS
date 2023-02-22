/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class TeamManagement {
    protected List<TeamMember> teamMembers;
    protected DefaultTableModel tableModel;
    protected JTable teamTable;
    protected JLabel nameLabel;
    protected JLabel emailLabel;
    protected JLabel positionLabel;
    protected JTextField nameField;
    protected JTextField emailField;
    protected JTextField positionField;

    public TeamManagement(JTable teamTable, JLabel nameLabel, JLabel emailLabel, JLabel positionLabel, JTextField nameField, JTextField emailField, JTextField positionField) {
        this.teamTable = teamTable;
        this.nameLabel = nameLabel;
        this.emailLabel = emailLabel;
        this.positionLabel = positionLabel;
        this.nameField = nameField;
        this.emailField = emailField;
        this.positionField = positionField;

        teamMembers = new ArrayList<>();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Email");
        tableModel.addColumn("Position");
        teamTable.setModel(tableModel);
        teamTable.getSelectionModel().addListSelectionListener(e -> updateFields());
}
