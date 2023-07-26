/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PruebaClase3Ejercicio8guia13;

import static PruebaClase3Ejercicio8guia13.Tres.metodo;



public class NewMain {

   
    public static void main(String[] args) {
     
try {
         Tres tres =new Tres(); 
         
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(" Excepcion en metodo()");
        e.printStackTrace();
        }
    }

}
