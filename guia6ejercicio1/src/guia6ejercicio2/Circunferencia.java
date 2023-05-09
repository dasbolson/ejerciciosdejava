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
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

     
    public void crearCircunferencia(){
       
        Scanner leer= new Scanner(System.in);
         double radio;
        System.out.println("Ingresar el Radio: ");  
        setRadio(leer.nextDouble());
       
        }
    
    public double area (){
        double res;
       res = (radio * 3.14)*(radio * 3.14);
    
    return res;
    }
    
    public double calculaPerimetro(){ 
    
        double perimetro;
    perimetro = 2 * 3.14 * radio;
    
    return perimetro;
    
    }
    
}
