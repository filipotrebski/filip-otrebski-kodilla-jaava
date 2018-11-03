package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Mr.Smith","smith@some.com");
        Product product = new Product("box",1.5,1);
        LocalDateTime orderCreationTime = LocalDateTime.now().minusDays(10);
        LocalDateTime shipDate = orderCreationTime.plusDays(11);
        return new OrderRequest(user,orderCreationTime,shipDate,product);
    }
}
