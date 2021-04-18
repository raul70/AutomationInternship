package com.elena.practiceoop.pb11;


public class Cake extends Food{
    private double pricePerKg;

    public Cake(String name, String size, double pricePerKg) {
        super(name, size);
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double calculatePrice() {
        return Double.parseDouble(getSize()) * pricePerKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "pricePerKg=" + pricePerKg +
                '}';
    }
}
