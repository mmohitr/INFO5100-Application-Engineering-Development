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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory(){
        this.hospitalDirectory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalArray) {
        this.hospitalDirectory = hospitalArray;
    }
    
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital(); 
        hospitalDirectory.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital h){
        hospitalDirectory.remove(h);
    }
}
