package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.FoodProduct;

import java.util.Iterator;

public class GlutenFreeShopIterator implements Iterator {

    private FoodProduct[] inventory;
    private int index = 0;

    public GlutenFreeShopIterator(FoodProduct[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean hasNext() {
        if (index >= inventory.length || inventory[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        FoodProduct product = inventory[index];
        index++;
        return product;
    }
}
