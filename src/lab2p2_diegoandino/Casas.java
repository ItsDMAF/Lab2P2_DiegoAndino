
package lab2p2_diegoandino;

import java.awt.Color;

public class Casas {
    
    private String casa;
    private int bloque;
    private Color color;
    private int ancho;
    private int largo;
    private int baños;
    private int cuartos;
    private String estado;
    private String dueño;
    
    public Casas(String casa, int bloque, 
            Color color, int ancho, int largo, 
            int baños, int cuartos, String estado, String dueño){
        
        this.casa = casa;
        this.bloque = bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.baños = baños;
        this.cuartos = cuartos;   
        this.estado = estado;
        this.dueño = dueño;
               
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
    
    public String toString(){
        return "Casa: " + casa + " Bloque: " + bloque + 
                " Color: " + color + " Ancho: " + ancho +
                " Largo: " + largo + " Baños: " + baños +
                " Cuartos: " + cuartos +  " estado: " + estado + " Dueño: " + dueño;
    }

    
}
