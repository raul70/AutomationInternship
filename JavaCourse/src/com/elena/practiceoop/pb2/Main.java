package com.elena.practiceoop.pb2;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", "Sfinx");
        Cat cat2 = new Cat("Albert", "Siamez");
        Dog dog1 = new Dog("Ella", "Bichon");
        Dog dog2 = new Dog("Blacky", "Labrador");
        Parrot parrot1 = new Parrot("Paco", "Nimfa");
        Parrot parrot2 = new Parrot("Lori", "Loriket");
        Fish fish1 = new Fish("Mircea", "Pastrav");
        Fish fish2 = new Fish("Adda", "Betta");

        System.out.println("Cat " + cat1.getName().toString());
        cat1.setName("Bobi");
        System.out.println(cat2.getName().toString() + " is plaing with " + cat1.getName().toString());
        dog1.play();
        System.out.println(dog1.getName().toString());
        dog1.setName("Bibi");
        System.out.println("New name for Ella is " + dog2.getName().toString());
        dog2.play();
        System.out.println(dog2.getName().toString() + " is a cute dog");
        parrot1.play();
        System.out.println("We present you " + parrot1.getName().toString() + " parrot.");
        parrot2.setName("Blue");
        System.out.println("The parrot name is " + parrot2.getName().toString());
        fish1.play();
        System.out.println("Fish 1 " + fish1.getName().toString() + " fish 2 " + fish2.getName().toString());



    }
}
