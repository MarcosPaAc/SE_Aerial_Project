package com.project.Aerial;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepository extends MongoRepository<Flights, ObjectId>{
	
}
