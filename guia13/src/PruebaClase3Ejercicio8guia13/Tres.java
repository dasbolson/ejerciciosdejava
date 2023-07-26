/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaClase3Ejercicio8guia13;

/**
 *
 * @author Casa
 */
public class Tres {
    public static int metodo() { // cambie la clase de Privet a Public , 
                                // para poder acceder al Metodo() en forma directa
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try : " +valor) ;
        } catch (NumberFormatException e) {
                valor = valor + Integer.parseInt("W");
                System.out.println("Valor final del catch  : " +valor) ;
        
        }finally {
                 valor = valor + 1;
                 System.out.println("Valor final del finally: " + valor) ;
}
                valor = valor + 1;
                System.out.println("Valor antes del return: " + valor) ;
        return valor;
     }
}
