/*
    Área rectángulo: base * altura 

   Perímetro rectángulo: (base + altura) * 2.
 */
package guia12Ejercicio4.Entidades;

import guia12Ejercicio4.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Rectangulos implements CalculosFormas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   private double base;
   private double altura;

    public Rectangulos() {
    }

    public Rectangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void calculaArea() {
        double area=base * altura ;
        System.out.println("El Area del rectangulos es: "+ area);
        
    }

    @Override
    public void calcularPerimetro() {
        double perimetro= (base +altura)*2;
        System.out.println("El Perimetro del rectangulos es: "+ perimetro);

    }

}
