package com.ust.FlightService.repository;

import com.ust.FlightService.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    Flight findByAirlineId(Long airlineId);
}
