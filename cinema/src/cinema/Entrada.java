/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.Date;

/**
 *
 * @author daw2
 */
public class Entrada {
   String pelicula;
   String fecha;
   int hora;
   int fila;
   int asiento;
   
   public Entrada(String pelicula, String fecha, int hora, int file, int asiento){
       this.pelicula= pelicula;
       this.fecha=fecha;
       this.hora=hora;
       this.fila=fila;
       this.asiento=asiento;
   }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(Date String) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
   
}
    
   

