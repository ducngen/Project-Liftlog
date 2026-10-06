package htwBerlin.project.controller;

import htwBerlin.project.entity.TrainingSet;
import htwBerlin.project.service.TrainingSetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sets")
public class TrainingSetController {

	private final TrainingSetService service;

	public TrainingSetController(TrainingSetService service) {
		this.service = service;
	}

	@GetMapping
	public List<TrainingSet> getAllSets() {
		return service.findAll();
	}
}
