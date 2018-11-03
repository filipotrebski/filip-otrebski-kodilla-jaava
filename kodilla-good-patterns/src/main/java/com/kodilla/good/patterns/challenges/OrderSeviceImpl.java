package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderSeviceImpl implements OrderService{
    @Override
    public boolean order(Product product) {
        if (product.getUnitsInStock() > 0){
            return true;
        } else {
            return false;
        }
    }
}
