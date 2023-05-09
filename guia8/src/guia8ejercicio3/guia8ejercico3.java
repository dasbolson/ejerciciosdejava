/*
 3. Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:

1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2)Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3)Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4)Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.



 */
package guia8ejercicio3;

import java.util.Scanner;
import guia8ejercicio3.Servicio.ArregloServicios;
import java.util.Arrays;

/**
 *
 * @author Casa
 */
public class guia8ejercico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArregloServicios as = new ArregloServicios();
        int opcion = 0;
        String opcion2 = "";

        double[] A = new double[50];
        double[] B = new double[20];
        double[] arreglo = null;
        do {
            System.out.println("1 inizializarA");
            System.out.println("2 inizializarA2");
            System.out.println("3 ¿Que arreglo quiere ver A o B?");
            System.out.println("4 ¿Que arreglo quiere ver A o B?2");
            System.out.println("5 Ordenar de mayor a menor");
            System.out.println("6 inicializar b");
            System.out.println("7 Mostrar A y B");
            System.out.println("8 Salir");
            System.out.println("9 inicializarB2 ");
            System.out.println("");
            opcion = leer.nextInt();

            
            
            
            switch (opcion) {
                case 1:
                    as.inizializarA(A);
                    break;
                case 2:
                    as.inizializarA2(A);
                    break;
                case 3:
                    System.out.println("¿Que arreglo quiere ver A o B?");
                    opcion2 = leer.next();
                    if ("a".equalsIgnoreCase(opcion2)) {
                        arreglo = A;
                        as.mostrar(arreglo);
                    } else if ("b".equalsIgnoreCase(opcion2)) {
                        arreglo = B;
                        as.mostrar(arreglo);
                    } else {
                        System.out.println(" opcion no valida ");
                    }
                    break;
                case 4:
                    System.out.println("¿Que arreglo quiere ver A o B?");
                    opcion2 = leer.next();
                    if ("a".equalsIgnoreCase(opcion2)) {
                        arreglo = A;
                        as.mostrar2(arreglo);
                    } else if ("b".equalsIgnoreCase(opcion2)) {
                        arreglo = B;
                        as.mostrar2(arreglo);
                    } else {
                        System.out.println(" opcion no valida ");
                    }
                    break;
                case 5:
                    as.ordenar(A);
                    break;
                case 6:
                    as.inicializarB(A, B);
                    break;
                case 7:
                    System.out.print("A = ");
                    System.out.println(Arrays.toString(A));
                    System.out.print("B = ");
                    System.out.println(Arrays.toString(B));

                    break;

                case 8:
                    System.out.println("Chauuu !!");
                    break;
                case 9:
                    as.inicializarB2(A, B);
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 8);

    }

}
