package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository {
    Connection connection;
    {
        try {
            connection = MySQL.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(POGO pogo, int i){
    int bdI = i + 1;
        try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO jku_info(monthNumber,month,Lightday,Lightnight,Waterhot,Watercold) VALUES ('" +bdI+ "','"+ Months.getById(i)+"','"+pogo.getLightday()+"','"+pogo.getLightnight()+"','"+pogo.getWaterhot()+"','"+pogo.getWatercold()+"')");
            connection.commit();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(POGO pogo, int i) {
    }
}
