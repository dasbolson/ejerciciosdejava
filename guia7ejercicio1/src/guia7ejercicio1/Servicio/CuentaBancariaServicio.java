/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio1.Servicio;

import guia7ejercicio1.Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

// a) Método para crear cuenta pidiéndole los datos al usuario
    public CuentaBancaria crearCuenta() {

        System.out.print("Ingresar Número de Cuenta: ");
        int numeroCuenta = leer.nextInt();

        System.out.print("Ingresar Número de DNI: ");
        long numeroDNI = leer.nextLong();

        System.out.print("Ingresar Saldo Actual ");
        double saldoActual = leer.nextInt();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta,numeroDNI,saldoActual);

        return cuenta;

    }

// b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
// se le sumará al saldo actual.

    public void ingresar(CuentaBancaria cuenta, double ingreso) {

        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);

    }

//  c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
// restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
// retirar se retirará el máximo posible hasta dejar la cuenta en 0.  
    public double retirar(CuentaBancaria cuenta, double retiro) {

        if (retiro > cuenta.getSaldoActual()) {
            retiro = cuenta.getSaldoActual();
        }

        System.out.println(" Su retiro fue de " + retiro);
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        return retiro;
    }

    /*
   d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20% 
     */
    public void extraccionRapida(CuentaBancaria cuenta, double extraccion) {

        if (extraccion > cuenta.getSaldoActual() + 0.20) {
            System.out.println("El valor ingresado Supera el monto de Extraccion Rapida ");
            System.out.println("Maximo monto para extraccion Rapida: " + cuenta.getSaldoActual() * 0.20);
        } else {
            System.out.println(" Operacion Exitosa, su extraccion es de " + extraccion);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - extraccion);
            System.out.println(" Saldo Actual: " + cuenta.getSaldoActual());
        }

    }

// e) Método consultarSaldo: permitirá consultar el saldo disponible en la
//  cuenta.
    
    public double consultarSaldo (CuentaBancaria cuenta){
    
    
    return cuenta.getSaldoActual();
    }
    
// f) Método consultarDatos: permitirá mostrar todos los datos de la
// cuenta.
    
    public void consultarDatos(CuentaBancaria cuenta){
    
        System.out.println(cuenta.toString());
    }
    
    
    
    
}
