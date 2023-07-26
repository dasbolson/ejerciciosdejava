/*
  2. Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:

https://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package guia6ejercicios2extras;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Puntos {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar las coordenadas de los puntos P1(X1,Y1), P2(X2,Y2)");
        System.out.println("");
        System.out.println("Punto X1:");
        this.setX1(leer.nextInt());
        System.out.println("Punto Y1:");
        this.setY1(leer.nextInt());
        System.out.println("Punto X2:");
        this.setX2(leer.nextInt());
        System.out.println("Punto Y2:");
        this.setY2(leer.nextInt());

    }

    public double calcular(){
        double distancia;
        distancia= Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1, 2));
        return distancia;
    }
    
    
    public Puntos() {
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

}
