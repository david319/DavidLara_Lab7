package org.example;

public class Equipo {

    private String nombre;
    private String PJ;
    private String PG;
    private String PE;
    private String PP;
    private String GF;
    private String GC;
    private String DG;
    private String puntos;


    public Equipo(String nombre) {
        this.nombre = nombre;
        PJ = "0";
        PG = "0";
        PE = "0";
        PP = "0";
        GF = "0";
        GC = "0";
        DG = "0";
        puntos = "0";
    }

    public Equipo(String nombre, String PJ, String PG, String PE, String PP, String GF, String GC, String DG, String puntos) {
        this.nombre = nombre;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.DG = DG;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPJ() {
        return PJ;
    }

    public void setPJ(String PJ) {
        this.PJ = PJ;
    }

    public String getPG() {
        return PG;
    }

    public void setPG(String PG) {
        this.PG = PG;
    }

    public String getPE() {
        return PE;
    }

    public void setPE(String PE) {
        this.PE = PE;
    }

    public String getPP() {
        return PP;
    }

    public void setPP(String PP) {
        this.PP = PP;
    }

    public String getGF() {
        return GF;
    }

    public void setGF(String GF) {
        this.GF = GF;
    }

    public String getGC() {
        return GC;
    }

    public void setGC(String GC) {
        this.GC = GC;
    }

    public String getDG() {
        return DG;
    }

    public void setDG(String DG) {
        this.DG = DG;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String toString() {
        return "Equipo: " + nombre + " PJ: " + PJ + " PG: " + PG + " PE: " + PE + " PP: " + PP + " GF: " + GF + " GC: " + GC + " DG: " + DG + " Puntos: " + puntos;
    }

}
