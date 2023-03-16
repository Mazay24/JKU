package org.example;

// храним только данные
public class POGO {

    private double lightday;
    private double lightnight;
    private double waterhot;
    private double watercold;
    private double all;

    public POGO(double lightday, double lightnight, double waterhot, double watercold, double all) {
        this.lightday = lightday;
        this.lightnight = lightnight;
        this.waterhot = waterhot;
        this.watercold = watercold;
        this.all = all;
    }

    public double getLightday() {
    return lightday;
    }
    public double getLightnight(){
    return lightnight;
    }
    public double getWaterhot(){
        return waterhot;
    }
    public double getWatercold(){
    return watercold;
    }
    public double getAll() {
        return all;
    }

    public void setAll(double all) {
        this.all = all;
    }

}