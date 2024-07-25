package com.ust.Airline.service;

import com.ust.Airline.Airline;
import com.ust.Airline.dto.FlightDto;
import com.ust.Airline.dto.ResponseDto;
import com.ust.Airline.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import  java.util.*;
@Service
public class AirlineServiceImpl {

    @Autowired
    private AirlineRepository airlineRepository;

    @Autowired
    private WebClient webClient;

    public Airline addAirline(Airline airline){
        return airlineRepository.save(airline);
    }

    public ResponseDto getFlightsWithAirlineId(Long airlineId){
        List<FlightDto> flights = webClient.get()
               .uri("http://localhost:7777/flights/"+ airlineId)
               .retrieve()
               .bodyToMono(new ParameterizedTypeReference<List<FlightDto>>() {
               })
               .block();
        ResponseDto response = new ResponseDto();
        Airline airline= airlineRepository.findByAirlineId(airlineId);

        response.setAirline(airline);
        response.setFlightDto(flights);

        return response;
    }
}
