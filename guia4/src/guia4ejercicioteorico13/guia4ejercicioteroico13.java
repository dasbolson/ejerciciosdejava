/*
Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.

Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
package guia4ejercicioteorico13;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicioteroico13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Scanner leer= new Scanner(System.in);
        String[] equipo = new String [9];
        String nombre;
        for (int i = 0; i < 8; i++) {
            
      
        System.out.println("Ingresar Nombre de los compañeros ");
        nombre = leer.next();
        equipo[i]=nombre;
        
        }   
        
        
        
        
    }
    
}
