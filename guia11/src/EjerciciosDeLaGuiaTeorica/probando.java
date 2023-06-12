/*
 EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main
 */
package EjerciciosDeLaGuiaTeorica;

import EjerciciosDeLaGuiaTeorica.Entidades.Dni;
import EjerciciosDeLaGuiaTeorica.Entidades.Persona;

public class probando {

    public static void main(String[] args) {

        Dni dni1 = new Dni('a', 2345);
        Dni dni2 = new Dni('b', 2346);
        Dni dni3 = new Dni('c', 2347);
        Dni dni4 = new Dni('d', 2348);

        Persona persona = new Persona("Angela", "Perez", dni1);
        Persona persona1 = new Persona("Angela1", "Perez1", dni2);
        Persona persona2 = new Persona("Angela2", "Perez2", dni3);
        Persona persona3 = new Persona("Angela3", "Perez3", dni4);

        System.out.println(persona.getDni().getSerie());
        System.out.println(persona3.getDni().getSerie());
        System.out.println(persona2.getDni().getSerie());
        System.out.println(dni3.getNumero());

        System.out.println( persona2.getDni().getSerie());
        persona2.setDni(new Dni('x', 8888));
        System.out.println(persona2.toString());
        
    }

}
