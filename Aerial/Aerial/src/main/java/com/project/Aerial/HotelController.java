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
@RequestMapping("/api/v1/hotels")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	@GetMapping
	public ResponseEntity<List<Hotels>> getAllHotels() {
		return new ResponseEntity<List<Hotels>>(hotelService.allHotels(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Hotels>> getSingleFlight(@PathVariable ObjectId id){
		return new ResponseEntity<Optional<Hotels>>(hotelService.singleHotel(id), HttpStatus.OK);
	}


}
