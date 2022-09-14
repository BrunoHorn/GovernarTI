package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.Races;
import com.teste.governarti.repository.RacesRepository;

@Service
public class RacesServiceImpl {
	
	@Autowired
	private CircuitsServiceImpl  circuitsServiceImpl;
	
	@Autowired
	private RacesRepository racesRepository;
	
	public Races pesquisaObjetos(Races races) throws NumberFormatException, Exception {
		
		races.setCircuit(circuitsServiceImpl.findById(races.getCircuitId()));
		return races;
	}
	
	public Races findById(Long id) throws Exception {
		return racesRepository.findById(id).orElseThrow(() -> new Exception());
	}
	

	
	
	

}
