package com.ust.Airline.dto;

import com.ust.Airline.Airline;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
    public List<FlightDto> flightDto;
    public Airline airline;
}
