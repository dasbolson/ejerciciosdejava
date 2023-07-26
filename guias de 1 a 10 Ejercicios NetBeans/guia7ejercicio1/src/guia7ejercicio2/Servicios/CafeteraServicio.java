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
package guia7ejercicio2.Servicios;

import guia7ejercicio2.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

// a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
// capacidad máxima. 
    public void llenarCafetera(Cafetera cafe) {

        cafe.setCantidadActual(cafe.getCantidadMaxima());
    }

    /*
    b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
     
     */
    public int servirTaza(Cafetera cafe, int tamanioTaza) {

        double mlDeCafe = 0;

        //  10 gramos de cafe por 180 ml de agua --  1 gr cafe 18 ml agua
        if ((cafe.getCantidadActual() - ((10 * tamanioTaza) / 180)) < 0) {
            mlDeCafe = calcularMl(cafe, tamanioTaza);
            cafe.setCantidadActual(0);
        } else {
            System.out.println(" Taza Llena al 100 %");
            cafe.setCantidadActual((cafe.getCantidadActual() - ((10 * tamanioTaza) / 180)));
            mlDeCafe = tamanioTaza;

        }

        return (int) mlDeCafe;
    }

    // c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
    }

// d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
    public int agregarCafe(Cafetera cafe) {

        System.out.print("Que cantidad de quiere agregar de cafe (Gramos):");
        int recargaCafe = leer.nextInt();
        if (cafe.getCantidadActual() + recargaCafe >= cafe.getCantidadMaxima()) {
            System.out.println("Su Recarga Excede la capacidad de la maquina! ");
            recargaCafe = recargaCafe - (int) (cafe.getCantidadMaxima() - cafe.getCantidadActual());
            System.out.println("Se Cargaron " + (cafe.getCantidadMaxima() - cafe.getCantidadActual()) + " grs. de Café ");
            System.out.println("Sobraron " + recargaCafe + " grs. de Café ");
            cafe.setCantidadActual(cafe.getCantidadMaxima());
            return recargaCafe;
        } else {
            cafe.setCantidadActual((cafe.getCantidadActual() + recargaCafe));
            System.out.println(" Recarga exitosa, se cargaron " + recargaCafe + " grs. de Café ");
            recargaCafe = 0;
        }

        return recargaCafe;
    }

    public double calcularMl(Cafetera cafe, int tamanioTaza) {
        double porcentaje = 0;
        //  10 gramos de cafe por 180 ml de agua --  1 gr cafe 18 ml agua

        System.out.println("La Maquina se quedo sin Carga de Café");
        System.out.println(" Su Taza de café, contiene " + cafe.getCantidadActual() * 18 + " ml de " + tamanioTaza + " ml de la Taza");
        porcentaje = ((cafe.getCantidadActual() * 18) * 100) / tamanioTaza;
        System.out.println(" Su Taza fue llenada al " + porcentaje + " %");

        return (cafe.getCantidadActual() * 18);
    }
}
