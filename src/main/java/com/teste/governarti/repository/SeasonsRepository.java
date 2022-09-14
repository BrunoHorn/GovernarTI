package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.Seasons;

@Repository
public interface SeasonsRepository extends JpaRepository<Seasons,Long> {

}
