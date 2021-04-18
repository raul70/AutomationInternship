package com.elena.practiceoop.pb8;


public class StudentAbsolvent extends Student {
    private int anAbsolvire;
    private double notaLicenta;
    private double mediaAnilor;

    public StudentAbsolvent(String nume, int anInscriere, int anAbsolvire, double notaLicenta, double mediaAnilor) {
        super(nume, anInscriere);
        this.anAbsolvire = anAbsolvire;
        this.notaLicenta = notaLicenta;
        this.mediaAnilor = mediaAnilor;
    }

    @Override
    public void showStudentDetails() {
        super.showStudentDetails();
        System.out.println(anAbsolvire + " " + notaLicenta + " " + mediaAnilor);
    }

    public int getAnAbsolvire() {
        return anAbsolvire;
    }

    public void setAnAbsolvire(int anAbsolvire) {
        this.anAbsolvire = anAbsolvire;
    }

    public double getNotaLicenta() {
        return notaLicenta;
    }

    public void setNotaLicenta(double notaLicenta) {
        this.notaLicenta = notaLicenta;
    }

    public double getMediaAnilor() {
        return mediaAnilor;
    }

    public void setMediaAnilor(double mediaAnilor) {
        this.mediaAnilor = mediaAnilor;
    }

    @Override
    public String toString() {
        return "StudentAbsolvent{" +
                "anAbsolvire=" + anAbsolvire +
                ", notaLicenta=" + notaLicenta +
                ", mediaAnilor=" + mediaAnilor +
                '}';
    }
}
