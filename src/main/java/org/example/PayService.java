package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PayService {
    public HashMap calculation (double lightday, double lightnight, double waterhot, double watercold, int i , HashMap Info){
        POGO pogo = new POGO();
        lightday = lightday * 3.24;
        Info.put(Months.getById(i).toString() + Trafic.LIGDAY, lightday);
        lightnight = lightnight * 1.69;
        Info.put(Months.getById(i).toString() + Trafic.LIGNIG, lightnight);
        waterhot = waterhot * 49.3;
        Info.put(Months.getById(i).toString() + Trafic.WATHOT, waterhot);
        watercold = watercold * 26.5;
        Info.put(Months.getById(i).toString() + Trafic.WATCOLD, watercold);
        pogo.setLightday(lightday * 3.24);
        pogo.setLightnight(lightnight * 1.69);
        pogo.setWaterhot(waterhot * 49.3);
        pogo.setWatercold(watercold * 26.5);
        double all = lightday + lightnight + waterhot + watercold;
        pogo.setAll(all);
        Info.put(Months.getById(i).toString(), all);
        Repository repository = new Repository();
        repository.save(pogo,i);
        return Info;

    }
}
