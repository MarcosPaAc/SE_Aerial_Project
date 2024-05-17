package com.project.Aerial;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	@Autowired
	private HotelsRepository hotelsRepository;
	
	public List<Hotels>allHotels(){
		return hotelsRepository.findAll();
	}
	
	public Optional<Hotels> singleHotel(ObjectId id) {
		return hotelsRepository.findById(id);
	}

}
