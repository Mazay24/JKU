package com.example.jku;

public enum Cosnt {
   ColMonths(12);

   private int value;
   Cosnt(int value){
       this.value = value;
   }

    public int getValue() {
        return value;
    }
}
