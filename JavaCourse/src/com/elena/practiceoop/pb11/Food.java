package com.elena.practiceoop.pb11;


public class Food {
    private String name;
    private String size;

    public Food(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public double calculatePrice() {return 0;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
