package com.caiopivetta6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caiopivetta6.domain.Flight;
import com.caiopivetta6.domain.Passanger;
import com.caiopivetta6.domain.Pilot;
import com.caiopivetta6.domain.Reserve;
import com.caiopivetta6.repository.FlightRepository;
import com.caiopivetta6.repository.PassangerRepository;
import com.caiopivetta6.repository.PilotRepository;
import com.caiopivetta6.repository.ReserveRepository;

@SpringBootApplication
public class FlightCompanyApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(FlightCompanyApplication.class, args);
	}
	
	@Autowired
	private ReserveRepository reserveRepository;
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private PilotRepository pilotRepository;
	
	@Autowired
	private PassangerRepository passangerRepository;

	@Override
	public void run(String... args) throws Exception , ParseException{
		// TODO Auto-generated method stub
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//PASSANGER AND PILOT
		
		Passanger p1 = new Passanger(null, "Julia Forest", "F", sdf.parse("11/09/2095").toInstant());
		Passanger p2 = new Passanger(null, "Carlos Crimes", "M", sdf.parse("11/09/1990").toInstant());
		Passanger p3 = new Passanger(null, "Benzema Karim", "M", sdf.parse("11/09/1990").toInstant());
		
		p1.getPhone().add("3923312932");
		p2.getPhone().add("5123123124");
		p3.getPhone().add("1314123412");
		
		Pilot pilot = new Pilot(null, "Carlos Rodrigues", "M", "7x9asxs");
		
		passangerRepository.saveAll(Arrays.asList(p1,p2,p3));
		pilotRepository.saveAll(Arrays.asList(pilot));
		
		//FLIGHT RESERVE
		
		Flight flight1 = new Flight(null, 2331, sdf.parse("10/02/2022").toInstant(), pilot);
		
		pilot.setFlight(flight1);
		
		
		Reserve res1 = new Reserve(null, "b32", flight1, p1);
		Reserve res2 = new Reserve(null, "b31", flight1, p2);
		Reserve res3 = new Reserve(null, "b30", flight1, p3);
		
		flight1.getReserves().addAll(Arrays.asList(res1, res2, res3));
		
		p1.setReserve(res1);
		p2.setReserve(res2);
		p3.setReserve(res3);
		
		
		flightRepository.saveAll(Arrays.asList(flight1));
		reserveRepository.saveAll(Arrays.asList(res1, res2, res3));
		
		
		
	}

}
