/*
 Nos han pedido que hagamos una aplicación Java para una tienda con sus productos. El
objetivo es realizar consultas para saber el stock de ciertos productos o que productos hay,
etc. Utilizando el lenguaje JAVA, una base de datos MySQL y JDBC para realizar la ejecución
de operaciones sobre la base de datos (BD).

a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.

 */
package Tienda;

import Tienda.Entidades.Producto;
import Tienda.Servicios.fabricanteService;
import Tienda.Servicios.productoService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import javafx.print.Collation;

public class TiendaMain {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String menu = "";

        do {

            try {

                System.out.println(" MENU DE OPCIONES");
                System.out.println("------------------");
                System.out.println("                  ");
                System.out.println(""
                        + "a) Lista el nombre de todos los productos que hay en la tabla producto.\n"
                        + "b) Lista los nombres y los precios de todos los productos de la tabla producto.\n"
                        + "c) Listar aquellos productos que su precio esté entre 120 y 202.\n"
                        + "d) Buscar y listar todos los Portátiles de la tabla producto.\n"
                        + "e) Listar el nombre y el precio del producto más barato.\n"
                        + "f) Ingresar un producto a la base de datos.\n"
                        + "g) Ingresar un fabricante a la base de datos.\n"
                        + "h) Editar un producto con datos a elección.\n"
                        + "i) Salir. \n");
                menu = leer.next().toLowerCase();

                productoService ps = new productoService();
                Collection<Producto> productos = new ArrayList();
                switch (menu) {
                    case "a":     //a) Lista el nombre de todos los productos que hay en la tabla producto.
                        productos = ps.listarProducto();
                        for (Producto producto : productos) {
                            System.out.println(producto.toString());
                            System.out.println("");
                        }
                        break;

                    case "b": //b) Lista los nombres y los precios de todos los productos de la tabla producto.
                        productos = ps.listarProducto();
                        for (Producto producto : productos) {
                            System.out.println("Nombre " + producto.getNombre() + "  Precio: " + producto.getPrecio());
                            System.out.println("");
                        }
                        break;
                    case "c":    // c) Listar aquellos productos que su precio esté entre 120 y 202
                        productos = ps.listarProducto();
                        for (Producto producto : productos) {

                            if (producto.getPrecio() >= 120 && producto.getPrecio() <= 202) {
                                System.out.println("Codio de Producto: " + producto.getCodigo() + "Nombre: " + producto.getNombre()
                                        + " Precio: " + producto.getPrecio() + "Cofigo de Fabricante: " + producto.getCodigoFabricante());
                                System.out.println("");
                            }
                        }
                        break;
                    case "d":   // d) Buscar y listar todos los Portátiles de la tabla producto.
                        productos = ps.listarProducto();
                        for (Producto producto : productos) {

                            if (producto.getNombre().contains("Portátil")) {
                                System.out.println("Codio de Producto: " + producto.getCodigo() + "Nombre: " + producto.getNombre()
                                        + " Precio: " + producto.getPrecio() + "Cofigo de Fabricante: " + producto.getCodigoFabricante());
                                System.out.println("");
                            }
                        }
                        break;
                    case "e":  //e) Listar el nombre y el precio del producto más barato
                        Producto product = new Producto();

                        product = ps.getDAO().buscarProductoPorMenorPrecio();
                        System.out.println("Nombre del Producto mas Barato " + product.getNombre() + " Precio: " + product.getPrecio());
                        System.out.println("");

                        break;
                    case "f":   // f) Ingresar un producto a la base de datos.

                        System.out.println("");
                        System.out.println("Creando Producto");
                        System.out.println("-----------------");
                        System.out.println("Ingresar Codigo del Producto");
                        int codigo = leer.nextInt();
                        System.out.println("Ingresar Nombre del Producto");
                        String nombre = leer.next();
                        System.out.println("Ingresar Precio del Producto");
                        Double precio2 = leer.nextDouble();
                        System.out.println("Ingresar Codigo del Fabricante");
                        int codigo_fabricante = leer.nextInt();
                        ps.crearProducto(codigo, nombre, precio2, codigo_fabricante);

                        break;
                    case "g":  // g) Ingresar un fabricante a la base de datos
                        System.out.println("");
                        System.out.println("Creando un nuevo Fabricante");
                        System.out.println("----------------------------");
                        System.out.println("");
                        System.out.println("Ingresar Codigo de Fabricante");
                        int codigo3 = leer.nextInt();
                        System.out.println("Ingresar nombre del Fabricante");
                        String nombre3=leer.next();
                        fabricanteService fs= new fabricanteService();
                        fs.crearFabricante(codigo3, nombre3);
                        
                        
                        
                        break;
                    case "h": ///h) Editar un producto con datos a elección
                        
                        System.out.println("Modificando Nombre de un Producto");
                        System.out.println("------------------------");
                         productos = ps.listarProducto();
                        for (Producto producto : productos) {
                            System.out.println(producto.toString());
                            System.out.println("");
                        }
                        System.out.println("Ingresar el Codigo del Producto a modificar");
                        int modificar= leer.nextInt();
                        System.out.println("Ingresar Nuevo Nombre");
                        String nuevoNombre= leer.next();
                        product= ps.buscarProductoPorCodigo(modificar);
                        product.setNombre(nuevoNombre);
                        ps.getDAO().modificarProducto(product);
                        
                        break;

                    case "i":
                        System.out.println(" SALIENDO, CHAUUUUUUUU !!!!!");
                        break;

                    default:
                        System.out.println("Opcion no valida, Ingresar nuevamente !");
                }

            } catch (Exception e) {
                throw e;
            }

        } while (!menu.equalsIgnoreCase("i"));

    }

}
