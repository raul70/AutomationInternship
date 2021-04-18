package com.elena.practiceoop.pb4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ana", "Cluj Napoca", "1");
        Employee employee2 = new Employee("Alex", "Baia Mare", "2");
        FullTimeEmployee employee3 = new FullTimeEmployee("Mirela", "Cluj Napoca", "1",  20000);
        FullTimeEmployee employee4 = new FullTimeEmployee("Irina", "Brasov", "2", 30000);
        PartTimeEmployee employee5 = new PartTimeEmployee("Adina", "Sinaia","3", 100, 19);

        System.out.println(employee1.toString());
        employee2.setAddress("Brasov");
        System.out.println(employee2.toString());
        employee3.setMonthlySalary(55555);
        System.out.println("A full time employee is " + employee3.getName().toString());
        System.out.println("A full time employee is " + employee4.getName().toString());

        System.out.println(employee5.getName().toString() + " is a part time employee.");
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        Set<Employee> set = new HashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        boolean isEmployee = set.contains(set);
        System.out.println(isEmployee);
        for(Employee e : set){
            System.out.println(e);
        }
    }
}
