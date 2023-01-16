package com.example.jku;

import java.util.HashMap;

public class Main {
    private static double all;
    static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",  "December"};

    public static void main(String[] args) {
        HashMap<String, Double> Info = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            System.out.println("Введитете значения за " + months[i]);
            Input input = new Input();
            double lightday = input.InLightday(Info, i);
            double lightnight = input.InLightnight(Info, i);
            double waterhot = input.InWaterhot(Info, i);
            double watercold = input.InWatercold(Info, i);
            Pay pay = new Pay();
            Info = pay.calculation(lightday, lightnight, waterhot, watercold, i, Info);
            Double gg = Info.get(months[i]);
            all += gg;
            System.out.println("Всего потрачено: " + all);
            if (all > 10000){
                System.out.println("Лимит 10 000 превышен!");
            }
            System.out.println("Плата за " + months[i] + " = " + gg);
        }

    }
}
