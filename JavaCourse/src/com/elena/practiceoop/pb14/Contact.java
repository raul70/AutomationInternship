package com.elena.practiceoop.pb14;


public class Contact {
    private String nume;
    private String prenume;

    public Contact(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void sendMessage() {
        System.out.println("Sent message to " + nume + " " + prenume);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}
