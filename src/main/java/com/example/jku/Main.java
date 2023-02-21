package com.example.jku;

import java.util.HashMap;

public class Main {
    private static double all;

    // .gitignore

    public static void main(String[] args) {
        Cosnt length = Cosnt.ColMonths;

        HashMap<Enum, Double> Info = new HashMap<>();
        for (int i = 0; i < length.getValue(); i++) {
            System.out.println("Введитете значения за " + Months.getById(i).toString());
            InputClient input = new InputClient();
            PayService pay = new PayService();
            Info = pay.calculation(input.InLightday(Info, i), input.InLightnight(Info, i), input.InWaterhot(Info, i), input.InWatercold(Info, i), i, Info);
            Double output = Info.get(Months.getById(i).toString());
            all += output;
            System.out.println("Всего потрачено: " + all);
            if (all > 10000){
                System.out.println("Лимит 10 000 превышен!");
            }
            System.out.println("Плата за " + Months.getById(i).toString() + " = " + output); // NullPointException
        }

    }

}
