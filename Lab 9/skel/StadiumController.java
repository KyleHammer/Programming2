import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;

public class StadiumController {
    private Stadium stadium = new Stadium();

    // JavaFX getters should be final
    public final Stadium getStadium() {
        return stadium;
    }

    @FXML private TextField sellTf;

    private final int getAmount() { return Integer.parseInt(sellTf.getText()); }
    private final void setAmount(int amount) { sellTf.setText(""+amount); }

    @FXML public void handleSell(ActionEvent e){
        int amount = getAmount();
        stadium.getGroup().sell(amount);
        setAmount(0);
    }
}
