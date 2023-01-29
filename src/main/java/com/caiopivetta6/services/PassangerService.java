package com.caiopivetta6.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.domain.Reserve;
import com.caiopivetta6.repository.PassangerRepository;
import com.caiopivetta6.services.exception.ObjectNotFoundException;

@Service
public class PassangerService {
	
	@Autowired
	private PassangerRepository repository;
	
	public Passanger find(Integer id) {
		
		Optional<Passanger> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Passanger.class.getName()));

	}
}
