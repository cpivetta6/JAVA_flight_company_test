package com.caiopivetta6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reserve_tb")
public class Reserve {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ReservePk id;
	
	private String seat;
	
	public Reserve() {
		
	}

	public Reserve(Passanger passanger, Flight flight, String seat) {
		super();
		id.setFlight(flight);
		id.setPassanger(passanger);
		this.seat = seat;
	}
	
	public Passanger getPassanger() {
		return id.getPassanger();
	}
	
	public Flight getFlight() {
		return id.getFlight();
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	
	
	
}
