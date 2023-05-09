/*
 4. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia6ejercicios4extras;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Cuentas {
 
    private int Saldo;
    private String Titular;

    public Cuentas(int Saldo, String Titular) {
        this.Saldo = Saldo;
        this.Titular = Titular;
    }
    
    
    
    
    
    
public void retirarDinero(){

Scanner leer= new Scanner(System.in);
    int retiro;  
    String  salida = null;
    
    do {
     
    System.out.println("¿Cuanto dinero Quiere Retirar de la Cuenta?");
    retiro = leer.nextInt();
    if (Saldo- retiro< 0) {
        System.out.println(" No es posible efectuar ese retiro, fondos insuficientes");
    }
    else {
            System.out.println(" Operacion Exitosa! ");
            this.Saldo= Saldo - retiro;
            System.out.println(" Titular :"+ this.Titular);
            System.out.println("Saldo: "+ this.Saldo);
    }
        System.out.println("¿ Desea hacer otro retiro ? S/N");
        salida= leer.next();
     } while (salida.equalsIgnoreCase("S"));
    
}


}
