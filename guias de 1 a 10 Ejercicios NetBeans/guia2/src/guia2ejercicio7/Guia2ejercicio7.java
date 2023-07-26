/*
 7. Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package guia2ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia2ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena, primerCaracter , ultimoCaracter;
        int correctas=0, incorrectas=0;
        Scanner leer = new Scanner(System.in);
        
        do {System.out.print("Ingresar la secuencia RS232 :");
        cadena=leer.next();
            if (cadena.length()<=5 && !cadena.equals("&&&&&")) {
                primerCaracter = cadena.substring(0, 1);
                ultimoCaracter= cadena.substring((cadena.length())-1, cadena.length());
                
              if (cadena.substring(0,1).equals("X") && cadena.substring((cadena.length()-1),cadena.length()).equals("O")){
                  correctas++;
              }else {
                  incorrectas++;
              }
            }
            else { incorrectas++;
            } 
                
        } while (!cadena.equals("&&&&&"));

        System.out.println("Cadenas Correctas: "+ correctas);
        System.out.println("Cadenas Incorrectas :"+ (incorrectas-1));
    }
    
}
