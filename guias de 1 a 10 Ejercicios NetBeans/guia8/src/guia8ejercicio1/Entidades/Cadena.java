/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1.Entidades;

/**
 *
 * @author Casa
 */
public class Cadena {
    
   private   String frase;
   private   int longuitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longuitud= frase.length();

    }

    public String getFrase() {
        return frase;
    }

    public int getLonguitud() {
        return longuitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLonguitud(int longuitud) {
        this.longuitud = longuitud;
    }
      
    
}
