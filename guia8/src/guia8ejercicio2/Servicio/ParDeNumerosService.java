/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio2.Servicio;

import guia8ejercicio2.Entidades.ParDeNumeros;

/**
 *
 * @author Casa
 */
public class ParDeNumerosService {

    ParDeNumeros pdn;

//   a) Método mostrarValores que muestra cuáles son los dos números
//       guardados.
    public void mostrarValores(ParDeNumeros pdn) {

        System.out.println("Numero 1 " + pdn.getNum1());
        System.out.println("Numero 2 " + pdn.getNum2());

    }

//  b) Método devolverMayor para retornar cuál de los dos atributos tiene
//  el mayor valor
    public String devolverMayor(ParDeNumeros pdn) {

        System.out.println("Numero 1: " + pdn.getNum1());
        System.out.println("Numero 2: " + pdn.getNum2());
        System.out.println("");

        if (pdn.getNum1() > pdn.getNum2()) {
            System.out.println("Numero 1: " + pdn.getNum1() + " es el Mayor de los numeros !");
            return "Numero 1";
        } else if (pdn.getNum1() < pdn.getNum2()) {
            System.out.println("Numero 2: " + pdn.getNum2() + " es el Mayor de los numeros !");
            return "Numero 2";
        } else {
            System.out.println("Los numeros son Iguales ");
        }
        return "Numeros Iguales";

    }
//  c) Método calcularPotencia para calcular la potencia del mayor valor de
//  la clase elevado al menor número. Previamente se deben redondear
//  ambos valores.

    public void calcularPotencia(ParDeNumeros pdn) {
        System.out.println("Mayor " + Math.floor(Math.max(pdn.getNum1(), pdn.getNum2())));
        System.out.println("Menor " + Math.floor(Math.min(pdn.getNum1(), pdn.getNum2())));
        System.out.println("");
        System.out.println("Resultado de Elevar el mayor numero a la potencia del menor numero = " + Math.pow(Math.floor(Math.max(pdn.getNum1(), pdn.getNum2())), Math.floor(Math.min(pdn.getNum1(), pdn.getNum2()))));

    }

//    d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//    dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//    valor absoluto del número.
//    
    public void calculaRaiz(ParDeNumeros pdn){
    
         System.out.println(" La raiz Cuadrada del menor de los numeros es= " + Math.sqrt(Math.floor(Math.min(pdn.getNum1(), pdn.getNum2()))));
                 
                 
    }
}
