/*

    Área circulo: PI * radio ^ 2 
    Perímetro circulo: PI * diámetro.

 */
package guia12Ejercicio4.Entidades;

import guia12Ejercicio4.CalculosFormas;

/**
 *
 * @author Casa
 */
public class Circulos implements CalculosFormas{

    private double radio;

    public Circulos() {
    }

    public Circulos(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void calculaArea() {
        double area = PI * this.radio * this.radio ;
        System.out.println("El area del Cirulo es: "+ area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = PI * (radio*2);
        System.out.println("El perimetro del circulo es: "+ perimetro);
        
    }
    
    
}
