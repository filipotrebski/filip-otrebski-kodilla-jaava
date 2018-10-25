package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("London", true);
        flights.put("Sydney", false);
        String destination = flight.getArrivalAirport();
        if (!flights.containsKey(destination) || flights.get(flight.getArrivalAirport()) == false) {
            throw new RouteNotFoundException();
        }

        System.out.println("Flight from " + flight.getDepartureAirport() + " to "
                + flight.getArrivalAirport() + " has been found");

    }

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "London");
        Flight flight1 = new Flight("Warsaw", "Antananarywa");
        Flight flight2 = new Flight("Singapore", "Sydney");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
    }
}
