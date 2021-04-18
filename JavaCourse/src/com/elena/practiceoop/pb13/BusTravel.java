package com.elena.practiceoop.pb13;


public class BusTravel extends Calatorie{
    private double pricePerCalatorie;

    public BusTravel(double pricePerCalatorie) {
        this.pricePerCalatorie = pricePerCalatorie;
    }

    @Override
    public double calculeazaCostCalatorie() {
        return pricePerCalatorie;
    }

    public double getPricePerCalatorie() {
        return pricePerCalatorie;
    }

    public void setPricePerCalatorie(double pricePerCalatorie) {
        this.pricePerCalatorie = pricePerCalatorie;
    }

    @Override
    public String toString() {
        return "BusTravel{" +
                "pricePerCalatorie=" + pricePerCalatorie +
                '}';
    }
}
