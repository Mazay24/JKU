package com.example.jku;

import java.util.HashMap;
import java.util.Scanner;

public class InputClient {
    private double result;
    private String line;


    public Trafic day = Trafic.LIGDAY;
    public Trafic nig = Trafic.LIGNIG;
    public Trafic hot = Trafic.WATHOT;
    public Trafic cold = Trafic.WATCOLD;

    private final int threeMonths = 3;




    public double InLightday(HashMap<Enum, Double> Info, int i) {
        System.out.print("Введите показания за свет(день): ");
        Scanner();
        error(line, Info, i, day, 3.24, 60);
        return result;
    }
        public double InLightnight(HashMap<Enum, Double> Info, int i) {
            System.out.print("Введите показания за свет(ночь): ");
            Scanner();
            error(line, Info, i, nig, 1.69, 30);
            return result;
        }
    public double InWaterhot(HashMap<Enum, Double> Info, int i) {
        System.out.print("Введите показания за воду(горячая): ");
        Scanner();
        error(line, Info, i, hot, 49.3, 100);
        return result;
    }
    public double InWatercold(HashMap<Enum, Double> Info, int i) {
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

    private double error(String line, HashMap Info, int i,Trafic trafic, double tarif, int sredznach){
        if (line.equals("") && i < threeMonths){
            result = sredznach;

        }
        else if (line.equals("") && Info.containsKey(Months.JANUARY.toString()) && Info.containsKey(Months.FEBRUARY.toString()) && Info.containsKey(Months.MARCH.toString())){
            double i1 = (double) Info.get(Months.getById(i-3).toString() + trafic);
            double i2 = (double) Info.get(Months.getById(i-2).toString()+ trafic);
            double i3 = (double) Info.get(Months.getById(i-1).toString() + trafic);
            result = (((i1 + i2 + i3) / tarif) / 3);
        }
        else {

            result = Double.parseDouble(line);
        }
        return result;
    }

}
