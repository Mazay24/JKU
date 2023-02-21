package com.example.jku;

import java.util.HashMap;

public class PayService {

    public PayService() {

    }

    public HashMap calculation(double lightday, double lightnight, double waterhot, double watercold, int i , HashMap Info){

        lightday = lightday * 3.24;
        Info.put(Months.getById(i).toString() + Trafic.LIGDAY, lightday);
        lightnight = lightnight * 1.69;
        Info.put(Months.getById(i).toString() + Trafic.LIGNIG, lightnight);
        waterhot = waterhot * 49.3;
        Info.put(Months.getById(i).toString() + com.example.jku.Trafic.WATHOT, waterhot);
        watercold = watercold * 26.5;
        Info.put(Months.getById(i).toString() + com.example.jku.Trafic.WATCOLD, watercold);
        double all = lightday + lightnight + waterhot + watercold;
        Info.put(Months.getById(i).toString(), all);

        return Info;

        // POGO data = new POGO(lightday, lightnight, ...)
        // repository.save(data)

    }
}
