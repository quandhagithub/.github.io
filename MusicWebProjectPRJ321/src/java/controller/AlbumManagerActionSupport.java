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
import model.Album;
import model.Song;
import model.User;

/**
 *
 * @author Inpiron
 */
public class AlbumManagerActionSupport extends ActionSupport {

    public AlbumManagerActionSupport() {
    }
    private String id;
    private String title;
    private String genre;
    private String path;
    private String idartist;
    private String artist;
    private String AlbumID = null;
    private List<User> dsuser = new ArrayList<>();
    private List<Album> dsalbum = new ArrayList<>();
    private List<Song> dss = new ArrayList<>();

    public String getAlbumID() {
        return AlbumID;
    }

    public void setAlbumID(String AlbumID) {
        this.AlbumID = AlbumID;
    }

    public List<Song> getDss() {
        return dss;
    }

    public void setDss(List<Song> dss) {
        this.dss = dss;
    }

    public List<Album> getDsalbum() {
        return dsalbum;
    }

    public void setDsalbum(List<Album> dsalbum) {
        this.dsalbum = dsalbum;
    }

    public List<User> getDsuser() {
        return dsuser;
    }

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

    public String getIdartist() {
        return idartist;
    }

    public void setIdartist(String idartist) {
        this.idartist = idartist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String execute() throws Exception {
        AlbumDAO ad = new AlbumDAO();
        ad.insert(id, title, genre, path);
        ad.insertArtist(idartist, artist);
        ad.linkArtistAlbum(id, idartist);
        dsalbum = ad.select();
        return "success";
    }

    public String edit() throws Exception {
        id = getId();
        title = getTitle();
        genre = getGenre();
        path = getPath();
        return "success";
    }

    public String editAlbum() throws Exception {
        AlbumDAO ad = new AlbumDAO();
        ad.edit(id, title, genre, path);
        dsalbum = ad.select();
        return "success";
    }

    public String song() throws Exception {
        SongDAO sd = new SongDAO();
        AlbumID = getAlbumID();
        dss = sd.ListSongOfAlbum(AlbumID);
        return "success";
    }

    public String deleteAlbum() throws Exception {
        AlbumDAO ad = new AlbumDAO();
        AlbumID = getAlbumID();
        ad.delete(AlbumID);
        dsalbum = ad.select();
        return "success";
    }
}
