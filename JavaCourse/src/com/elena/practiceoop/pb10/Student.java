package com.elena.practiceoop.pb10;


public class Student extends Person{
    private int yearOfStudy;
    private int nrMatricol;

    public Student(String lastName, String firstName, String address, int yearOfStudy, int nrMatricol) {
        super(lastName, firstName, address);
        this.yearOfStudy = yearOfStudy;
        this.nrMatricol = nrMatricol;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
        System.out.println(yearOfStudy + " " + nrMatricol);
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }

    public void setNrMatricol(int nrMatricol) {
        this.nrMatricol = nrMatricol;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy +
                ", nrMatricol=" + nrMatricol +
                '}';
    }
}
