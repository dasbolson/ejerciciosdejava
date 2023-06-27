/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio3.Entidades;

import guia11ejercicio3.Enumeraciones.Palo;
import guia11ejercicio3.Enumeraciones.Valor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Baraja {

    private HashSet<Carta> mazo;
    private HashSet<Carta> cartasQueSalieron;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja() {
        mazo = new HashSet();
        for (Palo palon : Palo.values()) {
            for (Valor valo : Valor.values()) {
                mazo.add(new Carta(palon, valo));
            }
        }
        cartasQueSalieron = new HashSet();
    }

    // Las operaciones que podrá realizar la baraja son:
    // • barajar(): cambia de posición todas las cartas aleatoriamente.
    public HashSet<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(HashSet<Carta> mazo) {
        this.mazo = mazo;
    }

    public HashSet<Carta> getCartasQueSalieron() {
        return cartasQueSalieron;
    }

    public void setCartasQueSalieron(HashSet<Carta> cartasQueSalieron) {
        this.cartasQueSalieron = cartasQueSalieron;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public HashSet<Carta> barajar(HashSet<Carta> mazo) {

        ArrayList<Carta> mazoMezclado = new ArrayList(mazo);
        Collections.shuffle(mazoMezclado);
        mazo.clear();
        mazo.addAll(mazoMezclado);
        return mazo;
    }

    // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    // se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta() {

        Carta siguiente = new Carta();

        Iterator<Carta> it = this.mazo.iterator();

        if (it.hasNext()) {
            siguiente = it.next();
           it.remove();
        } else {
            System.out.println("No quedan Cartas");
        }
        cartasQueSalieron.add(siguiente);
        return siguiente;
    }

    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {

        System.out.println("Cartas disponibles " + this.mazo.size() + " uds.");

    }
    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    // cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // debemos indicárselo al usuario.

    public ArrayList<Carta> darCartas() {
        Carta carta = new Carta();
        int cantidadDeCartasRepartir;
        ArrayList<Carta> cartasReapartidas = new ArrayList();
        System.out.print("Cantidad de cartas a repartir: ");
        cantidadDeCartasRepartir = leer.nextInt();

        if (mazo.size() - cantidadDeCartasRepartir >= 0) {
            for (int i = 0; i < cantidadDeCartasRepartir; i++) {

                Iterator<Carta> it2 = mazo.iterator();
                if (it2.hasNext()) {
                    carta = it2.next();
                    cartasQueSalieron.add(carta);
                    cartasReapartidas.add(carta);
                    it2.remove();
                }
            }
        } else {
            System.out.println("Las cartas en el mazo, no son suficiente!!!");
        }
        Iterator<Carta> it2 = mazo.iterator();
        return cartasReapartidas;

    }

    // • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    // indicárselo al usuario
    public void cartasMonton() {
        System.out.println("Salieron las siguientes Cartas:");
        System.out.println("------------------------------");

        for (Carta carta : cartasQueSalieron) {
            System.out.println(carta);
        }
    }

    //• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    //  luego se llama al método, este no mostrara esa primera carta
    public void mostrarBaraja() {

        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
    }

}
