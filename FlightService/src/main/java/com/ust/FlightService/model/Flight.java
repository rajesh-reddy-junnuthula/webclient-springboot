package com.ust.FlightService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="flights")
public class Flight {
    @Id
    public long fid;
    public String airline;
    public String departureAirport;
    public long airlineId;
}
