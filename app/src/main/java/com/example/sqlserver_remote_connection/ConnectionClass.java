package com.example.sqlserver_remote_connection;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    String classes = "net.sourceforge.jtds.jdbc.Driver";
    protected static String ip = "192.168.137.1";
    protected static String port = "1433";
    protected static String db = "TestConnection";
    protected static String un = "rendy";
    protected static String password = "asd123";

    public Connection CONN(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        try {
            Class.forName(classes);
            String conUrl = "jdbc:jtds:sqlserver://"+ip+":"+port+";"+db;
            conn = DriverManager.getConnection(conUrl, un, password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;

    }
}
