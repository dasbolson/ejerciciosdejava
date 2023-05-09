/*
 3. Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package guia6ejercicios3extras;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia6ejercicios3extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Juego jugada= new Juego();
            int intento=0, partidas=0,j1 = 0,j2 = 0;
            String jugar="";
            
        jugada.iniciarJuego();
        
            do{
            System.out.println("Juagador 2, adivine el numero !");
            intento=0;
            do {  
                System.out.println("Jugador 2, ingrese un numero. ");
                jugada.jugador2=leer.nextInt();
                
            
            
            if (jugada.jugador2!=jugada.jugador1) {
                
                if (jugada.jugador2 > jugada.jugador1) {
                    System.out.println("El numero es Mayor, que el que hay que adivinar !");
                    intento +=1;
                    
                }else {
                    System.out.println(" El numero es Menor, que el que hay que adivinar !");
                    intento += 1;
                }
            } else {
                intento +=1;
                j2+=1;
                  break;   
            }
            
            } while (intento< 5);
                j1+=1;
                System.out.println("Desea volver a jugar S/N");
                partidas +=1;
                jugar = leer.next();
                if (jugar.equalsIgnoreCase("S")){
                    jugada.iniciarJuego();
                    
                }
                        
                        
            } while (jugar.equalsIgnoreCase("S"));
        
        System.out.println(" El jugador 1 gano " + j1 + " Juegos");
        System.out.println(" El jugador 2 gano " + j2 + " Juegos");
        System.out.println(" El jugador 2 tuvo "+ intento + " Intentos en la ultima jugada ");
        System.out.println("------------- FIN");
    }
    
}
