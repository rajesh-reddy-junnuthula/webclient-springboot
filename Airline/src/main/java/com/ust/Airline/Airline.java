package com.ust.Airline;

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
@Table(name="airlines")
public class Airline {
    @Id
    public long airlineId;
    public String airlineName;
    public int establishedYear;
}
