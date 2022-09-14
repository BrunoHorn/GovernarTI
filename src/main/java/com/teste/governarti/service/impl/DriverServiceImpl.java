package com.teste.governarti.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teste.governarti.model.Drivers;
import com.teste.governarti.repository.DriversRepository;


@Service
public class DriverServiceImpl {

	@Autowired
	private DriversRepository driversRepository;
	
	public Drivers findById(Long id) throws Exception {
		return driversRepository.findById(id).orElseThrow(() -> new Exception());
	}
	
}
