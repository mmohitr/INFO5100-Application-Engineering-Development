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
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient addNewPatient(){
        Patient newPatient = new Patient(); 
        patientDirectory.add(newPatient);
        return newPatient;
    }
    
    public Boolean validateLogin(String email, String password){
        Boolean isValid = false;
        for(Patient p: patientDirectory){
            if((p.getEmailId().equalsIgnoreCase(email)) && p.getPassword().equals(password)){
                isValid = true;
            }
        }
        return isValid;
    }
    
    public Patient getPatient(String emailId, String password){
        for(Patient p: patientDirectory){
            if(p.getEmailId().equalsIgnoreCase(emailId) && p.getPassword().equals(password)){
                return p;
            }
        }
        return null;
    }
    
    public Patient getPatient(String name){
        for(Patient p: patientDirectory){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    
    public void deletePatient(Patient p){
        patientDirectory.remove(p);
    }
    
    public Boolean isAPatient(String name){
        for(Patient p: patientDirectory){
            if(p.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public Boolean isUniqueEmail(String emailId){
        for(Patient p: patientDirectory){
            if(p.getEmailId().equalsIgnoreCase(emailId)){
                return false;
            }
        }
        return true;
    }
}
