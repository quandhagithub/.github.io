/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.SongDAO;
import DAO.UserDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Song;
import model.User;

/**
 *
 * @author Inpiron
 */
public class SearchActionSupport extends ActionSupport {
    
    public SearchActionSupport() {
    }
    private String songTitle;
    private String username;
    private List<Song> dss = new ArrayList<>();
    private List<Song> dssf = new ArrayList<>();

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public List<Song> getDss() {
        return dss;
    }

    public void setDss(List<Song> dss) {
        this.dss = dss;
    } 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Song> getDssf() {
        return dssf;
    }

    public void setDssf(List<Song> dssf) {
        this.dssf = dssf;
    }
    
    
    
    public String execute() throws Exception {
        SongDAO sd = new SongDAO();
        songTitle = getSongTitle();
        username = getUsername();
        dss = sd.getListSearch(songTitle);
        dssf = sd.ListSongOfFavouriteOfSearch(songTitle,username);
        System.out.println("ohohoho: "+dssf.size()+songTitle+" "+username);
        return "success";
    }

}
