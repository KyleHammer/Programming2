import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

/**
 * This application allows the user to increment and decrement a value.
 */
public class IncDec extends Application {
    public static void main(String[] args) { launch(args); }

    private Label valueLbl;
    private TextField valueTf;
    private Button decBtn;
    private Button incBtn;
    private Button clear;

    @Override
    public void start(Stage stage) {
        // Create the leaves
        valueLbl = new Label("Value");
        valueTf = new TextField("0");
        decBtn = new Button("-1");
        incBtn = new Button("+1");
        clear = new Button("C");

        // Add the leaves to a branch
        HBox box = new HBox(10, valueLbl, valueTf, decBtn, incBtn, clear);
        box.setAlignment(Pos.CENTER);

        // Set the scene, show the stage
        stage.setScene(new Scene(box));
        stage.setTitle("Up Down");
        stage.show();
    }
}
