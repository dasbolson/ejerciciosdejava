/*
 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package guia2ejerciciosextras3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String letra="";
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar una Letra");
        letra=leer.next(letra);
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u"))  {
            System.out.println("La letra ingresada es una Vocal !!!");
        } else{ System.out.println("La letra ingresada no es una Vocal !!!");
        }
        
    }
    
}
