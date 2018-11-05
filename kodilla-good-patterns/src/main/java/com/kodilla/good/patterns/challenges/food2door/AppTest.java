package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;

public class AppTest {
    public static void main(String[] args) {
        Order order = new Order(new ExtraFoodShop(),new GlutenFreeShop(),new HealthyShop());

        order.printSuppliersInventory();
        System.out.println("________________________");
        order.createOrder(2);
        System.out.println("________________________");
        order.createOrder(5);
        System.out.println("________________________");
        order.createOrder(12);
    }
}
