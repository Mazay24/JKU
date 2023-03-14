package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class InputClient {
    private double result;
    private String line;
    private final int firstthreeMonths = 3;

    public double inLightday(HashMap<Months, Double> Info, int i) {
        System.out.print("Введите показания за свет(день): ");
        scanner();
        error(line, Info, i, Trafic.LIGDAY, 3.24, 60);
        return result;
    }
        public double inLightnight(HashMap<Months, Double> Info, int i) {
            System.out.print("Введите показания за свет(ночь): ");
            scanner();
            error(line, Info, i, Trafic.LIGNIG, 1.69, 30);
            return result;
        }
    public double inWaterhot(HashMap<Months, Double> Info, int i) {
        System.out.print("Введите показания за воду(горячая): ");
        scanner();
        error(line, Info, i, Trafic.WATHOT, 49.3, 100);
        return result;
    }
    public double inWatercold(HashMap<Months, Double> Info, int i) {
        System.out.print("Введите показания за воду(холодная): ");
        scanner();
        error(line, Info, i, Trafic.WATCOLD, 26.5, 50);
        return result;
    }
    private String scanner(){
        Scanner in = new Scanner(System.in);
        line = in.nextLine();
        return line;
    }
    private double error(String line, HashMap Info, int i,Trafic trafic, double tarif, int sredznach){
        if (line.equals("") && i < firstthreeMonths){
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
