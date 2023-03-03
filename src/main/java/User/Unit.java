/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoong
 */
public class Unit {
    private String unitNum;
    private int squareFeet;
    private int numBedroom;
    private String ownerName;
    private String ownerContact;
    
    public Unit() {
        unitNum = "";
        squareFeet = 0;
        numBedroom = 0;
        ownerName = "";
        ownerContact= "";
    }
    
    public void setUnitNumber(String unitNumber) {
        this.unitNum = unitNumber;
    }
    
    public void setSquareFeet(int sqft) {
        this.squareFeet = sqft;
    }
    
    public void setNumBedroom(int numBed) {
        this.numBedroom = numBed;
    }
    
    public void setOwnerName(String owner){
        this.ownerName = owner;
    }
    
    public void setOwnerContact(String ownerNum) {
        this.ownerContact = ownerNum;
    }
    
    public String getUnitNumber() {
        return this.unitNum;
    }
    
    public int getSquareFeet() {
        return this.squareFeet;
    }
    
    public int getNumBedroom() {
        return this.numBedroom;
    }
    
    public  String getOwnerName(){
        return this.ownerName;
    }
    
    public String getOwnerContact() {
        return this.ownerContact;
    }
    
    public boolean addNewUnit(String unitNumber, int squareFeet, int numBedroom, String ownerName, String ownerContact, String filePath) {
        setUnitNumber(unitNumber);
        setSquareFeet(squareFeet);
        setNumBedroom(numBedroom);
        setOwnerName(ownerName);
        setOwnerContact(ownerContact);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line=br.readLine()) !=null) {
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(getUnitNumber())) {
                    br.close();
                    return false;
                }
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(getUnitNumber() + ":" + getSquareFeet() + ":" + getNumBedroom() + ":" + getOwnerName() + ":" + getOwnerContact() + "\n");
            bw.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean editUnit(String unitNumber, int squareFeet, int numBedroom, String ownerName, String ownerContact, String filePath){
        setUnitNumber(unitNumber);
        boolean foundUnitNumber = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null ){
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(getUnitNumber())) {
                    setNumBedroom(numBedroom);
                    setSquareFeet(squareFeet);
                    setOwnerName(ownerName);
                    setOwnerContact(ownerContact);
                    line = dataRow[0] + ":" + getSquareFeet() + ":" + getNumBedroom() + ":" + getOwnerName() + ":" + getOwnerContact();
                    foundUnitNumber = true;
                }
                sb.append(line).append("\n");
            }   
            br.close();
            if (foundUnitNumber) {
                try (FileWriter fw = new FileWriter(filePath)) {
                    fw.write(sb.toString());
                    return true;
                } catch (IOException ex) {
                    Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            } else {
                return false;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean deleteUnit(String unitNumber, String filePath) {
        setUnitNumber(unitNumber);
        boolean foundUnitNumber = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) !=null ) {
                String[] dataRow = line.split(":");
                if (!dataRow[0].equals(getUnitNumber())) {
                    sb.append(line).append("\n");
                } else {
                    foundUnitNumber = true;
                }
            }
            br.close();
            
            if (foundUnitNumber) {
                try (FileWriter fw = new FileWriter(filePath)) {
                    fw.write(sb.toString());
                    return true;
                } catch (IOException e) {
                    return false;
                }
            } else {
                return false;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Facility.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Facility.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void refreshTable(JTable table, DefaultTableModel model, String filePath) {
        // Remove all rows from the table model
        model.setRowCount(0);

        // Read the data from the text file and add it to the table model
        boolean firstRow = true;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(":");
                if (firstRow) {
                    // Add column names only if the model is empty
                    if (model.getRowCount() == 0) {
                        model.setColumnIdentifiers(dataRow);
                    }
                    firstRow = false;
                } else {
                    model.addRow(dataRow);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }

        // Notify the table that the data has changed
        model.fireTableDataChanged();
        table.repaint();
    }
}
