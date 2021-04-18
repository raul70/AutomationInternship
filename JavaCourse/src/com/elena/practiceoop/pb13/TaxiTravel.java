package com.elena.practiceoop.pb13;


public class TaxiTravel extends Calatorie{
    private double pricePerKm;
    private double distanceKm;

    public TaxiTravel(double pricePerKm, double distanceKm) {
        this.pricePerKm = pricePerKm;
        this.distanceKm = distanceKm;
    }

    @Override
    public double calculeazaCostCalatorie() {
        return pricePerKm * distanceKm;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    @Override
    public String toString() {
        return "TaxiTravel{" +
                "pricePerKm=" + pricePerKm +
                ", distanceKm=" + distanceKm +
                '}';
    }
}
