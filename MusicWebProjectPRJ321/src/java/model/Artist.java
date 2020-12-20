/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Inpiron
 */
public class Artist {
    private String ID;
    private String name;
    private String country;

    public Artist(String ID, String name, String country) {
        this.ID = ID;
        this.name = name;
        this.country = country;
    }

    public Artist() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
      
}
