package org.example;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final Months[] values = Months.values();

    public static Months getById(int id) {
        try {
            return values[id];
        } catch (Exception e) {
            System.out.println("Не допустимое значение!");
        }
        return null;
    }

}

