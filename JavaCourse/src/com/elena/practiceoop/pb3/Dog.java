package com.elena.practiceoop.pb3;

public class Dog extends Animal{
    public Dog(String name, String category) {
        super(name, category);
    }

    @Override
    public void makeSound() {
        System.out.println("ham-ham");
    }
}
