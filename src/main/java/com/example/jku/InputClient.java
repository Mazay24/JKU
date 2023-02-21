package com.example.jku;

import java.util.HashMap;
import java.util.Scanner;

// ООП
// Инкапс-ция - сокрытие кода (модификаторы доступа)
// 1. DATA = POGO. Класс данные
// 2. Классы с логикой (методы имеет)
public class InputClient {

    public Trafic day = Trafic.LIGDAY;
    public Trafic nig = Trafic.LIGNIG;
    public Trafic hot = Trafic.WATHOT;
    public Trafic cold = Trafic.WATCOLD;

    private static final int threeMonths = 3; // count

    // 3.24 - долдны указываться в properties (application.properties, properties.yml): Spring.

    public double InLightday(HashMap<Enum, Double> Info, int i) {
        System.out.print("Введите показания за свет(день): ");
        return error(Scanner(), Info, i, day, 3.24, 60);
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

    private double error(String line, HashMap<Trafic, Double> Info, int i,Trafic trafic, double tarif, int sredznach){
        if (line.equals("") && i < threeMonths) {
            return sredznach;
        }
        else if (line.equals("") && Info.containsKey(Months.JANUARY.toString()) && Info.containsKey(Months.FEBRUARY.toString()) && Info.containsKey(Months.MARCH.toString())){
            double i1 = (double) Info.get(Months.getById(i - 3).toString() + trafic);
            double i2 = Info.get(Months.getById(i - 2).toString() + trafic);
            double i3 = Info.get(Months.getById(i - 1).toString() + trafic);
            return (((i1 + i2 + i3) / tarif) / 3);
        }
        else {
            return Double.parseDouble(line);
        }
    }

}
