/*
 4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla

 */
package guia10ejercicio4.Servicio;

import guia10ejercicio4.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {

        System.out.println("Ingresar Titulo de la Pelicula");
        String titulo = leer.next();
        System.out.println("Ingresar Director");
        String director = leer.next();
        System.out.println("Ingresar Duracion de La Pelicula");
        double duracion = leer.nextDouble();

        Pelicula peli = new Pelicula(titulo, director, duracion);

        return peli;
    }

    public void crearListaDePeliculas(ArrayList<Pelicula> listaPeliculas) {

        // ArrayList<Pelicula> listaPeliculas ;
        do {

            System.out.println("Crear Pelicula");
            System.out.println("---------------");

            // listaPeliculas.add(crearPelicula());
            listaPeliculas.add(new Pelicula("pepin", "tolo", 2.0));
            listaPeliculas.add(new Pelicula("Iepin1", "Rolo1", 1.0));
            listaPeliculas.add(new Pelicula("Repin2", "Holo2", 3.0));
            listaPeliculas.add(new Pelicula("Bepin3", "aolo3", 1.0));
            listaPeliculas.add(new Pelicula("aepin4", "Molo4", 2.0));

            System.out.println("");
            System.out.println("Ingresar otra Pelicula -> S/N");

        } while (leer.next().equalsIgnoreCase("s"));

    }
// • Mostrar en pantalla todas las películas.

    public void mostrarPeliculas(ArrayList<Pelicula> listaPeliculas) {

        for (Pelicula listaPelicula : listaPeliculas) {

            System.out.println(listaPelicula.toString());

        }
    }
// • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    public void peliculasMas1Hora(ArrayList<Pelicula> listaPeliculas) {

        for (Pelicula listaPelicula : listaPeliculas) {

            if (listaPelicula.getDuracion() > 1) {
                System.out.println("Pelicula con duracion mayor a una hora ");
                System.out.println(listaPelicula.toString());
            }
        }
    }

    // • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void mayorAMenorDuracion(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Pelicula.comparaDuracion);
        Collections.reverse(listaPeliculas);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }
    }
    // Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.

    public void menorAMayorDuracion(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Pelicula.comparaDuracion);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }

    }
    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

    public void ordenarPorTitulo(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Pelicula.compararTitulo);

        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }

    }

//// Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
    public void compararDirector(ArrayList<Pelicula> listaPeliculas) {

        listaPeliculas.sort(Pelicula.compararDirector);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula.toString());
        }

    }

}
