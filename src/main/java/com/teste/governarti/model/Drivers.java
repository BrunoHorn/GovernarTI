package com.teste.governarti.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

@NamedNativeQuery(name ="Drivers.winning", query = "select d.driver_ref driver_ref ,"+ 
		"d.forename forename,"+ 
		"d.surname surname, "+ 
		"d.dob dob,"+ 
		"d.nationality nationality,"+ 
		"cs.wins  wins "+ 
		"from  drivers d " + 
		"inner join results r on d.id = r.driver_id " + 
		"inner join races r2 " + 
		"on r2.id = r.race_id " + 
		"inner join constructor_standings cs " + 
		"on r2.id =cs.race_id " + 
		"where cs.wins > 0 " + 
		"group by d.driver_ref ,d.forename ,d.surname, d.dob, d.nationality ,cs.wins",  resultSetMapping = "DriversWinning")
@SqlResultSetMapping(name = "DriversWinning",
		classes =  @ConstructorResult(targetClass = DriversWinning.class, columns = {
				@ColumnResult(name = "driver_ref"),
				@ColumnResult(name = "forename"),
				@ColumnResult(name = "surname"),
				@ColumnResult(name = "dob", type=Date.class),
				@ColumnResult(name = "nationality"),
				@ColumnResult(name = "wins", type=Long.class)}))

@NamedNativeQuery(name ="Drivers.nationalitiesWins", query = "select d.nationality nationality," +
		"sum(cs.wins) as winssum " +
		"from  drivers d " + 
		"inner join results r on d.id = r.driver_id " + 
		"inner join races r2 " + 
		"on r2.id = r.race_id " + 
		"inner join constructor_standings cs " + 
		"on r2.id =cs.race_id " + 
		"group by d.nationality " + 
		"order by winssum desc",  resultSetMapping = "NationalitiesWins")
@SqlResultSetMapping(name = "NationalitiesWins",
		classes =  @ConstructorResult(targetClass = NationalitiesWins.class, columns = {
				@ColumnResult(name = "nationality"),
				@ColumnResult(name = "winssum", type=Long.class)}))
public class Drivers extends BaseModel<Drivers> {
	
	@Id
	private	Long id;
	
	@Column(name="driver_ref")
	private String driverRef;
	
	private String number;
	private String code;
	private String forename;
	private String surname;
	private Date dob;
	private String nationality;
	private String url;

	@Override
	public Drivers createObject(String[] attributes) throws Exception {
		
		Drivers drive;
			drive = Drivers.builder()
					.id(Long.valueOf(attributes[0]))
					.driverRef(attributes[1])
					.number(attributes[2])
					.code(attributes[3])
					.forename(attributes[4])
					.surname(attributes[5])
					.dob(parseDate(attributes[6]))
					.nationality(attributes[7])
					.build();
	
		return drive;
	}

}
