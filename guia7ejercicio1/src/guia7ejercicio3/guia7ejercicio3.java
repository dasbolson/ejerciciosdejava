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
package guia7ejercicio3;

import guia7ejercicio3.Entidades.Persona;
import guia7ejercicio3.Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia7ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean mayorDeEdad[] = new boolean[4];
        byte IMC[] = new byte[4];

        PersonaServicio ps = new PersonaServicio();

        Persona individuo = new Persona();
        ps.crearPersona(individuo);

        Persona individuo1 = new Persona();
        ps.crearPersona(individuo1);

        Persona individuo2 = new Persona();
        ps.crearPersona(individuo2);

        Persona individuo3 = new Persona();
        ps.crearPersona(individuo3);

        mayorDeEdad[0] = ps.esMayorDeEdad(individuo);
        IMC[0] = ps.calcularIMC(individuo);

        mayorDeEdad[1] = ps.esMayorDeEdad(individuo1);
        IMC[1] = ps.calcularIMC(individuo1);

        mayorDeEdad[2] = ps.esMayorDeEdad(individuo2);
        IMC[2] = ps.calcularIMC(individuo2);

        mayorDeEdad[3] = ps.esMayorDeEdad(individuo3);
        IMC[3] = ps.calcularIMC(individuo3);

        porcentajeEdad(mayorDeEdad);
        porcentajePeso(IMC);

        System.out.println(individuo.toString());
        System.out.println(individuo1.toString());
        System.out.println(individuo2.toString());
        System.out.println(individuo3.toString());

        System.out.println(" Chauuuu !!!!");
    }

    public static void porcentajePeso(byte[] IMC) {
        int bajoPeso = 0, idealPeso = 0, sobrePeso = 0;

        for (int i = 0; i < 4; i++) {

            switch (IMC[i]) {
                case -1:
                    bajoPeso += 1;
                    break;
                case 0:
                    idealPeso += 1;
                    break;
                case 1:
                    sobrePeso += 1;
                    break;
            }
        }

        System.out.println("El " + ((bajoPeso * 100) / 4) + " % Tienen Bajo Peso ");
        System.out.println("El " + ((idealPeso * 100) / 4) + " % Tienen Peso Ideal ");
        System.out.println("El " + ((sobrePeso * 100) / 4) + " % Tienen Sobrepeso ");

    }

    public static void porcentajeEdad(boolean[] mayorDeEdad) {

        int menor = 0, mayor = 0;

        for (int i = 0; i < 4; i++) {

            if (mayorDeEdad[i] = false) {
                menor += 1;
            } else {
                mayor += 1;
            }
        }

        System.out.println("El " + ((menor * 100) / 4) + " % es Menor de Edad ");
        System.out.println("El " + ((mayor * 100) / 4) + " % es Mayor de Edad ");

    }

}
