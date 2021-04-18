package com.elena.practiceoop.pb12;


public class VideoGame extends Game{
    private String producator;

    public VideoGame(String titlu, String producator) {
        super(titlu);
        this.producator = producator;
    }

    @Override
    public void howToPlay() {
        super.howToPlay();
        System.out.println("Made by " + producator);
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "producator='" + producator + '\'' +
                '}';
    }
}
