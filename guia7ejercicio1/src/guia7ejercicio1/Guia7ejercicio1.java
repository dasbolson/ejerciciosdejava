/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1;

import guia7ejercicio1.Entidad.CuentaBancaria;
import guia7ejercicio1.Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Guia7ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cuenta= cbs.crearCuenta();
        int menu;
        do {
            System.out.println("Menu de Opciones");
            System.out.println("-------------------");
            System.out.println("");
            System.out.println("1. Ingresar Dinero ");
            System.out.println("2. Retirar Dinero ");
            System.out.println("3. Extraccion Rapida ");
            System.out.println("4. Consultar Saldo ");
            System.out.println("5. Mostrar Datos de la Cuenta ");
            System.out.println("6. Salir ");
            
            menu=leer.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.print(" Ingrear el Monto a ser Ingreasdo: " );
                    cbs.ingresar(cuenta, leer.nextDouble());
                    break;
                case 2:
                    System.out.print(" Ingrear el Monto a Retirar: " );
                    cbs.retirar(cuenta, leer.nextDouble());
                    break;
                case 3:
                    System.out.print(" Ingrear el Monto para Extraccion Rapida: " );
                    cbs.extraccionRapida(cuenta, leer.nextDouble());
                    break;
                case 4:
                    System.out.print(" Su Saldo es :"+  cbs.consultarSaldo(cuenta));
                    break;
                case 5:
                    System.out.println(cuenta.toString());
                    break;
                case 6:
                    System.out.println(" Final , Saliendo !!!");
                    break;
                default:
                    System.out.println("Opcion no valida !!!");
                    
            }
            
        } while (menu!= 6);
        
       
        



    }
    
}
