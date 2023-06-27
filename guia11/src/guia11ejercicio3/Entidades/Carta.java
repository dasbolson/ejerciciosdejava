/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio3.Entidades;

import guia11ejercicio3.Enumeraciones.Palo;
import guia11ejercicio3.Enumeraciones.Valor;

/**
 *
 * @author Casa
 */
public class Carta {
    
  private Palo palo;
  private Valor valor;

    public Carta() {
    }

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }
    
    
    
}
