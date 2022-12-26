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
public class CommunityDirectory {
    private ArrayList<Community> communityDirectory;
    
    public CommunityDirectory(){
        this.communityDirectory = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }
    
    public Community addNewCommunity(String name){
        Community newCommunity = new Community(); 
        communityDirectory.add(newCommunity);
        return newCommunity;
    }
    
    public Boolean isACommunity(String name){
        for(Community c: communityDirectory){
            if(c.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
