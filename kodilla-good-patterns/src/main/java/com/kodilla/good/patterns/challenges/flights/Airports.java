package com.kodilla.good.patterns.challenges.flights;

public enum Airports {

    BERLIN ("Berlin"),
    CHICAGO ("Chicago"),
    GDANSK ("Gdańsk"),
    KATOWICE ("Katowice"),
    KRAKOW ("Kraków"),
    WARSZAWA ("Warszawa"),
    WROCLAW ("Wrocław");

    private String airport;

    Airports(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }
}
