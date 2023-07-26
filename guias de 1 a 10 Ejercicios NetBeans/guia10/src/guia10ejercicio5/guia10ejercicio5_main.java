/*
 5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.

 */

package guia10ejercicio5;

import guia10ejercicio5.Entidades.Pais;
import guia10ejercicio5.Servicios.ServicioPais;
import java.util.HashSet;
import java.util.Scanner;


public class guia10ejercicio5_main {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Pais> setPais=new HashSet();
        ServicioPais sp=new ServicioPais();
        
        System.out.println("Primer Paso");
        sp.cargarPais(setPais);
        System.out.println("Imprimir Conjunto");
        for (Pais setPai : setPais) {
            System.out.println(setPai.toString());
        }
        System.out.println("");
        System.out.println("Mostrar el conjunto ordenado alfabéticamente por El nombre del pais");
        sp.mostrarOrdenadoAlfabeticamente(setPais);
        System.out.println("");
        sp.eliminarPais(setPais);
        
   
        
    }

}
