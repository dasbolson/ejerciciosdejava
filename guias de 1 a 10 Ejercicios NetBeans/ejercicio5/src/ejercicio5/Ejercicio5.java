/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero, doble, triple, raizcuadrada;
        Scanner nuevoNumero= new Scanner(System.in);
        
        System.out.println("Ingresar el Numero: ");
        numero= nuevoNumero.nextInt();
        doble = numero*2;
        triple= numero*3;
        raizcuadrada=  sqrt(numero);
        
        System.out.println("El doble es = "+ doble);
        System.out.println("El triple es = "+ triple);
        System.out.println("La raiz cuadrada es = "+raizcuadrada);
        
               
        
    }
    
}
