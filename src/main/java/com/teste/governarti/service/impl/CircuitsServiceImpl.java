package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.governarti.model.Circuits;
import com.teste.governarti.repository.CircuitsRepository;


@Service
public class CircuitsServiceImpl {

	@Autowired
	private CircuitsRepository circuitsRepository;
	
	public Circuits findById(Long id) throws Exception {
		return circuitsRepository.findById(id).orElseThrow(() -> new Exception());
	}
	
}
