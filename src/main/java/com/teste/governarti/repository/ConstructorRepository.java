package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.Constructor;

@Repository
public interface ConstructorRepository extends JpaRepository<Constructor,Long> {

}
