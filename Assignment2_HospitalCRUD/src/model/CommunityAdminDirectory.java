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
public class CommunityAdminDirectory {
    private ArrayList<CommunityAdmin> communityAdminDirectory;
    
    public CommunityAdminDirectory(){
        this.communityAdminDirectory = new ArrayList<CommunityAdmin>();
    }

    public ArrayList<CommunityAdmin> getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(ArrayList<CommunityAdmin> communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }
    
    public CommunityAdmin addNewCommunityAdmin(){
        CommunityAdmin newCommunityAdmin = new CommunityAdmin(); 
        communityAdminDirectory.add(newCommunityAdmin);
        return newCommunityAdmin;
    }
    
    public Boolean validateLogin(String email, String password){
        Boolean isValid = false;
        for(CommunityAdmin ca: communityAdminDirectory){
            if((ca.getEmailId().equalsIgnoreCase(email)) && ca.getPassword().equals(password)){
                isValid = true;
            }
        }
        return isValid;
    }
    
    public CommunityAdmin getCommunityAdmin(String emailId, String password){
        for(CommunityAdmin ca: communityAdminDirectory){
            if(ca.getEmailId().equalsIgnoreCase(emailId) && ca.getPassword().equals(password)){
                return ca;
            }
        }
        return null;
    }
}
