package controller;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import au.edu.uts.ap.javafx.*;
import model.Stadium;
import model.Group;

public class StadiumController extends Controller<Stadium> {
    
    public Stadium getStadium(){
        return model;
    }

    @FXML
    private ListView<Group> groupsLv;

    public Group getCurrentGroup(){
        return groupsLv.getSelectionModel().getSelectedItem();
    }

    public void openGroup(ActionEvent e) throws IOException{
        Group group = getCurrentGroup();
        // Show on a new stage to not replace it
        // Potential to throw an error
        ViewLoader.showStage(group, "/view/group.fxml", group.getName() + " seat group", new Stage());
    }

}
