package com.Microproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    static Connection con;
    public static Connection createC() {
        try {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //create the connection
            String user = "Root";
            String password = "shambho@2003";
            String url = "jdbc:mysql://localhost:3306/student_manage";
            con = DriverManager.getConnection(url,user,password);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
