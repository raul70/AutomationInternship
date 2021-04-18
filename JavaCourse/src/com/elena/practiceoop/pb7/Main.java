package com.elena.practiceoop.pb7;

public class Main {
    public static void main(String[] args) {
        PaperBook paperBook = new PaperBook("News", "Cristian Sorescu", 15, "3 buc", "Actual", "Cluj Napoca");
        ElectronicBook electronicBook = new ElectronicBook("Funny Story", "Pop Elisa", 25, "www.funnystories.com", "pdf");

        System.out.println("Electronic Book price: "+ electronicBook.calcPrice());
        System.out.println("Paper book price with shipping cost: " + paperBook.calcPrice());
        System.out.println("The website where I found " + electronicBook.getTitle().toString() + "electonic book, is " + electronicBook.getNameOfWebsiteShop());

    }
}
