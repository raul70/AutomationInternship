package com.elena.practiceoop.pb6;


public class ProdAlimentar extends Produs{
    private double gramaj;

    public ProdAlimentar(long id, String nume, double pret, double gramaj) {
        super(id, nume, pret);
        this.gramaj = gramaj;
    }

    @Override
    public double applyDiscount(double discount) {
        return gramaj * getPret() * discount;
    }

    public double getGramaj() {
        return gramaj;
    }

    public void setGramaj(double gramaj) {
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        return "ProdAlimentar{" +
                "gramaj=" + gramaj +
                '}';
    }
}
