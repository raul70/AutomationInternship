package com.elena.practiceoop.pb9;


public class Batman extends Hero{
    public Batman(String name, String power, String costumeColor) {
        super(name, power, costumeColor);
    }

    @Override
    public void launchThePower() {
        System.out.println("Batman");
        super.launchThePower();
    }

    @Override
    public String toString() {
        return "Batman{}";
    }
}
