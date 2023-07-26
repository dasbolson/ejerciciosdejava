/*

 */
package Tienda.Servicios;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.productoDAO;
import java.util.Collection;

/**
 *
 * @author Casa
 */
public class productoService {

    private productoDAO DAO;

    public productoDAO getDAO() {
        return DAO;
    }

      public productoService() {
        this.DAO = new productoDAO();

    }

    public void crearProducto(int codigo, String nombre, Double precio, int codigo_fabricante) throws Exception {

        try {
            //Validamos
            if (codigo == 0) {
                throw new Exception("Debe indicar el codigo");
            }
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("Nombre incorrecto o vacio");
            }
            if (precio == null || precio == 0) {
                throw new Exception("Debe indicar el precio");
            }
            if (codigo_fabricante == 0) {
                throw new Exception("Error con el codigo del fabricante");
            }
            if (buscarProductoPorCodigo(codigo) != null) {
                throw new Exception("Ya existe un usuario con el codigo indicado " + codigo);
            }

            //Creamos el usuario
            Producto product = new Producto();
            product.setCodigo(codigo); 
            product.setNombre(nombre);
            product.setPrecio(precio);
            product.setCodigoFabricante(codigo_fabricante);
            
            
           DAO.guardarProducto(product);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarCodigoProducto(int codigo, int codigoActual, int nuevoCodigo) throws Exception {

        try {

            //Validamos
            if (codigo == 0 ) {
                throw new Exception("Debe indicar el codigo del producto");
            }

            if (codigoActual == 0 ) {
                throw new Exception("Debe indicar el codigo del producto");
            }

            if (nuevoCodigo ==0 ) {
                throw new Exception("Debe indicar el codigo del producto");
            }
            if (codigo==codigoActual) {
                throw new Exception("El codigo que intenta modificar, ya existe");
                
            }
            //Buscamos
            Producto product = buscarProductoPorCodigo(codigo);
            

            //Validamos
            if (codigo==product.getCodigo() ) {     
                throw new Exception("El Codigo ingresado ya existe");
            }

            //Modificamos
            product.setCodigo(nuevoCodigo);
            DAO.modificarProducto(product);
            
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(int codigo) throws Exception {

        try {

            //Validamos 
            if ( codigo == 0 ) {
                throw new Exception("Debe indicar el codigo de producto");
            }
            DAO.eliminarProducto(codigo);
            
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {

            //Validamos
            if (codigo == 0) {
                throw new Exception("Debe indicar el codigo");
            }

            Producto product = DAO.buscarProductoPorCodigo(codigo);

            return product;
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            Producto product = new Producto();
            

            return product;
        } catch (Exception e) {
            throw e;
        }
    }
    public Collection<Producto> listarProducto() throws Exception {

        try {

            Collection<Producto> productos = DAO.listarProducto();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProducto() throws Exception {

        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarProducto();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen prductos para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}


