package com.project.Aerial;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection  = "Flights")
public class Flights {
	@Id
	private ObjectId id;
	private String flightName;
	private String from;
	private String to;
	private String date;

}
