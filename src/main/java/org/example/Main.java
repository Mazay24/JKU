package org.example;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        POGO pogo = new POGO();
        HashMap<Months, Double> Info = new HashMap<>();
        for (int i = 0; i < Months.values().length; i++) {
            System.out.println("Введитете значения за " + Months.getById(i).toString());
            InputClient input = new InputClient();
            PayService pay = new PayService();
            Info = pay.calculation(input.inLightday(Info, i), input.inLightnight(Info, i), input.inWaterhot(Info, i), input.inWatercold(Info, i), i, Info);
            Double output = Info.get(Months.getById(i).toString());
            double all = pogo.getAll(); // ?! count
            pogo.setAll(all += output);
            System.out.println("Всего потрачено: " + all);
            if (all > 10000){
                System.out.println("Лимит 10 000 превышен!");
            }
            System.out.println("Плата за " + Months.getById(i).toString() + " = " + output);
        }
    }
}