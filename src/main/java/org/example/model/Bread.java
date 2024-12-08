package org.example.model;

public class Bread extends ProductForSale {
    private String size;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.size = "Medium"; // Default size
    }

    public Bread(String type, double price, String description, String size) {
        super(type, price, description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription() + ", Size: " + size);
    }
}