package com.caiopivetta6.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiopivetta6.domain.Reserve;
import com.caiopivetta6.repository.ReserveRepository;
import com.caiopivetta6.services.exception.ObjectNotFoundException;

@Service
public class PersonService {
	
	@Autowired
	private ReserveRepository repository;
	
	public Reserve find(Integer id) {
		
		Optional<Reserve> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Reserve.class.getName()));

	}
}
