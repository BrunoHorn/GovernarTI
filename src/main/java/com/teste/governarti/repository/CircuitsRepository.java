package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.Circuits;

@Repository
public interface CircuitsRepository extends JpaRepository<Circuits, Long>{

}
