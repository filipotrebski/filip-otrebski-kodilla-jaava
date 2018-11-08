package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public interface ConnectionFinder {
    List<Flight> allFlightsFromAirport(String source);
    List<Flight> allFlightsToAirport (String destination);
    List<Flight> findConnection(String departure, String arrival);
    List<Flight> findIndirectConnections(String departure, String arrival);
}
