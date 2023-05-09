/*
4. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia6ejercicios4extras;

/**
 *
 * @author Casa
 */
public class guia6ejercicios4extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    
    Cuentas cuenta = new Cuentas(5000, "Gomes");
    cuenta.retirarDinero();
        System.out.println(" Fin !!!!" );
    
    }
    
}
