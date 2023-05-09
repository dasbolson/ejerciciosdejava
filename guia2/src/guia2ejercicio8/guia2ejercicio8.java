/*
 8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia2ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int numero;
    Scanner leer= new Scanner(System.in);
    
        System.out.println("Ingresar el numero del asterisco! ");
        numero=leer.nextInt();
        
        
        for (int i = 1; i <= numero; i++) {
           
        
        if (i==1 || i == numero ) {
                    
            for (int j = 1; j <= numero; j++) {
                System.out.print("*");
               }
            System.out.println("");
            } else {
                System.out.print("*");
                for (int k = 1; k <= numero-2; k++) {
                System.out.print(" ");
                 }
                System.out.print("*");
                System.out.println("");
                }
        
        }    
    }
    
}
