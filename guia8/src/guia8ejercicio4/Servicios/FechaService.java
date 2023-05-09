/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio4.Servicios;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Casa
 */
public class FechaService {

    Scanner leer = new Scanner(System.in);

//   a) Método fechaNacimiento que pregunte al usuario día, mes y año de
//  su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//  El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//  new Date(anio, mes, dia);
//    
    public Date fechaNacimiento() {
        int dia;
        int mes;
        int anio;
        
        
        System.out.println("Ingrese su fecha de Nacimiento: ");
        System.out.println(" Dia ");
        dia = leer.nextInt();
        System.out.println("Mes ");
        mes = leer.nextInt();
        System.out.println("Año ");
        anio = leer.nextInt();
      //  Date fechaNac=new Date(anio, mes-1, dia);
       // System.out.println(fechaNac);
        return new Date(anio-1900, mes-1, dia); //fechaNac;

    }

    /*
    b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date
     */
    public Date fechaActual() {

        //Date fechaActual = new Date();
        return new Date();
    }

    //   c) Método diferencia que reciba las dos fechas por parámetro y retorna
//      la diferencia de años entre una y otra (edad del usuario).
    public int diferencia(Date fechaNacimiento, Date fechaActual) {

        int edad;

        edad =fechaActual.getYear()- fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual().getMonth()) {
            edad = edad - 1;
        } else {
            if (fechaNacimiento.getMonth() == fechaActual().getMonth()) {
                if (fechaNacimiento.getDate() > fechaActual().getDate()) {
                    edad = edad - 1;

                } else if (fechaNacimiento.getDate() == fechaActual().getDate()) {
                    System.out.println("Feliz Cumple Años!!!");
                }

            }
        }

        return edad;

    }
}
