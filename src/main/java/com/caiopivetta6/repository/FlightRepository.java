package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	
	
}
