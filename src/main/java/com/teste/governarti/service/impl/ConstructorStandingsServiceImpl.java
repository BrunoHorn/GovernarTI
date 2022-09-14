package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.governarti.model.ConstructorStandings;



@Service
public class ConstructorStandingsServiceImpl {
	
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	@Autowired
	private ConstructorServiceImpl constructorServiceImpl;
	
	public ConstructorStandings pesquisaObjetos(ConstructorStandings constructorStandings) throws NumberFormatException, Exception {
						
		constructorStandings.setConstructor(constructorServiceImpl.findById(constructorStandings.getConstructorId()));
		
		constructorStandings.setRace(racesServiceImpl.findById(constructorStandings.getRaceId()));

		return constructorStandings;
	}
	

}
