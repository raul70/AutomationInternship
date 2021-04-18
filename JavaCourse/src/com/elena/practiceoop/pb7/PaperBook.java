package com.elena.practiceoop.pb7;


public class PaperBook extends Book{
    private String stock;
    private String nameOfShopStore;
    private String addressOfShopStore;

    public PaperBook(String title, String author, double price, String stock, String nameOfShopStore, String addressOfShopStore) {
        super(title, author, price);
        this.stock = stock;
        this.nameOfShopStore = nameOfShopStore;
        this.addressOfShopStore = addressOfShopStore;
    }

    @Override
    public double calcPrice() {
        applyShippingCost(20);
        return getPrice();
    }

    public void applyShippingCost(double cost) {
        this.setPrice(this.getPrice() + cost);
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getNameOfShopStore() {
        return nameOfShopStore;
    }

    public void setNameOfShopStore(String nameOfShopStore) {
        this.nameOfShopStore = nameOfShopStore;
    }

    public String getAddressOfShopStore() {
        return addressOfShopStore;
    }

    public void setAddressOfShopStore(String addressOfShopStore) {
        this.addressOfShopStore = addressOfShopStore;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "stock='" + stock + '\'' +
                ", nameOfShopStore='" + nameOfShopStore + '\'' +
                ", addressOfShopStore='" + addressOfShopStore + '\'' +
                '}';
    }
}
