/*
7. Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia2ejerciciosextras7;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadNumeros, mayor = 0, menor = 0, numero=0, sumador = 0;

        System.out.print("Ingresar la cantidad de Números: ");
        cantidadNumeros = leer.nextInt();
        System.out.println("Ingresar los " + cantidadNumeros + " Nùmeros mayores que 0 : ");

        for (int i = 1; i <= cantidadNumeros; i++) {

            numero = leer.nextInt();
            while (menor == 0) {
                menor = numero;
            }

            mayor = Math.max(numero, mayor);
            menor = Math.min(numero, menor);
            sumador = sumador + numero;
        }
        System.out.println("");
        System.out.println("El Mayor de los Números es: " + mayor);
        System.out.println("El Menor de los Números es: " + menor);
        System.out.println("El Promedio de los Números es: " + sumador / cantidadNumeros);

    }

}
