package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.caiopivetta6.domain.Flight;
import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.domain.Person;
import com.caiopivetta6.domain.Pilot;

public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Person p1 = new Passanger(null, "Julia Forest", "F", sdf.parse("11/09/2095").toInstant());
		Person p2 = new Pilot(null, "Carlos Crimes", "M", "c");
		
		
		Passanger p3 = (Passanger) p1;
		
		
		
		System.out.println(p1.getName());
		/*
		
		Flight flight = new Flight(null, 1234, sdf.parse("22/10/2023").toInstant());
		
		//flight.getPilots().add((Pilot) p2);
		flight.getPilots().add((Pilot) pilot);
		
		
		for(Pilot p : flight.getPilots()) {
				System.out.println(p.getName());
		}
		
		*/
		
		
		

		
	}

}
