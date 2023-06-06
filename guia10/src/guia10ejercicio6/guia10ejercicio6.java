/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas

 */
package guia10ejercicio6;

import guia10ejercicio6.Entidades.Tienda;
import guia10ejercicio6.Servicios.ServicioTienda;
import java.util.HashMap;
import java.util.Scanner;

public class guia10ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioTienda sT = new ServicioTienda();
        HashMap<Long, Double> hashMapProductos = new HashMap();
        int menu;

        do {
            System.out.println("-------------------------");
            System.out.println("1 Cargar Producto");
            System.out.println("2 Modificar Precio");
            System.out.println("3 Eliminar un Producto");
            System.out.println("4 Mostrar los Productos");
            System.out.println("5 Generar Automatico");
            System.out.println("6 Salir");

            System.out.println("-------------------------");
            menu = leer.nextInt();

            switch (menu) {
                case 1: // cargar producto
                    sT.cargarProducto(hashMapProductos);
                    break;
                case 2: // modificar precio
                    sT.modificarPrecio(hashMapProductos);
                    break;
                case 3: // eliminar producto
                    sT.eliminarProducto(hashMapProductos);
                    break;
                case 4: // mostrar productos
                    sT.mostrarProductos(hashMapProductos);
                    break;
                case 5:
                    sT.generadorAutomatico(hashMapProductos);
                    break;
                case 6: //salir
                    System.out.println("Chauuu !!!");
                    break;
                default:
                    System.out.println("Opcion no valida !");
            }

        } while (menu != 6);

    }

}
