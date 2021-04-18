package com.elena.practiceoop.pb6;


public class Produs {
    private long id;
    private String nume;
    private double pret;

    public Produs(long id, String nume, double pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
    }

    public double applyDiscount(double discount) {return pret * discount;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
//
//    @Override
//    public String toString() {
//        return "Produs{" +
//                "id=" + id +
//                ", nume='" + nume + '\'' +
//                ", pret=" + pret +
//                '}';

    @Override
    public boolean equals(Object o){
        Produs produs = (Produs) o;
        return produs.getId()==id;
    }
    @Override
    public int hashCode(){
        return (int) (31*id);
    }
    @Override
    public String toString(){
    return "id " + id +  "nume " + nume + "pret " + pret;
}}
