/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mohit
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsHistory;

    public VitalSignsHistory(){
        this.vitalSignsHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addNewVitalSigns(){
        VitalSigns newVitalSigns = new VitalSigns(); 
        vitalSignsHistory.add(newVitalSigns);
        return newVitalSigns;
    }
    
    public VitalSigns getVitalSigns(Date date){
        for(VitalSigns v: vitalSignsHistory){
            if(v.getDate().toString().substring(0, 10).equals(date) || v.getDate().equals(date)){
                return v;
            }
        }
        return null;
    }
    
        public VitalSigns getVitalSigns(Date date, String name){
        for(VitalSigns v: vitalSignsHistory){
            if((v.getDate().toString().substring(0, 10).equals(date) || v.getDate().equals(date)) && v.getPatientName().equals(name)){
                return v;
            }
        }
        return null;
    }
}
