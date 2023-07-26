/*
 1. Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package guia8ejercicios1extras;

import java.math.MathContext;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia8ejercicios1extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MesSecreto ms = new MesSecreto();
        String adivinador;

        int intentos = 1;

        System.out.println(" Adivine el mes secreto.");
        System.out.println("Tiene 3 intentos");
        System.out.println(" Introduzca el nombre del mes en minúsculas: ");

        while (intentos < 4) {
             System.out.println(" Ingrese Mes: ");
            adivinador = leer.next().toLowerCase();
            if (ms.getMesSecreto().equalsIgnoreCase(adivinador)) {

                System.out.println(" Muy Bien !! usted adivino en " + intentos + " intentos");
                System.out.println("Mes secreto= " + ms.getMesSecreto() + " -- " + adivinador);
                break;
            } else {
                System.out.println("Intente nuevamente, intento " + intentos);
               

                intentos++;
            }
        }
     System.out.println("Mes secreto= " + ms.getMesSecreto());
    }

}
