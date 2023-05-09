/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejerciciosextras7bis;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras7bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int contador=0, cantidadNumeros, mayor = 0, menor = 0, numero = 0, sumador = 0;

        System.out.print("Ingresar la cantidad de Números: ");
        cantidadNumeros = leer.nextInt();
        System.out.println("Ingresar los " + cantidadNumeros + " Nùmeros mayores que 0 : ");

        do {
            numero = leer.nextInt();
            mayor = Math.max(numero, mayor);
            if (menor==0) {
                menor=numero;
            }
            menor = Math.min(numero, menor);
            sumador = sumador + numero;
            contador ++;
        } while (contador<cantidadNumeros);

        

        System.out.println("");
        System.out.println("El Mayor de los Números es: " + mayor);
        System.out.println("El Menor de los Números es: " + menor);
        System.out.println("El Promedio de los Números es: " + sumador / cantidadNumeros);

    }

}
