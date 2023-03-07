package org.example;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class MySQL {

    private static final String NAME = "root";
    private static final String PASSWORD = "1402200Ii.";
    private static final String URL = "jdbc:mysql://localhost:3306/JKU";
    private Connection connection;
    public void mySQL() {


        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, NAME, PASSWORD);

            if (!connection.isClosed()){
                System.out.println("Подключено");
            }
            connection.isClosed();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public Connection getConnection(){
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }



}
