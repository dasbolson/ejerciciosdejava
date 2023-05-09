/*
4. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).


            1   0   4                 1   0   6
Matriz A=   0   5   0  -> Matriz B=   0   5   0
            6   0   -9                4   0   -9

 */
package guia4ejercicio4;

/**
 *
 * @author Casa
 */
public class guia4ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Transpuesta");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
