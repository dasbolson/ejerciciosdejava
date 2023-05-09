/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia1ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre,apellido;
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Ingrese su nombre : ");
        nombre=leer.next();
        System.out.print("Ingrese su apellido: ");
        apellido = leer.next();
        System.out.println("");
        System.out.println("Su nombre es "+ nombre + " y su apellido es "+ apellido);

        
        
        
    }
    
}
