package com.elena.collections.animals;



public class Cat extends Pet {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void play() {
        System.out.println("pisica toarce");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
