package com.example.jku;

import java.util.HashMap;
import java.util.Scanner;

public class Input {
    double result;
    String line;
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",  "December"};


    Trafic day = Trafic.Ligday;
    Trafic nig = Trafic.Lignig;
    Trafic hot = Trafic.Wathot;
    Trafic cold = Trafic.Watcold;



    public double InLightday(HashMap<String, Double> Info, int i) {
        System.out.print("Введите показания за свет(день): ");
        Scanner();
        error(line, Info, i, day, 3.24, 60);
        return result;
    }
        public double InLightnight(HashMap <String, Double> Info, int i) {
            System.out.print("Введите показания за свет(ночь): ");
            Scanner();
            error(line, Info, i, nig, 1.69, 30);
            return result;
        }
    public double InWaterhot(HashMap <String, Double> Info, int i) {
        System.out.print("Введите показания за воду(горячая): ");
        Scanner();
        error(line, Info, i, hot, 49.3, 100);
        return result;
    }
    public double InWatercold(HashMap <String, Double> Info, int i) {
        System.out.print("Введите показания за воду(холодная): ");
        Scanner();
        error(line, Info, i, cold, 26.5, 50);
        return result;
    }
    private String Scanner(){
        Scanner in = new Scanner(System.in);
        line = in.nextLine();

        return line;
    }

    private double error(String line, HashMap Info, int i, Enum Trafic, double tarif, int sredznach){
        if (line.equals("") && i < 3){
            result = sredznach;

        }
        else if (line.equals("") && Info.containsKey("January") && Info.containsKey("February") && Info.containsKey("March")){
            double i1 = (double) Info.get(months[i-3] + Trafic);
            double i2 = (double) Info.get(months[i-2]+ Trafic);
            double i3 = (double) Info.get(months[i-1] + Trafic);
            result = (((i1 + i2 + i3) / tarif) / 3);
        }
        else {
            result = Double.parseDouble(line);
        }
        return result;
    }

}