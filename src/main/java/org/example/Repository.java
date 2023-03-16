package org.example;

import java.sql.SQLException;

// логика. для работы с БД
public class Repository {

    public void save(POGO pogo, int i) {
        int bdI = i + 1;
        try {
            mySQL.getConnection().execute("INSERT INTO jku_info(monthNumber,month,Lightday,Lightnight,Waterhot,Watercold) VALUES ('" +bdI+ "','"+ Months.getById(i)+"','"+lightday+"','"+lightnight+"','"+waterhot+"','"+watercold+"')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // delete
    public void delete(POGO pogo, int i) {
    }


    // find by ID
}
