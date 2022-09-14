package com.teste.governarti.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teste.governarti.model.Circuits;
import com.teste.governarti.model.Constructor;
import com.teste.governarti.model.ConstructorResults;
import com.teste.governarti.model.ConstructorStandings;
import com.teste.governarti.model.DriverStandings;
import com.teste.governarti.model.Drivers;
import com.teste.governarti.model.DriversWinning;
import com.teste.governarti.model.LapTimes;
import com.teste.governarti.model.NationalitiesWins;
import com.teste.governarti.model.PitStop;
import com.teste.governarti.model.Qualifying;
import com.teste.governarti.model.Races;
import com.teste.governarti.model.Results;
import com.teste.governarti.model.Seasons;
import com.teste.governarti.model.SprintResults;
import com.teste.governarti.model.Status;
import com.teste.governarti.repository.CircuitsRepository;
import com.teste.governarti.repository.ConstructorRepository;
import com.teste.governarti.repository.ConstructorResultsRepository;
import com.teste.governarti.repository.ConstructorStandingsRepository;
import com.teste.governarti.repository.DriverStandingsRepository;
import com.teste.governarti.repository.DriversRepository;
import com.teste.governarti.repository.LapTimesRepository;
import com.teste.governarti.repository.PitStopRepository;
import com.teste.governarti.repository.QualifyingRepository;
import com.teste.governarti.repository.RacesRepository;
import com.teste.governarti.repository.ResultsRepository;
import com.teste.governarti.repository.SeasonsRepository;
import com.teste.governarti.repository.SprintResultsRepository;
import com.teste.governarti.repository.StatusRepository;
import com.teste.governarti.service.impl.ConstructorResultsServiceImpl;
import com.teste.governarti.service.impl.ConstructorStandingsServiceImpl;
import com.teste.governarti.service.impl.DriverStandingsServiceImpl;
import com.teste.governarti.service.impl.LapTimesServiceImpl;
import com.teste.governarti.service.impl.PitStopServiceImpl;
import com.teste.governarti.service.impl.QualifyingServiceImpl;
import com.teste.governarti.service.impl.RacesServiceImpl;
import com.teste.governarti.service.impl.ResultsServiceImpl;
import com.teste.governarti.service.impl.SprintResultsServiceImpl;
import com.teste.governarti.utils.UploadCsvUtils;

@RestController
@RequestMapping(value = "/drivers")
public class CsvController {

	@Autowired
	private CircuitsRepository circuitsRepository;
	
	@Autowired
	private RacesRepository racesRepository;
	
	@Autowired
	private RacesServiceImpl RacesServiceImpl ;
	
	@Autowired
	private DriversRepository driversRepository;
	
	@Autowired
	private LapTimesRepository lapTimesRepository;
		
	@Autowired
	private LapTimesServiceImpl lapTimesServiceImpl;
		
	@Autowired
	private PitStopRepository pitStopRepository;
	
	@Autowired
	private PitStopServiceImpl pitStopServiceImpl;
	
	@Autowired
	private DriverStandingsRepository driverStandingsRepository;
	
	@Autowired
	private DriverStandingsServiceImpl driverStandingsServiceImpl;
	
	@Autowired
	private ConstructorRepository constructorRepository;
	
	@Autowired
	private ConstructorResultsRepository constructorResultsRepository;
	
	@Autowired
	private ConstructorResultsServiceImpl  constructorResultsServiceImpl;
		
	@Autowired
	private ConstructorStandingsServiceImpl  constructorStandingsServiceImpl ;
	
	@Autowired
	private ConstructorStandingsRepository  constructorStandingsRepository;
	
	@Autowired
	private QualifyingServiceImpl qualifyingServiceImpl;
	
	@Autowired
	private QualifyingRepository qualifyingRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private ResultsServiceImpl  resultsServiceImpl;
	
	@Autowired
	private ResultsRepository resultsRepository;
		
	@Autowired
	private SprintResultsServiceImpl sprintResultsServiceImpl;
	
	@Autowired
	private SprintResultsRepository sprintResultsRepository;
	
	@Autowired
	private SeasonsRepository seasonsRepository;
	
	@GetMapping("/upload-csv")
	public void uploadCsv() throws Exception {  
		
		String path = "C:\\governarti\\";
		
		List<Circuits> retornoCircuits = (List<Circuits>) new UploadCsvUtils<Circuits>().uploadCSVFile(new Circuits(), path.concat("circuits.csv"));
				
		for (var c : retornoCircuits) {
			circuitsRepository.save(c);
		}
				
		List<Races> retornoRaces = (List<Races>) new UploadCsvUtils<Races>().uploadCSVFile(new Races(), path.concat("races.csv"));
		
		for (var c : retornoRaces) {
			racesRepository.save(RacesServiceImpl.pesquisaObjetos(c));
		}
			
		List<Drivers> retornoDrivers = (List<Drivers>) new UploadCsvUtils<Drivers>().uploadCSVFile(new Drivers(), path.concat("drivers.csv"));
		
		for (var c : retornoDrivers) {
			driversRepository.save(c);
		}
				
		List<LapTimes> retornoLapTimes = (List<LapTimes>) new UploadCsvUtils<LapTimes>().uploadCSVFile(new LapTimes(), path.concat("lap_times.csv"));
		
		for (var c :retornoLapTimes) {
			lapTimesRepository.save(lapTimesServiceImpl.pesquisaObjetos(c));
		}
				
		List<PitStop> retornoPitStop = (List<PitStop>) new UploadCsvUtils<PitStop>().uploadCSVFile(new PitStop(), path.concat("pit_stops.csv"));
		
		for (var c :retornoPitStop) {
			pitStopRepository.save(pitStopServiceImpl.pesquisaObjetos(c));
		}
				
		List<DriverStandings> retornoDriverStandings = (List<DriverStandings>) new UploadCsvUtils<DriverStandings>().uploadCSVFile(new DriverStandings(), path.concat("driver_standings.csv"));

		for (var c :retornoDriverStandings) {
			driverStandingsRepository.save(driverStandingsServiceImpl.pesquisaObjetos(c));
		}
				
		List<Constructor> retornoConstructor = (List<Constructor>) new UploadCsvUtils<Constructor>().uploadCSVFile(new Constructor(), path.concat("constructors.csv"));
	
		for (var c : retornoConstructor) {
			constructorRepository.save(c);
		}		
				
		List<ConstructorResults> retornoConstructorResults = (List<ConstructorResults>) new UploadCsvUtils<ConstructorResults>().uploadCSVFile(new ConstructorResults(), path.concat("constructor_results.csv"));
		
		for (var c :retornoConstructorResults) {
			constructorResultsRepository.save(constructorResultsServiceImpl.pesquisaObjetos(c));
		}
				
		List<ConstructorStandings> retornoConstructorStandings = (List<ConstructorStandings>) new UploadCsvUtils<ConstructorStandings>().uploadCSVFile(new ConstructorStandings(), path.concat("constructor_standings.csv"));
		
		for (var c :retornoConstructorStandings) {
			constructorStandingsRepository.save(constructorStandingsServiceImpl.pesquisaObjetos(c));
		}
				
		List<Qualifying> retornoQualifying = (List<Qualifying>)  new UploadCsvUtils<Qualifying>().uploadCSVFile(new Qualifying(), path.concat("qualifying.csv"));
		
		for (var c :retornoQualifying) {
			qualifyingRepository.save(qualifyingServiceImpl.pesquisaObjetos(c));
		}

		List<Status> retornoStatus = (List<Status>) new UploadCsvUtils<Status>().uploadCSVFile(new Status(), path.concat("status.csv"));

		for (var c : retornoStatus) {
			statusRepository.save(c);
		}	
				
		List<Results> retornoResults = (List<Results>) new UploadCsvUtils<Results>().uploadCSVFile(new Results(), path.concat("results.csv"));
	
		for (var c :retornoResults) {
			resultsRepository.save(resultsServiceImpl.pesquisaObjetos(c));
		}
		
		List<SprintResults> retornoSprintResults = (List<SprintResults>) new UploadCsvUtils<SprintResults>().uploadCSVFile(new SprintResults(), path.concat("sprint_results.csv"));
		
		for (var c :retornoSprintResults) {
			sprintResultsRepository.save(sprintResultsServiceImpl.pesquisaObjetos(c));
		}
		
		List<Seasons> retornoSeasons = (List<Seasons>) new UploadCsvUtils<Seasons>().uploadCSVFile(new Seasons(), path.concat("seasons.csv"));
				
		for (var c :retornoSeasons) {
			seasonsRepository.save(c);
		}
				
	}
	
	@GetMapping("/winning")
	public List<DriversWinning> getDriversWinning() {
		return  driversRepository.winning();	
	}
	
	@GetMapping("/nationalities/wins")
	public List<NationalitiesWins> getNationalitiesWins() {
		return driversRepository.nationalitiesWins();
	}
	
}
