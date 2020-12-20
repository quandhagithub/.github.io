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
import java.sql.SQLException;
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
public class LoginDAO {

   
    public int checkLogin(String username, String password) throws SQLException, NamingException, Exception {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        int role = -1;
        try {
            con = ConnectDB.getConnection();
            if(con!=null) {
                String sql = "Select * from [User] Where username = ? And password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                
                rs = stm.executeQuery();
                if (rs.next()) {
                    role = rs.getInt(6);
                    return role;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        return role;
    }
}


    