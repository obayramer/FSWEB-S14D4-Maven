package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale bread = new Bread("Bread", 10.0, "Fresh Bread", "Large");
        ProductForSale chocolate = new Chocolate("Chocolate", 5.0, "Sweet Chocolate", "Dark");
        ProductForSale coke = new Coke("Coke", 3.0, "Chilled Coke", 330);

        ProductForSale[] products = {bread, chocolate, coke};

        listProducts(products);
    }
}