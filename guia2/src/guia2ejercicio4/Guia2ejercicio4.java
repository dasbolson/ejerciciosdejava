/*
4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package guia2ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     String palabra;
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese uan palabra que comience con A ");
        palabra = leer.next();
        if (palabra.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }     
                




    }
    
}
