package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .Bun("White Bun with sesame")
                .Burgers(2)
                .Sauce("barbecue")
                .Ingredient("salad")
                .Ingredient("tomatoes")
                .Ingredient("beckon")
                .Ingredient("cheddar")
                .bulid();
        //When
        int howManyBUrgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        boolean isChiliExsist = bigMac.getIngredients().contains("chili");
        //Then
        Assert.assertEquals(2,howManyBUrgers);
        Assert.assertEquals(4,howManyIngredients);
        Assert.assertFalse(isChiliExsist);
    }
}
