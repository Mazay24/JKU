package com.example.jku;

import java.util.HashMap;
import java.util.Scanner;

public class Input {
    double result;
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",  "December"};

    String[] Trafic = {"Ligday", "Lignig", "Wathot", "Watcold"};
    public double InLightday(HashMap Info, int i) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите показания за свет(день): ");
        String line = in.nextLine();
        error(line, Info, i, 0, 3.24, 60);
        return result;
    }
        public double InLightnight(HashMap Info, int i) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите показания за свет(ночь): ");
            String line = in.nextLine();
            error(line, Info, i, 1, 1.69, 30);
            return result;
        }
    public double InWaterhot(HashMap Info, int i) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите показания за воду(горячая): ");
        String line = in.nextLine();
        error(line, Info, i, 2, 49.3, 100);
        return result;
    }
    public double InWatercold(HashMap Info, int i) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите показания за воду(холодная): ");
        String line = in.nextLine();
        error(line, Info, i, 3, 26.5, 50);
        return result;
    }

    public double error(String line, HashMap Info, int i, int a, double tarif, int sredznach){
        if (line.equals("") && i < 3){
            result = sredznach;

        }
        else if (line.equals("") && Info.containsKey("January") && Info.containsKey("February") && Info.containsKey("March")){
            double i1 = (double) Info.get(months[i-3] + Trafic[a]);
            double i2 = (double) Info.get(months[i-2]+ Trafic[a]);
            double i3 = (double) Info.get(months[i-1] + Trafic[a]);
            result = (((i1 + i2 + i3) / tarif) / 3);
        }
        else {
            result = Double.parseDouble(line);
        }
        return result;
    }

}
