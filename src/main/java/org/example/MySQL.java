//package org.example;
//
//import com.mysql.fabric.jdbc.FabricMySQLDriver;
//
//import java.sql.*;
//
//public class MySQL {
//
//
//    public Statement getConnection() throws SQLException {
//        try {
//            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
//            if (!connection.isClosed()){
//                System.out.println("Подключено");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        connection.isClosed();
//        return connection.createStatement();
//    }
//
//}
