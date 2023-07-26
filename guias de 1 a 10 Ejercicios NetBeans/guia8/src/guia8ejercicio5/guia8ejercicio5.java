/*
 5. Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package guia8ejercicio5;

import guia8ejercicio5.Entidades.Persona;
import guia8ejercicio5.Servicio.PersonaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia8ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad;
        Scanner leer = new Scanner(System.in);

        PersonaService ps = new PersonaService();
        Persona persona = new Persona();
        persona = ps.crearPersona();

        ps.calcularEdad(persona.getFechaNacimiento(), ps.fechaActual());

        System.out.println("Ingresar edad para comparacion:..");
            edad =  leer.nextInt();
           System.out.println( " Es " + ps.menorQue(persona, edad)+ " que la edad ingresada es mayor "  ); 
        
           System.out.println(persona.toString());

    }

}
