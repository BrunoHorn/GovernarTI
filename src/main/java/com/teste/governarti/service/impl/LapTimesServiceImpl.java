package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.governarti.model.LapTimes;

@Service
public class LapTimesServiceImpl {

	@Autowired
	private DriverServiceImpl driverServiceImpl;
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	public LapTimes pesquisaObjetos(LapTimes lapTimes) throws NumberFormatException, Exception {
		
		lapTimes.setDriver(driverServiceImpl.findById(lapTimes.getDriverId()));
		
		lapTimes.setRace(racesServiceImpl.findById(lapTimes.getRaceId()));
		
		return lapTimes;
	}
}
