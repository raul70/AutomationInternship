package com.elena.practiceoop.pb1;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Tulip", "yellow", 6);
        Flower flower2 = new Flower("Rose","red", 10);
        Tree tree1 = new Tree("Fir", "5", 15);


        System.out.println(flower2.toString());
        flower2.setName("Snowdrop");
        flower2.setNrPetals(4);
        System.out.println(flower2.getColor().toString());
        flower1.getColor();
        flower1.setColor("blue");
        System.out.println(flower2.toString() + " and " + flower1.toString());
        System.out.println(tree1.toString());


    }


}
