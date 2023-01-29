package com.caiopivetta6.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<Passanger> insert (@RequestBody Passanger obj){
		
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Passanger> update (@PathVariable Integer id, @RequestBody Passanger obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
}

