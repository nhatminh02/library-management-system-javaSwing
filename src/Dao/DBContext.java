package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
 /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "jdbc:mysql://" + serverName + ":" + portNumber
                + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, userID, password);
//        return DriverManager.getConnection(url);
    }

    /*Insert your other code right after this comment*/
 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "doan";
    private final String portNumber = "3306";
    private final String userID = "root";
    private final String password = "samsunggears3";
}

class Using {

    public static void main(String[] args) {
        try {
            new DBContext().getConnection();
            System.out.println("Connection successful");
        } catch (Exception e) {
            System.out.println("Connection failed " + e.getMessage());
        }
    }
}
