import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Combodemo extends Application{
	@Override
	public void start(Stage primaryStage){
		primaryStage.setTitle("Account name");
		Label unLable=new Label("Username");
		Label pwLable=new Label("Password");
		Label accLable=new Label("Account Type");
		TextField unTField=new TextField();
		TextField pwTField=new PasswordField();
		ObservableList<String> options=FXCollections.observableArrayList("Administrator", "Staff", "Faculty", "Student", "Guest");
		ComboBox acTypeComboBox=new ComboBox(options);
		Button signInButton = new Button("Sign in");
		signInButton.setOnAction(e->{
			String displaystr="";
			Font welcomeFont=new Font("Wingdins", 40);
			if(unTField.getText().equals("Sung") && pwTField.getText().equals("a123")){
				String acType=(String)acTypeComboBox.getValue();
				if(acType.equals("Student")){displaystr="Welcome" + acType;
					if(acType.equals("Administrator")){displaystr="Welcome" + acType;}
					if(acType.equals("Staff")){displaystr="Welcome" + acType;}
					if(acType.equals("Faculty")){displaystr="Welcome" + acType;}
					if(acType.equals("Guest")){displaystr= "Welcome" + acType;}
				}
				
				else {displaystr="Incorrect Account Type";}
			}
				else {displaystr="Fail Authentication!";}
				Label welcomeLabel=new Label(displaystr);
				welcomeLabel.setFont(welcomeFont);
				Scene welcomeScene = new Scene(welcomeLabel);
				Stage welcomeStage = new Stage();
				welcomeStage.setScene(welcomeScene);
				welcomeStage.show();
		});
		VBox flowPane=new VBox();
		flowPane.getChildren().addAll(unLable,pwLable,accLable,unTField,pwTField,acTypeComboBox,signInButton);
		Scene scene=new Scene(flowPane, 500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main (String [] args){
		launch(args);
	}
}

