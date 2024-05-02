package com.project.Aerial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/flights")
public class FlightController {
	@Autowired
	private FlightService flightService;
	@GetMapping
	public ResponseEntity<List<Flights>> getAllFlights() {
		return new ResponseEntity<List<Flights>>(flightService.allFlights(), HttpStatus.OK);
	}

}
