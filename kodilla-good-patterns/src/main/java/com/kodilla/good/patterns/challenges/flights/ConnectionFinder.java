package com.kodilla.good.patterns.challenges.flights;

public interface ConnectionFinder {
    void findConnection(String departure, String arrival);
    void findIndirectConnections(String departure, String arrival);
}
