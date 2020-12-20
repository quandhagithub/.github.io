/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AlbumDAO;
import DAO.SongDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import model.Song;
import model.Album;

/**
 *
 * @author ADMIN
 */
public class ListAlbumActionSupport extends ActionSupport {
    
    public ListAlbumActionSupport() {
    }
    
    private Album alb = new Album();
    private List<Album> dsalbum = new ArrayList<>();

    public Album getAlbum() {
        return alb;
    }

    public void setAlbum(Album alb) {
        this.alb = alb;
    }

    public List<Album> getDsalbum() {
        return dsalbum;
    }

    public void setDsalbum(List<Album> dsalbum) {
        this.dsalbum = dsalbum;
    }

    
    public String execute() throws Exception {     
            AlbumDAO al=new AlbumDAO();
            dsalbum=al.select();
        return "success";
    }
    
}
