/*
//2. Escriba un programa que averigüe si dos vectores de N enteros son
//iguales (la comparación deberá detenerse en cuanto se detecte alguna
//diferencia entre los elementos).
 */
package guia4ejercicios_extra2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicos_extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros = 0, nDim, aux = 0;
        boolean igualdad = false;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar la dimencion del Vector");
        nDim = leer.nextInt();

        int[] vectorA = new int[nDim];
        int[] vectorB = new int[nDim];

        System.out.println("");
        System.out.println("Ingresar los valores para el vector A ");
        for (int i = 0; i < nDim; i++) {
            vectorA[i] = leer.nextInt();

        }
        System.out.println("");
        System.out.println("Ingresar los valores para el vector B ");
        for (int i = 0; i < nDim; i++) {
            vectorB[i] = leer.nextInt();
            if (vectorA[i] == vectorB[i]) {
                igualdad = true;
            } else {
                igualdad = false;
                break;
            }

        }
        System.out.println("");

        if (igualdad == true) {
            System.out.println("Los vectores Son iguales");
        } else {
            System.out.println("Los vectores No son iguales");

        }
    }

}
