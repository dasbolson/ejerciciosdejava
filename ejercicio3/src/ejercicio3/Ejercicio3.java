/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Casa
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leerfrase = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese la frase a transformar " );
        frase =  leerfrase.nextLine();
        System.out.println(" la frase en mayusculas "+ toUpperCase(frase));

        System.out.println(" la frase en minusculas "+ toLowerCase(frase));
    }
    
}
