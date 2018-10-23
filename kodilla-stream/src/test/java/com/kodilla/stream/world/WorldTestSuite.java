package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testpeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");
        Country poland = new Country("Poland",new BigDecimal("4"));
        Country germany = new Country("Germany",new BigDecimal("5"));
        Country china = new Country("China", new BigDecimal("12"));
        Country japan = new Country("Japan",new BigDecimal("8"));
        Country mexico = new Country("Mexico",new BigDecimal("10"));
        Country canada = new Country("Canada",new BigDecimal("2"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(canada);
        asia.addCountry(china);
        asia.addCountry(japan);
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);
        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("41");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
