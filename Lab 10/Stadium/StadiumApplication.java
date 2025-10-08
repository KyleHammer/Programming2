import javafx.application.*;
import javafx.stage.*;
import model.Stadium;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.fxml.*;
import au.edu.uts.ap.javafx.*;

//public class StadiumApplication extends Application {
public class StadiumApplication extends Application {
	public static void main(String[] args) { launch(args); }
	@Override
	public void start(Stage stage) throws Exception {
		Stadium stadium = new Stadium(); // Import the model
		ViewLoader.showStage(stadium, "/view/stadium.fxml", "Stadium", stage);
	}
}
