package com.example.jku;

import java.util.HashMap;

public class Pay {

    double all;
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",  "December"};

    String[] Trafic = {"Ligday", "Lignig", "Wathot", "Watcold"};
    public Pay(){

    }
    public HashMap calculation (double lightday, double lightnight, double waterhot, double watercold, int i, HashMap Info){
        lightday = lightday * 3.24;
        Info.put(months[i] + Trafic[0], lightday);
        lightnight = lightnight * 1.69;
        Info.put(months[i] + Trafic[1], lightnight);
        waterhot = waterhot * 49.3;
        Info.put(months[i] + Trafic[2], waterhot);
        watercold = watercold * 26.5;
        Info.put(months[i] + Trafic[3], watercold);
        all = lightday + lightnight + waterhot +watercold;
        Info.put(months[i], all);

        return Info;

    }
}
