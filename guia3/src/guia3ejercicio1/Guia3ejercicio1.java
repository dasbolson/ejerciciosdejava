/*
1. Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main
 */
package guia3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia3ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        int numero1, numero2, opcion;
        boolean salir = false;
        System.out.println("Ingresar el primer Numero");
        numero1=leer.nextInt();
        System.out.println("Ingresar el segundo Numero");
        numero2=leer.nextInt();
    
        do {
            System.out.println("1. Para Sumar");
            System.out.println("2. Para Restar");
            System.out.println("3. Para Multiplicar");
            System.out.println("4. Para Dividir");
            System.out.println("5. Para Salir");
            System.out.print("Elija Opcion: ");
            opcion=leer.nextInt();
            System.out.println(" ");
            
            switch (opcion) {
                case 1:
                    System.out.println("La Suma da: " + sumar(numero1,numero2));
                    break;
                
                case 2:
                    System.out.println("La Resta da: " + restar(numero1,numero2));
                    break;
                
                case 3:
                    System.out.println("La Multiplicacion da: " + multiplicar(numero1,numero2));
                    break;
                
                case 4:
                    System.out.println("La Divicion da: " +(double)dividir(numero1,numero2));
                    break;
                
                case 5:
                    System.out.println("Salir " );
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Opcion no valida !!! ");
            }
      
            System.out.println(" ");
        } while (!salir);
         
         
        
    }
    
    public static int sumar(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
                
    }
     public static int restar(int numero1, int numero2){
        int resultado;
        resultado = numero1 - numero2;
        return resultado;
                
    }
  public static int multiplicar(int numero1, int numero2){
        int resultado;
        resultado = numero1 * numero2;
        return resultado;
                
    }
   public static double dividir(int numero1, int numero2){
        double resultado;
        resultado = (double)numero1 / numero2;
        return resultado;
                
    }
    
    
}
