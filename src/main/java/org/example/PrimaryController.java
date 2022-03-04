package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import static org.example.Archivos.addTeam;
import static org.example.Archivos.deleteTeam;

public class PrimaryController {

    @FXML
    private Pane Crear, DeleteT;

    @FXML
    private MenuBar MenuBar;

    @FXML
    private MenuItem CreateT, deleteT, EditT, LoadA, SimularP, TablaDeP;

    @FXML
    private TextField nameTeamC, nameD;

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
        if (addTeam(name)){
            Crear.setVisible(false);
            MenuBar.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText("Equipo creado");
            alert.setContentText("El equipo ha sido creado");
            alert.showAndWait();
        }
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

    public void OnClickDeleteTeam() {
        DeleteT.setVisible(true);
        Crear.setVisible(false);
        MenuBar.setVisible(false);
    }

    public void BackD(){
        DeleteT.setVisible(false);
        MenuBar.setVisible(true);
    }

    public void OnbackEClicked(){
        BackD();
    }

    public void delete_btn(){
        String name = nameD.getText();
        if (deleteTeam(name)){
            DeleteT.setVisible(false);
            MenuBar.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Informacion");
            alert.setHeaderText("Equipo eliminado");
            alert.setContentText("El equipo ha sido eliminado");
            alert.showAndWait();
        } else {
            DeleteT.setVisible(false);
            MenuBar.setVisible(true);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Equipo no encontrado");
            alert.setContentText("El equipo no existe");
            alert.showAndWait();
        }
    }

    public void OnDeleteClicked(){
        delete_btn();
    }

}

