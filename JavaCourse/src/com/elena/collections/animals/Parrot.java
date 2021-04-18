package com.elena.collections.animals;


public class Parrot extends Pet {
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
