/*
5. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia6ejercicios5extras;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia6ejercicios5extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Empleado emple = new Empleado();
        System.out.print(" Nombre del Empleado: ");
        emple.setNombre(leer.next());
        System.out.print(" Edad: ");
        emple.setEdad(leer.nextInt());
        System.out.print(" Salario: ");
        emple.setSalario(leer.nextDouble());
        emple.calcularAumento( emple.getEdad(), emple.getSalario());
        System.out.println("-------------");
        System.out.println(" Salario con aumento"+ emple.calcularAumento( emple.getEdad(), emple.getSalario()));
        emple.toString();
        
    
    }

}
