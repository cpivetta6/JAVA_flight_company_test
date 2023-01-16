package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reserve_tb")
public class Reserve implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String seat;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight flight;
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "passanger_id")
	private Passanger passanger;
	
	
	public Reserve() {
		
	}

	public Reserve(Integer id, String seat, Flight flight, Passanger passanger) {
		super();
		this.id = id;
		this.seat = seat;
		this.flight = flight;
		this.passanger = passanger;
	}
	
	

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
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
		Reserve other = (Reserve) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
