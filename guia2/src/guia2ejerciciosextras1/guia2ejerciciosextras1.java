/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia2ejerciciosextras1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double dias, horas, minutos,restoMin,restoHoras;
        Scanner leer= new Scanner(System.in);
        
        System.out.print("Ingresar la cantidad de Minutos: ");
        minutos= leer.nextDouble();
        horas= Math.floor(minutos/60);
        restoMin = (minutos % 60);
        dias = Math.floor(horas/24);
        restoHoras=(horas % 24);
                
        System.out.println(minutos + " Minutos son "+ dias +" dias "+ restoHoras + " Horas " + restoMin + " Minutos");
        

    }
    
}
