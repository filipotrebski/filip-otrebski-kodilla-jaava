package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.FoodProduct;

import java.util.Iterator;

public class GlutenFreeShop implements FoodSupplier {

    private FoodProduct[] inventory;

    public GlutenFreeShop() {
        inventory = new FoodProduct[5];
        inventory[0] = new FoodProduct("Basmati rise", 3.35, 15, false, true);
        inventory[1] = new FoodProduct("Corn flower", 5.5, 20, true, true);
        inventory[2] = new FoodProduct("Chocolate", 10.5, 15, false, true);
        inventory[3] = new FoodProduct("Grapes", 4.15, 15, false, true);
        inventory[4] = new FoodProduct("Wine", 15.3, 0, false, true);
    }

    @Override
    public void process(FoodProduct product) {
        boolean isAvalible = false;
        System.out.println("\n" + toString());
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].equals(product)) {
                isAvalible = (inventory[i].getUnitsInStock() > 0);
                System.out.println("Order confirmed");
            }
        }
        if (!isAvalible) {
            System.out.println(product.getProductName() + " is't available ");
        }

    }

    public FoodProduct[] getInventory() {
        return inventory;
    }

    @Override
    public Iterator createIterator() {
        return new GlutenFreeShopIterator(inventory);
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }

}
