/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicios2extras.Servicios;

import guia7ejercicios2extras.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class NIFServicios {

    Scanner leer = new Scanner(System.in);

   NIF nif = new NIF();

    public long getDni() {
        return nif.dni;
    }

    public char getLetra() {
        return nif.letra;
    }

    public void setDni(long dni) {
        nif.dni = dni;
    }

    public void setLetra(char letra) {
        nif.letra = letra;
    }

    public void crearNIF() {
        long dni;
        char letra;
        String dnistring;
        do {
            System.out.println("Ingresar el DNI: ");
            dni = leer.nextLong();
            dnistring = Integer.toString((int) dni);

        } while (dnistring.length() != 8);
        letra = calcularLetra(dni);
        NIF nif = new NIF();
        setDni(dni);
        setLetra(letra);
        System.out.println(dni+"-"+letra);
    }
    public char calcularLetra(long dni){
        int numeroLetra;
        char [] convercion ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
                
        numeroLetra=(int)(dni % 23);
        return convercion[numeroLetra-1];
    }

    public void mostrarNIF (){
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println(getDni()+"-"+getLetra());
        System.out.println("");
        System.out.println("Chauu ");
    
    }

}
