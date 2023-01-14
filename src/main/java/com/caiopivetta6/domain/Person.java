package com.caiopivetta6.domain;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer genre;
	
	public Person() {
		
	}

	public Person(Integer id, String name, Integer genre) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGenre() {
		return genre;
	}

	public void setGenre(Integer genre) {
		this.genre = genre;
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
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
