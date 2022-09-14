package com.teste.governarti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Circuits extends BaseModel<Circuits> {
	
	@Id
	private	Long id;
	 
	@Column(name= "circuit_ref")
	private	String circuitRef;
	
	@Column(name= "name_circuit")
	private	String name;  
	
	private	String location;
	private String country;
	private String lat;
	private String lng;
	private String alt;
	private String url; 
	
	@Override
	public Circuits createObject(String[] attributes) {
		var cir = Circuits.builder()				
				.id(Long.valueOf(attributes[0]))
				.circuitRef(attributes[1])
				.name(attributes[2])
				.location(attributes[3])
				.country(attributes[4])
				.lat((attributes[5]))
				.lng(attributes[6])
				.alt(attributes[7])
				.url(attributes[8])
				.build();
		
		return cir;
	}

}
