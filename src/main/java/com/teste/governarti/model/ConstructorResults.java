package com.teste.governarti.model;

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
@Table(name = "constructor_result")
public class ConstructorResults extends BaseModel<ConstructorResults>  {
	
	@Id
	private	Long id;
	
	@ManyToOne
	@JoinColumn(name="race_id")
	private Races race;
	
	@Transient
	private	Long raceId;
	 
	@ManyToOne
	@JoinColumn(name="constructor_id")
	private	Constructor constructor;
	
	@Transient
	private Long constructorId;
	
	private	Double points;
	private	String status;
	
	
	@Override
	public ConstructorResults createObject(String[] attributes) {
		var cons = ConstructorResults.builder()
				.id(Long.valueOf(attributes[0]))
				.raceId(Long.valueOf(attributes[1]))
				.constructorId(Long.valueOf(attributes[2]))
				.points(Double.valueOf(attributes[3]))
				.status(attributes[4])
				.build();
		return cons;
	} 

}
