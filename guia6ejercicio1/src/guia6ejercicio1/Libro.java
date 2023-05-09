/*
 1. Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package guia6ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    
    public void cargarLibro(Scanner leer){
        System.out.print("Cargar el ISBN: ");
    this.ISBN = Integer.parseInt(leer.nextLine());
        System.out.print("Cargar el Titulo: ");
    this.Titulo = leer.nextLine();
        System.out.print("Cargar el Autor: ");
    this.Autor = leer.nextLine();
        System.out.print("Cargar el Numero De Paginas: ");
    this.NumeroDePaginas = leer.nextInt();
  
    }
    
    public void mostrarLibro (){
        System.out.println(" ISBN: "+ ISBN);
        System.out.println(" Titulo: "+ Titulo);
        System.out.println(" Autor: "+ Autor);
        System.out.println(" Numero de Paginas "+ NumeroDePaginas);
        
    }
    
    
    
}
/*
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro() {

    }

    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro(Scanner input) {
        this.ISBN = Integer.parseInt(input.nextLine());
        this.titulo = input.nextLine();
        this.autor = input.nextLine();
        this.numPaginas = Integer.parseInt(input.nextLine());
    }
    /*
    public void mostrarLibro() {
        System.out.println("El libro seleccionado es: " + titulo + "\n"
                + "El autor es: " + autor + "\n"
                + "contiene: " + numPaginas + " paginas \n"
                + "Su codigo identificatorio es: " + ISBN);
    }
    */
    
    
//}
//-----------------------------------------------------
//public class Test {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//        final Scanner input = new Scanner(System.in);
//        
//        Libro libro1 = new Libro();
//        libro1.cargarLibro(input);
//        libro1.mostrarLibro();
//    }
//    
//}
//*/
/*
public static void main(String[] args) {
        
        final Scanner input = new Scanner(System.in);
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro(1653, "padre rico padre pobre","robert kiyosaky",400);
        
        libro1.cargarLibro(input);
        libro1.mostrarLibro();
        
        System.out.println("-------------------------");
        
        System.out.println(libro2.getAutor());
        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getNumPaginas());
        System.out.println(libro2.getISBN());
    }
    
}
*/