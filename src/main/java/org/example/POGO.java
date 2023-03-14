package org.example;

public class POGO {
private double lightday;
private double lightnight;
private double waterhot;
private double watercold;
private double all;

public void setData(double lightday, double lightnight, double waterhot, double watercold){
    this.lightday = lightday;
    this.lightnight = lightnight;
    this.waterhot = waterhot;
    this.watercold = watercold;
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
public void setAll(double all){
    this.all = all;
}
public double getAll(){
    return all;
    }

}