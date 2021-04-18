package com.elena.practiceoop.pb3;


public class Bird extends Animal{
    public Bird(String name, String category) {
        super(name, category);
    }

    @Override
    public void makeSound() {
        System.out.println("cip-cirip");
    }
}
