/*
1. Crear un programa que dado un número determine si es par o impar.
 */
package guia2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int numero;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero, para determinar si es Par: ");
        numero = leer.nextInt();
        if ((numero%2==0)) {
            System.out.println("El numero ingresado es Par !!!");
            
        } else {
            System.out.println("El numero es Impar !!!");
        }
        
        
        
        
        
    }
    
}
