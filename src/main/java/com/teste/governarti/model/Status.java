package com.teste.governarti.model;

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
@Table(name = "status")
public class Status  extends BaseModel<Status> {
	
	@Id
	private Long   id;
	
	private String status;
	
	@Override
	public Status createObject(String[] attributes) {
		var status = Status.builder() 
				.id(Long.valueOf(attributes[0]))
				.status(attributes[1])
				.build();
		return status;
	}

}
