/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio5.Entidades;

import java.util.Comparator;

/**
 *
 * @author Casa
 */
public class Pais {
    private String pais;
    private Integer poblacion;
    private String continente;

    public Pais() {
    }

    public Pais(String pais, Integer poblacion, String continente) {
        this.pais = pais;
        this.poblacion = poblacion;
        this.continente = continente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    public static Comparator <Pais> ordenarXPais = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {

            return t.getPais().compareToIgnoreCase(t1.getPais());
        }
    };

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + ", poblacion=" + poblacion + ", continente=" + continente + '}';
    }
    
    
    
    
}
