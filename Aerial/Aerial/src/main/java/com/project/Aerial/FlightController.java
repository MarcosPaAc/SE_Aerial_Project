package com.project.Aerial;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Flights>> getSingleFlight(@PathVariable ObjectId id){
		return new ResponseEntity<Optional<Flights>>(flightService.singleFlight(id), HttpStatus.OK);
	}

}
