package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int baseLength;
    private int height;

    public Triangle(int baseLength, int height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double calculateField() {
        double field = baseLength * (height / 2);
        return field;
    }

    public int getBaseLength() {
        return baseLength;
    }

    public int getHeight() {
        return height;
    }
}
