/*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */
package guia1ejercicio5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia1ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Double numero;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar un numero entero :");
        numero = leer.nextDouble();
        System.out.println("El doble del numero es: " + (numero *2));
        System.out.println("El triple del numero es: " + (numero *3));
        System.out.println("La raiz cuadrada del numero es : " + Math.sqrt(numero));
        
    }
    
}
