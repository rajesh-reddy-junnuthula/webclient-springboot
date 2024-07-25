package com.ust.FlightService.service;

import com.ust.FlightService.model.Flight;
import com.ust.FlightService.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    public FlightRepository repo;


    public Flight add(Flight flight) {
        return repo.save(flight);
    }

    public Flight getByAirlineId(Long airlineId) {
        return  repo.findByAirlineId(airlineId);
    }
}
