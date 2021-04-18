package com.elena.FinalProject;

import java.util.List;

public class EmployeeTrainer extends Person implements Trainer {

    public EmployeeTrainer(int id, String cnp, String firstName, String lastName, Address address) {
        super(id, cnp, firstName, lastName, address);
    }

    @Override
    public double calculateTrainerRemuneration(TrainingGroup trainingGroup) {
        List<Course> courses = trainingGroup.getTraining().getCourses();
        double startRemuneration = 0;

        for(Course course : courses){
            double coursePrice = course.getCoursePrice();
            startRemuneration+=coursePrice;

        }
        return startRemuneration;
    }

    @Override
    public String toString() {
        return "EmployeeTrainer{" +
                "id=" + super.getId() +
                ", cnp=" + super.getCnp() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address=" + super.getAddress() +
                '}';
    }
}
