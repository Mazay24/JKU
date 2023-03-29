package org.example;

import java.util.Objects;

public class POGO {
private double lightday;
private double lightnight;
private double waterhot;
private double watercold;
private double all;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POGO pogo = (POGO) o;
        return Double.compare(pogo.lightday, lightday) == 0 && Double.compare(pogo.lightnight, lightnight) == 0 && Double.compare(pogo.waterhot, waterhot) == 0 && Double.compare(pogo.watercold, watercold) == 0 && Double.compare(pogo.all, all) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lightday, lightnight, waterhot, watercold, all);
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
    public double getAll(){
        return all;
    }
public void setAll(double all){
    this.all = all;
}
    public void setLightnight(double lightnight) {
        this.lightnight = lightnight;
    }

    public void setWaterhot(double waterhot) {
        this.waterhot = waterhot;
    }

    public void setLightday(double lightday) {
        this.lightday = lightday;
    }

    public void setWatercold(double watercold) {
        this.watercold = watercold;
    }
}