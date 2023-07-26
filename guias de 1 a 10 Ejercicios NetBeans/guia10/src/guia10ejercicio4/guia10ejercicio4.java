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
package guia10ejercicio4;

import guia10ejercicio4.Entidades.Pelicula;
import guia10ejercicio4.Servicio.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia10ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula sp = new ServicioPelicula();
        System.out.println("Crear peliculas");
        System.out.println("");
        sp.crearListaDePeliculas(listaPeliculas);
        System.out.println("Crear lista de  peliculas");
        System.out.println("");
        System.out.println(listaPeliculas.toString());
        System.out.println("Mostrar lista de peliculas ");
        System.out.println("");
        sp.mostrarPeliculas(listaPeliculas);
        System.out.println("Mostrar lista de peliculas de mas de 1 hora");
        System.out.println("");
        sp.peliculasMas1Hora(listaPeliculas);
        System.out.println("Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en\n"
                + "pantalla");
        System.out.println("");
        sp.mayorAMenorDuracion(listaPeliculas);
        System.out.println("Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en\n"
                + "pantalla.");
        System.out.println("");
        sp.menorAMayorDuracion(listaPeliculas);
        System.out.println("Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla");
        System.out.println("");
        sp.ordenarPorTitulo(listaPeliculas);
        System.out.println("Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla");
        System.out.println("");
        sp.compararDirector(listaPeliculas);
        System.out.println("Chauu !");
        
    }
    
}
