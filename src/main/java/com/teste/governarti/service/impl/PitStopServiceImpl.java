package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.PitStop;

@Service
public class PitStopServiceImpl {

	@Autowired
	private DriverServiceImpl driverServiceImpl;
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	public PitStop pesquisaObjetos(PitStop pitStop) throws NumberFormatException, Exception {
		
		pitStop.setDriver(driverServiceImpl.findById(pitStop.getDriverId()));
		
		pitStop.setRace(racesServiceImpl.findById(pitStop.getRaceId()));
		
		return pitStop;
	}
	
}
