/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package guia6ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia6ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int base, altura;
         Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa Base: ");
         base=leer.nextInt();
         System.out.println("Ingrear Altura");
         altura=leer.nextInt();
         Rectangulo rec= new Rectangulo(base, altura);
         
         System.out.println("La superficie del Rectangulo es: " + rec.superficie());
         System.out.println("El perimetro del rectangulo es: " + rec.perimetro());
        System.out.println("-----------------------------");
        System.out.println("Superficie =" + (rec.getBase()* rec.getAltura()));
        System.out.println("Perimetro ="+ (rec.getBase()+ rec.getAltura())*2);
        System.out.println("-------------------------------");
        rec.imprimir();
    
    
    }
    
    
}
