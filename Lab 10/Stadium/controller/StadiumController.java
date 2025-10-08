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

public class StadiumController extends Controller<Stadium> {
    
    public Stadium getStadium(){
        return model;
    }

}
