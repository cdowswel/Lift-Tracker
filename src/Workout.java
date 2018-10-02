//Workout Model
import java.util.Date;

public class Workout {
	
	private Exercise exercise = new Exercise();
	private Date workoutDate;
	
	public static Workout createWorkout() {
		Workout workout = null;
		
		return workout;
	}
	
	public Exercise getExercise()
	{
		return exercise;
	}
	
	public Date getWorkoutDate()
	{
		return workoutDate;
	}
	
	public void setWorkoutDate(Date workoutDate)
	{
		this.workoutDate = workoutDate;
	}
	
	public void setExercise(Exercise exercise)
	{
		this.exercise = exercise;
	}
}
