/*
 4. Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package guia3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia3ejecicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     int numero;
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingresar un numero para evaluar si es Primo o No Primo");
        numero=leer.nextInt();
        
        if (evaluaNumero(numero)) {
            System.out.println("El Número ingresado es Primo !");
            
        } else {
            System.out.println("El Número ingresado no es Primo !");
        }


    }
    public static boolean evaluaNumero(int numero){
       
        
        boolean condicion=false;
        int resto;
        
        int contador=0;
        
                
        for (int i = 1; i <= numero; i++) {
            resto=numero%i;
            if (resto==0) {
                contador++;
            } 
        }
        if (contador==2) {
            condicion=true;
        }
        return condicion;
        
    }
}
