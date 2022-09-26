package org.example;

public class Coin {
    public double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double volue) {
        int value = 0;
        if (value > 0) {
           diameter = value;
       }
       else {
           diameter = 0.01;
       }
    }

    public double takeWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
