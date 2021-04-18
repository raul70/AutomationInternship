package com.elena.practiceoop.pb6;


public class ProdAccesoriu extends Produs{
    private String marime;

    public ProdAccesoriu(long id, String nume, double pret, String marime) {
        super(id, nume, pret);
        this.marime = marime;
    }


    @Override
    public double applyDiscount(double discount) {
        return super.applyDiscount(discount) * 0.1;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public String toString() {
        return "ProdAccesoriu{" +
                "marime='" + marime + '\'' +
                '}';
    }
}
