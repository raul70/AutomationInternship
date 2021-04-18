package com.elena.practiceoop.pb8;


public class Student {
    private String nume;
    private int anInscriere;

    public Student(String nume, int anInscriere) {
        this.nume = nume;
        this.anInscriere = anInscriere;
    }

    public void showStudentDetails() {
        System.out.println(nume + " " + anInscriere);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAnInscriere() {
        return anInscriere;
    }

    public void setAnInscriere(int anInscriere) {
        this.anInscriere = anInscriere;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", anInscriere=" + anInscriere +
                '}';
    }
}
