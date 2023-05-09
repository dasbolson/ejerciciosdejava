/*
6. Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia2ejerciciosextras6;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int nPersonas, contador1=0, contador2=0;
       double estatura,estatura1=0, estatura2=0;
       
        System.out.print("Ingresar la cantidad de Pesonas: ");
        nPersonas=leer.nextInt();
        System.out.println("");
        for (int i = 1; i <= nPersonas; i++) {
            System.out.println("Ingresar la altura de la persona "+ (i) +" : ");
            estatura= leer.nextDouble();
            if (estatura < 1.60) {
                contador1 ++;
                estatura1=estatura1 + estatura;
            }else { contador2 ++;
                estatura2= estatura2 + estatura;
            }
        }
        System.out.println("");
        System.out.println("Cantidad de Personas con estatura menor a 1.60 mts: "+ contador1);
        System.out.println("Promedio de estatura de personas por debajo de 1.60 Mts "+(estatura1/contador1));
        System.out.println("");
        System.out.println("Promedio General: "+(estatura1+estatura2)/(contador1+contador2));
    }
    
    
    
    
}
