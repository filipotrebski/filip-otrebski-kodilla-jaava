package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int radius;
    private final double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double calculateField() {
        double field = pi * radius * radius;
        return field;
    }
}
