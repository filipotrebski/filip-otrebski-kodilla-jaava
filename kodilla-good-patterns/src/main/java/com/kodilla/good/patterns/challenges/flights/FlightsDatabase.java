package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsDatabase implements Connections {

    private List<Flight> flights = new ArrayList<>();

    public FlightsDatabase() {
        flights.add(new Flight(Airports.BERLIN.getAirport(), Airports.WARSZAWA.getAirport()));
        flights.add(new Flight(Airports.CHICAGO.getAirport(), Airports.KRAKOW.getAirport()));
        flights.add(new Flight(Airports.CHICAGO.getAirport(), Airports.WARSZAWA.getAirport()));
        flights.add(new Flight(Airports.KATOWICE.getAirport(), Airports.GDANSK.getAirport()));
        flights.add(new Flight(Airports.KATOWICE.getAirport(), Airports.WARSZAWA.getAirport()));
        flights.add(new Flight(Airports.KRAKOW.getAirport(), Airports.WARSZAWA.getAirport()));
        flights.add(new Flight(Airports.KRAKOW.getAirport(), Airports.WROCLAW.getAirport()));
        flights.add(new Flight(Airports.KRAKOW.getAirport(), Airports.GDANSK.getAirport()));
        flights.add(new Flight(Airports.KRAKOW.getAirport(), Airports.CHICAGO.getAirport()));
        flights.add(new Flight(Airports.WARSZAWA.getAirport(), Airports.KRAKOW.getAirport()));
        flights.add(new Flight(Airports.WARSZAWA.getAirport(), Airports.BERLIN.getAirport()));
        flights.add(new Flight(Airports.WARSZAWA.getAirport(), Airports.CHICAGO.getAirport()));
        flights.add(new Flight(Airports.WARSZAWA.getAirport(), Airports.GDANSK.getAirport()));
        flights.add(new Flight(Airports.WARSZAWA.getAirport(), Airports.KATOWICE.getAirport()));
        flights.add(new Flight(Airports.WARSZAWA.getAirport(), Airports.WROCLAW.getAirport()));
        flights.add(new Flight(Airports.WROCLAW.getAirport(), Airports.KATOWICE.getAirport()));
        flights.add(new Flight(Airports.WROCLAW.getAirport(), Airports.WARSZAWA.getAirport()));
    }

    @Override
    public void printConnections(String source) {
        System.out.println("Available connections from " + source);
        flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(source))
                .map(f -> f.getArrivalAirport())
                .forEach(System.out::println);
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
