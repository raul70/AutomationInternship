package com.elena.practiceoop.pb6;


public class ProdElectronic extends Produs{
    private String model;

    public ProdElectronic(long id, String nume, double pret, String model) {
        super(id, nume, pret);
        this.model = model;
    }

    @Override
    public double applyDiscount(double discount) {
        return super.applyDiscount(discount) * 0.2;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ProdElectronic{" +
                "model='" + model + '\'' +
                '}';
    }
}
