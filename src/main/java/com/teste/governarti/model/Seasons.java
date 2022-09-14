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
@Table(name = "seasons")
public class Seasons extends BaseModel<Seasons> {
	
	@Id
	private Long   year;
	
	private String url;
	
	@Override
	public Seasons createObject(String[] attributes) {
		var seasons =Seasons.builder()
				.year(Long.valueOf(attributes[0]))
				.url(attributes[1])
				.build();
		return seasons;
	}

}
