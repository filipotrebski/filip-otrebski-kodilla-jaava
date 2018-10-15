package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if (n >= 0 && n < shapes.size()) {
            theShape = shapes.get(n);
        }
        return theShape;
    }

    public String showFigures() {
        String storedFigures = "";
        for (Shape shape : shapes){
            storedFigures += "Shape : " + shape.getShapeName()
                    + " Field : " + shape.calculateField();
        }
        return storedFigures;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
