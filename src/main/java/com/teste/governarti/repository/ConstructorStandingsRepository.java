package com.teste.governarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.teste.governarti.model.ConstructorStandings;

@Repository
public interface ConstructorStandingsRepository extends JpaRepository<ConstructorStandings ,Long> {

}
