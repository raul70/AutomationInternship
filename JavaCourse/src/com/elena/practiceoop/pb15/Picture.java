package com.elena.practiceoop.pb15;

public class Picture {
    private String titlu;
    private double pret;

    public Picture(String titlu, double pret) {
        this.titlu = titlu;
        this.pret = pret;
    }

    public double applyPromoPrice(double promoPrice) {
        return pret - promoPrice;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "titlu='" + titlu + '\'' +
                ", pret=" + pret +
                '}';
    }
}
