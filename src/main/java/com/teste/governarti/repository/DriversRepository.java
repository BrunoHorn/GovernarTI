package com.teste.governarti.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teste.governarti.model.Drivers;
import com.teste.governarti.model.DriversWinning;
import com.teste.governarti.model.NationalitiesWins;

@Repository
public interface DriversRepository extends JpaRepository<Drivers,Long> {

	@Query(nativeQuery = true)
	List<DriversWinning> winning();
	
	
	
	@Query(nativeQuery = true)
	List<NationalitiesWins> nationalitiesWins();
}
