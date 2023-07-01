/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12Ejercicio1;

public class main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Perro perro1 = new Perro("M", "Stich", "carnivoro", 15, "Dobermann");
        perro1.alimentarse();
        Perro perro2 = new Perro("M", "Teddy", "Croquetas", 10, "Chiguagua");
        perro2.alimentarse();
        Gato gato1 = new Gato("Largo", "Peluza", "Galletas", 10, "Siamés");
        gato1.alimentarse();
        Caballo caballo = new Caballo("Petiso", "Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();

    }

}
