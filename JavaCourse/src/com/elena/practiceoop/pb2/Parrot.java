package com.elena.practiceoop.pb2;


public class Parrot extends Pet{
    public Parrot(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("papagalul canta");
    }

    @Override
    public String toString() {
        return "Parrot{}";
    }
}
