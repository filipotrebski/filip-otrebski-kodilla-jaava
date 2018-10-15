package com.kodilla.testing;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;

public class TestingMain {

    public static void main(String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);
        shapeCollector.addFigure(shape);
        shapeCollector.getShapes().add(shape);


    }
}
