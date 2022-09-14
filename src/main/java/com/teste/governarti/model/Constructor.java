package com.teste.governarti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "constructors")
public class Constructor extends BaseModel<Constructor>  {
	
	@Id
	private	Long   id;
	
	@Column(name ="constructor_ref")
	private String constructorRef;
	
	private String name;
	private String nationality;
	private String url;
	
	@Override
	public Constructor createObject(String[] attributes) {
		var cons = Constructor.builder()				
				.id(Long.valueOf(attributes[0]))
				.constructorRef(attributes[1])
				.name(attributes[2])
				.nationality(attributes[3])
				.url(attributes[4])
				.build();
		return cons;
	}

}
