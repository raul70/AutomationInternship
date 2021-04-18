package com.elena.practiceoop.pb9;


public class Hero {
    private String name;
    private String power;
    private String costumeColor;

    public Hero(String name, String power, String costumeColor) {
        this.name = name;
        this.power = power;
        this.costumeColor = costumeColor;
    }

    public void launchThePower() {
        System.out.println(name + " with " + costumeColor + " launching " + power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCostumeColor() {
        return costumeColor;
    }

    public void setCostumeColor(String costumeColor) {
        this.costumeColor = costumeColor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", costumeColor='" + costumeColor + '\'' +
                '}';
    }
}
