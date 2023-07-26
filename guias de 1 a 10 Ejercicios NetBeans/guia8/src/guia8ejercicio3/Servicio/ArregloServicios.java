/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio3.Servicio;

import java.util.Arrays;

/**
 *
 * @author Casa
 */
public class ArregloServicios {

    public void inizializarA(double[] arregloA) {

        for (int i = 0; i < 50; i++) {

            arregloA[i] = Math.random() * 100 - 1;
           
        }

    }

    public void inizializarA2(double[] arregloA) {

        for (int i = 0; i < 50 ; i++) {
         
            Arrays.fill(arregloA,i,i+1, Math.random() * 10 - 1);    
        }
        
    }

    public void mostrar(double[] arreglo) {

        System.out.println(Arrays.toString(arreglo));
    }

    public void mostrar2(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " , ");
           
        }
        System.out.println("");
        
    }
//    Método ordenar recibe un arreglo por parámetro y lo ordena de
//    mayor a menor.

    public void ordenar(double[] arreglo) {
        int contador=0;
        System.out.print(Arrays.toString(arreglo));
        System.out.println("");
         Arrays.sort(arreglo);
          System.out.println(Arrays.toString(arreglo));
        double[] arregloTemp = new double[arreglo.length];
        for (int i = arreglo.length - 1; i > 0; i--) {

                 arregloTemp[contador]=arreglo [i] ;       
                 contador ++;
        }
        System.out.println(Arrays.toString(arregloTemp));

    }

//    Método inicializarB copia los primeros 10 números del arreglo A en el
//    arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
    public void inicializarB (double[] arregloA, double[] arregloB){
    
        for (int i = 0; i < 10; i++) {
            arregloB[i]=arregloA[i];
        }
        for (int i = 10; i < 20; i++) {
            arregloB[i]=0.5;
        }
       
        
    }
    public void inicializarB2 (double[] arregloA, double[] arregloB){
    
     System.arraycopy(arregloA, 0, arregloB, 0, 10);
      for (int i = 10; i < 20; i++) {
            arregloB[i]=0.5;
            
        }
    }
       
}
