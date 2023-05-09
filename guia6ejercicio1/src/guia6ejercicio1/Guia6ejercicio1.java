/*
 1. Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */

package guia6ejercicio1;

import java.util.Scanner;


public class Guia6ejercicio1 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        libro1.cargarLibro(leer);
        libro1.mostrarLibro();

    }
    
}
