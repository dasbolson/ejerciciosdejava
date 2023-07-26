/*
3. Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.

 */
package guia6ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Operacion {
    
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion (){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero 1");
        this.setNumero1 (leer.nextDouble());
        System.out.println("Ingresar numero 2");
        setNumero2(leer.nextDouble());
        System.out.println(this.numero1);
        System.out.println(this.numero2);
    }
    
    public double sumar(){
        
   double suma = this.numero1+this.numero2;
    return suma;
    
    }
    
    public double restar(){
        
    double resta=this.getNumero1()-this.getNumero2();
    return resta;
    
    }
            
    public double multiplicar(){
    double multi;
            if (this.numero1==0 || this.numero2==0) {
                System.out.println("Imposible multiplicar. Un Cero entre los numeros");
                multi=0;
        }else{
                
                multi= this.numero1 * this.numero2;
            
            }
            return multi;
            
    }
    
    public double dividir(){
    double division;
            if (this.numero2==0) {
                System.out.println("Imposible Dividir por Un Cero ");
                division=0;
        }else{
               
                division= numero1 / numero2;
            
            }
            return division;
            
    }
    
}
