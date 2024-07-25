package com.ust.Airline.controller;

import com.ust.Airline.Airline;
import com.ust.Airline.dto.ResponseDto;
import com.ust.Airline.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineService airlineService;

    @PostMapping("/add-airline")
    public Airline addAirline(@RequestBody Airline airline){
        return airlineService.addAirline(airline);
    }

    @GetMapping("/{airlineId}")
    public ResponseDto getFlightsWithAirlineId(@PathVariable Long airlineId){
        return airlineService.getFlightsWithAirlineId(airlineId);
    }

}
