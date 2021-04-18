package com.elena.courseoop;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id,String name, String category, double price){
        this.id =id;
        this.name = name;
        this.category = category;
        this.price = price;


    }
    //getters
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void getCategory(String category){
        this.category = category;
    }
    public void getPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }


}
