/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia2ejerciciosextras2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a, b, c, d, aux;
     Scanner leer= new Scanner(System.in);
        System.out.print("Ingresar valor de a: ");
        a=leer.nextInt();

        System.out.print("Ingresar valor de b: ");
        b=leer.nextInt();
       
        System.out.print("Ingresar valor de c: ");
        c=leer.nextInt();

        System.out.print("Ingresar valor de d: ");
        d=leer.nextInt();

        System.out.print(" a=" + a + " b=" + b + " c=" + c + " d=" + d );
        System.out.println("");
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.print(" a=" + a + " b=" + b + " c=" + c + " d=" + d );
        System.out.println("");
    }
    
}
