package com.elena.practiceoop.pb14;


public class EmailContact extends Contact{
    private String email;

    public EmailContact(String nume, String prenume, String email) {
        super(nume, prenume);
        this.email = email;
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println(" with email " + email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailContact{" +
                "email='" + email + '\'' +
                '}';
    }
}
