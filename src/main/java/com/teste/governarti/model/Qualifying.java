package com.teste.governarti.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "qualifying")
public class Qualifying  extends BaseModel<Qualifying>{
	
	@javax.persistence.Id
	private	Long  id;
	
	@ManyToOne
	@JoinColumn(name="race_id")
	private Races race;
	
	@Transient
	private Long raceId;
	  
	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Drivers driver;
	  
	@Transient
	private Long driverId;
		
	@ManyToOne
	@JoinColumn(name="constructor_id")
	private	Constructor constructor;
	
	@Transient
	private Long constructorId;
	
	private Long number;
	private Long position;
	private String q1;
	private String q2;
	private String q3;
		
	@Override
	public Qualifying createObject(String[] attributes) {
		var qualifying =Qualifying.builder()
				.id(Long.valueOf(attributes[0]))
				.raceId(Long.valueOf(attributes[1]))
				.driverId(Long.valueOf(attributes[2]))
				.constructorId(Long.valueOf(attributes[3]))
				.number(Long.valueOf(attributes[4]))
				.position((Long.valueOf(attributes[5])))
				.q1(attributes[6])
				.q2(attributes[7])
				.q3(attributes[8])
				.build();
		return qualifying;
	}

}


