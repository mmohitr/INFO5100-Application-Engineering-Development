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
public class DoctorDirectory {
    private ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory(){
        this.doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor(); 
        doctorDirectory.add(newDoctor);
        return newDoctor;
    }
    
    public Boolean validateLogin(String email, String password){
        Boolean isValid = false;
        for(Doctor d: doctorDirectory){
            if((d.getEmailId().equalsIgnoreCase(email)) && d.getPassword().equals(password)){
                isValid = true;
            }
        }
        return isValid;
    }
    
    public ArrayList<Doctor> getSearchResults(String searchTerm){
        ArrayList<Doctor> searchResults = new ArrayList<Doctor>();
        for(Doctor d: doctorDirectory){
            if(d.getArea() == null ? searchTerm == null : d.getArea().equalsIgnoreCase(searchTerm)){
                searchResults.add(d);
            }
        }
        return searchResults;
    }
    
    public Doctor getDoctor(String emailId, String password){
        for(Doctor d: doctorDirectory){
            if(d.getEmailId().equalsIgnoreCase(emailId) && d.getPassword().equals(password)){
                return d;
            }
        }
        return null;
    }
    
    public Boolean getDoctor(String name){
        for(Doctor d: doctorDirectory){
            if(d.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public void deleteDoctor(Doctor d){
        doctorDirectory.remove(d);
    }
    
    public Boolean isUniqueEmail(String emailId){
        for(Doctor d: doctorDirectory){
            if(d.getEmailId().equalsIgnoreCase(emailId)){
                return false;
            }
        }
        return true;
    }
}
