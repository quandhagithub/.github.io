/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AlbumDAO;
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
public class SongManagerActionSupport extends ActionSupport {

    public SongManagerActionSupport() {
    }
    private String id;
    private String title;
    private String genre;
    private String path;
    private String AlbumID;
    private String AlbumIDD;
    private String idSongDel;
    private String idSongEdit;
    private List<Song> dss = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlbumIDD() {
        return AlbumIDD;
    }

    public void setAlbumIDD(String AlbumIDD) {
        this.AlbumIDD = AlbumIDD;
    }

    
    
    public String getAlbumID() {
        return AlbumID;
    }

    public void setAlbumID(String AlbumID) {
        this.AlbumID = AlbumID;
    }

    public String getIdSongDel() {
        return idSongDel;
    }

    public void setIdSongDel(String idSongDel) {
        this.idSongDel = idSongDel;
    }

    public String getIdSongEdit() {
        return idSongEdit;
    }

    public void setIdSongEdit(String idSongEdit) {
        this.idSongEdit = idSongEdit;
    }

    public List<Song> getDss() {
        return dss;
    }

    public void setDss(List<Song> dss) {
        this.dss = dss;
    }

    public String execute() throws Exception {
        SongDAO sd = new SongDAO();
        AlbumDAO ad = new AlbumDAO();
        sd.linkSongAlbum(id, AlbumID);
        sd.insert(id, title,genre, path);      
        dss = sd.ListSongOfAlbum(AlbumID);
        return "success";
    }

    public String delete() throws Exception {
        SongDAO sd = new SongDAO();
        String AlbumID = getAlbumID();
        String idSongDel = getIdSongDel();
        sd.deleteHas(idSongDel);
        sd.deleteFavorite(idSongDel);
        sd.delete(idSongDel);
        dss = sd.ListSongOfAlbum(AlbumID);
        return "success";
    }
    
    public String sendAlbumID() throws Exception{
        AlbumID=getAlbumID();
        return "success";
    }
    
    public String edits() throws Exception {
        id = getId();
        title = getTitle();
        genre = getGenre();
        path = getPath();
        return "success";
    }
    
    public String editSong() throws Exception {
        SongDAO sd = new SongDAO();
        sd.edit(id, title, genre, path);
        dss = sd.ListSongOfAlbum(AlbumID);
        return "success";
    }
}
