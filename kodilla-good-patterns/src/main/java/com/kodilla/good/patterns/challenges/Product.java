package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private double price;
    private int unitsInStock;

    public Product(String productName, double price, int unitsInStock) {
        this.productName = productName;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }
}
