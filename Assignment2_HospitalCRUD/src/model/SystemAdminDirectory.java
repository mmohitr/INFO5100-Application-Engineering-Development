/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mohit
 */
public class SystemAdminDirectory {
    private ArrayList<SystemAdmin> systemAdminDirectory;
    
    public SystemAdminDirectory(){
        this.systemAdminDirectory = new ArrayList<SystemAdmin>();
    }

    public ArrayList<SystemAdmin> getSystemAdminArray() {
        return systemAdminDirectory;
    }

    public void setSystemAdminArray(ArrayList<SystemAdmin> systemAdminArray) {
        this.systemAdminDirectory = systemAdminArray;
    }
    
    public SystemAdmin addNewSystemAdmin(){
        SystemAdmin newSystemAdmin = new SystemAdmin(); 
        systemAdminDirectory.add(newSystemAdmin);
        return newSystemAdmin;
    }
    
    public Boolean validateLogin(String email, String password){
        Boolean isValid = false;
        for(SystemAdmin sa: systemAdminDirectory){
            if((sa.getEmailId().equalsIgnoreCase(email)) && sa.getPassword().equals(password)){
                isValid = true;
            }
        }
        return isValid;
    }
    
    public SystemAdmin getSystemAdmin(String emailId, String password){
        for(SystemAdmin sa: systemAdminDirectory){
            if(sa.getEmailId().equalsIgnoreCase(emailId) && sa.getPassword().equals(password)){
                return sa;
            }
        }
        return null;
    }
}
