package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.FoodProduct;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HealthyShop implements FoodSuplier {
    private static final String VEGETABLES = "Vegetables";
    private static final String MEAT = "Meat";
    private static final String FRUITS = "Fruits";

    private Map<String, FoodProduct> inventory = new HashMap<>();

    public HealthyShop() {
        setFoodProductMap();
    }

    public void setFoodProductMap() {
        inventory.put(VEGETABLES, new FoodProduct("Eggplant", 11.5, 0, true, true));
        inventory.put(MEAT, new FoodProduct("Turkey", 25.5, 5, true, true));
        inventory.put(FRUITS, new FoodProduct("Apple", 7.00, 2, true, true));
    }

    @Override
    public void process(FoodProduct product) {
        boolean isAvalible = false;
        System.out.println("\n" + toString());
        for (FoodProduct foodProduct : inventory.values()) {
            if (foodProduct.equals(product) && foodProduct.getUnitsInStock() > 0) {
                System.out.println("Order accepted");
                isAvalible = true;
            }
        }
        if (!isAvalible) {
            System.out.println("Order rejected");
        }

    }

    @Override
    public Iterator createIterator() {
        return inventory.values().iterator();
    }

    public Map<String, FoodProduct> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}
