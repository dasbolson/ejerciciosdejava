/*
a) Lista el nombre de todos los productos que hay en la tabla producto.
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Casa
 */
public final class productoDAO extends DAO {

    public void guardarProducto(Producto product) throws Exception {

        try {
            if (product == null) {
                throw new Exception("Falta cargar el producto");
            }
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES (" + product.getCodigo() + " , '" + product.getNombre() + "', " + product.getPrecio() + " , " + product.getCodigoFabricante() + ");";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(Producto product) throws Exception {
        try {
            if (product == null) {
                throw new Exception("Falta el producto a ser modificado");
            }
            String sql = "UPDATE producto SET nombre = ' " + product.getNombre() + " ' WHERE codigo = " + product.getCodigo() + " ;";
            
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(int codigo) throws Exception {

        try {
            if (codigo == 0) {
                throw new Exception("Falta cargar codigo del producto");
            }
            String sql = "DELETE FROM producto WHERE codigo = " + codigo + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;

        }
    }

    public Producto buscarProductoPorCodigo(int codigo) throws Exception {

        try {
            if (codigo == 0) {
                throw new Exception("Falta ingresar el codigo del producto");
            }
            String sql = "SELECT * FROM producto WHERE codigo = '" + codigo + "';";
            consultarBase(sql);
            Producto product = null;
            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));

            }
            desconectarBase();
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Producto buscarProductoPorMenorPrecio() throws Exception {

        try {
            String sql = "SELECT codigo ,nombre, precio, codigo_fabricante FROM producto ORDER BY precio LIMIT 1;";
            consultarBase(sql);
            Producto product = null;
            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return product;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProducto() throws Exception {

        try {
            String sql = "SELECT * FROM producto;";
            consultarBase(sql);
            Producto product = null;
            ArrayList<Producto> productos = new ArrayList();

            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigoFabricante(resultado.getInt(4));

                productos.add(product);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();

            throw new Exception("Error de Sistema !!!");

        }

    }

}
