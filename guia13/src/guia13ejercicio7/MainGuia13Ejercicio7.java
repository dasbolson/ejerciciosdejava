/*
7. Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

    class B {
public void metodoB() {
sentencia_b1
try {
sentencia_b2
} catch (MioException e){
sentencia_b3
}
finally
sentencia_b4
}
}
 */
package guia13ejercicio7;

public class MainGuia13Ejercicio7 {

    public static void main(String[] args) {
        /*
        
        COPIADO DIRECTO DE LA GUIA
        FALTAN LOS PUNTO Y COMA AL FINALIZAR  LINEAS Y
        FALTA LAS LLAVES EN EL BLOQUE FINALLY

        class B {

            public void metodoB() {
                sentencia_b1
                try {
                    sentencia_b2
                } catch (MioException e) {
                    sentencia_b3
                } finally sentencia_b4
                }
            }

        }

        REPARADO EL ERROR DE LOS PUNTOS Y COMAS, Y BLOQUE FINALLY        
        
        class B {

            public void metodoB() {
                sentencia_b1;
                try {
                    sentencia_b2;
                } catch (MioException e) {
                    sentencia_b3;
                } finally {
                 sentencia_b4;
                }
            }
        }
        
        Respuesta A)
        
        ORDEN DE EJECUCION 
        
        sentencia_b1;
        (bloque try) 
        sentencia_b2;
        SE LANZA MioException
        (bloque catch)
        sentencia_b3;
        (bloque finally)
        sentencia_b4 
        
   
        
         Respuesta B)
        
        ORDEN DE EJECUCION 
        
        sentencia_b1;
          ENTRA EN EL TRY
        sentencia_b2;
        (bloque finally)
        sentencia_b4;
         

        */
    }  
    }
  
