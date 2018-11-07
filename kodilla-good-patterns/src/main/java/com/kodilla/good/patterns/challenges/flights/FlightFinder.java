package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder implements ConnectionFinder {

    private FlightsDatabase database = new FlightsDatabase();

    @Override
    public List<Flight> findConnection(String departure, String arrival) {
        List<Flight> flights = database.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
        return flights;
    }

    @Override
    public List<Flight> findIndirectConnections(String departure, String arrival) {
        List<Flight> flights = database.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure) && !flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
        List<Flight> flightList = null;
        for (Flight flight : flights) {
            String middle = flight.getArrivalAirport();
            flightList = findConnection(middle,arrival);
        }
        flightList.stream().collect(Collectors.toCollection(() -> flights));
        return flights;
    }
}
