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

public class UItest extends Application implements EventHandler<ActionEvent> {
	
	Label titleText;
	Button loginButton;
	TextField userField;
	Label loginText;
	Button regButton;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Lift Tracker 2018");
		
		titleText = new Label("Enter your username:");
		loginButton = new Button("Login");
		loginButton.setOnAction(this);
		userField = new TextField();
		loginText = new Label("");
		regButton = new Button("Register");
		regButton.setOnAction(this);
		
		TilePane layout = new TilePane();
		
		layout.setPadding(new Insets(5,0,5,0));
		layout.setVgap(5);
		layout.setHgap(5);
		layout.setPrefRows(4);
		layout.setPrefColumns(1);
		layout.setAlignment(Pos.CENTER);
		layout.setStyle("-fx-background-color: DAE6F3;");
		
		layout.getChildren().add(titleText);
		layout.getChildren().add(userField);
		layout.getChildren().add(loginButton);
		layout.getChildren().add(loginText);
		layout.getChildren().add(regButton);
		layout.setTileAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	@Override
	public void handle(ActionEvent event)
	{
		if (event.getSource() == loginButton)
		{
			if (userField.getText().equals("cnasty"))
			{
				loginText.setText("Valid User");
				loginText.setTextFill(Color.GREEN);
				System.out.println("correct user");
			}
			//loginText.setText("Valid User");
			else {
				loginText.setText("Invalid User");
				loginText.setTextFill(Color.RED);
			}
		}
		else if (event.getSource() == regButton)
		{
			System.out.println("register");
		}
	}

}
