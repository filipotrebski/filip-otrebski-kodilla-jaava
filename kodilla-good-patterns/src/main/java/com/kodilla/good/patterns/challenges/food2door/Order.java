package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.shops.FoodSuplier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {
    private List<FoodSuplier> suppliers = new ArrayList<>();
    private List<FoodProduct> products = new ArrayList<>();

    public Order(FoodSuplier supplier, FoodSuplier supplier1, FoodSuplier supplier2) {
        suppliers.add(supplier);
        suppliers.add(supplier1);
        suppliers.add(supplier2);
    }

    public void printSuppliersInventory() {
        for (FoodSuplier foodSuplier : suppliers) {
            printSuppliersInventory(foodSuplier.createIterator());
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
       for (FoodSuplier foodSuplier : suppliers) {
           foodSuplier.process(product);
       }
    }

    public List<FoodProduct> getProducts() {
        return products;
    }

    public List<FoodSuplier> getSuppliers() {
        return suppliers;
    }
}
