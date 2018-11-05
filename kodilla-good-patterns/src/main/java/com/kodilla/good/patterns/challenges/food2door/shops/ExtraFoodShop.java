package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.FoodProduct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtraFoodShop implements FoodSuplier {


    private List<FoodProduct> inventory = new ArrayList<>();

    public ExtraFoodShop() {
        createProductsList();
    }

    public void createProductsList() {
        inventory.add(new FoodProduct("Beef steak from Argentina", 22.5, 10, false, false));
        inventory.add(new FoodProduct("Salomon", 15.3, 3, false, false));
        inventory.add(new FoodProduct("Parboiled rice", 2.15, 30, false, false));
        inventory.add(new FoodProduct("French fries", 4.88, 10, false, false));
        inventory.add(new FoodProduct("Ananas", 7.5, 0, false, false));
    }

    @Override
    public void process(FoodProduct product) {
        boolean isAvailable = inventory.contains(product);
        System.out.println("\n" + toString());
        if (isAvailable && inventory.get(inventory.indexOf(product)).getUnitsInStock() > 1) {
            System.out.println(product.getProductName() + " is in stock.");
        } else {
            System.out.println("Order rejected. Product is not available");
        }
    }

    @Override
    public Iterator createIterator() {
        return inventory.iterator();
    }

    public List<FoodProduct> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}
