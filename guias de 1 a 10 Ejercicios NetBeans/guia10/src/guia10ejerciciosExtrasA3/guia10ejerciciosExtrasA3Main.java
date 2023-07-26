/*
 3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.



 */
package guia10ejerciciosExtrasA3;

import guia10ejerciciosExtrasA3.Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class guia10ejerciciosExtrasA3Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer opcion;

        HashSet<Libro> conjuntoLibro = new HashSet<>();

        do {
            System.out.println("1 Ingresar Libro");
            System.out.println("2 Prestamos de Libro");
            System.out.println("3 Devolucion de Libro");
            System.out.println("4 Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo !!!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 4);

    }

}
