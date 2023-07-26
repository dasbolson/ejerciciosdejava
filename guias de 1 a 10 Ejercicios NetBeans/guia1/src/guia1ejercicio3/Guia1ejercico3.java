/*
 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y después toda en minúsculas..
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia1ejercico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una Frase ");
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
        
        
    }
    
}
