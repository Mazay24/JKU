package org.example;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PayService {




    public PayService(){


    }
    public HashMap calculation (double lightday, double lightnight, double waterhot, double watercold, int i , HashMap Info){
        MySQL mySQL = new MySQL();

        lightday = lightday * 3.24;
        Info.put(Months.getById(i).toString() + Trafic.LIGDAY, lightday);
        lightnight = lightnight * 1.69;
        Info.put(Months.getById(i).toString() + Trafic.LIGNIG, lightnight);
        waterhot = waterhot * 49.3;
        Info.put(Months.getById(i).toString() + Trafic.WATHOT, waterhot);
        watercold = watercold * 26.5;
        Info.put(Months.getById(i).toString() + Trafic.WATCOLD, watercold);
        double all = lightday + lightnight + waterhot + watercold;
        Info.put(Months.getById(i).toString(), all);
        int bdI = i + 1;

        try {
           Statement statement = mySQL.getConnection().createStatement();
           statement.execute("INSERT INTO jku_info(monthNumber,month,Lightday,Lightnight,Waterhot,Watercold) VALUES ('" +bdI+ "','"+ Months.getById(i)+"','"+lightday+"','"+lightnight+"','"+waterhot+"','"+watercold+"')");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //mySQL.mySQL(lightday, lightnight, waterhot, watercold, i );

        return Info;

    }
}
