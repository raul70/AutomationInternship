package com.elena.practiceoop.pb5;


public class PersoanaJuridica extends Person{

    private String companie;
    private String cuiFirma;
    private String adresaFirma;

    public PersoanaJuridica(String lastName, String firstName, String companie, String cuiFirma, String adresaFirma) {
        super(lastName, firstName);
        this.companie = companie;
        this.cuiFirma = cuiFirma;
        this.adresaFirma = adresaFirma;
    }

    @Override
    public void showPersonDetails() {
        System.out.println(getFirstName() + " " + getLastName() + " " + companie + " " + cuiFirma + " " + adresaFirma);
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getCuiFirma() {
        return cuiFirma;
    }

    public void setCuiFirma(String cuiFirma) {
        this.cuiFirma = cuiFirma;
    }

    public String getAdresaFirma() {
        return adresaFirma;
    }

    public void setAdresaFirma(String adresaFirma) {
        this.adresaFirma = adresaFirma;
    }

    @Override
    public String toString() {
        return "PersoanaJuridica{" +
                "companie='" + companie + '\'' +
                ", cuiFirma='" + cuiFirma + '\'' +
                ", adresaFirma='" + adresaFirma + '\'' +
                '}';
    }
}
