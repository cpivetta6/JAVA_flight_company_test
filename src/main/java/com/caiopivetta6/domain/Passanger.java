package com.caiopivetta6.domain;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Passanger extends Person {

	private Instant birth;
	
	private Set<String> phone = new HashSet<>();

	public Passanger() {
		
	}

	public Passanger(Integer id, String name, Integer genre) {
		super(id, name, genre);
		// TODO Auto-generated constructor stub
	}
	

	public Set<String> getPhone() {
		return phone;
	}

	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}

	public Instant getBirth() {
		return birth;
	}

	public void setBirth(Instant birth) {
		this.birth = birth;
	}
	
	
	
	
	
}
