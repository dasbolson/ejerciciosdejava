/*
1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package guia4ejercicio1;

/**
 *
 * @author Casa
 */
public class guia4ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]=i;
           
        }
        for (int j = 99; j >= 0; j--) {
            System.out.println("vector " + vector[j] );
        }
        
    }
    
}
