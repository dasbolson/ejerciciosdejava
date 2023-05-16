/*
 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia10ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Casa
 */
public class Guia10ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String raza;
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razasDePerros = new ArrayList();
      
        do {
            System.out.println("Ingresar Raza de Perro ");
            raza = leer.next();
            razasDePerros.add(raza);
            
            System.out.println("Desea ingresar una nueva Raza");
            
        } while (true);
        
        
        
        
        
        
    }

    
    
    
    
    
    
}
