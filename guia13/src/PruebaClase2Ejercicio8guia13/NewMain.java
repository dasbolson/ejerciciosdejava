/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PruebaClase2Ejercicio8guia13;

import static PruebaClase2Ejercicio8guia13.Dos.metodo;


public class NewMain {

   
    public static void main(String[] args) {
     try {
         Dos dos =new Dos(); 
         
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(" Excepcion en metodo()");
        e.printStackTrace();
        }
    

    }
}
    
    
    
    
    

