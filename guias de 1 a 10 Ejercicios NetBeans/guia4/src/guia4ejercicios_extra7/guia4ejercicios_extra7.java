/*

7. Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1),
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente
link: https://quantdare.com/numeros-de-fibonacci/

 */
package guia4ejercicios_extra7;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicios_extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner leer= new Scanner(System.in);
    int nTerminos=0;
    
        System.out.print("Ingresar la cantidad de Terminos a ver, de la sucesión de Fibonacci: ");
        nTerminos= leer.nextInt();
        int [] fibo=new int[nTerminos];
        switch (nTerminos) {
            case 1 :
                fibo[0]=1;
                break;
            case 2 :
               fibo[0]=1;
               fibo[1]=1;
               break;
                
            default:
               fibo[0]=1;
               fibo[1]=1;                
                for (int i = 2; i < nTerminos; i++) {
                    fibo[i]=fibo[i-1]+fibo[i-2];
                }
        }
        System.out.println("Los "+ nTerminos+ " terminos de la Sucesión de FIBONACCI son:");
        System.out.println("");
        for (int i = 0; i < nTerminos; i++) {
            System.out.print(fibo[i] + " ,");
            
        }
        System.out.println(" Fin !");
    }
    
    
}
