/*
5. Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package guia2ejerciciosextras5;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia2ejerciciosextras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double costoTramiento;
        String tipoSocio;

        System.out.println("Ingresar que tipo de Socio es !");
        System.out.println("Tipo 'A' ");
        System.out.println("Tipo 'B' ");
        System.out.println("Tipo 'C' ");
        System.out.println("");
        tipoSocio=  leer.next();
        tipoSocio= tipoSocio.toUpperCase();
        System.out.println("");
        System.out.println(" Ingresar el costo del Tratamiento ");
        costoTramiento = leer.nextInt();
        switch (tipoSocio) {
            case "A":
                    System.out.println("Socio Tipo: "+ tipoSocio);
                    System.out.println(" Costo del tratamiento sin descuento $ "+ costoTramiento);
                    costoTramiento = costoTramiento-(costoTramiento*0.5);
                    System.out.println(" Costo del tratamiento con descuento de 50% $ "+ costoTramiento);
                    System.out.println(" Fin !!");
                break;
            case "B":
                    System.out.println("Socio Tipo: "+ tipoSocio);
                    System.out.println(" Costo del tratamiento sin descuento $ "+ costoTramiento);
                    costoTramiento = costoTramiento-(costoTramiento*0.35);
                    System.out.println(" Costo del tratamiento con descuento de 35% $ "+ costoTramiento);
                    System.out.println(" Final !!");
                break;
            case "C":
                    System.out.println("Socio Tipo: "+ tipoSocio);
                    System.out.println(" Costo del tratamiento sin descuento $ "+ costoTramiento);
                    System.out.println(" Costo del tratamiento no tiene descuento $ "+ costoTramiento);
                    System.out.println(" Fin !!");
                break;

            default:
                System.out.println(" Se ingreso una opcion no Valida !!! Chauuuu...");
        }
    }

}
