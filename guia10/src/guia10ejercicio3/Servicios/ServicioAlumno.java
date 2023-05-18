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
package guia10ejercicio3.Servicios;

import java.util.Scanner;
import guia10ejercicio3.Entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        
          ArrayList<Integer> notasService = new ArrayList();
       //  ArrayList<Alumno> listaAlumno= new ArrayList<>();
       
            System.out.println("Ingresar el Nombre del Alumno: ");
            String nombre = leer.next();
            System.out.println("Ingresar Nota 1: ");
            Integer nota1 = leer.nextInt();
            System.out.println("Ingresar Nota 2: ");
            Integer nota2 = leer.nextInt();
            System.out.println("Ingresar Nota 3: ");
            Integer nota3 = leer.nextInt();
           
            notasService.add(nota1);
            notasService.add(nota2);
            notasService.add(nota3);

            Alumno nuevoAlumno= new Alumno(nombre,notasService);
           // listaAlumno.add(nuevoAlumno);
            System.out.println(" Nuevo Alumno: "+ nuevoAlumno.getNombre());
              
            System.out.println(" Notas 1: "+ notasService.get(0)+" Notas 2: "+ notasService.get(1)+" Notas 3: "+notasService.get(2));
            System.out.println("");
//            System.out.println("¿Desea ingresar un nuevo Alumno? -> (S/N)");
//            opcion = leer.next();
//            
       

      return nuevoAlumno;
    }

    public int notaFinal(Alumno estudiante){
    int nota;
    
     nota = (estudiante.getNotas().get(0)+estudiante.getNotas().get(1)+estudiante.getNotas().get(2))/3;
    
    
    return nota;
    }


}
