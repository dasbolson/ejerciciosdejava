/*

EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package EjerciciosDeLaGuiaTeorica2;

import EjerciciosDeLaGuiaTeorica2.Entidades.Equipo;
import EjerciciosDeLaGuiaTeorica2.Entidades.Jugador;
import java.util.ArrayList;
import java.util.Iterator;

public class NewMain {

    public static void main(String[] args) {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        Jugador jugador1 = new Jugador("nombre1", "apellido1", "posicion1", 1);
        Jugador jugador2 = new Jugador("nombre12", "apellido12", "posicion12", 2);
        Jugador jugador3 = new Jugador("nombre13", "apellido13", "posicion13", 3);
        Jugador jugador4 = new Jugador("nombre14", "apellido14", "posicion14", 4);
        Jugador jugador5 = new Jugador("nombre15", "apellido15", "posicion15", 5);
        Jugador jugador6 = new Jugador("nombre16", "apellido16", "posicion16", 6);
        Jugador jugador7 = new Jugador("nombre17", "apellido17", "posicion17", 71);
        Jugador jugador8 = new Jugador("nombre18", "apellido18", "posicion18", 8);
        Jugador jugador9 = new Jugador("nombre19", "apellido19", "posicion19", 9);

        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        listaJugadores.add(jugador4);
        listaJugadores.add(jugador5);
        listaJugadores.add(jugador6);
        listaJugadores.add(jugador7);
        listaJugadores.add(jugador8);
        listaJugadores.add(jugador9);

        Equipo equipo = new Equipo("Nombre Equipo", listaJugadores);

        // Iterator it = listaJugadores.iterator();
         
        for (Jugador listaJugadore : listaJugadores) {
            System.out.println(listaJugadore.toString());
        }
        
        
    }

}
