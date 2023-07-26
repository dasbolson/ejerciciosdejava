/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg4.ejecicio.pkg7.guia.teorica;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Encuentro4Ejecicio7GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int opcion;
        System.out.println("Ingrese el tipo de Motor");
        System.out.println(" ");
        System.out.println("1 -> Bomba de agua");
        System.out.println("2 -> Bomba de gasolina");
        System.out.println("3 -> Bomba de hormigón");
        System.out.println("4 -> Bomba de pasta alimenticia");
        System.out.println(" ");
        System.out.println("Ingrese una opcion");
        opcion= leer.nextInt();
        switch(opcion){
            case 1: System.out.println("La bomba es una bomba de agua");
            break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3: System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default: System.out.println(" No existe un valor válido para tipo de bomba"); 
            
        }
        
    }
    
}
