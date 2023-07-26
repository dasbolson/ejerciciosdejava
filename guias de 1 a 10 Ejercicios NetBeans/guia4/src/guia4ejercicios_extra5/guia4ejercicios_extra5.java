/*
5. Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package guia4ejercicios_extra5;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicios_extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner leer= new Scanner(System.in);
        int m,n, suma = 0;
        System.out.println("Ingresar m ");
        m=leer.nextInt();
        
        System.out.println("Ingresar m ");
        n=leer.nextInt();
        int [][] mXn= new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mXn[i][j]=(int) Math.round(Math.random()*100);
               suma = suma + mXn[i][j];
                System.out.print(mXn[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma da : "+ suma );
    }
    
}
