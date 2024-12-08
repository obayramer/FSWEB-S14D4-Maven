package org.example.model;

public class Coke extends ProductForSale {
    private int volume;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 500; // Default volume
    }

    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Volume: " + volume + "ml");
    }
}
