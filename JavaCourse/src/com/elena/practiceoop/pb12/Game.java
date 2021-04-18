package com.elena.practiceoop.pb12;


public class Game {
    private String titlu;

    public Game(String titlu) {
        this.titlu = titlu;
    }

    public void howToPlay() {
        System.out.println("How to play " + titlu);
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String toString() {
        return "Game{" +
                "titlu='" + titlu + '\'' +
                '}';
    }
}
