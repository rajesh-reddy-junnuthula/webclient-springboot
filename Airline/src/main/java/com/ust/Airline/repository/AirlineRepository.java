package com.ust.Airline.repository;

import com.ust.Airline.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline,Long> {


    Airline findByAirlineId(Long airlineId);
}
