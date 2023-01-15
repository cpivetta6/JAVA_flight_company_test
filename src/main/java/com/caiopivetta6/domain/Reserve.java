package com.caiopivetta6.domain;

public class Reserve {

	
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
