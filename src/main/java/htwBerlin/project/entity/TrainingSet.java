package htwBerlin.project.entity;

import java.time.LocalDate;

/**
 * Ein einzelner geloggter Satz, z. B. "Bankdrücken, 60 kg x 8 Wdh. am 03.10.".
 */
public class TrainingSet {

	private Long id;
	private String exercise;
	private MuscleGroup muscleGroup;
	private double weightKg;
	private int reps;
	private LocalDate performedOn;

	public TrainingSet() {
	}

	public TrainingSet(Long id, String exercise, MuscleGroup muscleGroup,
			double weightKg, int reps, LocalDate performedOn) {
		this.id = id;
		this.exercise = exercise;
		this.muscleGroup = muscleGroup;
		this.weightKg = weightKg;
		this.reps = reps;
		this.performedOn = performedOn;
	}

	/** Trainingsvolumen dieses Satzes: Gewicht x Wiederholungen. */
	public double getVolume() {
		return weightKg * reps;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getExercise() { return exercise; }
	public void setExercise(String exercise) { this.exercise = exercise; }

	public MuscleGroup getMuscleGroup() { return muscleGroup; }
	public void setMuscleGroup(MuscleGroup muscleGroup) { this.muscleGroup = muscleGroup; }

	public double getWeightKg() { return weightKg; }
	public void setWeightKg(double weightKg) { this.weightKg = weightKg; }

	public int getReps() { return reps; }
	public void setReps(int reps) { this.reps = reps; }

	public LocalDate getPerformedOn() { return performedOn; }
	public void setPerformedOn(LocalDate performedOn) { this.performedOn = performedOn; }
}
