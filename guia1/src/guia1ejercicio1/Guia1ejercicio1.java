/*
 1. Escribir un programa que pida dos números enteros por teclado y calcule
 la suma de los dos. El programa deberá después mostrar el resultado de
 la sumatemplate in the editor.
 */
package guia1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia1ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int numero1, numero2;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero ");
        numero2 = leer.nextInt();
        System.out.println("La suma de los dos numeros da: " + (numero1+numero2));
        
        
        
    }
    
}
