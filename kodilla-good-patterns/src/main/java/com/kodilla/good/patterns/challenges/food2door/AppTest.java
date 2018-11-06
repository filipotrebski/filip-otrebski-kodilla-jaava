package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;

public class AppTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.addNewSupplier(new ExtraFoodShop());
        order.addNewSupplier(new HealthyShop());
        order.addNewSupplier(new GlutenFreeShop());

        order.printSuppliersInventory();
        System.out.println("________________________");
        order.createOrder(2);
        System.out.println("________________________");
        order.createOrder(5);
        System.out.println("________________________");
        order.createOrder(12);
    }
}
