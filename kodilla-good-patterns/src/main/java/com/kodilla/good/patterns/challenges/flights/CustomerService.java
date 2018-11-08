package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class CustomerService {

    private ConnectionFinder connectionFinder;

    public CustomerService(ConnectionFinder connectionFinder) {

        this.connectionFinder = connectionFinder;
    }

    public List<Flight> allDeparturesFrom(String from) {
        return connectionFinder.allFlightsFromAirport(from);
    }

    public List<Flight> allArrivalsTo(String destination) {
        return connectionFinder.allFlightsToAirport(destination);
    }

    public List<Flight> directConnections(String departure, String arrival) {
       return connectionFinder.findConnection(departure, arrival);
    }
    public List<Flight> connectionsWithStepover(String departure, String arrival){
        return connectionFinder.findIndirectConnections(departure,arrival);
    }
}
