/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicios1extras.Servicios;

import guia7ejercicios1extras.Entidades.Raices;

/**
 *
 * @author Casa
 */
public class RaicesServicios {

    Raices raiz = new Raices(1,2,1);

    public double getDiscriminante() {

        return (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();

    }

    public boolean tieneRaices() {
        boolean retorno;

        retorno = getDiscriminante() > 0;
        return retorno;
    }

    /*c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.*/
    public boolean tieneRaiz() {
        boolean retorno;

        retorno = getDiscriminante() == 0;
        return retorno;
    }

    /*d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
imprime las 2 posibles soluciones.*/
    public void obtenerRaices() {

        double r1, r2;

        if (tieneRaices() == true) {

            r1 = -(raiz.getB()) + (Math.sqrt(raiz.getB() * raiz.getB() - 4 * raiz.getA() * raiz.getC()));
            r2 = -(raiz.getB()) - (Math.sqrt(raiz.getB() * raiz.getB() - 4 * raiz.getA() * raiz.getC()));
            System.out.println("Raiz 1: " + r1);
            System.out.println("Raiz 2: " + r2);
        }

    }

    /*e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.*/
    public void obtenerRaiz() {

        double r = 0;

        if (tieneRaiz() == true) {

            r = -raiz.getB() / (2 * raiz.getA());

        }
        System.out.println("La Raiz unica es: "+ r);
    }

  /* f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
    */
    
    public void calcular(){
    
        if (tieneRaices()==true) {
            
           obtenerRaices();
        }else if(tieneRaiz()== true){
            obtenerRaiz();
        }
            
        else {
            System.out.println("La Ecuacion no tiene Raices Reales! ");
        }
        }
   
}
