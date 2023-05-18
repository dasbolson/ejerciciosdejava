/*
// 3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
//
//Pueden encontrar un ejemplo de Colección como Atributo en tu Aula
//Virtual

 */
package guia10ejercicio3;

import java.util.Scanner;
import guia10ejercicio3.Entidades.Alumno;
import guia10ejercicio3.Servicios.ServicioAlumno;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Casa
 */
public class guia10ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> listaAlumno = new ArrayList();
        ServicioAlumno sa = new ServicioAlumno();
        String opcionMenu, consulta;
        boolean estaEnLaLista = false;
        Iterator<Alumno> it = listaAlumno.iterator();
        System.out.println("Hola Bienvenido ");
        do {
            listaAlumno.add(sa.crearAlumno());
            System.out.print("Ingresar un nuevo Alumno -> (S/N) ");
            // opcionMenu=leer.next();
        } while (leer.next().equalsIgnoreCase("s"));

        System.out.print("Mostrar nota final del siguiente Alumno, Ingresar nombre: ");
        consulta = leer.next();

        for (Alumno alumno : listaAlumno) {
            if (alumno.getNombre().equalsIgnoreCase(consulta)) {
                estaEnLaLista = true;
            }
            //System.out.println(" esta en la lista "+estaEnLaLista);
        }
        
        if (estaEnLaLista) {

            for (Alumno alumno : listaAlumno) {
                
            }
            while (it.hasNext()) {
               // if((it.next().equals(it)) {
                    System.out.println("Alumno: " + it.next().getNombre());
                    System.out.println("Nota Final Promedio: " + sa.notaFinal(it.next()));
            //    }

            }
        }else{
            System.out.println(" El nombre ingresado no esta en la lista");
        }

    }

}
