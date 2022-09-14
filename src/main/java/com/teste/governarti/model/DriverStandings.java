package com.teste.governarti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "driver_standings")
public class DriverStandings extends BaseModel<DriverStandings> {
	
	@Id	
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
	
	private Double points;
	private Long position;
	
	@Column(name ="position_text")
	private String positionText;
	private Long wins;
		
	@Override
	public DriverStandings createObject(String[] attributes) {
		var driveStan = DriverStandings.builder()
				.id(Long.valueOf(attributes[0]))
				.raceId(Long.valueOf(attributes[1]))
				.driverId(Long.valueOf(attributes[2]))
				.points(Double.valueOf(attributes[3]))
				.position(Long.valueOf(attributes[4]))
				.positionText(attributes[5])
				.wins(Long.valueOf(attributes[6]))
				.build();	
		
		return driveStan;
	}

}
