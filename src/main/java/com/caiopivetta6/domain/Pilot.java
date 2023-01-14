package com.caiopivetta6.domain;

public class Pilot extends Person{

	private String license;
	
	
	public Pilot() {
		
	}


	public Pilot(Integer id, String name, Integer genre, String license) {
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
