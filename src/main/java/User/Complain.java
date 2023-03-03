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

/**
 *
 * @author hoong
 */
public class Complain {
    private int id;
    private String residentName;
    private String contactNum;
    private String description;
    private String resolved;
    private String filePath;
    
    public Complain() {
        id = 0;
        residentName = "";
        description = "";
        resolved = "";
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }
    
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setResolved(String resolved) {
        this.resolved = resolved;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getResidentName() {
        return this.residentName;
    }
    
    public String getContactNum() {
        return this.contactNum;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getResolved() {
        return this.resolved;
    }
    
    public void viewComplain(int id, String residentName, String contactNum, String description, String resolved, String filePath) {
        setId(id);
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null ){
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(getId())) {
                setResidentName(residentName);
                setContactNum(contactNum);
                setDescription(description);
                setResolved(resolved);
                }
            }   
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public boolean addComplain(int id, String residentName, String contactNum, String description, String resolved, String filePath) {
        setId(id);
        setResidentName(residentName);
        setContactNum(contactNum);
        setDescription(description);
        setResolved(resolved);
        
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
            bw.write(getId() + ":" + getResidentName() + ":" + getContactNum() + ":" + getDescription() + ":" + getResolved() + "\n");
            bw.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Facility.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean updateComplain(int id, String residentName, String contactNum, String description, String resolved, String filePath) {
        setId(id);
        boolean foundId = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line ;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(":");
                if (dataRow[0].equals(String.valueOf(getId()))) {
                    setResidentName(residentName);
                    setContactNum(contactNum);
                    setDescription(description);
                    setResolved(resolved);
                    line = (getId() + ":" + getResidentName() + ":" + getContactNum() + ":" + getDescription() + ":" + getResolved());
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
        
    public boolean deleteComplain(int id, String filePath) {
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
}
