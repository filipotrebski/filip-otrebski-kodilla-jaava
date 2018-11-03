package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime creationTime;
    private LocalDateTime shipTime;
    private Product orderedProduct;

    public OrderRequest(User user, LocalDateTime creationTime, LocalDateTime shipTime, Product orderedProduct) {
        this.user = user;
        this.creationTime = creationTime;
        this.shipTime = shipTime;
        this.orderedProduct = orderedProduct;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getCreationTime() {

        return creationTime;
    }

    public LocalDateTime getShipTime() {
        return shipTime;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }
}
