/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejecicio.pkg6.guia.teorica;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Encuentro4Ejecicio6GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ingresoNumero = new Scanner(System.in);
        
        int numero1, numero2 ;
        
        System.out.println("Ingrese un primer Número ");
        numero1= ingresoNumero.nextInt();
         System.out.println("Ingrese un segundo Número ");
        numero2= ingresoNumero.nextInt();
        
        
        if (numero1>25 && numero2 >25 ) {
            System.out.println("El primer y segundo numero son mayores que 25");
        }
        else if (numero1>25){ 
        System.out.println("El primer numero es mayor que 25");
        }
        else if (numero2>25) { System.out.println("El segundo numero es mayor que 25");
        }
        else { System.out.println("Ninguno de los numeros es mayor que 25");
        }
    }
    
}
