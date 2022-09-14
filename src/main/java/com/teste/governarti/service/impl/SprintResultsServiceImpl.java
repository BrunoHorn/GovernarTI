package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.SprintResults;

@Service
public class SprintResultsServiceImpl {

	@Autowired
	private DriverServiceImpl driverServiceImpl;
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	@Autowired
	private ConstructorServiceImpl constructorServiceImpl;
	
	@Autowired
	private StatusServiceImpl statusServiceImpl;
	
	@Autowired
	private ResultsServiceImpl resultsServiceImpl;
	
	public SprintResults pesquisaObjetos(SprintResults sprintResults) throws NumberFormatException, Exception {
		
		sprintResults.setDriver(driverServiceImpl.findById(sprintResults.getDriverId()));
		
		sprintResults.setRace(racesServiceImpl.findById(sprintResults.getRaceId()));
		
		sprintResults.setConstructor(constructorServiceImpl.findById(sprintResults.getConstructorId()));
		
		sprintResults.setStatus(statusServiceImpl.findById(sprintResults.getStatusId()));
		
		sprintResults.setResult(resultsServiceImpl.findById(sprintResults.getResultId()));
		
		return sprintResults;
	}
	
}
