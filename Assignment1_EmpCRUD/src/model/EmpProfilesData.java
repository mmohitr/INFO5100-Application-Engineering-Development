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
public class EmpProfilesData {
    private ArrayList<EmpProfile> data;
    
    public EmpProfilesData(){
        this.data = new ArrayList<EmpProfile>();
    }

    public ArrayList<EmpProfile> getData() {
        return data;
    }

    public void setData(ArrayList<EmpProfile> data) {
        this.data = data;
    }
    
    public EmpProfile addNewProfile(){
        EmpProfile newProfile = new EmpProfile(); 
        data.add(newProfile); 
        return newProfile;
    }
    
    public void deleteEmpProfile (EmpProfile ep){
        data.remove(ep);
    }
    
    public ArrayList<EmpProfile> getSearchResults(String searchTerm){
        ArrayList<EmpProfile> res = new ArrayList<EmpProfile>();
        for(EmpProfile ep : data){
            if(ep.getName().contains(searchTerm) ||
               ep.getEmpId().contains(searchTerm) ||
               ep.getPositionTitle().contains(searchTerm)) 
            {
                res.add(ep);
            }
        }
        return res;
    }
}
