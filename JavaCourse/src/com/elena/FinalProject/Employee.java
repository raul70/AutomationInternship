package com.elena.FinalProject;

public class Employee extends Person{
    private Location workLocation;
    public Employee(int id, Location workLocation, String cnp, String firstName, String lastName, Address address) {
        super(id, cnp, firstName, lastName, address);
        this.workLocation = workLocation;
    }

    public Location getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Location workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + ", " +
                "workLocation=" + workLocation +
                '}';
    }
}
