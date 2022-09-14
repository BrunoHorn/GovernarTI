package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.ConstructorResults;

@Repository
public interface ConstructorResultsRepository  extends JpaRepository<ConstructorResults ,Long> {

}
