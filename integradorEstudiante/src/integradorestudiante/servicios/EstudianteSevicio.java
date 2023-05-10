/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorestudiante.servicios;

import integradorestudiante.entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class EstudianteSevicio {

    public Estudiante[] cargarEstudiante(Estudiante[] alumnos) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresar Nombre del Alumno");
            String name=leer.next();
            System.out.println("Ingresar Nota Final del Alumno");
            double note= leer.nextDouble();
           alumnos[i]=new Estudiante(name, note);

        }
        return alumnos;
    }

    public double promedio(Estudiante[] alumnos){
        double sumador =0;
        for (int i = 0; i < alumnos.length; i++) {
            sumador += alumnos[i].getNota();
        }
        return sumador/8;
    }

    public String[] superiorMedia(Estudiante[] alumnos, double promedioNotas){
        int contador=0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota()>promedioNotas) {
                contador ++;
            }
        }
       String supMedia[]= new String[contador];
       contador=0;
        for (int i = 0; i < alumnos.length; i++) {
            
            if (alumnos[i].getNota()>promedioNotas) {
                supMedia[contador]=alumnos[i].getNombre();
                contador ++;
            }
        }
        return supMedia;
    }

}



