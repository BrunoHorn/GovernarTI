package com.teste.governarti.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.teste.governarti.service.impl.DriverServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lap_times")
public class LapTimes extends BaseModel<LapTimes> {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
	
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
		
	private Long lap;
	private Long position;
	private String time;
	private Long milliseconds;
	
	
	@Override
	public LapTimes createObject(String[] attributes) {

		LapTimes lapTimes;
	
			lapTimes = LapTimes.builder()
					.raceId(Long.valueOf(attributes[0]))
					.driverId(Long.valueOf(attributes[1]))
					.lap(Long.valueOf(attributes[2]))
					.position(Long.valueOf(attributes[3]))
					.time(attributes[4])
					.milliseconds(Long.valueOf(attributes[5]))
					.build();
	
		return lapTimes;
		
	}

}
