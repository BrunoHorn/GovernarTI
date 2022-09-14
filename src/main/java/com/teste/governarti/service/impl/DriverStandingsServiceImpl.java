package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.DriverStandings;
import com.teste.governarti.repository.DriverStandingsRepository;


@Service
public class DriverStandingsServiceImpl {
    
	@Autowired
	private DriverStandingsRepository driverStandingsRepository;
	
	public DriverStandings findById(Long id) throws Exception {
		return driverStandingsRepository.findById(id).orElseThrow(() -> new Exception());
	}
	
	@Autowired
	private DriverServiceImpl driverServiceImpl;
	
	@Autowired
	private RacesServiceImpl  racesServiceImpl;
	
	public DriverStandings pesquisaObjetos(DriverStandings driverStandings) throws NumberFormatException, Exception {
		
		driverStandings.setDriver(driverServiceImpl.findById(driverStandings.getDriverId()));
		
		driverStandings.setRace(racesServiceImpl.findById(driverStandings.getRaceId()));
		
		return driverStandings;
	}
	
}
