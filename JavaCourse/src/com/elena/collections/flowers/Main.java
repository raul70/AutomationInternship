package com.elena.collections.flowers;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Tree> filterTreesByHeight(List<Tree> treeList, int height) {
        List<Tree> filteredList = new ArrayList<>();

        for (Tree tree : treeList) {
            if (tree.getHeight() > height) {
                filteredList.add(tree);
            }
        }
        return filteredList;
    }

    public static List<Flower> filterFlowersByColor(List<Flower> flowerList, String color) {

        List<Flower> filteredList = new ArrayList<>();
        for (Flower flower : flowerList) {
            if (flower.getColor().equals(color)) {
                filteredList.add(flower);

            }

        }

        return filteredList;
    }

    public static void main(String[] args) {
        Flower flower1 = new Flower("Tulip", "yellow", 6);
        Flower flower2 = new Flower("Rose", "red", 10);
        Flower flower3 = new Flower("Rose", "yellow", 10);

        Tree tree1 = new Tree("Fir5", 5, 15);
        Tree tree2 = new Tree("Fir15", 15, 15);
        Tree tree3 = new Tree("Fir17", 17, 15);


//        System.out.println(flower2.toString());
//        flower2.setName("Snowdrop");
//        flower2.setNrPetals(4);
//        System.out.println(flower2.getColor().toString());
//        flower1.getColor();
//        flower1.setColor("blue");
//        System.out.println(flower2.toString() + " and " + flower1.toString());
//        System.out.println(tree1.toString());

        List<Flower> flowers = new ArrayList<>();

        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);

        List<Flower> result = filterFlowersByColor(flowers, "red");
        printFlowers(result);

        List<Tree> trees = new ArrayList<>();
        trees.add(tree1);
        trees.add(tree2);
        trees.add(tree3);
        List<Tree> filteredTrees = filterTreesByHeight(trees, 14);
        printTrees(filteredTrees);

    }

    public static void printFlowers(List<Flower> flowers) {
        for (Flower flower : flowers) {

            System.out.println(flower.toString());


        }
    }

    public static void printTrees(List<Tree> trees) {
        for (Tree tree : trees) {

            System.out.println(tree.toString());


        }
    }

}
