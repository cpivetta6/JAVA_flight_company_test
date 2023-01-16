package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ReservePk implements Serializable{

	private static final long serialVersionUID = 1L;
	private Passanger passanger;
	private Flight flight;
	
	public ReservePk() {
		
	}

	public ReservePk(Passanger passanger, Flight flight) {
		super();
		this.passanger = passanger;
		this.flight = flight;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flight, passanger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservePk other = (ReservePk) obj;
		return Objects.equals(flight, other.flight) && Objects.equals(passanger, other.passanger);
	}
	
	
	
	
}
