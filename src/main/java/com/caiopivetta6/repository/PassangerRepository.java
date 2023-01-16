package com.caiopivetta6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiopivetta6.domain.Flight;
import com.caiopivetta6.domain.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

	
	
}
