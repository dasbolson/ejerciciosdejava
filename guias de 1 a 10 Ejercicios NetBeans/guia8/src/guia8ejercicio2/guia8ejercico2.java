/*
 2. Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package guia8ejercicio2;

import java.util.Scanner;
import guia8ejercicio2.Servicio.ParDeNumerosService;
import guia8ejercicio2.Entidades.ParDeNumeros;

/**
 *
 * @author Casa
 */
public class guia8ejercico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ParDeNumeros pdn = new ParDeNumeros();
        ParDeNumerosService pdns = new ParDeNumerosService();
        byte opcion = 0;

        do {
            System.out.println("1 mostrarValores");
            System.out.println("2 devolverMayor");
            System.out.println("3 calcularPotencia ");
            System.out.println("4 calculaRaiz");
            System.out.println("5 Salir ");

            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    pdns.mostrarValores(pdn);
                    break;
                case 2:
                    System.out.println("El mayor = "+ pdns.devolverMayor(pdn));
                    break;
                case 3:
                    pdns.calcularPotencia(pdn); 
                    break;
                case 4:
                    pdns.calculaRaiz(pdn);
                    break;
                case 5:
                    System.out.println(" Chauuuu ");
                    break;

                default:
                    System.out.println(" Opcion no Valida !");
            }

        } while (opcion!=5);

    }

}
