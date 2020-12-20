/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.User;

/**
 *
 * @author Inpiron
 */
public class FavoriteDAO {
  public boolean newFavorite(String songId, String username) {
      
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "INSERT INTO [Favorite](song_id,username) VALUES(?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, songId);
            stmt.setString(2, username);
            rc = stmt.executeUpdate();
            conn.close();

            System.out.println("Add successfully!");
            return true;
        } catch (Exception ex) {
            System.out.println("Add failure!");
            ex.printStackTrace();
        }
        return false;
    }
  
    public static void main(String[] args) {
        FavoriteDAO dao = new FavoriteDAO();
        System.out.println(dao.newFavorite("ALNE", "minh"));
    }

    public boolean removeFavorite(String songId, String username) {
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "DELETE FROM [Favorite] WHERE (song_id = ? and username = ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, songId);
            stmt.setString(2, username);
            rc = stmt.executeUpdate();
            conn.close();

            System.out.println("Add successfully!");
            return true;
        } catch (Exception ex) {
            System.out.println("Add failure!");
            ex.printStackTrace();
        }
        return false;
    }
  
}
