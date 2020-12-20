/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author ADMIN
 */
import ConnectDB.ConnectDB;
import model.Song;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import model.Album;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Thaycacac
 */
public class AlbumDAO {

    public void insert(String id, String title, String genre, String path) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Album (id, title, genre, path) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, title);
            stmt.setString(3, genre);
            stmt.setString(4, path);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void insertArtist(String id, String name) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Artist (id, name) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void linkArtistAlbum(String idAlbum, String idArtist) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Release (artist_id, album_id) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, idArtist);
            stmt.setString(2, idAlbum);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Album> select() {
        ArrayList<Album> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Album.id, Album.title, Album.genre, Album.path, Artist.name\n"
                    + "from Album inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String author = rs.getString(5);
                Album alb = new Album(id, title, genre, path, author);
                lista.add(alb);
            }
            rs.close();
            stmt.close();
            con.close();
            return lista;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void edit(String id, String title, String genre, String path) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "UPDATE Album SET title = ?, genre = ? , path = ? WHERE id = " + "'" + id + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, genre);
            stmt.setString(3, path);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String idAlbum) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "DELETE FROM [Album] WHERE id = " + "'" + idAlbum + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return;
    }

    public String getArtist(String AlbumID) {     
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Artist.name from Artist\n"
                    + "inner join Release on Artist.id = Release.artist_id\n"
                    + "where Release.album_id=" + "'" + AlbumID + "'";

            ResultSet rs = stmt.executeQuery(sql);

            String Artist = rs.getString(1);
            rs.close();
            stmt.close();
            con.close();
            return Artist;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
