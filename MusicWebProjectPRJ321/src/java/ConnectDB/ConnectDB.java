/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

/**
 *
 * @author Inpiron
 */


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB implements DataBaseInfo{
    public static Connection getConnection() {
        Connection conn=null;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL,userDB,passDB);
            System.out.println("Connect successfully");
        } catch (Exception e) {
            System.out.println("Connect failure!");
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}

