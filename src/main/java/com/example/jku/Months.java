package com.example.jku;

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
        return values[id];
    }

}

