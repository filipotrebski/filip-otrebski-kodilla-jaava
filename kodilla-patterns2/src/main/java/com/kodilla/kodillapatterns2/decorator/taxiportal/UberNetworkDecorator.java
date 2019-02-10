package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkDecorator extends AbstractTaxiOrderDecorator {

    public UberNetworkDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcodded stub cost cost 20
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}
