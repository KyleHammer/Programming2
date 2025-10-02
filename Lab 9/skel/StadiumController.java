import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;

public class StadiumController {
    @FXML private TextField sellTf;

    private final int getAmount() { return Integer.parseInt(sellTf.getText()); }
    private final void setAmount(int amount) { sellTf.setText(""+amount); }

    @FXML public void handleSell(ActionEvent e){
        int amount = getAmount();
        setAmount(0);
    }
}
