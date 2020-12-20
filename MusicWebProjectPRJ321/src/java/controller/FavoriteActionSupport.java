/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.FavoriteDAO;
import DAO.SongDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Song;

/**
 *
 * @author Inpiron
 */
public class FavoriteActionSupport extends ActionSupport {

    private String songTitle;
    private String songId, username,AlbumID;
    private final String SUCCESS = "success";
    private List<Song> dss = new ArrayList<>();
    private List<Song> dssf = new ArrayList<>();
    private boolean result;

    public FavoriteActionSupport() {
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    
    
    public List<Song> getDssf() {
        return dssf;
    }

    public void setDssf(List<Song> dssf) {
        this.dssf = dssf;
    }

    
    
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    
    public List<Song> getDss() {
        return dss;
    }

    public void setDss(List<Song> dss) {
        this.dss = dss;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAlbumID() {
        return AlbumID;
    }

    public void setAlbumID(String AlbumID) {
        this.AlbumID = AlbumID;
    }
    
    

    public String execute() throws Exception {
        FavoriteDAO dao = new FavoriteDAO();
        SongDAO sdao = new SongDAO();
        dss = sdao.select();
        System.out.println("popop:"+dssf.size());
        result = dao.newFavorite(getSongId(), getUsername());
        dssf = sdao.ListSongOfFavourite(username);
        return SUCCESS;
    }

    public String favoriteSongOfAlbum() throws Exception {
        FavoriteDAO dao = new FavoriteDAO();
        SongDAO sd = new SongDAO();
        String AlbumID = getAlbumID();
        dss = sd.ListSongOfAlbum(AlbumID);
        result = dao.newFavorite(getSongId(), getUsername());
        dssf = sd.ListSongOfFavouriteOfAlbum(username,AlbumID);
        return SUCCESS;
    }
    
    public String favoriteSongOfSearch() throws Exception {
        FavoriteDAO dao = new FavoriteDAO();
        SongDAO sd = new SongDAO();
        songTitle = getSongTitle();
        dss = sd.getListSearch(songTitle);
        result = dao.newFavorite(getSongId(), getUsername());
        dssf = sd.ListSongOfFavouriteOfSearch(songTitle,username);
        System.out.println("lilili: "+songTitle+"-"+username+dssf.size()+dss.size());
        return SUCCESS;
    }
    
    public String removeFavoriteSong() throws Exception {
        FavoriteDAO dao = new FavoriteDAO();
        SongDAO sdao = new SongDAO();
        dss = sdao.select();
        result = dao.removeFavorite(getSongId(), getUsername());
        dssf = sdao.ListSongOfFavourite(username);
        return SUCCESS;
    }
    
    public String removeFavoriteSongOfAlbum() throws Exception {
        FavoriteDAO dao = new FavoriteDAO();
        SongDAO sdao = new SongDAO();       
        AlbumID = getAlbumID();
        dss = sdao.ListSongOfAlbum(AlbumID);
        result = dao.removeFavorite(getSongId(), getUsername());
        dssf = sdao.ListSongOfFavouriteOfAlbum(username,AlbumID);
        return SUCCESS;
    }
    
    public String removeFavoriteSongOfSearch() throws Exception {
        FavoriteDAO dao = new FavoriteDAO();
        SongDAO sd = new SongDAO();       
        songTitle = getSongTitle();
        dss = sd.getListSearch(songTitle);
        result = dao.removeFavorite(getSongId(), getUsername());
        dssf = sd.ListSongOfFavouriteOfSearch(songTitle,username);
        return SUCCESS;
    }
}
