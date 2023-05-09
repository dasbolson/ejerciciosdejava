/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicios1extras;

/**
 *
 * @author Casa
 */
public class MesSecreto {
    private String [] mesSecreto= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","dicienbre"};
     int incognita= (int)(Math.random()*12);
     
    public MesSecreto() {
    }

    public String getMesSecreto() {
        
        return mesSecreto[incognita];
    }

    public int getIncognita() {
        return incognita;
    }
     
     
}
