/*
6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N) 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.



    MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
 Elija una Opcion:


 */
package guia2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int numero1, numero2, opcion;
        String salida = "N";
        System.out.print("Ingrese un primer numero: ");
        numero1=leer.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        numero2=leer.nextInt();
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una Opcion: ");
            opcion=leer.nextInt();

            switch (opcion) {
            case 1:
                System.out.println("La Suma da: " + (numero1+numero2));
                break;
            case 2:
                System.out.println("La Resta da: " + (numero1-numero2));
                break;  
            case 3:
                System.out.println("La Multiplicacion da: " + (numero1*numero2));
                break; 
            case 4:
                System.out.println("La Division da: " + (numero1/numero2));
                break;
            case 5:
                System.out.println("Salir: " );
                System.out.print("S / N (si/no):");
                salida = leer.next();
                break;            
            default:
                System.out.println("Ingrese una opcion valida ");
                break;
       
            }
            
            
        } while (!salida.equals("S") );
        
        
        
        
        
        
        
    }
    
}
