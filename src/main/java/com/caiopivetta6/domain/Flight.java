package com.caiopivetta6.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Flight implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer number;
	private Instant date;
	
	public Flight() {
		
	}

	public Flight(Integer id, Integer number, Instant date) {
		super();
		this.id = id;
		this.number = number;
		this.date = date;
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
