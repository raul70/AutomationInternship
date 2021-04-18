package com.elena.courseoop;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ObjectManager {
    public Set<Person> extractPersonFromOrders(List<Order> orderList) {
        Set<Person> personSet = new HashSet<>();
        for (Order order : orderList) {
            Person p=order.getPersoana();
            personSet.add(p);
        }
        return personSet;
    }

    public double getPriceOfProductFromOrder(Map<String, Order> orderMap, int idOfProduct){
       Set<String> orderId = orderMap.keySet();
       for(String s: orderId){
          Order order = orderMap.get(s);
          Product product = order.getProdus();
          if(product.getId() == idOfProduct){

              return product.getPrice();
          }
       }
       return 0;
    }

    public Set<Person> extractPersonsFromOrder(Map<String,Order> orderMap, int idOfProduct){
        Set<String> orderIds = orderMap.keySet();
        Set<Person> personSet = new HashSet<>();
        for(String mapKey: orderIds){
            Order order = orderMap.get(mapKey);
            Product product = order.getProdus();
            int id = product.getId();
            if(idOfProduct == id){
                Person person = order.getPersoana();
                personSet.add(person);

            }
        }
        return personSet;
    }

}
