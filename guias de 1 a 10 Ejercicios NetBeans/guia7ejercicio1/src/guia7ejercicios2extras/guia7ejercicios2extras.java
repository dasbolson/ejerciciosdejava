/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicios2extras;

import guia7ejercicios2extras.Entidades.NIF;
import guia7ejercicios2extras.Servicios.NIFServicios;

/**
 *
 * @author Casa
 */
public class guia7ejercicios2extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF nif= new NIF();
        NIFServicios nifServicios= new NIFServicios();
        nifServicios.crearNIF();
        nifServicios.mostrarNIF();


    }
    
}
