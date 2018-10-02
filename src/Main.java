import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Main extends Application implements EventHandler<ActionEvent> {
	
	public static void main(String[] args) {
		
		User newUser = new User();
		//newUser = User.createUser();
		
		System.out.println("Enter your desired username:" );
		String firstUsername;
		String firstDOBS;
		String firstWeight;
		Scanner input = new Scanner(System.in);
		firstUsername = input.nextLine();
		newUser.setUserName(firstUsername);
		System.out.println("Enter your date of birth:");
		firstDOBS = input.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date formatted = null;
		try {
			formatted = format.parse(firstDOBS);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		newUser.setUserDOB(formatted);
		System.out.println("Enter your current weight in lbs:");
		firstWeight = input.nextLine();
		newUser.setUserWeight(Double.parseDouble(firstWeight));
		input.close();
		
		//userlist[0].userName = firstUsername;
		//userlist[0].userDOB = formatted;
		//userlist[0].userWeight = Double.parseDouble(firstWeightS); 
		
		System.out.println(newUser.userName);
		System.out.println(newUser.userWeight);
		System.out.println(newUser.userDOB);
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
