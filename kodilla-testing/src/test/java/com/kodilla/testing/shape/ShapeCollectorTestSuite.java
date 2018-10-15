package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of the test");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Testing is finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }

    //1
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapes().size());
    }

    //2
    @Test
    public void testRemoveNotExistingFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(4, 2);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertFalse(result);
    }

    //3
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(6);
        Shape shape2 = new Square(5);
        shapeCollector.addFigure(shape);
        shapeCollector.addFigure(shape2);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, shapeCollector.getShapes().size());

    }

    //4
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //Then
        Shape retrivedShape;
        retrivedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(shape, retrivedShape);
    }

    //5
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(7, 6);
        shapeCollector.addFigure(shape);
        //When
        List<Shape> testShapeList = new ArrayList<>();
        testShapeList.add(shape);
        //Then
        Assert.assertEquals("Shape : " + testShapeList.get(0).getShapeName()
                + " Field : " + testShapeList.get(0).calculateField(), shapeCollector.showFigures());


    }
}
