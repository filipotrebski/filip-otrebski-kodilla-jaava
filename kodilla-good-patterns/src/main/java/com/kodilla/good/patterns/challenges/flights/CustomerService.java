package com.kodilla.good.patterns.challenges.flights;

public class CustomerService {
    Connections connections;

    ConnectionFinder connectionFinder;

    public CustomerService(Connections connections, ConnectionFinder connectionFinder) {
        this.connections = connections;
        this.connectionFinder = connectionFinder;
    }

    public void conecctionPrint (String from) {
        connections.printConnections(from);
    }

}
