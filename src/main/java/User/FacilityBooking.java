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
public class FacilityBooking {
    private String name;
    private String contact;
    private String unitNumber;
    private String date;
    private String time;
    private int id;
    
    public FacilityBooking() {
        name = "";
        contact = "";
        unitNumber = "";
        date = "";
        time = "";
        id = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public void setId(int id){
        this.id = id;
        
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getContact() {
        return this.contact;
    }
    
    public String getUnitNumber() {
        return this.unitNumber;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public String getTime() {
        return this.time;
    }
    
    public boolean addBooking(int id, String name, String contact, String unitNumber, String date, String time, String filePath){
        setId(id);
        setName(name);
        setContact(contact);
        setUnitNumber(unitNumber);
        setDate(date);
        setTime(time);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null ) {
                String[] dataRow = line.split(";");
                if (dataRow[3].equals(getDate())  && dataRow[4].equals(getTime())) {
                    br.close();
                    return false;
                }
                if (dataRow[0].equals(getId())){
                    br.close();
                    return false;
                }
            }
            
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(getId() + ";" + getName() + ";" + getContact() + ";" + getUnitNumber() + ";" + getDate() + ";" + getTime() + "\n");
            bw.close();
            return true;   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FacilityBooking.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(FacilityBooking.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean deleteBooking(int id, String filePath){
        setId(id);
        boolean foundVariable = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(";");
//                if (!(dataRow[0].equals(getName()) && (dataRow[3].equals(getDate()) && (dataRow[4].equals(getTime()))))) {
                if(!dataRow[0].equals(String.valueOf(getId()))) {
                    sb.append(line).append("\n");
                } else {
                    foundVariable = true;
                }
            }
            br.close();

            if (foundVariable) {
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
    
    public boolean editBooking(int id, String name, String contact, String unitNumber, String date, String time, String filePath) {
        setId(id);
        boolean foundVariable = false;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(";");
                if (dataRow[0].equals(String.valueOf(getId()))) {
                    setName(name);
                    setContact(contact);
                    setUnitNumber(unitNumber);
                    setTime(time);
                    setDate(date);
                    line = dataRow[0] + ";" + getName() + ";" + getContact() + ";" + getUnitNumber() + ";" + getDate() + ";" + getTime();
                    foundVariable = true;
                }
                sb.append(line).append("\n");
            }
            br.close();

            if (foundVariable) {
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
                String[] dataRow = line.split(";");
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
