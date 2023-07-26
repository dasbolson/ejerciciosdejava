/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package guia2ejerciciosextras4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejercicosextras4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println(" Ingresar un numero del 1 al 10 ");
        numero = leer.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El 1 en Números Romanos es: I ");
                break;
            case 2:
                System.out.println("El 2 en Números Romanos es: II ");
                break;
            case 3:
                System.out.println("El 3 en Números Romanos es: III ");
                break;
            case 4:
                System.out.println("El 4 en Números Romanos es: IV ");
                break;
            case 5:
                System.out.println("El 5 en Números Romanos es: V ");
                break;
            case 6:
                System.out.println("El 6 en Números Romanos es: VI ");
                break;
            case 7:
                System.out.println("El 7 en Números Romanos es: VII ");
                break;
            case 8:
                System.out.println("El 8 en Números Romanos es: VIII ");
                break;
            case 9:
                System.out.println("El 9 en Números Romanos es: IX ");
                break;
            case 10:
                System.out.println("El 10 en Números Romanos es: X ");
                break;
            default:
                System.out.println("El numero esta duera del rango, Fin !!!");
        }

    }

}
