/*
 Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y 
saber qué alumnos han recibido una nota por encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre
y nota (representando la nota obtenida en el final). 
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con
sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo
Estudiante, usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.

1 Calcular y mostrar el promedio de notas de todo el curso
2 Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
3 Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package integradorestudiante;

import integradorestudiante.entidades.Estudiante;
import java.util.Scanner;
import integradorestudiante.servicios.EstudianteSevicio;

/**
 *
 * @author Casa
 */
public class integradorEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Estudiante alumnos[] = new Estudiante[8];
        EstudianteSevicio eServicio=new EstudianteSevicio();
        String superiorMedia2[];
        eServicio.cargarEstudiante(alumnos);
        double promedioNotas= eServicio.promedio(alumnos);
        System.out.println("");
        System.out.println("Promedio de Notas del Curso: " + promedioNotas );
        System.out.println("");
        superiorMedia2=eServicio.superiorMedia(alumnos, promedioNotas);
        System.out.println("Alumnos con notas superior al promedio");
        for (int i = 0; i < superiorMedia2.length; i++) {
            System.out.println(superiorMedia2[i]);
        }
        
        
    }

}
