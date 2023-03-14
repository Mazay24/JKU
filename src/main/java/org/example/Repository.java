package org.example;

import java.sql.SQLException;

public class Repository {
    MySQL mySQL = new MySQL();
    public void save(double lightday, double lightnight, double waterhot, double watercold, int i){
    int bdI = i + 1;
        try {
            mySQL.getConnection().execute("INSERT INTO jku_info(monthNumber,month,Lightday,Lightnight,Waterhot,Watercold) VALUES ('" +bdI+ "','"+ Months.getById(i)+"','"+lightday+"','"+lightnight+"','"+waterhot+"','"+watercold+"')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
