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
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory(){
        this.encounterHistory = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter(); 
        encounterHistory.add(newEncounter);
        return newEncounter;
    }
    
    public ArrayList<Encounter> getEncounter(String docName){
        ArrayList<Encounter> res = new ArrayList<Encounter>();
        for(Encounter e: encounterHistory){
            if(e.getDoctorName().equalsIgnoreCase(docName)){
                res.add(e);
            }
        }
        return res;
    }
    
    public ArrayList<Encounter> getEncounter(String docName, String patName){
        ArrayList<Encounter> res = new ArrayList<Encounter>();
        for(Encounter e: encounterHistory){
            if(e.getDoctorName().equalsIgnoreCase(docName) && e.getPatientName().equalsIgnoreCase(patName)){
                res.add(e);
            }
        }
        return res;
    }
    
    public void deleteEncounter(Encounter e){
        encounterHistory.remove(e);
    }
}
