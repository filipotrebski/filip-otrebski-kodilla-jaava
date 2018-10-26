package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("London", true);
        flights.put("Sydney", false);
        String destination = flight.getArrivalAirport();
        if (flights.containsKey(destination)) {
            System.out.println(flights.get(destination));
            return flights.get(destination);
        } else {
            System.out.println("Flight does't exist");
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        Flight flight0 = new Flight("Warsaw", "London");
        Flight flight1 = new Flight("Warsaw", "Antananarywa");
        Flight flight2 = new Flight("Singapore", "Sydney");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight0);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

//        try {
//            flightFinder.findFlight(flight1);
//        } catch (RouteNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
