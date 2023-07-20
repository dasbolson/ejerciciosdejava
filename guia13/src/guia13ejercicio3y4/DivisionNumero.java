/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio3y4;

/**
 *
 * @author Casa
 */
public class DivisionNumero {
    
   private int a;
   private int b;

    public DivisionNumero() {
    }

    public DivisionNumero(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    public void dividir (){
    
    double resultado;
    
    try{
    resultado= a / b ;
        
        System.out.println("El resultado es: "+ resultado);
        
    }catch(ArithmeticException e){
        System.out.println(" Error , division por cero no es posible");
    }
    finally{
        System.out.println("Saludos desde Finally!");
    
    }
    
    }
    
    
    
}
