/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio5.Servicios;

import guia10ejercicio5.Entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPais(HashSet<Pais> setPais) {
        do {

            System.out.println("Cargar Pais");
            System.out.println("");
            System.out.println("Ingresar Nombre del Pais");
            String pais = leer.next();
            System.out.println("Ingresar Poblacion del Pais");
            Integer poblacion = leer.nextInt();
            System.out.println("Ingresar Continente del Pais");
            String continente = leer.next();
            setPais.add(new Pais(pais, poblacion, continente));
            System.out.println("");
            System.out.println("Agregar otro Pais S/N ");

        } while (leer.next().equalsIgnoreCase("s"));
        System.out.println("Lista de Paises");
        for (Pais setPai : setPais) {
            System.out.println(setPai.toString());
        }
        System.out.println("Chauuu");

    }
    // Después deberemos mostrar el conjunto ordenado alfabéticamente

    public void mostrarOrdenadoAlfabeticamente(HashSet<Pais> setPais) {

        ArrayList<Pais> listaPais = new ArrayList(setPais);
        listaPais.sort(Pais.ordenarXPais);
        for (Pais listaPai : listaPais) {
            System.out.println(listaPai.toString());
        }
        System.out.println("...");
    }

    public void eliminarPais(HashSet<Pais> setPais) {
        boolean estaEnLaLista = false;
        System.out.println("Ingresar el pais a Borrar ");
        String paisBorrar = leer.next();
        Iterator<Pais> it = setPais.iterator();

        while (it.hasNext()) {
            if (it.next().getPais().equalsIgnoreCase(paisBorrar)) {
                System.out.println("Borramos !!!" + paisBorrar);
                it.remove();
                estaEnLaLista = true;
            }
        }
        if (estaEnLaLista) {
            System.out.println("Se borro el Pais: " + paisBorrar);
        } else {
            System.out.println("El Pais " + paisBorrar + " no estaba en el conjunto");
            System.out.println("Bye !!!");
        }
        for (Pais setPai : setPais) {
            System.out.println(setPai);
            
        }
    }

}
