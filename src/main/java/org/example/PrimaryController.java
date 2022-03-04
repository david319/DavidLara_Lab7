package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import static org.example.Archivos.addTeam;

public class PrimaryController {

    @FXML
    private Pane Crear, DeleteT;

    @FXML
    private MenuBar MenuBar;

    @FXML
    private MenuItem CreateT, deleteT, EditT, LoadA, SimularP, TablaDeP;

    @FXML
    private TextField nameTeamC;

    @FXML
    private Button BackP, Create, delete_btn, backE;


    @FXML
    private void initialize() {
    }

    public void OnClickCreateTeam() {
        Crear.setVisible(true);
        DeleteT.setVisible(false);
    }

    public void BackP(){
        Crear.setVisible(false);
        MenuBar.setVisible(true);
    }

    public void Create(){
        String name = nameTeamC.getText();
        addTeam(name);
        Crear.setVisible(false);
        MenuBar.setVisible(true);
    }

    public void OnCreateClicked(){
        Create();
    }

    public void backE(){
        Crear.setVisible(false);
        MenuBar.setVisible(true);
    }

    public void OnbacEClicked(){
        backE();
    }

}

