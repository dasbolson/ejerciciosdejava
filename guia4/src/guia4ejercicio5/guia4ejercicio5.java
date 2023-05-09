/*
5. Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).

     Matriz         Matris Transpuesta
    0 -2  4             0  2 -4
    2  0  2            -2  0 -2
   -4 -2  0             4  2  0 

En este caso la matriz es antisimétrica.

 */
package guia4ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        boolean condicion = false;
        Scanner leer = new Scanner(System.in);

        System.out.println("Matriz A");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = leer.nextInt();
                // System.out.print(matrizA[i][j] + " ");
            }
            //  System.out.println("");
        }
        System.out.println("Matriz B");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = leer.nextInt();
                //  System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz A");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz B");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("");

        // Es B ¿ transpuesta de A ?
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matrizA[i][j]) == (matrizB[j][i])) {
                    condicion = true;
                } else {
                    condicion = false;
                    break;
                }
            }
            if (condicion == false) {
                break;
            }
        }
        
        // Es ¿B = - A ?
        if (condicion == true) {
            System.out.println("B es Transpuesta de A");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((matrizA[i][j]) == -(matrizB[i][j])) {
                        condicion = true;
                    } else {
                        condicion = false;
                        break;
                    }
                }
                if (condicion == false) {
                    break;
                }
            }
        }// else {
    if (condicion == true) {
            System.out.println("La Matriz B es la ANTISIMETRICA de A");
    }else {
        System.out.println(" La Matriz B NO es Antisimetrica de A");
    }

    System.out.println ("");
    System.out.println ("FIN !!!");
    }
    
    }

   

