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
public class Caballo extends Animal {
    
    protected String tipoDeCaballo;

    public Caballo(String tipoDeCaballo, String nombre, String alimento, Integer edad, String razaDelAnimal) {
        super(nombre, alimento, edad, razaDelAnimal);
        
    }

    @Override
    public void alimentarse(){
        System.out.println("Los Caballos comen: " + this.alimento);
    }

    @Override
    public String toString() {
        return "Caballo{" + "tipoDeCaballo=" + tipoDeCaballo + '}';
    }
    
    
}
