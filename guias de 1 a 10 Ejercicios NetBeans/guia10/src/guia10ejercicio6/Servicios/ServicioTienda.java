/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas

 */
package guia10ejercicio6.Servicios;

import java.util.HashMap;
import guia10ejercicio6.Entidades.Tienda;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class ServicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //introducir un Producto
    public void cargarProducto(HashMap<Long, Double> hashMapProductos) {
        System.out.println("Cargar un nuevo Producto");
        System.out.println("Ingresar Nombre del Procuto");
        String producto = leer.next();
        System.out.println("Cargar codigo del Producto");
        Long codigo = leer.nextLong();
        System.out.println("Precio del Procuto");
        Double precio = leer.nextDouble();
        hashMapProductos.put(codigo, precio);

    }

    public void modificarPrecio(HashMap<Long, Double> hashMapProductos) {

        Long codigo;
        Double precio;
        System.out.println("Modificar Precio ");
        System.out.println("------------------");
        System.out.println("Ingresar Codigo del Producto ");
        codigo = leer.nextLong();

        if (hashMapProductos.containsKey(codigo)) {

            System.out.println(hashMapProductos.get(codigo));
            System.out.println("Ingresar nuevo Precio");
            precio = leer.nextDouble();
            hashMapProductos.put(codigo, precio);
            System.out.println(hashMapProductos.get(codigo).toString());

        } else {
            System.out.println("Codigo Inexistente !!! ");
        }

    }

    // eliminar producto
    public void eliminarProducto(HashMap<Long, Double> hashMapProductos) {
        Long codigo;

        System.out.println("Eliminar Producto ");
        System.out.println("------------------");
        System.out.println("Ingresar Codigo del Producto ");
        codigo = leer.nextLong();

        if (hashMapProductos.containsKey(codigo)) {
            System.out.println("");
            System.out.println(hashMapProductos.get(codigo));
            System.out.println("");
            System.out.println("Eliminando" + hashMapProductos.get(codigo));
            hashMapProductos.remove(codigo);
            System.out.println("");
            System.out.println(hashMapProductos.get(codigo));
            System.out.println("");
        } else {
            System.out.println("Codigo Inexistente !!! ");
        }

    }

    // Mostrar Productos
    public void mostrarProductos(HashMap<Long, Double> hashMapProductos) {

        System.out.println(hashMapProductos.toString());

    }

    //genrador automatico
    public void generadorAutomatico(HashMap<Long, Double> hashMapProductos) {
       
        for (int i = 2; i < 10; i++) {
             
            hashMapProductos.put(Long.valueOf(i) , Math.random()*10+1);

        }

    }
}
