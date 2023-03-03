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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hoong
 */
public class AssignedTask {
    private int id;
    private String description;
    private String workerName;
    private String status;
    private String completeBy;
    private String filePath;
    
    public AssignedTask() {
        id = 0;
        description = "";
        workerName = "";
        status = "";
        completeBy = "";
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setDate(String date) {
        this.completeBy = date;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getWorkerName() {
        return this.workerName;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public String getDate() {
        return this.completeBy;
    }
    
  
    public void viewTask(int id, String description, String workerName, String status, String completeBy, String filePath) {
        setId(id);
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null ){
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(getId())) {
                setDescription(description);
                setWorkerName(workerName);
                setStatus(status);
                setDate(completeBy);
                }
            }   
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public boolean addTask(int id, String description, String workerName, String status, String completeBy, String filePath) {
        setId(id);
        setDescription(description);
        setWorkerName(workerName);
        setStatus(status);
        setDate(completeBy);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(getId())) {
                    br.close();
                    return false;
                }
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(getId() + ":" + getDescription() + ":" + getWorkerName() + ":" + getStatus() + ":" + getDate() + "\n");
            bw.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Facility.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean updateTask(int id, String description, String workerName, String status, String completeBy, String filePath) {
        setId(id);
        boolean foundId = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line ;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(String.valueOf(getId()))) {
                    setDescription(description);
                    setWorkerName(workerName);
                    setStatus(status);
                    setDate(completeBy);
                    line = (getId() + ":" + getDescription() + ":" + getWorkerName() + ":" + getStatus() + ":" + getDate());
                    foundId = true;
                }
                sb.append(line).append("\n");
            }
            br.close();

            if (foundId) {
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
            Logger.getLogger(Complain.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(Complain.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
    public boolean deleteTask(int id, String filePath) {
        setId(id);
        boolean foundId = false ;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(":");
                if (!dataRow[0].equals(String.valueOf(getId()))) {
                    sb.append(line).append("\n");
                } else {
                    foundId = true;
                }
            }
            br.close();

            if (foundId) {
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
    
    public void searchTable(String keyword, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(keyword));
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
