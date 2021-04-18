package com.elena.FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<Employee> employeeList;
    private List<EmployeeTrainer> employeeTrainerList;
    private List<ExternalTrainer> externalTrainerList;

    public Repository() {
        this.employeeList = new ArrayList<>();
        this.employeeTrainerList = new ArrayList<>();
        this.externalTrainerList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void addEmployeeTrainer(EmployeeTrainer employeeTrainer) {
        this.employeeTrainerList.add(employeeTrainer);
    }

    public void addExternalTrainer(ExternalTrainer externalTrainer) {
        this.externalTrainerList.add(externalTrainer);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<EmployeeTrainer> getEmployeeTrainerList() {
        return employeeTrainerList;
    }

    public List<ExternalTrainer> getExternalTrainerList() {
        return externalTrainerList;
    }
}
