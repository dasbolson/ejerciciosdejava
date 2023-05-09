/*
2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase ");
        frase = leer.nextLine();
        if (frase.equalsIgnoreCase("Eureka")) {
            System.out.println("correcto !!!");
            
        } else {
            System.out.println("Incorrecto");
        }
        
        
        
    }
    
}
