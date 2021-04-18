package com.elena.practiceoop.pb12;


public class BoardGame extends Game{
    private int nrOfPlayers;
    private double averagePlaytime;

    public BoardGame(String titlu, int nrOfPlayers, double averagePlaytime) {
        super(titlu);
        this.nrOfPlayers = nrOfPlayers;
        this.averagePlaytime = averagePlaytime;
    }

    @Override
    public void howToPlay() {
        super.howToPlay();
        System.out.println("Nr of players: " + nrOfPlayers + ", average playtime: " + averagePlaytime);
    }

    public int getNrOfPlayers() {
        return nrOfPlayers;
    }

    public void setNrOfPlayers(int nrOfPlayers) {
        this.nrOfPlayers = nrOfPlayers;
    }

    public double getAveragePlaytime() {
        return averagePlaytime;
    }

    public void setAveragePlaytime(double averagePlaytime) {
        this.averagePlaytime = averagePlaytime;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "nrOfPlayers=" + nrOfPlayers +
                ", averagePlaytime=" + averagePlaytime +
                '}';
    }
}
