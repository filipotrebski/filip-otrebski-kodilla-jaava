package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaDecoratorTestSuite {

    @Test
    public void testBasicPizza() {
        //Given
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
        //When
        BigDecimal theCost = pizza.getCost();
        String components = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(15), theCost);
        assertEquals("Pizza with: tomato sauce, cheese", components);
    }

    @Test
    public void testPizzaOnThinDoughWithExtraCheese() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ThinDoughDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
        //When
        BigDecimal theCost = pizza.getCost();
        String components = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(21), theCost);
        assertEquals("Pizza with: tomato sauce, cheese on thin dough, extra cheese", components);

    }

    @Test
    public void testPizzaWithAllComponents() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new DriedTomatoesDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new PeperoniDecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new ThinDoughDecorator(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
        //When
        BigDecimal theCost = pizza.getCost();
        String components = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(33), theCost);
        assertEquals("Pizza with: tomato sauce, cheese, dried tomatoes" +
                ", extra cheese, mushrooms, peperoni, salami on thin dough", components);
    }

    @Test
    public void testPizzaWithSalamiAndPepperoni() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new SalamiDecorator(pizza);
        pizza = new PeperoniDecorator(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
        //when
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(23), theCost);
        assertEquals("Pizza with: tomato sauce, cheese, salami, peperoni", description);
    }

    @Test
    public void testBigPizzaWithSalamiAndPepperoni() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new BigPizzadecorator(pizza);
        pizza = new SalamiDecorator(pizza);
        pizza = new PeperoniDecorator(pizza);
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
        //when
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(30.5), theCost);
        assertEquals("Big Pizza with: tomato sauce, cheese, salami, peperoni", description);
    }
}
