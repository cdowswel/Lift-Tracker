//Exercise Model
public class Exercise {
	
	private String exerciseName;
	private Set set = new Set();
	
	public static Exercise createExercise() {
		Exercise exercise = null;
		
		return exercise;
	}
	
	public String getExerciseName()
	{
		return exerciseName;
	}
	
	public Set getSet()
	{
		return set;
	}
	
	public void setExerciseName(String exerciseName)
	{
		this.exerciseName = exerciseName;
	}
	
	public void setSet(Set set)
	{
		this.set = set;
	}
	
	public static void main(String[] args) {
		
		System.out.println("test");
	}
	
}
