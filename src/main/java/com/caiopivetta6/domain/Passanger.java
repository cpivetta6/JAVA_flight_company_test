package com.caiopivetta6.domain;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Passanger extends Person {

	
	private static final long serialVersionUID = 1L;

	private Instant birth;
	
	private Set<String> phone = new HashSet<>();

	public Passanger() {
		
	}

	public Passanger(Integer id, String name, String genre, Instant birth) {
		super(id, name, genre);
		this.birth = birth;
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
