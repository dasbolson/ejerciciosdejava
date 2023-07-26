/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia13ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
import guia13ejercicio5.MiExcepcion;
import guia13ejercicio5.MiExcepcion;

public class MainGuia13Ejercicio5 {

    public static void main(String[] args) throws MiExcepcion {

        JuegoAdivinarNumero juego = new JuegoAdivinarNumero();
        int intentados;
        System.out.println("INICIO DEL JUEGO - ADIVINAR EL NUMERO INCOGNITA"
                + "QUE ESTA ENTRE EL 0  Y EL 500 ");
        System.out.println("-------------------------------------------------");

        do {
            int incognita = 0;
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            intentados= juego.getIntentos()+ 1;
            juego.setIntentos(intentados);
            try {
                
                System.out.println(" ");
                System.out.println("Ingresar su número");
                incognita = leer.nextInt();

                if (incognita == 666) {
                    throw new MiExcepcion("El malefico!!!");
                }

                juego.intentoAdivinar(incognita);
            } catch (ArithmeticException e) {
                System.out.println(" Excepcion Aritmetica");
            } catch (InputMismatchException e) {
               // incognita = 0;

              System.out.println("Ingreso incorrecto por tecldo");
                // throw new MiExcepcion("Ingreso incorrecto por tecldo 2");
                // NullPointerException
            } catch (NullPointerException e) {
               
                System.out.println("NullPointerException desde ");

            } catch (NumberFormatException e) {
                System.out.println("formato de Numero Exception");
            } catch (MiExcepcion e) {
                System.out.println("Miexcepion desde el main x malefico");
                System.out.println(e.getMessage());
            } finally {
                System.out.println(" Finally main");
            }

        } while (!juego.getResolusion());

    }

}
