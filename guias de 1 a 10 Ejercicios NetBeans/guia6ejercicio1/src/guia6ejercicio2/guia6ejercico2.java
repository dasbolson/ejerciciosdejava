/*
2. Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia AREA=(PI*radio)^2
e) Método perimetro(): para calcular el perímetro . PERIMETRO = 2 * PI * radio
 */
package guia6ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia6ejercico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia c1= new Circunferencia();
        c1.crearCircunferencia();
        System.out.println("Area de la circunferencia: "+ c1.area());
        System.out.println("El perimetro de la circuenferencia es: " + c1.calculaPerimetro());
    
    
    
    
    }

   
    
}
