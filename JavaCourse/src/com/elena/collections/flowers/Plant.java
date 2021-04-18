package com.elena.collections.flowers;

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public void saySomethingSpecialAbout() {
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
