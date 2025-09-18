import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
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
        clear = new button("C");

        // Add the leaves to a branch
        HBox box = new HBox(10, valueLbl, valueTf, decBtn, incBtn, clear);
        box.setAlignment(Pos.CENTER);

        // Set the event handlers using 3 different ways
        incBtn.setOnAction(event -> setValue(getValue() + 1));
        decBtn.setOnAction(new ButtonHandler());
        clear.setOnAction(new EventHandler<ActionEvent>() { 
            @Override public void handle(ActionEvent event) {
                setValue(0);
            }
        });

        // Set the scene, show the stage
        stage.setScene(new Scene(box));
        stage.setTitle("Up Down");
        stage.show();
    }

    private int getValue() {
        return Integer.parseInt(valueTf.getText());
    }

    private void setValue(int value) {
        valueTf.setText(String.valueOf(value));
    }

    private class ButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            setValue(getValue()-1);
        }        
    }
}
