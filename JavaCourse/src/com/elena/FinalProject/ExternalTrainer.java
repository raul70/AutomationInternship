package com.elena.FinalProject;

public class ExternalTrainer extends Person {
    String professionalDescription;
    String link;
    double amountPerHor;

    public ExternalTrainer(int id, String cnp, String firstName, String lastName, Address address, String professionalDescription, String link, double amountPerHor) {
        super(id, cnp, firstName, lastName, address);
        this.professionalDescription = professionalDescription;
        this.link = link;
        this.amountPerHor = amountPerHor;
    }

    @Override
    public String toString() {
        return "ExternalTrainer{" + super.toString() + ", " +
                "professionalDescription='" + professionalDescription + '\'' +
                ", link='" + link + '\'' +
                ", amountPerHor=" + amountPerHor +
                '}';
    }
}

