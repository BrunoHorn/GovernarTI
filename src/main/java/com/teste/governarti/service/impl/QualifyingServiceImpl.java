package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.Qualifying;

@Service
public class QualifyingServiceImpl {
	
	@Autowired
	private DriverServiceImpl driverServiceImpl;
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	@Autowired
	private ConstructorServiceImpl constructorServiceImpl;
	
	public Qualifying pesquisaObjetos(Qualifying qualifying) throws NumberFormatException, Exception {
		
		qualifying.setDriver(driverServiceImpl.findById(qualifying.getDriverId()));
		
		qualifying.setRace(racesServiceImpl.findById(qualifying.getRaceId()));
		
		qualifying.setConstructor(constructorServiceImpl.findById(qualifying.getRaceId()));
		
		return qualifying;
	}

}
