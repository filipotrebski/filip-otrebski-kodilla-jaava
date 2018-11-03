package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrdersDBase implements OrderRepository{
    @Override
    public boolean createOrder(User user, LocalDateTime creationTime, LocalDateTime realisationDate, Product product) {
            System.out.println("Order of user : " + user.getUsername()
                    + "\nproduct :" + product.getProductName()
                    + "\ncreated : " + creationTime.toString()
                    + "\nshipped : " + realisationDate.toString());
            return true;
    }
}
