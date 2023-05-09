/*
2. Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package guia4ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int n=0, busqueda, coincidencias=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar el tamaño del Vector");
        n=leer.nextInt();
        int[] vector= new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*100);
            System.out.println(" "+ vector[i] );
        }
        System.out.println("Ingrese el numero a Buscar");  
        busqueda=leer.nextInt();
          
        for (int i = 0; i < n; i++) {
            if (vector[i]==busqueda) {
                System.out.println("El numero se encuentra en la posicion " + (i+1)+ " del Vector");
               coincidencias++;
            }
            
        }
          if (coincidencias == 0) {
              System.out.println("No se encintro el numero igresado, en el vector");
        }
   
        
    }
    
}
