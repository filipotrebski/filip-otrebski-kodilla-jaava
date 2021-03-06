package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.FoodProduct;

import java.util.Iterator;

public interface FoodSupplier {
    void process(FoodProduct product);
    Iterator createIterator();
}
