package com.elena.practiceoop.pb9;


public class Superman extends Hero{
    private String specialPower;

    public Superman(String name, String power, String costumeColor, String specialPower) {
        super(name, power, costumeColor);
        this.specialPower = specialPower;
    }

    private void launchTheSpecialPower() {
        System.out.println(getName() + " launched " + specialPower);
    }

    @Override
    public void launchThePower() {
        this.launchTheSpecialPower();
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    @Override
    public String toString() {
        return "Superman{" +
                "specialPower='" + specialPower + '\'' +
                '}';
    }
}
