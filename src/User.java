import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	// User model attributes
	public String userName;
	public Date userDOB;
	public double userWeight;
	

	public User()
	{
		
	}
	
	public static User createUser() {
		User user = null;
		
		return user;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public Date getUserDOB()
	{
		return userDOB;
	}
	
	public double getUserWeight()
	{
		return userWeight;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setUserDOB(Date userDOB)
	{
		this.userDOB = userDOB;
	}
	
	public void setUserWeight(double userWeight)
	{
		this.userWeight = userWeight;
	}
	

}
