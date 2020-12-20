/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Song;
import model.User;

/**
 *
 * @author ADMIN
 */
public class UserDAO {

    public ArrayList<User> listUser(String user) {
        ArrayList<User> lista = new ArrayList<>();
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from [User]\n"
                    + "where username != " + "'" + user + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String username = rs.getString(1);
                String email = rs.getString(2);
                String password = rs.getString(3);
                String country = rs.getString(4);
                String gender = rs.getBoolean(5) ? "Male" : "Female";
                int role = rs.getInt(6);
                User u = new User(username, password, gender, email, email, role);
                lista.add(u);
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

    public void delete(String username) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "DELETE FROM [Favorite] WHERE username = " + "'" + username + "'";
            String sql2 = "DELETE FROM [User] WHERE username = " + "'" + username + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt = con.prepareStatement(sql2);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return;
    }

    public void opUser(String usernameOp) {
        System.out.println(usernameOp);
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "UPDATE [User] SET role = 1 WHERE username = " + "'"+usernameOp+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void deopUser(String usernameDeop) {
        Connection con = null;
        ConnectDB db = new ConnectDB();
        try {
            con = db.getConnection();
            String sql = "UPDATE [User] SET role = 0 WHERE username = " + "'"+usernameDeop+"'";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
