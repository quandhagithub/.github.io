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
public interface DataBaseInfo {

    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL = "jdbc:sqlserver://QUANDHADE140119\\SQLEXPRESS:1433;databaseName=Clown";
//    public static String dbURL="jdbc:sqlserver://localhost:1433;"+ "databaseName=PRJ321_DE140119;"+ "integratedSecurity=true";
    public static String userDB = "quandhade140119";
    public static String passDB = "minimine123456";
}
