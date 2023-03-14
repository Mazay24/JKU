package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PayService {
    public HashMap calculation (double lightday, double lightnight, double waterhot, double watercold, int i , HashMap Info){
        MySQL mySQL = new MySQL();
        POGO pogo = new POGO();
        lightday = lightday * 3.24;
        Info.put(Months.getById(i).toString() + Trafic.LIGDAY, lightday);
        lightnight = lightnight * 1.69;
        Info.put(Months.getById(i).toString() + Trafic.LIGNIG, lightnight);
        waterhot = waterhot * 49.3;
        Info.put(Months.getById(i).toString() + Trafic.WATHOT, waterhot);
        watercold = watercold * 26.5;
        Info.put(Months.getById(i).toString() + Trafic.WATCOLD, watercold);
        double all = lightday + lightnight + waterhot + watercold;
        pogo.setData(lightday, lightnight, waterhot, watercold);
        pogo.setAll(all);
        Info.put(Months.getById(i).toString(), all);
        Repository repository = new Repository();
                repository.save(pogo.getLightday(), pogo.getLightnight(),pogo.getWaterhot(),pogo.getWatercold(), i);
        //mySQL.mySQL(lightday, lightnight, waterhot, watercold, i );
        return Info;

    }
}
