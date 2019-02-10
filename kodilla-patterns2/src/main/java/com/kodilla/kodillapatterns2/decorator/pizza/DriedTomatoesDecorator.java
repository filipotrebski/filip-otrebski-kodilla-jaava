package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class DriedTomatoesDecorator extends AbstractPizzaDecorator{
    public DriedTomatoesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", dried tomatoes";
    }
}
