package com.caiopivetta6.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiopivetta6.domain.Reserve;
import com.caiopivetta6.services.ReserveService;

@RestController
@RequestMapping(value = "/reserve")
public class ReserveResource {
	
	@Autowired
	private ReserveService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Reserve> findById (@PathVariable Integer id) {
		
		Reserve obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}

