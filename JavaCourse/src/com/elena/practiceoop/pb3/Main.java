package com.elena.practiceoop.pb3;


public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Lili", "Black");
        Dog dog = new Dog("Oreo", "white");
        Bird bird = new Bird("Parrot", "Colorful");

        System.out.println("Little cat " + cat.getName().toString() + " is " + cat.getCategory().toString());
        System.out.println(dog.getName() + " is " + dog.getCategory().toString());
        System.out.println("The Bird is a" + bird.getCategory().toString() + " and a little " + bird.getName().toString());


    }
}
