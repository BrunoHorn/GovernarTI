package com.teste.governarti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "spring_results")
public class SprintResults  extends BaseModel<SprintResults> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="result_id")
	private Results result;
	
	@Transient
	private Long resultId;
	
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
	@JoinColumn(name = "constructor_id")
	private Constructor constructor;
	  
	@Transient
	private Long constructorId;
	
	
	private	Long 	number;
	private	Long 	grid;
	private	String 	position;
	
	@Column(name= "position_text")
	private String  positionText;
	
	@Column(name= "position_order")
	private	Long	positionOrder;
	
	private	Long	points;
	private	Long	laps;
	private String  time;
	private String  milliseconds;
	
	@Column(name= "fastest_lap")
	private	String  fastestLap;
	
	@Column(name= "fastest_lap_time")
	private String  fastestLapTime;
	
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status status;
	@Transient
	private Long statusId;
 
	@Override
	public SprintResults createObject(String[] attributes) {
		var sprintResults = SprintResults.builder() 
		.resultId(Long.valueOf(attributes[0]))
		.raceId(Long.valueOf(attributes[1]))
		.driverId(Long.valueOf(attributes[2]))
		.constructorId(Long.valueOf(attributes[3]))
		.number(Long.valueOf(attributes[4]))
		.grid(Long.valueOf(attributes[5]))
		.position(attributes[6])
		.positionText(attributes[7])
		.positionOrder(Long.valueOf(attributes[8]))
		.points(Long.valueOf(attributes[9]))
		.laps(Long.valueOf(attributes[10]))
		.time(attributes[11])
		.milliseconds(attributes[12])
		.fastestLap(attributes[13])
		.fastestLapTime(attributes[14])
		.statusId(Long.valueOf(attributes[15]))
		.build();
		return sprintResults;
	}

}
