package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public interface Connections {
    List<Flight> allFlightsFromAirport(String source);
    List<Flight> allFlightsToAirport (String destination);
}
