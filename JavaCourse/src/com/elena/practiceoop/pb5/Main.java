package com.elena.practiceoop.pb5;

public class Main {
    public static void main(String[] args) {

        PersFizica pers1 = new PersFizica("Pop", "Andrei", "255655252565","Cluj");
        PersoanaJuridica pers2= new PersoanaJuridica("Lazar", "Irina", "Petrom", "456556", "Cluj");

        pers1.showPersonDetails();
        pers2.showPersonDetails();


//        Order order1 = new Order("1", order1.getProdus() ,pers1);
//      //  Order order2 = new Order("2", order2.getProdus(), pers2);
//        Map<String, Order> myMap = new HashMap();
//        myMap.put(order1.getId(),order1);
//        myMap.put(order2.getId(),order2);
//        boolean containsKey = myMap.containsKey(order2.getId());
//        boolean containsValue = myMap.containsValue(order2);
//        System.out.println(containsKey);
//        System.out.println(containsValue);
////myMap.remove(order1.getId(),order2);
////myMap.remove(order1.getId(),order1);
////myMap.remove(order2.getId());
////itereaza un map
//        Set<String> keySet =  myMap.keySet();
//        for(String s : keySet){
//            System.out.println("Cheia este: " + s);
//        }
////returneaza valorile
//        Collection<Order> values =  myMap.values();
//        Iterator<Order> valuesIter = values.iterator();
//        while(valuesIter.hasNext()) {
//            Order o = valuesIter.next();
//            System.out.println(o);
     }
    }

