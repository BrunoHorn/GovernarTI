package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.ConstructorResults;


@Service
public class ConstructorResultsServiceImpl {
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	@Autowired
	private ConstructorServiceImpl constructorServiceImpl;
	
	public ConstructorResults pesquisaObjetos(ConstructorResults constructorResults) throws NumberFormatException, Exception {
		
		constructorResults.setConstructor(constructorServiceImpl.findById(constructorResults.getConstructorId()));
		
		constructorResults.setRace(racesServiceImpl.findById(constructorResults.getRaceId()));

		return constructorResults;
	}
}
