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
public class HouseDirectory {
    private ArrayList<House> houseDirectory;
    
    public HouseDirectory(){
        this.houseDirectory = new ArrayList<House>();
    }

    public ArrayList<House> getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(ArrayList<House> houseDirectory) {
        this.houseDirectory = houseDirectory;
    }
    
    public House addNewHouse(){
        House newHouse = new House(); 
        houseDirectory.add(newHouse);
        return newHouse;
    }
}
