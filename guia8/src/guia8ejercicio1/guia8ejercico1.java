/*
 1. Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.






 */
package guia8ejercicio1;

import java.util.Scanner;
import guia8ejercicio1.Entidades.Cadena;
import guia8ejercicio1.Servicio.CadenaServicio;

/**
 *
 * @author Casa
 */
public class guia8ejercico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();

        String letra, frase;
        int opcion;
        System.out.println(" Ingresar una Frase para guardar en Cadena ");
        frase = leer.nextLine();
        Cadena nca = new Cadena(frase);

        do {
            System.out.println("");
            System.out.println(" Menu General de Metodos");
            System.out.println(" ------------");
            System.out.println("1  mostrarVocales ");
            System.out.println("2  invertirFrase ");
            System.out.println("3  vecesRepetido");
            System.out.println("4  compararLongitud ");
            System.out.println("5  unirFrases ");
            System.out.println("6  reemplazar ");
            System.out.println("7  contiene");
            System.out.println("8  Ingresr nueva Frase en Cadena");
            System.out.println("9  Salir");
            System.out.println("");

//            System.out.print(nca.getFrase());
//            System.out.println(nca.getLonguitud());
//            System.out.println(frase.length());
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.mostrarVocales(nca);

                    break;
                case 2:
                    cs.invertirFrase(nca);
                    break;
                case 3:
                    System.out.println("ingrese una letra: ");
                    letra = leer.next();
                    cs.vecesRepetido(letra,nca);
                    break;
                case 4:
                    System.out.println("Ingrese una frase: ");
                    frase = leer.next();
                    cs.compararLongitud(frase, nca);
                    break;
                case 5:
                    System.out.println("Ingresar una Frase");
                    frase = leer.next();
                    cs.unirFrases(frase, nca);
                    break;
                case 6:
                    System.out.println(" Ingrese el digito para remplazar la leta 'a' ");
                    letra = leer.next();
                    cs.reemplazar(letra, nca);
                    break;
                case 7:
                    System.out.println("Ingrese una letra a ser buscada en la frase. ");
                    letra = leer.next();
                    System.out.println("Es "+cs.contiene(letra, nca)+" que la letra "+ letra+" esta en la frase");
                    System.out.println(nca.getFrase());
                    break;
                case 8:
                    System.out.println("Ingresar una nueva Frase para cargar en Clase Cadena");
                    nca.setFrase(leer.next());
                    break;
                case 9:
                    System.out.println(" Saludossssss.....!!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 9);

    }

}
