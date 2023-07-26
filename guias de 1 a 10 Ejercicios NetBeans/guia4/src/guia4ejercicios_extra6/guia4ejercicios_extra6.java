/*
 6. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().

 */
package guia4ejercicios_extra6;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicios_extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String palabra = "";
        String[][] sopa = new String[20][20];

        System.out.println("Ingresar 5 Palabra, de Minimo 3 letras y Maximo 5 letras");
        for (int i = 0; i < 5; i++) {
            palabra = ingresarPalabra(palabra, i);
            
            acomodarPalabra(sopa,palabra);
            
            }
        completaSopa(sopa);
        
        imprimir(sopa);

        
    }

    static public String ingresarPalabra(String palabra, int i) {
        Scanner leer = new Scanner(System.in);
        boolean condicion = false;
        do {
            System.out.print("Palabra " + (i + 1) + " : ");
            palabra = leer.next();
            System.out.println("");
            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.print("Palabra incorrecta ! Ingresarla nuevamente");
                System.out.println("");
                condicion = false;
            } else {
                condicion = true;
            }
        } while (!condicion);
        return palabra;
    }

    static public String [][] acomodarPalabra ( String [][] sopa, String palabra){
    
    int fila, columna, largo=0;
    boolean condicion1=false;
        do {        // ver que el numero de columna + long de la palabra sean menor que 20
            fila =(int) Math.round((Math.random()*10)*2);
            columna =(int) Math.round((Math.random()*10)*2);   
            if (columna+palabra.length()<20) {
                for (int j = columna; j < columna+palabra.length(); j++) {
                    if (sopa[fila][j]==null ) {
                        condicion1= true;
                    }else {
                    condicion1=false;
                    break;
                    }
                }
            }
        } while (!condicion1);
        
        for (int j = columna; j < columna+palabra.length(); j++) {
           
            sopa[fila][j]=palabra.substring(largo, largo+1);
              largo++;       
        }
        for (int j = 0; j < 20; j++) {
            if (sopa[fila][j]==null) {
                sopa[fila][j]= String.valueOf( Math.round(Math.random()*10));
            }
        }
        
        return sopa;

    }
    
    static public void imprimir(String[][] sopa){
    
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                System.out.print(" "+ sopa [j][k]);
             }
            System.out.println("");
        }
    }

static public void completaSopa (String [][] sopa){

    for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 20; k++) {
                if (sopa[j][k]==null) {
                    sopa [j][k]= String.valueOf( Math.round(Math.random()*10));
                }
             }
           
        }
    
}

}




