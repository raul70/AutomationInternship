package com.elena.practiceoop.pb16;

public class Album extends LibraryItem{
    private String artist;
    private int nrOfSongs;

    public Album(String artist, int nrOfSongs) {
        this.artist = artist;
        this.nrOfSongs = nrOfSongs;
    }

    @Override
    public void showItemDetails() {
        System.out.println("Artist " + artist + " has " + nrOfSongs + " songs");
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNrOfSongs() {
        return nrOfSongs;
    }

    public void setNrOfSongs(int nrOfSongs) {
        this.nrOfSongs = nrOfSongs;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", nrOfSongs=" + nrOfSongs +
                '}';
    }
}
