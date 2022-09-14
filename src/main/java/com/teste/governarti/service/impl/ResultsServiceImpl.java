package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.governarti.model.LapTimes;
import com.teste.governarti.model.Results;
import com.teste.governarti.repository.ResultsRepository;

@Service
public class ResultsServiceImpl {
	
	@Autowired
	private ResultsRepository resultsRepository;
	
	@Autowired
	private DriverServiceImpl driverServiceImpl;
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	@Autowired
	private ConstructorServiceImpl constructorServiceImpl;
	
	@Autowired
	private StatusServiceImpl statusServiceImpl;
	
	public Results findById(Long id) throws Exception {
		return resultsRepository.findById(id).orElseThrow(() -> new Exception());
	}
	
	public Results pesquisaObjetos(Results results) throws NumberFormatException, Exception {
		
		results.setDriver(driverServiceImpl.findById(results.getDriverId()));
		
		results.setRace(racesServiceImpl.findById(results.getRaceId()));
		
		results.setConstructor(constructorServiceImpl.findById(results.getConstructorId()));
		
		results.setStatus(statusServiceImpl.findById(results.getStatusId()));
		
		return results;
	}
	
	
}
