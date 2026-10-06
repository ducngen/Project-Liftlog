package htwBerlin.project.service;

import htwBerlin.project.entity.MuscleGroup;
import htwBerlin.project.entity.TrainingSet;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainingSetService {

	// M1: feste Beispieldaten.
	public List<TrainingSet> findAll() {
		return List.of(
				new TrainingSet(1L, "Bankdrücken", MuscleGroup.CHEST, 60, 8, LocalDate.of(2026, 10, 1)),
				new TrainingSet(2L, "Kniebeuge", MuscleGroup.LEGS, 80, 5, LocalDate.of(2026, 10, 2)),
				new TrainingSet(3L, "Klimmzüge", MuscleGroup.BACK, 0, 10, LocalDate.of(2026, 10, 3)),
				new TrainingSet(4L, "Schulterdrücken", MuscleGroup.SHOULDERS, 30, 10, LocalDate.of(2026, 10, 3))
		);
	}
}
