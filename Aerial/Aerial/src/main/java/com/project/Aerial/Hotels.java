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
@Document(collection  = "Hotel")
public class Hotels {
	
	@Id
	private ObjectId id;
	private String hotelName;
	private String roomType;
	private String price;

}
