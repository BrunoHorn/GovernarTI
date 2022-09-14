package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.LapTimes;

@Repository
public interface LapTimesRepository extends JpaRepository <LapTimes,Long>{

}
