package com.ust.Airline.service;

import com.ust.Airline.Airline;
import com.ust.Airline.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface AirlineService {

    Airline addAirline(Airline airline);

    ResponseDto getFlightsWithAirlineId(Long airlineId);
}
