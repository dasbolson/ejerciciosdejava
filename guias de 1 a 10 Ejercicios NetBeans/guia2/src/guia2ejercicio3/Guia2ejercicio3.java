/*
3. Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package guia2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String frase;
      Scanner leer = new Scanner(System.in);
      
        System.out.println("ingresar una frase o palabra de 8 caracteres");
        frase = leer.nextLine();
        if (frase.length()==8) {
            System.out.println("Frase o Palabra correcta");
        }else { System.out.println("Frase o palabra incorrecta"); 
            
        }
        
        
        
    }
    
}
