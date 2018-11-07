package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class CustomerService {
    private Connections connections;
    private ConnectionFinder connectionFinder;

    public CustomerService(Connections connections, ConnectionFinder connectionFinder) {
        this.connections = connections;
        this.connectionFinder = connectionFinder;
    }

    public List<Flight> allDeparturesFrom(String from) {
        return connections.allFlightsFromAirport(from);
    }

    public List<Flight> allArrivalsTo(String destination) {
        return connections.allFlightsToAirport(destination);
    }

    public List<Flight> directConnections(String departure, String arrival) {
       return connectionFinder.findConnection(departure, arrival);
    }
    public List<Flight> connectionsWithStepover(String departure, String arrival){
        return connectionFinder.findIndirectConnections(departure,arrival);
    }
}
