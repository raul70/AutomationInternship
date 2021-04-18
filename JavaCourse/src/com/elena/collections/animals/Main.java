package com.elena.collections.animals;


import com.en.elena.practiceoop.pb3.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static boolean searchPetByBreed(List<Pet> petList, String breed){

        for (Pet pets : petList){
            if (pets.getBreed().equals(breed)){
                return true;
            }
        }
        return false;

    }


    public static String findAnimalNameByCategory(List<Animal> animalList, String category){
        for (Animal animal : animalList){
            if(animal.getCategory().equals(category)){
                return animal.getName();
            }
        }
    return null;

    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", "Sfinx");
        Cat cat2 = new Cat("Albert", "Siamez");
        Dog dog1 = new Dog("Ella", "Bichon");
        Dog dog2 = new Dog("Blacky", "Labrador");
        Parrot parrot1 = new Parrot("Paco", "Nimfa");
        Parrot parrot2 = new Parrot("Lori", "Loriket");
        Fish fish1 = new Fish("Mircea", "Pastrav");
        Fish fish2 = new Fish("Adda", "Betta");
//
//        System.out.println("Cat " + cat1.getName().toString());
//        cat1.setName("Bobi");
//        System.out.println(cat2.getName().toString() + " is plaing with " + cat1.getName().toString());
//        dog1.play();
//        System.out.println(dog1.getName().toString());
//        dog1.setName("Bibi");
//        System.out.println("New name for Ella is " + dog2.getName().toString());
//        dog2.play();
//        System.out.println(dog2.getName().toString() + " is a cute dog");
//        parrot1.play();
//        System.out.println("We present you " + parrot1.getName().toString() + " parrot.");
//        parrot2.setName("Blue");
//        System.out.println("The parrot name is " + parrot2.getName().toString());
//        fish1.play();
//        System.out.println("Fish 1 " + fish1.getName().toString() + " fish 2 " + fish2.getName().toString());
          List<Pet> pets = new ArrayList<>();
          pets.add(dog1);
          pets.add(dog2);

          boolean result = searchPetByBreed(pets, "Bichon");
        System.out.println(result);

          List<Animal> animals = new ArrayList<>();
          animals.add(new com.en.elena.practiceoop.pb3.Dog("Bibi", "dog"));
          animals.add(new com.en.elena.practiceoop.pb3.Bird("Bibu", "bird"));
          animals.add(new com.en.elena.practiceoop.pb3.Cat("Biba", "cat"));
          String animalNameByCategory = findAnimalNameByCategory(animals, "cat");
          System.out.println("Animal name " + animalNameByCategory);

    }
}
