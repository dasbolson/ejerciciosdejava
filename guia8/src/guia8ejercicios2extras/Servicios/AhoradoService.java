/*
 2. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. Definir los siguientes métodos en
AhorcadoService:
● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.

● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra):que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.

Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes):(3,4)
Número de oportunidades restantes: 4
----------------------------------------------

 */
package guia8ejercicios2extras.Servicios;

import java.util.Scanner;
import guia8ejercicios2extras.Entidades.Ahorcado;
import java.util.Arrays;

/**
 *
 * @author Casa
 */
public class AhoradoService {

    Scanner leer = new Scanner(System.in);
    Ahorcado a;

    /*
    ● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
    
     */
    private void crearJuego(Ahorcado a) {

        int cantidadJugadasMax;
       

        System.out.println("Ingresar la Palabra Oculta");
        String palabra = leer.next();
        char[] palabraOculta = new char[palabra.length()];
        System.out.print("Ingresar la cantidad de jugadas permtidas ");
        cantidadJugadasMax = leer.nextInt();
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta[i] = palabra.charAt(i);
        }
       
        a.setPalabraABuscar(palabraOculta);
        a.setCantidadDeJugadasMaximas(cantidadJugadasMax);
      
                
    }

    /*
    ● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
     */
    private void longitud(Ahorcado a) {

        System.out.println("La longitud de la Palabra Oculta es: " +a.getPalabraABuscar().length + " letras");
      

    }

    /* 
    ● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no
    
     */
    public boolean buscar(char letra, Ahorcado a) {

        char[] oculta = new char[a.getPalabraABuscar().length];
        oculta = a.getPalabraABuscar();
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            if (letra == oculta[i]) {
                System.out.println("La Letra Pertenese a la Palabra ");
                return true;
            }
        }
        System.out.println("La Letra No Pertenese a la Palabra ");

        return false;
    }

    /*
    ● Método encontradas(letra):que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
   
     */
    public boolean encontradas(char letra, Ahorcado a) {

        int letraRepetida = 0;
        char[] oculta = new char[a.getPalabraABuscar().length];
        oculta = a.getPalabraABuscar();

        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            if (letra == oculta[i]) {
                a.setCantidadDeLetrasEncontradas(a.getCantidadDeLetrasEncontradas() + 1);
                letraRepetida++;
            }
        }

        System.out.println("La Letra: " + letra + " se encuentra " + letraRepetida + " veces en la palabra");

        System.out.println("Numero de letras ( Encontradas, Faltantes): (" + a.getCantidadDeLetrasEncontradas() + "," + (a.getPalabraABuscar().length - a.getCantidadDeLetrasEncontradas()) + ")");
        a.setCantidadDeJugadasMaximas(a.getCantidadDeJugadasMaximas() - 1);
        System.out.println("----------------------");
        System.out.println(" Letra Encontrada ");
        return letraRepetida >= 1;
    }

    /*
    ● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
     */
    public void intentos(Ahorcado a) {

        System.out.println("Quedan " + a.getCantidadDeJugadasMaximas() + " intentos mas");
    }

    /*
    ● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
     */
    public void juego(Ahorcado a) {
        char aux;
                 crearJuego(a); 
                 longitud(a);
                 
        do {
           
            System.out.println("Buscar letra");
            aux = leer.next().charAt(0);
            buscar(aux, a);
            encontradas(aux, a);
            intentos(a);
            if (a.getCantidadDeLetrasEncontradas()==a.getPalabraABuscar().length){
                System.out.println("Felicitaciones has enciontrado la Palabra");
            }
        } while (a.getCantidadDeJugadasMaximas()>0 & a.getCantidadDeLetrasEncontradas()<a.getPalabraABuscar().length );
      
        
        
   

    }
}
