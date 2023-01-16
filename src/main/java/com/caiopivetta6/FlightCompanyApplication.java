package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Flight;
import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.domain.Person;
import com.caiopivetta6.domain.Pilot;
import com.caiopivetta6.domain.Reserve;

@SpringBootApplication
public class FlightCompanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FlightCompanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception , ParseException{
		// TODO Auto-generated method stub
		
		/*
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//PASSANGER AND PILOT
		
		Passanger p1 = new Passanger(null, "Julia Forest", "F", sdf.parse("11/09/2095").toInstant());
		Passanger p2 = new Passanger(null, "Carlos Crimes", "M", sdf.parse("11/09/1990").toInstant());
		Passanger p3 = new Passanger(null, "Benzema Karim", "M", sdf.parse("11/09/1990").toInstant());
		
		p1.getPhone().add("3923312932");
		p2.getPhone().add("5123123124");
		p3.getPhone().add("1314123412");
		
		Pilot pilot = new Pilot(null, "Carlos Rodrigues", "M", "7x9asxs");
		
		//FLIGHT RESERVE
		
		Flight flight1 = new Flight(null, 2331, sdf.parse("10/02/2022").toInstant());
		flight1.getPassangers().addAll(Arrays.asList(p1, p2, p3));
		flight1.getPilots().add(pilot);
		
		Reserve res1 = new Reserve(p1, flight1, "b32");
		Reserve res2 = new Reserve(p2, flight1, "b33");
		Reserve res3 = new Reserve(p3, flight1, "b30");
		
		
		*/
		
	}

}
