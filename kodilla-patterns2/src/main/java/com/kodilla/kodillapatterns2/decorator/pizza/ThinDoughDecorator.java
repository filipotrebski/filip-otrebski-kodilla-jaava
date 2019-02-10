package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThinDoughDecorator extends AbstractPizzaDecorator {
    public ThinDoughDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " on thin dough";
    }
}
