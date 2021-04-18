package com.elena.practiceoop.pb15;


public class Photograph extends Picture{
    private String cameraType;
    private String photographer;

    public Photograph(String titlu, double pret, String cameraType, String photographer) {
        super(titlu, pret);
        this.cameraType = cameraType;
        this.photographer = photographer;
    }

    @Override
    public double applyPromoPrice(double promoPrice) {
        System.out.println("Photographer: " + photographer + ", camera type: " + cameraType);
        return super.applyPromoPrice(promoPrice);
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    @Override
    public String toString() {
        return "Photograph{" +
                "cameraType='" + cameraType + '\'' +
                ", photographer='" + photographer + '\'' +
                '}';
    }
}
