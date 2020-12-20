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
 * @author ADMIN
 */
public class RegisterDAO {
  public boolean newUser(User user) {
      
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "INSERT INTO [User](username,email,password,country,gender,role) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
//            System.out.println(s.getName());
//            System.out.println(s.isGender());
//            System.out.println(s.getDOB());
//            stmt.setInt(1, ++a);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getNation());
            stmt.setBoolean(5, user.getGender().equalsIgnoreCase("true"));
            stmt.setInt(6, user.getRole());
            rc = stmt.executeUpdate();
            conn.close();

            System.out.println("Register successfully!");
            return true;
        } catch (Exception ex) {
            System.out.println("Register failure!");
            ex.printStackTrace();
        }
        return false;
    }
  
}
