/*
6. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

    2   7   6
    + +
    9 + 5 + 1    = 15
    +     +
    4   3   8
 
    ||          \\
    15           15



 */
package guia4ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int nDim, valor;
        System.out.println("Ingresar el numero de Lado de la matriz");
        nDim = leer.nextInt();
        int matriz[][] = new int[nDim][nDim];

        System.out.println("Ingresar numeros del 1 al 9 para la matriz");

        for (int i = 0; i < nDim; i++) {
            for (int j = 0; j < nDim; j++) {
                do {

                    valor = leer.nextInt();

                    if (valor > 25 || valor < 1) {
                        System.out.println(" Valor no valido");
                    }

                } while (valor > 25 || valor < 1);

                matriz[i][j] = valor;
            }
        }
        System.out.println("");
        
        for (int i = 0; i < nDim; i++) {
            for (int j = 0; j < nDim; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
  // suma y comprueba filas  columnas y diagonales
        System.out.println("Es " + testFyC(matriz, nDim) + " que sea un cuadrado Magico");

    }

    static public boolean testFyC(int [][] matriz, int nDim) {
        int[] vectorSumas = new int[nDim + nDim + 2];
        int aux;
        boolean magico = false;
        for (int i = 0; i < nDim; i++) {
        for (int j = 0; j < nDim; j++) {
            vectorSumas[i] = vectorSumas[i]+ matriz[i][j];
            vectorSumas[i + nDim] =vectorSumas[i + nDim]+ matriz[j][i] + matriz[1][j] + matriz[2][j];
           
          //  if (vectorSumas[j] == vectorSumas[j + nDim]) {
           //     magico = true;
           // } else {
          //      magico = false;
           //     System.out.println("No se cumple las condiciones para que sea un cuadrado Magico");
          //      break;
            }
        }
        
        if (magico = true) {
            for (int i = 0; i < nDim; i++) {
                for (int j = 0; j < nDim; j++) {
                    if (j == i) {
                        vectorSumas[nDim * 2] = vectorSumas[nDim * 2] + matriz[i][j];
                    }
                    if (i + j == (nDim - 1)) {
                        vectorSumas[(nDim * 2) + 1] = vectorSumas[(nDim * 2) + 1] + matriz[i][j];
                    }
                }
            }

        }
        if (magico== true) {
          aux=vectorSumas[0];  
        
        for (int i = 0; i < nDim; i++) {
            if (aux == vectorSumas[i]) {
                magico = true;
            }else{ magico=false;
            break;
            }
        
        }
        }
        return magico;

    }

}
