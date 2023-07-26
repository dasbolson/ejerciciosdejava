/*
 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.

 */
package guia10ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia10ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String raza;
        int opcion;
        ArrayList<String> razasDePerros = new ArrayList();

        do {

            System.out.println(" 1 -> Ingresar un nuevo registro de Raza ");
            System.out.println(" 2 -> Mostrar Razas ");
            System.out.println(" 3 -> Eliminar un registro de Raza");
            System.out.println(" 4 -> Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ingresarRaza(razasDePerros);
                    break;
                case 2:
                    mostrarRazas(razasDePerros);
                    break;
                case 3:
                    eliminarRegistroRaza(razasDePerros);
                    break;
                case 4:
                    System.out.println("Chau !!!");
                    break;

                default:
                    System.out.println("Opcion no Valida");

            }

        } while (opcion != 4);

    }

    public static void ingresarRaza(ArrayList<String> razasDePerros) {
        String raza;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {

            System.out.println("Ingresar Raza de Perro ");
            raza = leer.next();
            razasDePerros.add(raza);
            System.out.println("Desea ingresar otro registro de Raza de Can ? -> (S/N)");
            raza = leer.next();

        } while (raza.equalsIgnoreCase("S"));
        for (String razasDePerro : razasDePerros) {
            System.out.println(razasDePerro);
        }
    }

    public static void mostrarRazas(ArrayList<String> razasDePerros) {

        for (String razasDePerro : razasDePerros) {
            System.out.println(razasDePerro);
        }

    }

    public static void eliminarRegistroRaza(ArrayList<String> razasDePerros) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Iterator it = razasDePerros.iterator();
        String raza;
        System.out.println("Ingrese que Raza quiere borrar de la Lista");
        raza = leer.next();

        if (razasDePerros.contains(raza)) {

            while (it.hasNext()) {

                if (it.next().equals(raza)) {
                    System.out.println("La Raza ingresada Esta presente en la lista ");
                    System.out.println("Se borrara -> " + raza);
                    it.remove();
                }
            }
        } else {
            System.out.println("La Raza ingresada NO Esta presente en la lista ");
        }
    
         Collections.sort(razasDePerros);
        for (String razasDePerro : razasDePerros) {
            System.out.println(razasDePerro + " ");

        }
    }
    
}

    

    
