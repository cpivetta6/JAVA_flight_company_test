package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.services.PassangerService;

@RestController
@RequestMapping(value = "/passanger")
public class PassangerResource {
	
	@Autowired
	private PassangerService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Passanger> findById (@PathVariable Integer id) {
		
		Passanger obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}

