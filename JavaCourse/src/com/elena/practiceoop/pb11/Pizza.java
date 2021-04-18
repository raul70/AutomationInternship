package com.elena.practiceoop.pb11;


public class Pizza extends Food{
    private double pricePerBuc;

    public Pizza(String name, String size, double pricePerBuc) {
        super(name, size);
        this.pricePerBuc = pricePerBuc;
    }

    @Override
    public double calculatePrice() {
        return pricePerBuc;
    }

    public double getPricePerBuc() {
        return pricePerBuc;
    }

    public void setPricePerBuc(double pricePerBuc) {
        this.pricePerBuc = pricePerBuc;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pricePerBuc=" + pricePerBuc +
                '}';
    }
}
