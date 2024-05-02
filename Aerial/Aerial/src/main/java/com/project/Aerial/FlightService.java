package com.project.Aerial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	private FlightsRepository flightsRepository;
	
	public List<Flights>allFlights(){
		return flightsRepository.findAll();
	}

}
