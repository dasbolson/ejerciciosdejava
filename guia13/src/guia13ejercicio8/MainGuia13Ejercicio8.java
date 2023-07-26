/*
8. Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:

 */
package guia13ejercicio8;

public class MainGuia13Ejercicio8 {

    public static void main(String[] args) {

    }
}
//         ***  CLASE UNO  ***
/*
        class Uno {

            private static int metodo() {
                int valor = 0;
                try {
                    valor = valor + 1;
                    valor = valor + Integer.parseInt(”42”);
                    valor = valor + 1;
                    System.out.println(”Valor final del try :” +valor) ;
                    } catch (NumberFormatException e) {
                        Valor = valor + Integer.parseInt(”42”);
                     System.out.println(“Valor final del catch  :” +valor);
                }finally {
                    valor = valor + 1;
                    System.out.println(”Valor final del finally: ” + valor) ;
}
                        valor = valor + 1;
                        System.out.println(”Valor antes del return: ” + valor) ;
                    return valor;
                    }
                   

            public static void main(String[] args) {
                try {
                    System.out.println(metodo());
                } catch (Exception e) {
                    System.err.println(”Excepcion en metodo() ”) ;
                    e.printStackTrace();
                }
            }
        }

        SE MOSTRARA: 
        Valor final del try 44
        
        Valor final del finally: 45
        
        Valor antes del return: 46
        
        46
 */

//        ***  CLASE DOS  ***


        /*
        class Dos {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt(”W”);
            valor = valor + 1;
            System.out.println(”Valor final del try : ” +valor) ;
        } catch (NumberFormatException e) {
                valor = valor + Integer.parseInt(”42”);
                System.out.println(”Valor final del catch  : ” +valor) ;
        
        }finally {
                 valor = valor + 1;
                 System.out.println(”Valor final del finally: ” + valor) ;
}
                valor = valor + 1;
                System.out.println(”Valor antes del return: ” + valor) ;
        return valor;
            }


    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println( ” Excepcion en metodo() ” ) ;
        e.printStackTrace();
        }
    }
}

        MOSTRARA 
Valor final del catch 43 
Valor final del finally: 44
Valor antes del return: 45
45

*/
//              **** CLASE TRES  *****

     /*

    public class Tres {
    public static int metodo() { // cambie la clase de Privet a Public , 
                                // para poder acceder al Metodo() en forma directa
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try : " +valor) ;
        } catch (NumberFormatException e) {
                valor = valor + Integer.parseInt("W");
                System.out.println("Valor final del catch  : " +valor) ;
        
        }finally {
                 valor = valor + 1;
                 System.out.println("Valor final del finally: " + valor) ;
}
                valor = valor + 1;
                System.out.println("Valor antes del return: " + valor) ;
        return valor;
     }
}

public class NewMain {

   
    public static void main(String[] args) {
     
try {
         Tres tres =new Tres(); 
         
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println(" Excepcion en metodo()");
        e.printStackTrace();
        }
    }

}

        MOSTRARA
Valor final del finally: 2

Y A CONTINUACION EL MENSAJE DE LA EXCEPTION (

Excepcion en metodo()
java.lang.NumberFormatException: For input string: "W"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at PruebaClase3Ejercicio8guia13.Tres.metodo(Tres.java:22)
	at PruebaClase3Ejercicio8guia13.NewMain.main(NewMain.java:21)


*/

