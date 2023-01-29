package com.caiopivetta6.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.repository.PassangerRepository;
import com.caiopivetta6.services.exception.DatabaseException;
import com.caiopivetta6.services.exception.ObjectNotFoundException;
import com.caiopivetta6.services.exception.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PassangerService {
	
	@Autowired
	private PassangerRepository repository;
	
	public Passanger find(Integer id) {
		
		Optional<Passanger> obj = repository.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Passanger.class.getName()));

	}
	
	public Passanger insert(Passanger obj) {
		repository.save(obj);
		return obj;
	}
	
	
	public void delete(Integer id) {
		try {
		repository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Passanger update(Integer id, Passanger obj) {
		try {
		Passanger entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}
	
	private void updateData(Passanger entity, Passanger obj) {
		entity.setName(obj.getName());
		entity.setGenre(obj.getGenre());
		entity.setPhone(obj.getPhone());
	}
	
	
}
