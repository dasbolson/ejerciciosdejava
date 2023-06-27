/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.


 */
package guia11ejercicio2.Entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Juego {

    private HashSet<Jugador> conjuntoJugadores;
    private RevolverDeAgua r;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego() {
    }

    public Juego(HashSet<Jugador> conjuntoJugadores, RevolverDeAgua r) {
        this.conjuntoJugadores = conjuntoJugadores;
        this.r = r;
    }

    public HashSet<Jugador> getConjuntoJugadores() {
        return conjuntoJugadores;
    }

    public void setConjuntoJugadores(HashSet<Jugador> conjuntoJugadores) {
        this.conjuntoJugadores = conjuntoJugadores;
    }

    public RevolverDeAgua getR() {
        return r;
    }

    public void setR(RevolverDeAgua r) {
        this.r = r;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void llenarJuego(ArrayList<Jugador> listaJugadores, RevolverDeAgua r) {

        HashSet<Jugador> conjuntoJugadores = new HashSet<>(listaJugadores);
        this.r = r;
        this.conjuntoJugadores = conjuntoJugadores;

    }

    public void ronda() {
        
        String menu ;
        do {

            for (Jugador conjuntoJugadore : this.conjuntoJugadores) {

                if (!conjuntoJugadore.disparo(r)) {
                    conjuntoJugadore.setMojado(Boolean.FALSE);
                    System.out.println("Chauuuu!!!! ");
                    System.out.println(conjuntoJugadore.toString());
                    return;
                }
                System.out.println(conjuntoJugadore.getId()+" "+ conjuntoJugadore.getNombre());
                System.out.println(r.getPosicionActual()+" "+r.getPosicionAgua());
                System.out.println("Siguiente Jugador");
                System.out.println(conjuntoJugadore.toString());
            menu=leer.next();
            }
            System.out.println("Siguiente Ronda ");
            menu=leer.next();
        
        } while (menu.equals("s"));
            
    }

}
