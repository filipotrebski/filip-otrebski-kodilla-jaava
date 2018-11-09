package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 10;
        double b = 5;
        //When
        double addResult = calculator.add(a, b);
        double subResult = calculator.sub(a, b);
        double mulResult = calculator.mul(a, b);
        double divResult = calculator.div(a, b);
        //Then
        Assert.assertEquals(15, addResult, 0.001);
        Assert.assertEquals(5, subResult, 0.001);
        Assert.assertEquals(50, mulResult, 0.001);
        Assert.assertEquals(2, divResult, 0.001);


    }
}
