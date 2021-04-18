package com.elena.practiceoop.pb10;


public class Professor extends Person{
    private double salary;

    public Professor(String lastName, String firstName, String address, double salary) {
        super(lastName, firstName, address);
        this.salary = salary;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
        System.out.println(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salary=" + salary +
                '}';
    }
}
