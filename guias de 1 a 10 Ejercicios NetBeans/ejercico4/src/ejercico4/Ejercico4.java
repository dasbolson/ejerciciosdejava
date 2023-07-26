/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Ejercico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Double gradosF, resultado ;
        Scanner ingresaGrados = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados Fahrenthei a transformar a Centigrados:");
        gradosF = ingresaGrados.nextDouble();
        resultado = 32 +(9 *( gradosF/5));
        System.out.println( gradosF +" centigrados Son grados Fahrenhtei " + resultado  );
        
        
    }
    
}
