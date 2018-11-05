package com.kodilla.good.patterns.challenges.food2door;

public class FoodProduct {
    private String productName;
    private double price;
    private int unitsInStock;
    private boolean isOrganic;
    private boolean isGlutenFree;

    public FoodProduct(String productName, double price, int unitsInStock, boolean isOrganic, boolean isGlutenFree) {
        this.productName = productName;
        this.price = price;
        this.unitsInStock = unitsInStock;
        this.isOrganic = isOrganic;
        this.isGlutenFree = isGlutenFree;
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

    public boolean isOrganic() {
        return isOrganic;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    @Override
    public String toString() {
        return productName;
    }
}
