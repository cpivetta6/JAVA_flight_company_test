package com.caiopivetta6.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pilot_tb")
public class Pilot extends Person{
 
	
	private static final long serialVersionUID = 1L;
	
	@JsonBackReference
	@OneToOne(mappedBy = "pilot")
	private Flight flight;
	
	private String license;
	
	
	public Pilot() {
		
	}


	public Pilot(Integer id, String name, String genre, String license) {
		super(id, name, genre);
		this.license = license;
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}
	
	
	
		
	
	
	
	
}
