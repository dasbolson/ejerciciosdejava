/*
3  Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.


 */
package guia13ejercicio3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainGuia13Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String cadena1;
        String cadena2;
        DivisionNumero divide ;
        int val1;
        int val2;

        try{
        System.out.println("Ingresar Valor 1");
        cadena1 = leer.next();
        System.out.println("Ingresar Valor 2");
        cadena2 = leer.next();

        val1 = Integer.parseInt(cadena1);
        val2 = Integer.parseInt(cadena2);
        
        divide= new DivisionNumero(val1, val2);
        
        divide.dividir();
        
        
        }catch(InputMismatchException f){
            System.out.println("Ingréso por teclado, diferente a números");
        
        }catch(NumberFormatException g){
        
            System.out.println("El parseInt no pudo hacer el pasaje de String a int !!!");
        }finally{
            System.out.println("Salutes desde el main");
        }
        
    }

}
