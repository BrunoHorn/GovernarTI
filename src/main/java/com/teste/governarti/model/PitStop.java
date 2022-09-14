package com.teste.governarti.model;

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
@Table(name = "pit_stop")
public class PitStop extends BaseModel<PitStop>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	@ManyToOne
	@JoinColumn(name="race_id")
	private Races race;
			
	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Drivers driver;
	  
	@Transient
	private Long driverId;
		
	@Transient
	private Long raceId;
	
	private Long stop;
	private String time;
	private String duration;
	private String milliseconds;
	
	@Override
	public PitStop createObject(String[] attributes) {
		var pitStop =PitStop.builder()
				.raceId(Long.valueOf(attributes[0]))
				.driverId(Long.valueOf(attributes[1]))
				.stop(Long.valueOf(attributes[2]))
				.time(attributes[3])
				.duration(attributes[4])
				.milliseconds(attributes[5])
				.build();
		return pitStop;
	}

}
