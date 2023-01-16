package com.caiopivetta6.domain;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "passanger_tb")
public class Passanger extends Person {

	
	private static final long serialVersionUID = 1L;

	private Instant birth;
	
	@JsonBackReference
	@OneToOne(mappedBy = "passanger")
	private Reserve reserve;
	
	
	@ElementCollection
	@CollectionTable(name = "phone")
	private Set<String> phone = new HashSet<>();
	

	public Passanger() {
		
	}

	public Passanger(Integer id, String name, String genre, Instant birth) {
		super(id, name, genre);
		this.birth = birth;
		// TODO Auto-generated constructor stub
	}
	

	public Reserve getReserve() {
		return reserve;
	}

	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
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
