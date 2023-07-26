/*
3. Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package guia4ejercicios_extra3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicos_extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


       int numeros =0, nDim, aux=0;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingresar la dimensión del Vector");
        nDim=leer.nextInt();
        
        int [] vector=new int[nDim];
        rellenaVector(vector);
        imprimir(vector);

        System.out.println("");
        System.out.println("Fin ");
        
    }
    public static int[] rellenaVector (int [] vector){
     
        for (int i = 0; i < vector.length ; i++) {
            vector[i]=(int)Math.round(Math.random()*100);
        }
    return vector;
    }      
    
    public static void imprimir (int[] vector ){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
        
    
    }
    
    
    
    
    }
    
    
    
