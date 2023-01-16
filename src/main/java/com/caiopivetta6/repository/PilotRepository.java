package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Flight;
import com.caiopivetta6.domain.Pilot;

public interface PilotRepository extends JpaRepository<Pilot, Integer> {

	
	
}
