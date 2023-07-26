/*
1. Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.


 */
package guia4ejercicios_extra1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicos_extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeros =0, nDim, aux=0;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingresar la dimencion del Vector");
        nDim=leer.nextInt();
        
        int [] vector=new int[nDim];
        System.out.println("");
        System.out.println("Ingresar los valores para el vector ");
        for (int i = 0; i < nDim; i++) {
            vector[i]=leer.nextInt();
            aux= aux + vector[i];       
        }
        System.out.println("");
        System.out.println("La Suma de los numeros del Vector da: "+ aux);
        
    
    }
    
    
}
