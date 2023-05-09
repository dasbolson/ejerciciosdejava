/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
     
     int numero1, numero2;
     int suma;
             
    System.out.println("Ingresar el numero 1 " );
    numero1= leer.nextInt();   
    System.out.println("Ingresar el numero 2 " );
    numero2=leer.nextInt();
    suma= numero1+numero2;
    System.out.println("la suma da " + suma );
    
                



// TODO code application logic here
    }
    
}
