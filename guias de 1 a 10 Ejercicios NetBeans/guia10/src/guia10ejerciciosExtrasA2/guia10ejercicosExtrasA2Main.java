/*
 2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.



 */
package guia10ejerciciosExtrasA2;

import java.util.ArrayList;
import java.util.Scanner;

public class guia10ejercicosExtrasA2Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> cantantesFamoso = new ArrayList<>();
        String menu, nombre, discoMasVendido;
        Integer opcion;
        cantantesFamoso.add(new CantanteFamoso("Carlos", "CarlosDisc"));
        cantantesFamoso.add(new CantanteFamoso("Carlos1", "CarlosDisc1"));
        cantantesFamoso.add(new CantanteFamoso("Carlos2", "CarlosDisc2"));
        cantantesFamoso.add(new CantanteFamoso("Carlos3", "CarlosDisc3"));
        cantantesFamoso.add(new CantanteFamoso("Carlos4", "CarlosDisc4"));

        for (CantanteFamoso cantanteFamoso : cantantesFamoso) {
            System.out.println(cantanteFamoso.toString());
        }

        System.out.println("Mas Opciones -> S/N");
        menu = leer.next();
        if (menu.equalsIgnoreCase("s")) {
            do {

                System.out.println("1 -> Agregar Cantante");
                System.out.println("2 -> Mostrar todos los Cantantes");
                System.out.println("3 -> Eliminar Cantante");
                System.out.println("4 -> Salir");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresar Nombre del Cantante");
                        nombre = leer.next();
                        System.out.println("Ingresar Disco mas Vendido del Cantante");
                        discoMasVendido = leer.next();
                        cantantesFamoso.add(new CantanteFamoso(nombre, discoMasVendido));
                        break;
                    case 2:
                        for (CantanteFamoso cantanteFamoso : cantantesFamoso) {
                            System.out.println(cantanteFamoso.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Eliminar Cantante de la Lista");
                        nombre = leer.next();
                        Boolean estaEnLaLista = true;
                        for (int i = 0; i < cantantesFamoso.size(); i++) {
                            String cantor = cantantesFamoso.get(i).getNombre();

                            if (cantor.equalsIgnoreCase(nombre)) {
                                cantantesFamoso.remove(i);
                                estaEnLaLista = false;
                            }
                        }
                        while (estaEnLaLista) {
                            System.out.println("No esta en la lista el cantante: " + nombre);
                        }
                        break;
                    case 4:
                        System.out.println("Chauuuu");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        ;
                }

            } while (opcion != 4);

        }
        for (CantanteFamoso cantanteFamos : cantantesFamoso) {
            System.out.println(cantanteFamos.toString());
        }
        System.out.println("Sayonara Tribilin !!!");
    }

}
