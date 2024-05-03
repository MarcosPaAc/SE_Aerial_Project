package com.project.Aerial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	@Autowired
	private HotelsRepository hotelsRepository;
	
	public List<Hotels>allFlights(){
		return hotelsRepository.findAll();
	}

}
