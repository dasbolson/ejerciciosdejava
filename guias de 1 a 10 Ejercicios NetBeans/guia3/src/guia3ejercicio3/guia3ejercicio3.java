/*
3. Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package guia3ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class guia3ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int cantidadDeEuros,opcion ;
        String monedaDeConvercion="";
        System.out.println("Ingresar la cantidad de Euros a Convertir: ");
        cantidadDeEuros=leer.nextInt();
        System.out.println("");
        do {System.out.println(" Ingrese a que moneda quiere convertir los Euros");
            System.out.println("");
            System.out.println("1. Libras");
            System.out.println("2. Pesos");
            System.out.println("3. Yenes");
            System.out.println("4, Salir");
            System.out.println(" ");
            opcion = leer.nextInt();
        
        
            switch (opcion) {
                case 1:
                    monedaDeConvercion="Libras";
                    System.out.println("");
                    System.out.println( cantidadDeEuros + " Euros son "+ convertidor(cantidadDeEuros,monedaDeConvercion)+" "+ monedaDeConvercion);
                    System.out.println("");
                    break;
                case 2:
                    monedaDeConvercion = "Pesos";
                    System.out.println("");
                    System.out.println( cantidadDeEuros + " Euros son "+ convertidor(cantidadDeEuros,monedaDeConvercion)+" "+ monedaDeConvercion);
                    System.out.println("");
                    break;
                case 3:
                    monedaDeConvercion="Yenes";
                    System.out.println("");
                    System.out.println( cantidadDeEuros + " Euros son "+ convertidor(cantidadDeEuros,monedaDeConvercion)+" "+ monedaDeConvercion);
                    System.out.println("");
                    break;
                
            }
            //System.out.println("");
            //System.out.println( cantidadDeEuros + " Euros son "+ convertidor(cantidadDeEuros,monedaDeConvercion)+" "+ monedaDeConvercion);
            //System.out.println("");
        } while (opcion!=4);
        
    }
    public static double convertidor(int cantidadDeEuros,String monedaDeConvercion){
        double totalConvertido=0;
        switch (monedaDeConvercion) {
            case "Libras":
                totalConvertido = cantidadDeEuros * 0.86;
                
                break;
                
                case "Pesos":
                totalConvertido = cantidadDeEuros * 1.28611;
                
                break;
                
                case "Yenes":
                totalConvertido = cantidadDeEuros * 129.852;
                
                break;            
            
        }
        
        return totalConvertido;
        
        
    }    
        
   
    
}
