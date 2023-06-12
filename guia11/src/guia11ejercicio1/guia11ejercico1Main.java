/*
 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona
 */
package guia11ejercicio1;

import guia11ejercicio1.Entidades.Perro;
import guia11ejercicio1.Entidades.Persona;

public class guia11ejercico1Main {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Pendorcho", "cualquiera", 8, 'M');
        Perro perro2 = new Perro("Pendorcho2", "cualquiera2", 82, 'P');

        Persona persona1 = new Persona("Juan", "Gomez", 35, 1234, perro1);
        Persona persona2 = new Persona("Juan2", "Gomez2", 352, 4567, perro2);

        if (Math.random() * 10 > 5) {
            persona1.setPerro(perro1);
            persona2.setPerro(perro2);

        } else {
            persona1.setPerro(perro2);
            persona2.setPerro(perro1);
        }
        System.out.println( persona1.toString());
        System.out.println( persona2.toString());
        
        System.out.println("-------------");
        
        persona1.infoPerroPersona();
        persona2.infoPerroPersona();
    }

}
