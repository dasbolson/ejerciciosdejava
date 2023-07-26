/*
2. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”
 */
package guia3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia3ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner leer=new Scanner(System.in);
       String salida;
            
        do {
            nombreEdad();
            
            
            System.out.println("Quiere seguir mostrando personas ?");
            salida=leer.next();
            
        } while(!salida.equals("No"));
        

    }

public static void nombreEdad(){

      String nombre ="";
      int edad = 0;
       Scanner leer=new Scanner(System.in);
       
            System.out.println("Ingresar el Nombre de la persona");
            nombre=leer.nextLine();
            System.out.println("Ingresar la edad");
            edad = leer.nextInt();
        if (edad<18) {
            System.out.println(nombre + " es menor de edad");
        }else {
            System.out.println(nombre + " es mayor de edad");
        }
   
}
}