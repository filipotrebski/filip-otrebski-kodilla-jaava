package com.kodilla.good.patterns.challenges.flights;

public class CustomerService {
    private Connections connections;
    private ConnectionFinder connectionFinder;

    public CustomerService(Connections connections, ConnectionFinder connectionFinder) {
        this.connections = connections;
        this.connectionFinder = connectionFinder;
    }

    public void printAllConnectionsFrom (String from) {
        connections.printConnections(from);
    }

    public void printConnectionsFromTo(String departure, String arrival){
        connectionFinder.findConnection(departure,arrival);
        connectionFinder.findIndirectConnections(departure,arrival);
    }

}
