package com.caiopivetta6.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "pilot_id")
	private Pilot pilot;
	
	@JsonBackReference
	@OneToMany(mappedBy = "flight")
	private Set<Reserve> reserves = new HashSet<>();
	
	
	public Flight() {
		
	}

	public Flight(Integer id, Integer number, Instant date, Pilot pilot) {
		super();
		this.id = id;
		this.number = number;
		this.date = date;
		this.pilot = pilot;
	}
	
	

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public Set<Reserve> getReserves() {
		return reserves;
	}

	public void setReserves(Set<Reserve> reserves) {
		this.reserves = reserves;
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
