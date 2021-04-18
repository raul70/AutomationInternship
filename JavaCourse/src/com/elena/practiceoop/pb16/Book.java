package com.elena.practiceoop.pb16;

public class Book extends LibraryItem{
    private String author;
    private String publisher;
    private int nrOfPages;

    public Book(String author, String publisher, int nrOfPages) {
        this.author = author;
        this.publisher = publisher;
        this.nrOfPages = nrOfPages;
    }

    @Override
    public void showItemDetails() {
        System.out.println("Book with author " + author + ", publisher " + publisher + ", nr of pages " + nrOfPages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", nrOfPages=" + nrOfPages +
                '}';
    }
}
