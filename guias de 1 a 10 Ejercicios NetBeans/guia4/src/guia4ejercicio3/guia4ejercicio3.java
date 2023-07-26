/*
3. Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia4ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia4ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int n=0, numeroDeDigitos=0, unDigito = 0, dosDigitos = 0, valorVector;
       int tresDigitos = 0, cuatroDigitos = 0, cincoDigitos = 0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar el tamaño del Vector");
        n=leer.nextInt();
        int[] vector= new int[n];
      
        for (int i = 0; i < n; i++) {
         vector[i]=(int)(Math.random()*(100000-1)+1);
          System.out.println(" "+ vector[i] );
        } 
        for (int j = 0; j < n; j++) {
            valorVector=vector[j];
            numeroDeDigitos= determinaDigitos(valorVector);
                       
            switch (numeroDeDigitos) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;                    
                case 4:
                    cuatroDigitos++;
                    break;                    
                case 5:
                    cincoDigitos++;
                    break;                    
                
            }
          }
        
        System.out.println("Hay " + unDigito + " numeros de un digitos ");
        System.out.println("Hay " + dosDigitos + " numeros de dos digitos ");
        System.out.println("Hay " + tresDigitos + " numeros de tres digitos ");
        System.out.println("Hay " + cuatroDigitos + " numeros de cuatro digitos ");
        System.out.println("Hay " + cincoDigitos + " numeros de cinco digitos ");
  
        
    }
    public static int determinaDigitos(int valorVector){
        int digitos=1, valor=0 ;
        double aux=0;
        aux = valorVector/10;
        do { 
                digitos++;
                aux=aux/10;
        } while (aux > 1);
        
    return digitos ;  
    }
    
    
    
    
}
