/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejecicio.pkg8.guia.teorica;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Encuentro4Ejecicio8GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Ingresar una nota entre 0 y 10");
        nota= leer.nextInt();
        while (nota <= 0 || nota > 10) {
            
            System.out.println("Nota incorrecta ");
            System.out.println(" ");
             System.out.println("Ingresar una nota entre 0 y 10");
            nota= leer.nextInt();
            continue;
    }
        System.out.println("Nota correcta");
        
        
        
        
    }
    
}
