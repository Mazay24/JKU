package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

// логика
public class PayService {
    public HashMap calculation (double lightday, double lightnight, double waterhot, double watercold, int i , HashMap Info){
        POGO pogo = new POGO();
        lightday = lightday * 3.24; // set
        lightnight = lightnight * 1.69; // set
        waterhot = waterhot * 49.3; // set
        watercold = watercold * 26.5; // set
        double all = lightday + lightnight + waterhot + watercold; // set
        pogo.setAll(all);
        Repository repository = new Repository();
                repository.save(pogo, i);
        //mySQL.mySQL(lightday, lightnight, waterhot, watercold, i );
        return Info;

    }
}
