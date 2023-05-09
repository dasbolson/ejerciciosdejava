/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1.Servicio;

import guia8ejercicio1.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);
    Cadena nc ;

    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.*/
    public void mostrarVocales(Cadena nc) {

        int contador = 0;
        String letra;

        for (int i = 0; i < nc.getLonguitud(); i++) {

            letra = nc.getFrase().toLowerCase().substring(i, i + 1);

            if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
                contador += 1;
            }
            if ("á".equals(letra) || "é".equals(letra) || "í".equals(letra) || "ó".equals(letra) || "ú".equals(letra)) {
                contador +=1;
            }
        }
        System.out.println("");
        System.out.println(nc.getFrase());
        System.out.println("");
        System.out.println("Las vocales estan " + contador + " veces en la frase");
        System.out.println("");
    }

    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".*/
    public void invertirFrase(Cadena nc) {

        String fraseInvertida = "";
       

        for (int i = (nc.getFrase().length()-1); i >= 0; i--) {

            fraseInvertida = fraseInvertida.concat(nc.getFrase().substring(i, i+1));

        }
        System.out.println("");
        System.out.println("Frase Original:         " + nc.getFrase());
        System.out.println("La frase Invertida es:  " + fraseInvertida);

    }

    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:  Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
     */
    
    
    public void vecesRepetido(String letra,Cadena nc) {

        System.out.println(nc.getFrase());
        int contador = 0;
        for (int i = 0; i < nc.getFrase().length(); i++) {

            if (nc.getFrase().substring(i, i + 1).equals(letra)) {
                contador += 1;
            }
        }
        System.out.println(" El Caracter; " + letra + " se repite " + contador + " veces !");
    }

    /*
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
     */
    public void compararLongitud(String frase, Cadena nc) {

        if (frase.length() < nc.getLonguitud()) {
            System.out.println("La Frase ingresada por tecaldo es de Menor Longuitud ");
        } else if (frase.length() > nc.getLonguitud()) {
            System.out.println("La Frase ingresada por tecaldo es de Mayor Longuitud ");
        } else {
            System.out.println("Las Frases son de igual Longuitud ");
        }
    }

    /*
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
     */
    public void unirFrases(String frase, Cadena nc) {

        System.out.println(nc.getFrase().concat(" " + frase));
    }

    /*
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
     */
    public void reemplazar(String letra, Cadena nc) {

        String nuevaFrase = nc.getFrase().replace("a", letra);
        System.out.println("Frase Original:   " + nc.getFrase());
        System.out.println("Frase Modificada: " + nuevaFrase);
    }

    /*
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
     */
    public boolean contiene(String letra, Cadena nc) {

        return nc.getFrase().contains(letra);

    }

}
