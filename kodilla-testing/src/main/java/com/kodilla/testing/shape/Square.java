package com.kodilla.testing.shape;

public class Square implements Shape {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double calculateField() {
        double field = width * width;
        return field;
    }

    public int getWidth() {
        return width;
    }
}
