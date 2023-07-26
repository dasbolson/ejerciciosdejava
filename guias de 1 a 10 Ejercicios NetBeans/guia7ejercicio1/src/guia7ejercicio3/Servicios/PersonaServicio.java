/*
 1. Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
c) Método calcularIMC():calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.

 */
package guia7ejercicio3.Servicios;

import guia7ejercicio3.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
// a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
// función devuelve un booleano.

    public boolean esMayorDeEdad(Persona indi) {
        boolean resultado = false;

        if (indi.getEdad() >= 18) {
            resultado = true;
        }

        return resultado;
    }

    /* b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje    
     */
    public Persona crearPersona(Persona indi) {

        System.out.print(" Ingresar Nombre: ");
        String nombre = leer.next();
        System.out.print(" Ingresar Edad: ");
        int edad = leer.nextInt();
        String sexo = "";

        do {
            System.out.print(" Ingresar Sexo ‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)");
            //sexo = ; //(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)
            sexo = leer.next();
        } while (!sexo.equalsIgnoreCase("H") & !sexo.equalsIgnoreCase("M") & !sexo.equalsIgnoreCase("O"));

        System.out.print(" Ingresar Peso: ");
        double peso = leer.nextDouble();
        System.out.print(" Ingresar Altura: ");
        double altura = leer.nextDouble();
        System.out.print(" Ingresar DNI: ");
        double dni = leer.nextDouble();
        System.out.print(" Ingresar Nacionalidad: ");
        String nacionalidad = leer.next();
        
        indi.setNombre(nombre);
        indi.setEdad(edad);
        indi.setSexo(sexo);
        indi.setPeso(peso);
        indi.setAltura(altura);
        indi.setDNI(dni);
        indi.setNacionalidad(nacionalidad);
        System.out.println(indi.toString());

        return indi;
    }

    /*
  c) Método calcularIMC():calculara si la persona está en su peso ideal
  (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
  valor menor que 20, significa que la persona está por debajo de su
  peso ideal y la función devuelve un -1. Si la fórmula da por resultado
  un número entre 20 y 25 (incluidos), significa que la persona está en
  su peso ideal y la función devuelve un 0. Finalmente, si el resultado
  de la fórmula es un valor mayor que 25 significa que la persona tiene
  sobrepeso, y la función devuelve un 1.
     */
    public byte calcularIMC(Persona indi) {

        double imc;
        byte condicion = 3;
        imc = indi.getPeso() / (indi.getAltura() * indi.getAltura());

        if (imc < 20) {
            condicion = -1;// significa que la persona está por debajo de su
            // peso ideal y la función devuelve un -1.
        }
        if (20 < imc & imc <= 25) {
            condicion = 0;
            /*entre 20 y 25 (incluidos), significa que la persona está en
        su peso ideal y la función devuelve un 0*/
        }
        if (imc > 25) {
            condicion = 1;
            /*mayor que 25 significa que la persona tiene
             sobrepeso, y la función devuelve un 1*/

        }
        return condicion;

    }

}
