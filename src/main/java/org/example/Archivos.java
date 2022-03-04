package org.example;

import javafx.scene.control.Alert;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivos {

    static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void addTeam(String team) {
        Equipo equipo = new Equipo(team);
        equipos.add(equipo);
        try {
            FileWriter fw = new FileWriter("Equipo.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(team);
            pw.close();
            fw.close();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error al crear el archivo");
            alert.setContentText("No se pudo crear el archivo");
            alert.showAndWait();
        }
    }

    public static void deleteTeam(String team) {
        for(int i = 0; i < equipos.size(); i++) {
            if(equipos.get(i).getNombre().equals(team)) {
                equipos.remove(i);
            }
        }
        try {
            FileWriter fw = new FileWriter("Equipo.txt");
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < equipos.size(); i++) {
                pw.println(equipos.get(i).getNombre());
            }
            pw.close();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error al crear el archivo");
            alert.setContentText("No se pudo crear el archivo");
        }
    }



}
