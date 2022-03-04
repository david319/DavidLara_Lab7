package org.example;

import javafx.scene.control.Alert;

import java.io.*;
import java.util.ArrayList;

public class Archivos {

    static ArrayList<Equipo> equipos = new ArrayList<>();

    public static boolean addTeam(String name) {
        for (Equipo e : equipos) {
            if (e.getNombre().equals(name)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Equipo ya existente");
                alert.setContentText("El equipo ya existe");
                alert.showAndWait();
                return false;
            }
        }
        equipos.add(new Equipo(name));
        try {
            String ruta = "equipos.txt";
            for (Equipo equipo : equipos) {
                FileWriter fw = new FileWriter(ruta, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(equipo.toString() + "\n");
                bw.close();
            }
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean deleteTeam(String name) {
        for (Equipo e : equipos) {
            if (e.getNombre().equals(name)) {
                equipos.remove(e);
                try {
                    String ruta = "equipos.txt";
                    FileWriter fw = new FileWriter(ruta, false);
                    BufferedWriter bw = new BufferedWriter(fw);
                    for (Equipo equipo : equipos) {
                        bw.write(equipo.toString() + "\n");
                    }
                    bw.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                return true;
            }
        }
        return false;
    }




}
