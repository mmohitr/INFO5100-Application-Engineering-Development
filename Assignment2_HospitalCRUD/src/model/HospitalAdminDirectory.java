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
public class HospitalAdminDirectory {
    private ArrayList<HospitalAdmin> hospitalAdminDirectory;
    
    public HospitalAdminDirectory(){
        this.hospitalAdminDirectory = new ArrayList<HospitalAdmin>();
    }

    public ArrayList<HospitalAdmin> getHospitalAdminDirectory() {
        return hospitalAdminDirectory;
    }

    public void setHospitalAdminDirectory(ArrayList<HospitalAdmin> hospitalAdminDirectory) {
        this.hospitalAdminDirectory = hospitalAdminDirectory;
    }
    
    public HospitalAdmin addNewHospitalAdmin(){
        HospitalAdmin newHospitalAdmin = new HospitalAdmin(); 
        hospitalAdminDirectory.add(newHospitalAdmin);
        return newHospitalAdmin;
    }
    
    public HospitalAdmin getHospitalAdmin(String emailId, String password){
        for(HospitalAdmin ha: hospitalAdminDirectory){
            if(ha.getEmailId().equalsIgnoreCase(emailId) && ha.getPassword().equals(password)){
                return ha;
            }
        }
        return null;
    }
    
    public Boolean validateLogin(String email, String password){
        Boolean isValid = false;
        for(HospitalAdmin ha: hospitalAdminDirectory){
            if((ha.getEmailId().equalsIgnoreCase(email)) && ha.getPassword().equals(password)){
                isValid = true;
            }
        }
        return isValid;
    }
}
