/*
Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10
 */
package Guia3teoricaejercicio11;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia3teoricaejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String frase;
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingresar una frase.");
     frase=leer.nextLine();
        System.out.println(cambiafrase(frase)); 
       
    }
    
public static String cambiafrase(String frase) {
    
    int longuitudFrase = frase.length();
    String letra, nuevaFrase="";
    
    for (int i = 0; i <= (longuitudFrase - 1); i++) {
        letra = frase.substring(i,i+1);
        letra =letra.toLowerCase();
        switch (letra) {
            case "a":
                letra="@";
                nuevaFrase=nuevaFrase.concat(letra);
                break;
            case "e":
                letra="#";
                nuevaFrase=nuevaFrase.concat(letra);
                break;
            case "i":
                letra="$";
                nuevaFrase=nuevaFrase.concat(letra);
                break;                
            case "o":
                letra="%";
                nuevaFrase=nuevaFrase.concat(letra);
                break;            
            case "u":
                letra="*";
                nuevaFrase=nuevaFrase.concat(letra);
                break;            
            
            
            default:
                nuevaFrase=nuevaFrase.concat(letra);
                ;
                
        }
   
    
    }
    return nuevaFrase; 
}   
    
    
}
