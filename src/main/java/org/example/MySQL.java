package org.example;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class MySQL {

    private static final String NAME = "root";
    private static final String PASSWORD = "1402200Ii.";
    private static final String URL = "jdbc:mysql://localhost:3306/JKU";
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private MySQL(){}// патерн Singleton
    public static Connection getConnection() throws SQLException {
        if (connection == null){
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        }
        return connection;
    }


    public void mySQL() {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
