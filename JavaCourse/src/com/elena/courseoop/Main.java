package com.elena.courseoop;

public class Main {

    public static void main(String[] args) {
    Product product1 = new Product(1, "Book", "Books", 22);
    Product product2 = new Product(2, "Chocolate", "Choco", 4);
    String nameProduct1 = product1.getName();
    double priceProduct2 = product2.getPrice();
        System.out.println("Problem 1");
        System.out.println(nameProduct1);
        System.out.println(priceProduct2);
     //change name for product1
    product1.setName("News");
    System.out.println(nameProduct1);

    System.out.println("Problem 2");
    Person person1 = new Person(3, "Popescu", "Ion", 35);
       int person1Age = person1.getAge();
        System.out.println(person1Age);
        person1.setAge(5);
        System.out.println(person1Age);

    }
}
