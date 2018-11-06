package com.kodilla.good.patterns.challenges.flights;

public class FlightApp {
    public static void main(String[] args) {
        CustomerService service = new CustomerService(new FlightsDatabase(),new FlightFinder());

        service.printAllConnectionsFrom(Airports.KRAKOW.getAirport());
        System.out.println("----------------------");
        service.printConnectionsFromTo(Airports.KRAKOW.getAirport(),Airports.WARSZAWA.getAirport());
    }
}
