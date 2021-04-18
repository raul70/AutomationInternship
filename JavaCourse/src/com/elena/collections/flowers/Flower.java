package com.elena.collections.flowers;

public class Flower extends Plant {
    private String color;
    private int nrPetals;

    public Flower(String name, String color, int nrPetals) {
        super(name);
        this.color = color;
        this.nrPetals = nrPetals;
    }

    @Override
    public void saySomethingSpecialAbout() {
        System.out.println("Life is the flower for which love is the honey!");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", nrPetals=" + nrPetals +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNrPetals() {
        return nrPetals;
    }

    public void setNrPetals(int nrPetals) {
        this.nrPetals = nrPetals;
    }




}
