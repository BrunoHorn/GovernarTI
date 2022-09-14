package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.governarti.model.Constructor;
import com.teste.governarti.repository.ConstructorRepository;

@Service
public class ConstructorServiceImpl {
	
	@Autowired
	private ConstructorRepository constructorRepository;
	
	public Constructor findById(Long id) throws Exception {
		return constructorRepository.findById(id).orElseThrow(() -> new Exception());
	}

}
