package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.Results;

@Repository
public interface ResultsRepository extends JpaRepository<Results ,Long>{

}
