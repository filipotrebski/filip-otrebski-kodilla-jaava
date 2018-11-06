package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.shops.FoodSupplier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {

    private List<FoodSupplier> suppliers = new ArrayList<>();
    private List<FoodProduct> products = new ArrayList<>();

    public void printSuppliersInventory() {
        if (suppliers.size() > 0) {
            for (FoodSupplier foodSupplier : suppliers) {
                printSuppliersInventory(foodSupplier.createIterator());
            }
        }
    }

    private void printSuppliersInventory(Iterator iterator) {
        while (iterator.hasNext()) {
            FoodProduct foodProduct = (FoodProduct) iterator.next();
            products.add(foodProduct);
            System.out.println(foodProduct.toString());
        }
    }

    public void createOrder(int productNumber) {
        FoodProduct product = products.get(productNumber);
        for (FoodSupplier foodSupplier : suppliers) {
            foodSupplier.process(product);
        }
    }

    public List<FoodProduct> getProducts() {
        return products;
    }

    public List<FoodSupplier> getSuppliers() {
        return suppliers;
    }

    public void addNewSupplier(FoodSupplier supplier) {
        suppliers.add(supplier);
    }
}
