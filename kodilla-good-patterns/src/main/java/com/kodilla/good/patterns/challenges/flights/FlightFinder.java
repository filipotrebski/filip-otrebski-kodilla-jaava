package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder implements ConnectionFinder{

    private FlightsDatabase database = new FlightsDatabase();

    @Override
    public void findConnection(String departure, String arrival) {
        List<Flight> flights = database.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
        flights.stream().forEach(System.out::println);
    }

    @Override
    public void findIndirectConnections(String departure, String arrival) {
        List<Flight> flights = database.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(departure) && !flight.getDepartureAirport().equals(departure))
                .collect(Collectors.toList());
        //TODO skonczyc
        //database.getFlights().stream().filter(flight -> flight.getDepartureAirport().equals())
    }
}
