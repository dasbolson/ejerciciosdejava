/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Casa
 */
public final class fabricanteDAO extends DAO {

    public void guardarFabrica(Fabricante fabrica) throws Exception {

        try {
            if (fabrica == null) {
                throw new Exception("Falta cargar fabrica");
            }
            String sql = "INSERT INTO fabricante (codigo, nombre)" + " VALUES (" + fabrica.getCodigo() + " , '" + fabrica.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;

        }
    }

    public void modificarFabrica(Fabricante fabrica) throws Exception {

        try {
            if (fabrica == null) {
                throw new Exception("Falta la fabrica a ser modificada");
            }
            String sql = "UPDATE fabricante SET" + "nombre = ´" + fabrica.getNombre() + "' WHERE codigo =" + fabrica.getCodigo() + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;

        }
    }

    public void eliminarFabrica(int codigo) throws Exception {

        try {
            if (codigo == 0) {
                throw new Exception("Falta cargar codigo de fabrica");
            } else {
            }
            String sql = "DELETE FROM fabricante WHERE codigo = " + codigo + ";";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;

        }
    }

    public Fabricante buscarFabricaPorCodigo(int codigo) throws Exception {

        try {
            if (codigo == 0) {
                throw new Exception("Falta ingresar el codigo de fabricante");
            }
            String sql = "SELECT * FROM fabricante WHERE codigo = '" + codigo + "';";
            consultarBase(sql);
            Fabricante fabrica = null;
            while (resultado.next()) {
                fabrica = new Fabricante();
                fabrica.setCodigo(resultado.getInt(1));
                fabrica.setNombre(resultado.getString(2));

            }
            desconectarBase();
            return fabrica;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listarFabricantes() throws Exception {

        try {
            String sql = "SELECT codigo, nombre FROM fabricante;";
            consultarBase(sql);
            Fabricante fabrica = null;
            ArrayList<Fabricante> fabricas = new ArrayList<>();

            while (resultado.next()) {
                fabrica = new Fabricante();
                fabrica.setCodigo(resultado.getInt(1));
                fabrica.setNombre(resultado.getString(2));
                fabricas.add(fabrica);
            }
            desconectarBase();
            return fabricas;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();

            throw new Exception("Error de Sistema !!!");

        }

    }

}
