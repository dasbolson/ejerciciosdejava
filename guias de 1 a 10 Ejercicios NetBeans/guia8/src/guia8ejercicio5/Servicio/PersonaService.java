/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio5.Servicio;

import guia8ejercicio5.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;
import guia8ejercicio4.Servicios.FechaService;

/**
 *
 * @author Casa
 */
public class PersonaService {
    Scanner leer= new Scanner(System.in);
    
 //   a) Método crearPersona que pida al usuario Nombre y fecha de
//     nacimiento de la persona a crear. Retornar el objeto Persona creado.
    
    public Persona crearPersona(){
        String nombre;
        int dia, mes, anio;
        System.out.println("ingresar nombre; ");  
        nombre=leer.next();
        System.out.println("Ingresar fecha de Nacimiento:");
        System.out.println("Dia: " );
        dia=leer.nextInt();
        System.out.println("Mes: ");
        mes=leer.nextInt()-1;
        System.out.println("Año: ");
        anio=leer.nextInt()-1900;
        Date fechaNac= new Date(anio,mes,dia);
        
        return new Persona(nombre,fechaNac);
       
    }
    
/*
    b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
   
*/

    public int calcularEdad(Date fechaNacimiento, Date fechaActual){
    
        int edad;

        edad =fechaActual.getYear()- fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()) {
            edad = edad - 1;
        } else {
            if (fechaNacimiento.getMonth() == fechaActual.getMonth()) {
                if (fechaNacimiento.getDate() > fechaActual.getDate()) {
                    edad = edad - 1;

                } else if (fechaNacimiento.getDate() == fechaActual.getDate()) {
                    System.out.println("Feliz Cumple Años!!!");
                }
            }
        }
        System.out.println(" La edad es de " + edad +" Años");
    return edad;
    
    }
    
  /*
    c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
      
    */  
    
    public boolean menorQue (Persona p1, int edad ){
    
      boolean retorno;
      FechaService fecha=new FechaService();
      retorno = this.calcularEdad(p1.getFechaNacimiento(), fecha.fechaActual())< edad;
     
      return retorno;
    }
    
    /*
    d) Método mostrarPersona que muestra la información de la persona
deseada.
    
    */
    
    public void mostrarPersona(Persona p1){
    
        System.out.println("p1.toString()"+ p1);
    
    
    }
    
    public Date fechaActual() {

        //Date fechaActual = new Date();
        return new Date();
    }


}
