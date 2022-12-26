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
public class CityDirectory {
    private ArrayList<City> cityDirectory;
    
    public CityDirectory(){
        this.cityDirectory = new ArrayList<City>();
    }

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    
    public City addNewCity(){
        City newCity = new City(); 
        cityDirectory.add(newCity);
        return newCity;
    }
    
    public void deleteCity(City c){
        cityDirectory.remove(c);
    }
    
    public Boolean isACity(String name){
        for(City c: cityDirectory){
            if(c.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
