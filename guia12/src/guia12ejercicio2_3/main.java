/*
 Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos

 */
package guia12ejercicio2_3;

import guia12ejercicio2_3.Entidades.Electrodomesticos;
import guia12ejercicio2_3.Entidades.Lavadora;
import guia12ejercicio2_3.Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomesticos electro = new Electrodomesticos();
        Lavadora lavalava = new Lavadora();
        Televisor tele = new Televisor();
/*
        PARTE 1 DEL EJERCICIO GUIA12 EJERCICIO 2
        
        lavalava = lavalava.crearLavadora();
        lavalava.precioFinal();

        tele = tele.crearTelevisor();
        tele.precioFinal();
*/
        /*
        3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.

            PARTE 2 DEL EJERCICIO GUIA12 EJERCICIO 3


*/
        
        
        
        
        ArrayList<Electrodomesticos> listaElectrodomesticos = new ArrayList<>();
        Double sumaDePrecios= 0d;
        listaElectrodomesticos.add(new Televisor(45d, true, 10000d, "Bordo", 'B', 32d));
        listaElectrodomesticos.add(new Televisor(40d, true, 9000d, "Bordo", 'c', 45d));
        listaElectrodomesticos.add(new Lavadora(50d, 8000d, "Blanco", 'D', 54d));
        listaElectrodomesticos.add(new Lavadora(40d, 9000d, "GRIS", 'D', 45d));
        
        for (Electrodomesticos aux : listaElectrodomesticos) {
            
            aux.precioFinal();
            sumaDePrecios = sumaDePrecios + aux.getPrecio();
            
        }
        System.out.println("Precio de los electrodomesticos " + sumaDePrecios);
    }

}
