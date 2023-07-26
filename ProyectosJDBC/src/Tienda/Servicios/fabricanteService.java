/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda.Servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Persistencia.fabricanteDAO;

/**
 *
 * @author Casa
 */
public class fabricanteService {

    private fabricanteDAO DAO;

    public fabricanteService() {
        this.DAO = new fabricanteDAO();
    }

    public void crearFabricante(int codigo, String nombre) throws Exception {

        try {
            if (codigo == 0) {
                throw new Exception("Falta el Codigo del Fabricante");
            }
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("Nombre Vacio !!!");
            }
            Fabricante fabrica = new Fabricante();
            fabrica.setCodigo(codigo);
            fabrica.setNombre(nombre);
            DAO.guardarFabrica(fabrica);

        } catch (Exception e) {
            throw e;
        }
    }
  

}
