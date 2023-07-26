/*
4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package guia2ejercicio4bis;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejercicio4bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        String palabra;
        int  primeraLetra;
        System.out.println("Ingresar una Palabra");
        palabra=leer.next();
        primeraLetra=palabra.charAt(0);
        if (primeraLetra==65 ) {
            System.out.println("Correcto");
        }else 
        System.out.println("Incorrecto ");
    }
    
}
