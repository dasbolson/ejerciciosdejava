/*
 
9. Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?



class C {
void metodoC() throws TuException{
sentencia_c1
try {
sentencia_c2
sentencia_c3
} catch (MioException e){

sentencia_c4
} catch (TuException e){
sentencia_c5
throw (e)
}
finally
sentencia_c6
}
}


 */
package guia13ejercicio9;

public class MainGuia13Ejercicio9 {

    public static void main(String[] args) {

    }
}
/*
        class C {

            void metodoC() throws TuException {
                sentencia_c1
                try {
                    sentencia_c2 sentencia_c3
                } catch (MioException e) {
                    sentencia_c4
                } catch (TuException e) {
                    sentencia_c5
                    throw (e)
                } finally sentencia_c6
                }
            }
        }

    ****    PRIMERAMENTE AGREGO PUNTOS Y COMAS QUE FALTAN  Y LLAVES ****
        
class C {

            void metodoC() throws TuException {
                sentencia_c1;
                try {
                    sentencia_c2;
                    sentencia_c3;
                } catch (MioException e) {
                    sentencia_c4;
                } catch (TuException e) {
                    sentencia_c5;
                    throw (e);
                } finally {
                sentencia_c6;
                }
            }
        }

        Respuesta A)
                    
                    sentencia_c1
                    dependiendo donde se produce el error !
                    sentencia_c2 
                    O 
                    sentencia_c2 y sentencia_c3    
                    BLOQUE catch (MioException e)
                    sentencia_c4;
                    BLOQUE FINALLY
                    sentencia_c6;

        Respuesta B)           

                    sentencia_c1
                    sentencia_c2 
                    sentencia_c3 
                    sentencia_c6

        Respuesta C)

                    sentencia_c1
                    dependiendo donde se produce el error !
                    sentencia_c2 
                    O 
                    sentencia_c2 y sentencia_c3  
                    sentencia_c5
                    sentencia_c6




*/
  
