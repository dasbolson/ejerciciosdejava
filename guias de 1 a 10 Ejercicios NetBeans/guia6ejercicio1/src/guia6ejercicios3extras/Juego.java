/*
3. Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado
 */
package guia6ejercicios3extras;

import com.sun.org.apache.bcel.internal.generic.IFEQ;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Juego {
    Scanner leer = new Scanner(System.in);
    
  public int jugador1;
  public int jugador2;
  

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }
  
  
  public void iniciarJuego (){
   
      do {
       
      System.out.println("Jugaror 1, debe ingresar el Numero a ser adivinado ");
  
      this.setJugador1(leer.nextInt());
    
      } while (jugador1== 0);
 
  }
  
  
    
    
}
