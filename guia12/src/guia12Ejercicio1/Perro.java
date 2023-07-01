/*
 1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package guia12Ejercicio1;

/**
 *
 * @author Casa
 */
public class Perro extends Animal {

    protected String tamano;

    public Perro(String tamano, String nombre, String alimento, Integer edad, String razaDelAnimal) {
        super(nombre, alimento, edad, razaDelAnimal);
        this.tamano = tamano;
    }



    @Override
    public void alimentarse(){
        System.out.println("El Perro se alimenta con: " + this.alimento); 
        
    }

    @Override
    public String toString() {
        return "Perro{" + "tamano=" + tamano + '}';
    }
   
}
