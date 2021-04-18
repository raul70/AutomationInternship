package com.elena.practiceoop.pb15;

public class Painting extends Picture{
    private String artist;
    private String owner;

    public Painting(String titlu, double pret, String artist, String owner) {
        super(titlu, pret);
        this.artist = artist;
        this.owner = owner;
    }

    @Override
    public double applyPromoPrice(double promoPrice) {
        System.out.println("Artist: " + artist + ", owner:" + owner);
        return super.applyPromoPrice(promoPrice);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "artist='" + artist + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
