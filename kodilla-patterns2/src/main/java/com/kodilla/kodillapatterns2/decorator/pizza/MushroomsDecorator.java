package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends AbstractPizzaDecorator {
    public MushroomsDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mushrooms";
    }
}
