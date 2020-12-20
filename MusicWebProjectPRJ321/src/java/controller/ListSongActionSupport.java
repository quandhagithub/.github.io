/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.SongDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import model.Song;

/**
 *
 * @author ADMIN
 */
public class ListSongActionSupport extends ActionSupport {

    public ListSongActionSupport() {
    }

    private String AlbumID=null;
    private String username=null;
    private Song s = new Song();
    private List<Song> dss = new ArrayList<>();
    private List<Song> dssf = new ArrayList<>();

    public List<Song> getDssf() {
        return dssf;
    }

    public void setDssf(List<Song> dssf) {
        this.dssf = dssf;
    }

    
    
    public String getAlbumID() {
        return AlbumID;
    }

    public void setAlbumID(String AlbumID) {
        this.AlbumID = AlbumID;
    }

    public Song getS() {
        return s;
    }

    public void setS(Song s) {
        this.s = s;
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
    

    public String execute() throws Exception {
        SongDAO sd = new SongDAO();
        dss = sd.select();
        dssf = sd.ListSongOfFavourite(username);
        return "success";
    }

    public String songOfAlbum() throws Exception {
        SongDAO sd = new SongDAO();
        AlbumID = getAlbumID();
        dss = sd.ListSongOfAlbum(AlbumID);
        dssf = sd.ListSongOfFavouriteOfAlbum(username,AlbumID);
        return "success";
    }
    
    public String songOfFavorite() throws Exception {
        SongDAO sd = new SongDAO();
        String username = getUsername();        
        dss = sd.ListSongOfFavourite(username);
        System.out.println("hoho:"+username+dss.size());
        return "success";
    }
}
