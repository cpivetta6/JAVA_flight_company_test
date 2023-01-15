package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Flight;
import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.domain.Person;
import com.caiopivetta6.domain.Pilot;

@SpringBootApplication
public class FlightCompanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FlightCompanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception , ParseException{
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Person p1 = new Passanger(null, "Carlos Crimes", "M", sdf.parse("11/09/1990").toInstant());
		Person p2 = new Passanger(null, "Julia Forest", "F", sdf.parse("11/09/2095").toInstant());
		
		Passanger p3 = new Passanger(null, "Julia Forest", "F", sdf.parse("11/09/2095").toInstant());
		Passanger p3 = new Passanger(null, "Julia Forest", "F", sdf.parse("11/09/2095").toInstant());
		
		Pilot pilot =  (Pilot) p1;
		pilot.setLicense("458asf586as");
		
		
		Flight flight1 = new Flight(null, 2331, sdf.parse("10/02/2022").toInstant());
		flight1.getPilots().add(pilot);
		
		flight1.getPassangers().addAll(p3);
		
		
		
		
	}

}
