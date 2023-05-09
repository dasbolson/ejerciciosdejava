/*
 4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */
package guia8ejercicio4;

import guia8ejercicio4.Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Casa
 */
public class guia8ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Date fechaNacimiento;
        FechaService fs = new FechaService();
      //  System.out.println(fs.fechaNacimiento());
        System.out.println(fs.fechaActual());
        fechaNacimiento=fs.fechaNacimiento();
               
        edad= fs.diferencia(fechaNacimiento,fs.fechaActual());
        System.out.println("Edad = "+edad);
        
        
        
        
        
    }
    
}
/*
package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    
    public Date fechaDeNacimiento(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el día de Nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de Nacimiento");
        int mes = (leer.nextInt()-1);
        System.out.println("Ingrese el año de Nacimiento");
        int anio = (leer.nextInt()-1900);
        return new Date(anio,mes,dia);
    }
    public Date fechaActual(){
        return new Date();
    }
    public int diferencia(Date nacimiento,Date actual){
        int edad;
        if (nacimiento.getMonth()>actual.getMonth()){
            edad = (actual.getYear()-nacimiento.getYear()-1);
        } else if (nacimiento.getMonth() == actual.getMonth()){
            if (nacimiento.getDate()>actual.getDate()){
                edad = (actual.getYear()-nacimiento.getYear()-1);
            } else {
                edad = (actual.getYear()-nacimiento.getYear());
            }
        } else {
            edad = (actual.getYear()-nacimiento.getYear());
        }
        return edad;
    } 
}



*/