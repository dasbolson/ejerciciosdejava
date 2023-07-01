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
public class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String razaDelAnimal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String razaDelAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaDelAnimal = razaDelAnimal;
    }

    public void alimentarse(){
        System.out.println("El animal se alimenta con " + this.alimento);
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", razaDelAnimal=" + razaDelAnimal + '}';
    }

    
}
