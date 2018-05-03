/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author daw2
 */
public class Cinema {
     public static void main(String[] args) {
        ArrayList<Entrada> Entradas = new ArrayList<Entrada>();
        String opcion = "";
            String mensaje = "1. Sacar entrada \n";
            mensaje+="2. Salir";
            opcion = JOptionPane.showInputDialog(null, mensaje);
            
            switch (opcion){    
                case "1":
                    String form_pelicula = "Introduce el nombre de película.";
                    String pelicula = JOptionPane.showInputDialog(null, form_pelicula);
                    String form_fecha = "La fecha para ir a verla.";
                    String fecha = JOptionPane.showInputDialog(null, form_fecha);
                    String form_hora = "La hora para ir a verla.";
                    int hora = Integer.parseInt(JOptionPane.showInputDialog(null, form_hora));
                    String form_fila = "La fila que deseas.";
                    int fila = Integer.parseInt(JOptionPane.showInputDialog(null, form_fila));
                    String form_asiento = "El número de asiento";
                    int asiento = Integer.parseInt(JOptionPane.showInputDialog(null, form_asiento));
                    
                    Entrada nuevaEntrada = new Entrada(pelicula,fecha,hora,fila,asiento);
                    
                    String imprimirEntrada = "Pelicula: "+nuevaEntrada.getPelicula()+"\n";
                    imprimirEntrada+= "Fecha: "+nuevaEntrada.getFecha()+"\n";
                    imprimirEntrada+= "Hora: "+nuevaEntrada.getHora()+"\n";
                    imprimirEntrada+= "Fila: "+nuevaEntrada.getFila()+"\n";
                    imprimirEntrada+= "Asiento: "+nuevaEntrada.getAsiento()+"\n";
                
                    // COMPROBACIÓN DISPONIBILIDAD ASIENTO
                    Iterator<Entrada> iterador = Entradas.iterator();
                    int contador=0;
                    while(iterador.hasNext()){
                        //if(!Entradas.equals(nuevaEntrada)){
                        if(Entradas.get(contador)==nuevaEntrada){
                            Entradas.add(nuevaEntrada);
                            JOptionPane.showMessageDialog(null, imprimirEntrada );
                        }else{
                            System.out.println("El asiento solicitado, en esa peli de ese día con esa hora, está ocupado");
                        }
                    }
                    break;
                
                case "2":
                    System.out.println("¡Adiós!");
                    break;
            }
    }
}
