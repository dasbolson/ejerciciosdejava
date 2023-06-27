/*
3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia11ejercicio3;

import guia11ejercicio3.Entidades.Baraja;
import guia11ejercicio3.Entidades.Carta;
import java.util.Scanner;

public class guia11ejercicio3Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu;
        Carta carta=new Carta();
        Baraja baraja= new Baraja();
        do {
            System.out.println("1  Barajar");
            System.out.println("2  Siguiente Carta");
            System.out.println("3  Cartas Disponibles");
            System.out.println("4  Dar Cartas");
            System.out.println("5  Mostrar cartas del Monton que ya Salieron");
            System.out.println("6  Mostrar Barajar");
            System.out.println("7  Salir");

            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    baraja.barajar(baraja.getMazo());
                    break;
                case 2:
                    System.out.println(baraja.siguienteCarta().toString());
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    baraja.darCartas();
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;

                default:
                    System.out.println("Opcion no valida !!!");
            }

        } while (menu != 7);

    }

}
