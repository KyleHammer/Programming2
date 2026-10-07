package controller;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import model.Stadium;
import javafx.beans.property.*;
import java.io.*;
import au.edu.uts.ap.javafx.*;

public class StadiumController extends Controller<Stadium>{
    
    public Stadium getStadium() { return model; }
}
