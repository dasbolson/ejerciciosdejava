/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

 */
package guia13ejercicio6;

public class MainGuia13Ejercicio6 {

    public static void main(String[] args) {

        /* COPIADO DIRECTO DE LA GUIA
        FALTAN LOS PUNTO Y COMA AL FINALIZAR  LINEAS
        
        class A {

            public void metodoA() {
                sentencia_a1 
                sentencia_a2
                try {
                    sentencia_a3 sentencia_a4
                } catch (MioException e) {
                    sentencia_a6
                }
                sentencia_a5
            }
        }
        r.

    }
         */
 /*     REPARADO EL ERROR DE LOS PUNTOS Y COMAS
        
        class A {

            public void metodoA() {
                sentencia_a1;
                sentencia_a2;
                try {
                    sentencia_a3;
                    sentencia_a4;
                } catch (MioException e) {
                    sentencia_a6;
                }
                sentencia_a5;
            }
        }
        
        
        Respuesta A)
        
        ORDEN DE EJECUCION 
        
        sentencia_a1;
        sentencia_a2;
        ENTRA EN EL TRY
        sentencia_a3;
        SI sentencia_a3 NO TIRA ERROR, CONTINUA CON
        sentencia_a4;
        
        SE LANZA MioException
        sentencia_a6;
        
        sentencia_a5;
        
        
         Respuesta b)
        
        ORDEN DE EJECUCION 
        
        sentencia_a1;
        sentencia_a2;
        ENTRA EN EL TRY
        sentencia_a3;
         
        sentencia_a4;
        
        SE LANZA MioException
        sentencia_a5;

     
*/
    }
}
