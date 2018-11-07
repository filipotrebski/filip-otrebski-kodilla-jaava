package com.kodilla.good.patterns.challenges.flights;

public class FlightApp {
    public static void main(String[] args) {
        CustomerService service = new CustomerService(new FlightsDatabase(),new FlightFinder());


        service.allDeparturesFrom(Airports.KRAKOW.getAirport()).stream().forEach(System.out::println);
        System.out.println("----------------------");
        service.allArrivalsTo(Airports.WARSZAWA.getAirport()).stream().forEach(System.out::println);
        System.out.println("----------------------");
        service.directConnections(Airports.KRAKOW.getAirport(),Airports.WARSZAWA.getAirport()).forEach(System.out::println);
        System.out.println("----------------------");
        service.connectionsWithStepover(Airports.KRAKOW.getAirport(),Airports.WARSZAWA.getAirport()).forEach(System.out::println);
    }
}
