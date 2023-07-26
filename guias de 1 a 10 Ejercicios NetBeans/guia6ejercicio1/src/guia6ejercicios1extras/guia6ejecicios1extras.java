/*
 1. Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.

 */
package guia6ejercicios1extras;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia6ejecicios1extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Cancion n1=new Cancion(leer.next(), leer.next());
        System.out.println(" cancion "+ n1.titulo + "Autor: "+ n1.autor);

    }

}
