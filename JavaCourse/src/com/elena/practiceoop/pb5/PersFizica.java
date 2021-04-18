package com.elena.practiceoop.pb5;

public class PersFizica extends Person{
    private String cnp;
    private String domiciliu;

    public PersFizica(String lastName, String firstName, String cnp, String domiciliu) {
        super(lastName, firstName);
        this.cnp = cnp;
        this.domiciliu = domiciliu;
    }

    @Override
    public void showPersonDetails() {
        System.out.println(getFirstName() + " " + getLastName() + " " + cnp + " " + domiciliu);
    }

    public String getCnp() {
        return cnp;
    }

    public String getDomiciliu() {
        return domiciliu;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setDomiciliu(String domiciliu) {
        this.domiciliu = domiciliu;
    }

    @Override
    public String toString() {
        return "PersFizica{" +
                "cnp='" + cnp + '\'' +
                ", domiciliu='" + domiciliu + '\'' +
                '}';
    }
}
