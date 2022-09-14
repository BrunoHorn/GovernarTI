package com.teste.governarti.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Races extends BaseModel<Races> {
	
	@Id
	private	Long id;
	
	private Long year;
	private Long round;
	
	@ManyToOne
	@JoinColumn(name="circuit_id")
	private Circuits circuit;
	
	@Transient
	private  Long circuitId; 
	
	private String name;  
	private String date;
	private String time;
	private String url;
	
	@Column(name="fp1_date")
	private String fp1Date;
	
	@Column(name="fp1_time")
	private String fp1Time;
	
	@Column(name="fp2_date")
	private String fp2Date;
	
	@Column(name="fp2_time")
	private String fp2Time;
	
	@Column(name="fp3_date")
	private String fp3Date;
	
	@Column(name="fp3_time")
	private String fp3Time;
	
	@Column(name="quali_date")
	private String qualiDate;
	
	@Column(name="quali_time")
	private String qualiTime;
	
	@Column(name="sprint_date")
	private String sprintDate;
	
	@Column(name="sprint_time")
	private String sprintTime;

	@Override
	public Races createObject(String[] attributes) {
		var races=Races.builder()
				.id(Long.valueOf(attributes[0]))
				.year(Long.valueOf(attributes[1]))
				.round(Long.valueOf(attributes[2]))
				.circuitId(Long.valueOf(attributes[3]))				
				.name(attributes[4])
				.date(attributes[5])
				.time(attributes[6])
				.url(attributes[7])
				.fp1Date(attributes[8])
				.fp1Time(attributes[9])
				.fp2Date(attributes[10])
				.fp2Time(attributes[11])
				.fp3Date(attributes[12])
				.fp3Time(attributes[13])
				.qualiDate(attributes[14])
				.qualiTime(attributes[15])
				.sprintDate(attributes[16])
				.sprintTime(attributes[17])				
				.build();
		return races;
	}

}
