package com.ust.FlightService.controller;


import com.netflix.discovery.converters.Auto;
import com.ust.FlightService.FlightServiceApplication;
import com.ust.FlightService.model.Flight;
import com.ust.FlightService.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    public FlightService flightService;

    @PostMapping("/add-flight")
    public Flight addflight(@RequestBody Flight flight) {
        return flightService.add(flight);
    }

    @GetMapping("/{airlineId}")
    public Flight getFlightByAirlineId(@PathVariable Long airlineId) {
        return flightService.getByAirlineId(airlineId);
    }

}
