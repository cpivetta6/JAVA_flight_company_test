package com.caiopivetta6.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_tb")
public class Flight implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer number;
	private Instant date;
	
	@OneToMany(mappedBy = "flights")
	private Set<Pilot> pilots = new HashSet<>();
	
	@OneToMany(mappedBy = "flight")
	private Set<Passanger> passangers = new HashSet<>();
	
	
	
	public Flight() {
		
	}

	public Flight(Integer id, Integer number, Instant date) {
		super();
		this.id = id;
		this.number = number;
		this.date = date;
	}
	
	


	public Set<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(Set<Pilot> pilots) {
		this.pilots = pilots;
	}

	public Set<Passanger> getPassangers() {
		return passangers;
	}

	public void setPassangers(Set<Passanger> passangers) {
		this.passangers = passangers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
