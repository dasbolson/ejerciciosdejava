/*
 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

 */
package guia12Ejercicio4;

import guia12Ejercicio4.Entidades.Circulos;
import guia12Ejercicio4.Entidades.Rectangulos;
import java.util.Scanner;

public class MainGuia12Ejercicio4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Circulos circulo;
        Rectangulos rectangulo;
        double radio;
        double base;
        double altura;
        
        System.out.println("Ingresar el Radio del Circulo");
        radio = leer.nextDouble();
        System.out.println("Ingresar Alto del Rectangulo");
        altura= leer.nextDouble();
        System.out.println("Ingresar Base del Rectangulo");
        base=leer.nextDouble();
        
        circulo= new Circulos(radio);
        rectangulo= new Rectangulos(base, altura);
        System.out.println(" PARA EL CIRULO");
        System.out.println("-----------------");
         
        circulo.calculaArea();
        circulo.calcularPerimetro();
        System.out.println("--------------");
        System.out.println(" ");
        System.out.println("PARA EL RECTANGULO");
        System.out.println("------------------");
        rectangulo.calculaArea();
        rectangulo.calcularPerimetro();
        
    }

}
