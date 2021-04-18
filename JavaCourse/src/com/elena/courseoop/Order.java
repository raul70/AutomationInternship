package com.elena.courseoop;

public class Order {
    private String id;
    private Product produs;
    private Person persoana;
    public Order (String id, Product produs, Person persoana){
        this.id = id;
        this.produs = produs;
        this.persoana = persoana;
    }
    public String getId() {
        return id;
    }
    public Product getProdus() {
        return produs;
    }
    public Person getPersoana() {
        return persoana;
    }
    @Override
    public int hashCode(){
        return 31*id.hashCode();
    }
    @Override
    public boolean equals(Object o){
        Order order = (Order) o;
        if(this.id.equals(order.getId())){
            return true;
        }
        else return false;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", produs=" + produs +
                ", persoana=" + persoana +
                '}';
    }
}

