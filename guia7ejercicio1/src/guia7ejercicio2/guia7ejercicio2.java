/*
 2. Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.

 */
package guia7ejercicio2;

import guia7ejercicio2.Entidades.Cafetera;
import guia7ejercicio2.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia7ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafe = new Cafetera();
        int menu, tamanioTaza;

        do {
            System.out.println("Menu General Cafeteria");
            System.out.println("------------------------");
            System.out.println("1_ Llenar Cafetera ");
            System.out.println("2_ Servir Taza ");
            System.out.println("3_ Vaciar Cafetera ");
            System.out.println("4_ Agregar Café");
            System.out.println("5_ Ver Estado ");
            System.out.println("6_ Salir");
            System.out.println("");

            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    cs.llenarCafetera(cafe);
                    break;
                case 2:
                    do {
                        System.out.println("¿Que tamaño de taza desea Servir?");
                        System.out.println(" 1 60 ml Espresso ");
                        System.out.println(" 2 125 ml Jarrito");
                        System.out.println(" 3 150 ml Capuccino ");
                        System.out.println(" 4 200 ml Cafe Doble");

                        tamanioTaza = leer.nextInt();

                    } while (tamanioTaza > 4);

                    switch (tamanioTaza) {
                        case 1:
                            tamanioTaza = 60;
                            break;
                        case 2:
                            tamanioTaza = 125;
                            break;
                        case 3:
                            tamanioTaza = 150;
                            break;
                        case 4:
                            tamanioTaza = 200;
                            break;
                    }

                   
                    System.out.println("Recibio " + cs.servirTaza(cafe, tamanioTaza) + " ml de Café ");
                    System.out.println("");

                    break;
                case 3:
                    cs.vaciarCafetera(cafe);
                    break;
                case 4:
                    cs.agregarCafe(cafe);
                    break;
                case 5:
                    System.out.println(cafe.toString());
                    break;
                case 6:
                    System.out.println("Chauuu...");
                    break;

                default:
                    System.out.println("Opcion no Valida !!! ");

            }

        } while (menu != 6);

    }

}
