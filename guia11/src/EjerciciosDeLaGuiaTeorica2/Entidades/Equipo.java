/*
EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package EjerciciosDeLaGuiaTeorica2.Entidades;

import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> equipo;

    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }
    
    
    
}
