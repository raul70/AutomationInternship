package com.elena.practiceoop.pb4;

public class PartTimeEmployee extends Employee implements SalaryCalculation{
    private int nrOfHoursWorked;
    private double pricePerHour;

    public PartTimeEmployee(String name, String address, String employeeId, int nrOfHoursWorked, double pricePerHour) {
        super(name, address, employeeId);
        this.nrOfHoursWorked = nrOfHoursWorked;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "nrOfHoursWorked=" + nrOfHoursWorked +
                ", pricePerHour=" + pricePerHour +
                '}';
    }


    public int getNrOfHoursWorked() {
        return nrOfHoursWorked;
    }

    public void setNrOfHoursWorked(int nrOfHoursWorked) {
        this.nrOfHoursWorked = nrOfHoursWorked;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
