package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BigPizzadecorator extends AbstractPizzaDecorator {
    public BigPizzadecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().multiply(new BigDecimal(1.5));
    }

    @Override
    public String getDescription() {
        return "Big " + super.getDescription();
    }
}
