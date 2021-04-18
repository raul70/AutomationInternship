package com.elena.map;

import com.en.elena.courseoop.Order;
import com.en.elena.courseoop.Person;
import com.en.elena.courseoop.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static int numberOfOrders(Map<String, Order> orders, int productId) {
        int nrOfOrders = 0;
        Set<String> keySet = orders.keySet();
        for (String key : keySet) {
            Order order = orders.get(key);
            Product product = order.getProdus();
            if (product.getId() == productId) {
                nrOfOrders++;
            }
        }
        return nrOfOrders;
    }

    public static double sumOfOrders(Map<String, Order> orders, int personId) {
        double sumOfOrders = 0;
        Set<String> keySet = orders.keySet();
        for (String key : keySet) {
            Order order = orders.get(key);
            Person person = order.getPersoana();
            if (person.getId() == personId) {
                sumOfOrders += order.getProdus().getPrice();
            }
        }
        return sumOfOrders;
    }

    public static Set<String> getOrderIdsForPerson(Map<String, Order> orders, int personId) {
        Set<String> orderIds = new HashSet<>();
        Set<String> keySet = orders.keySet();
        for (String key : keySet) {
            Order order = orders.get(key);
            Person person = order.getPersoana();
            if (person.getId() == personId) {
                orderIds.add(order.getId());
            }
        }
        return orderIds;
    }

    public static Map<Integer, Person> getPersonsFromOrdersByProductId(Map<String, Order> orders, int productId) {
        Map<Integer, Person> persons = new HashMap<>();
        Set<String> keySet = orders.keySet();
        for (String key : keySet) {
            Order order = orders.get(key);
            Person person = order.getPersoana();
            Product product = order.getProdus();
            if (product.getId() == productId) {
                persons.put(person.getId(), person);
            }
        }
        return persons;
    }

    public static Map<Integer, Integer> getPersonsOrdersCount(Map<String, Order> orders) {
        Map<Integer, Integer> personsOrdersCount = new HashMap<>();
        Set<String> keySet = orders.keySet();
        for (String key : keySet) {
            Order order = orders.get(key);
            Person person = order.getPersoana();
            int personId = person.getId();
            if (personsOrdersCount.containsKey(personId)) {
                personsOrdersCount.put(personId, personsOrdersCount.get(personId) + 1);
            } else {
                personsOrdersCount.put(personId, 1);
            }
        }
        return personsOrdersCount;
    }

    public static void main(String[] args) {
        Person person = new Person(1, "Person1", "Person1", 20);
        Person person2 = new Person(2, "Person2", "Person2", 20);
        Product productApple = new Product(1, "Apples", "Fruits", 2.0);
        Product productTomato = new Product(2, "Tomato", "Vegetables", 5.0);
        Order order = new Order("1", productApple, person);

        Order order1 = new Order("2", productApple, person);

        Order order2 = new Order("3", productTomato, person);
        Order order3 = new Order("4", productTomato, person2);

        Map<String, Order> orderMap = new HashMap<>();
        orderMap.put("1", order);
        orderMap.put("2", order1);
        orderMap.put("3", order2);
        orderMap.put("4", order3);

        System.out.println(numberOfOrders(orderMap, 1));

        System.out.println(sumOfOrders(orderMap, 1));

        printSet(getOrderIdsForPerson(orderMap, 1));

        Map<Integer, Person> personsFromOrdersByProductId = getPersonsFromOrdersByProductId(orderMap, 2);
        Set<Integer> keys = personsFromOrdersByProductId.keySet();
        for(int key : keys) {
            System.out.print(personsFromOrdersByProductId.get(key).toString() + " ");
        }
        System.out.println("");

        Map<Integer, Integer> personsOrdersCount = getPersonsOrdersCount(orderMap);
        keys = personsFromOrdersByProductId.keySet();
        for(int key : keys) {
            System.out.println("Id person: " + key + ", nr orders: " + personsOrdersCount.get(key));
        }
    }

    public static void printSet(Set<String> elements) {
        for(String element : elements) {
            System.out.print(element + ' ');
        }
        System.out.println("");
    }
}
