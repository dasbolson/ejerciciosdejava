/*
 2 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).

 */

package guia13ejercicio2;

import java.lang.reflect.Array;


public class MainGuia13ejercico2 {

   
    public static void main(String[] args) {
     
       Double vector[] = new Double[4];
       
       try{
       
           vector[3]= 17d;
           
       }catch(ArrayIndexOutOfBoundsException a){
       
           System.out.println("Indice del vector superior a la dimension del mismo");
       }
       
       
    }

}
