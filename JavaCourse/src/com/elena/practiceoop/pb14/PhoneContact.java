package com.elena.practiceoop.pb14;


public class PhoneContact extends Contact{
    private String telefon;

    public PhoneContact(String nume, String prenume, String telefon) {
        super(nume, prenume);
        this.telefon = telefon;
    }

    @Override
    public void sendMessage() {
        System.out.println(" with telefon" + telefon);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "PhoneContact{" +
                "telefon='" + telefon + '\'' +
                '}';
    }
}
