package com.elena.practiceoop.pb4;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, String address, String employeeId, double monthlySalary) {
        super(name, address, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }


    public double calculatePay() {
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
