package com.teste.governarti.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DriversWinning {
	
	private String driver_ref;
	
	private String forename;
	
	private String surname; 

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dob ;
	
	private String nationality ;
	
	private Long  wins;

}
 