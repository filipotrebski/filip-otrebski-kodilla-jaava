package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        continents.forEach(System.out::println);
        BigDecimal worldPopulation = continents.stream()
                .map(c -> {
                    System.out.println(c);
                    return c;
                })
                .flatMap(continent -> continent.getCountries().stream())
                .map(c->{
                    System.out.println(c.getCountryName() + " : " + c.getPeopleQuantity());
                    return c;
                })
                .map(Country::getPeopleQuantity)
                .map(bd -> {
                    System.out.println(bd);
                    return bd;
                })
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPopulation;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }
}
