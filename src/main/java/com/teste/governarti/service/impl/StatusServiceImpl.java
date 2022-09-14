package com.teste.governarti.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.teste.governarti.model.Status;
import com.teste.governarti.repository.StatusRepository;

@Service
public class StatusServiceImpl {
	 
	@Autowired
	private StatusRepository statusRepository;
	
	public Status findById(Long id) throws Exception {
		return statusRepository.findById(id).orElseThrow(() -> new Exception());
	}
	
}
