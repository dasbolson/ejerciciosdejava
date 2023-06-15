/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */

package guia10ejerciciosExtrasA1;

import java.util.ArrayList;
import java.util.Scanner;


public class guia10ejercicosExtrasA1Main {

   
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Integer> arraiList = new ArrayList<>();
        Integer suma=0;
        System.out.println("Ingresar numeros Enteros: " );
        Integer menu = leer.nextInt() ;
        
        while (menu!=99) {
            arraiList.add(menu);
            System.out.println("Ingresar otro numero: ");
            menu = leer.nextInt();
        }
        System.out.println("Se ingresaron "+arraiList.size()+ " Numeros");
        for (Integer integer : arraiList) {
            System.out.println(integer + " ");
            suma = suma + integer;
        }
        System.out.println("suma = "+suma+ " Promedio= "+suma/(arraiList.size()) );
        System.out.println("Chauuu ");
        
    }

}
