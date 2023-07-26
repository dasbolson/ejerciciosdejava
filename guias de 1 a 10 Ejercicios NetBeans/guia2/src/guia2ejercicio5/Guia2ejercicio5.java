/*
5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package guia2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Scanner leer = new Scanner(System.in);
     int numeroLimite, numeroIngreso, suma = 0;
        System.out.println("Ingrese el numero limite para las sumas"); 
        numeroLimite=leer.nextInt();
                
        do {
           System.out.println("Ingrese el numero para las suma"); 
           numeroIngreso=leer.nextInt();
           suma=suma+numeroIngreso;
                       
        } while (suma<numeroLimite);
        
        System.out.println("Las suma dio: "+ suma);
        System.out.println("El limite era: "+ numeroLimite);
        
    }
    
    
}
