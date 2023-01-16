package com.caiopivetta6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pilot_tb")
public class Pilot extends Person{
 
	
	private static final long serialVersionUID = 1L;
	
	private String license;
	
	
	public Pilot() {
		
	}


	public Pilot(Integer id, String name, String genre, String license) {
		super(id, name, genre);
		this.license = license;
		// TODO Auto-generated constructor stub
	}
	

	

	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}
	
	
	
		
	
	
	
	
}
