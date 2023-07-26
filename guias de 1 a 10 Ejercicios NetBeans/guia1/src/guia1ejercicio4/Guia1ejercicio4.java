/*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32+ (9 * C / 5)
 */
package guia1ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia1ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Double gradosC, gradosF;
      Scanner leer = new Scanner(System.in);
      
        System.out.print("Ingresar la cantidad de Grados Centigrados: ");
      gradosC= leer.nextDouble();
      gradosF= 32+(9 * gradosC/5);
        System.out.println("Transformando de Centigrados a Fahrenheit");
        System.out.println("" + gradosC + " grados Centigrados son igual a " + gradosF + " Fahrenheit");


    }
    
}
