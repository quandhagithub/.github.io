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
//import dataobj.Contact;
//import db.DBContext;
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
public class SongDAO {

    public void insert(String id, String title, String genre, String path) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Song (id, title, genre, path) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, title);
            stmt.setString(3, genre);
            stmt.setString(4, path);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("ifale");
            ex.printStackTrace();
        }
    }

    public void linkSongAlbum(String songId, String albumID) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Has (song_id, album_id) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, songId);
            stmt.setString(2, albumID);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("ifale2");
            ex.printStackTrace();
        }
    }

    public ArrayList<Song> select() {
        ArrayList<Song> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Song.id,Song.title,Song.genre,Song.path, Artist.name\n"
                    + "from Song inner join Has on Song.id = Has.Song_id\n"
                    + "inner join Album on Has.album_id = Album.id\n"
                    + "inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String arti = rs.getString(5);
                Song s = new Song(id, title, arti, genre, path);
                lista.add(s);
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

    public ArrayList<Song> ListSongOfAlbum(String idAlbum) {
        System.out.println("id: " + idAlbum);
        ArrayList<Song> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Song.id,Song.title,Song.genre,Song.path, Artist.name\n"
                    + "from Song inner join Has on Song.id = Has.song_id\n"
                    + "inner join Album on Has.album_id = Album.id\n"
                    + "inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id\n"
                    + "where Album.id = " + "'" + idAlbum + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String arti = rs.getString(5);
                Song s = new Song(id, title, arti, genre, path);
                lista.add(s);
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

    public ArrayList<Song> ListSongOfFavourite(String idUser) {
        ArrayList<Song> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Song.id,Song.title,Song.genre,Song.path, Artist.name\n"
                    + "from Song inner join Favorite on Song.id = Favorite.song_id\n"
                    + "inner join Has on Song.id = Has.song_id\n"
                    + "inner join [User] on Favorite.username = [User].username\n"
                    + "inner join Album on Has.album_id = Album.id\n"
                    + "inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id\n"
                    + "where [User].username = " + "'" + idUser + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String arti = rs.getString(5);
                Song s = new Song(id, title, arti, genre, path);
                lista.add(s);
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

    public ArrayList<Song> ListSongOfFavouriteOfAlbum(String idUser, String idAlbum) {
        ArrayList<Song> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Song.id,Song.title,Song.genre,Song.path, Artist.name\n"
                    + "from Song inner join Favorite on Song.id = Favorite.song_id\n"
                    + "inner join Has on Song.id = Has.song_id\n"
                    + "inner join [User] on Favorite.username = [User].username\n"
                    + "inner join Album on Has.album_id = Album.id\n"
                    + "inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id\n"
                    + "where [User].username = " + "'" + idUser + "' and [Album].id = " + "'" + idAlbum + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String arti = rs.getString(5);
                Song s = new Song(id, title, arti, genre, path);
                lista.add(s);
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
            String sql = "UPDATE Song SET title = ?, genre = ? , path = ? WHERE id = " + "'" + id + "'";
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

    public void delete(String SongID) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "DELETE FROM Song WHERE id = " + "'" + SongID + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return;
    }

    public void deleteFavorite(String SongID) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "DELETE FROM Favorite WHERE song_id = " + "'" + SongID + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return;
    }

    public void deleteHas(String SongID) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "DELETE FROM Has WHERE song_id = " + "'" + SongID + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return;
    }

    public ArrayList<Song> getListSearch(String songTitle) {
        ArrayList<Song> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Song.id,Song.title,Song.genre,Song.path, Artist.name\n"
                    + "from Song inner join Has on Song.id = Has.Song_id\n"
                    + "inner join Album on Has.album_id = Album.id\n"
                    + "inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id\n"
                    + "where Song.title like '%" + songTitle + "%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String arti = rs.getString(5);
                Song s = new Song(id, title, arti, genre, path);
                lista.add(s);
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

    public ArrayList<Song> ListSongOfFavouriteOfSearch(String songTitle, String username) {
        ArrayList<Song> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select Song.id,Song.title,Song.genre,Song.path, Artist.name\n"
                    + "from Song inner join Favorite on Song.id = Favorite.song_id\n"
                    + "inner join Has on Song.id = Has.song_id\n"
                    + "inner join [User] on Favorite.username = [User].username\n"
                    + "inner join Album on Has.album_id = Album.id\n"
                    + "inner join Release on Album.id = Release.album_id\n"
                    + "inner join Artist on Release.artist_id = Artist.id\n"
                    + "where Song.title like '%" + songTitle + "%' and " + "[User].username = " + "'" + username + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString(1);
                String title = rs.getString(2);
                String genre = rs.getString(3);
                String path = rs.getString(4);
                String arti = rs.getString(5);
                Song s = new Song(id, title, arti, genre, path);
                lista.add(s);
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

    public static void main(String[] args) {
        SongDAO dao = new SongDAO();
        System.out.println(dao.ListSongOfFavouriteOfSearch("k", "quan").size());
    }
    
}
