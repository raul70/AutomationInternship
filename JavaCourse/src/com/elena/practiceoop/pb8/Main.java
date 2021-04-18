package com.elena.practiceoop.pb8;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mihai", 2019);
        Student student1 = new Student("Andrei", 2016);
        StudentAbsolvent studentAbsolvent = new StudentAbsolvent("Miruna", 2015, 2019, 9,8);

        System.out.println("Student absolvent" + studentAbsolvent.getNume().toString() + " in anul " + studentAbsolvent.getAnAbsolvire() + " cu nota la licenta " + studentAbsolvent.getNotaLicenta());
        System.out.println("Tudentii care nu au absolvit inca sunt " +  student.getNume().toString() + " si " + student1.getNume().toString());

    }
}
