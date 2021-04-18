package com.elena.practiceoop.pb4;


public class Employee {
    private String employeeId;
    private String name;
    private String address;

    public Employee(String name, String address, String employeeId) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';

    }
    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        boolean isEmployee = false;
        if (employee.employeeId.equals(this.employeeId)) {

            isEmployee = true;
        }
        return isEmployee;
    }
    @Override
    public int hashCode() {
        return 31 * employeeId.hashCode();
    }

}
