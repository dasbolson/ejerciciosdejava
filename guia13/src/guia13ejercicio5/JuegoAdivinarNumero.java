/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ejercicio5;

/**
 *
 * @author Casa
 */
public class JuegoAdivinarNumero {

    public JuegoAdivinarNumero() {
    }

    private final int numeroIncognita = (int) (Math.random() * 499 + 1);
    private int intentos;
    private boolean resolusion=false;
    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean getResolusion() {
        return resolusion;
    }

    public void setResolusion(boolean resolusion) {
        this.resolusion = resolusion;
    }
    
    
    
    public void intentoAdivinar(int numeroAdivinador) throws MiExcepcion {

        try {
            // intentos ++;
            if (numeroAdivinador > 500 || numeroAdivinador <= 0) {

                throw new MiExcepcion("Su numero esta fuera del rango de 0 a 500 !!!");
            }
                System.out.println("numero inco " + numeroIncognita);
            if (numeroAdivinador<numeroIncognita){
                System.out.println("El numero que ingreso en Menor al numero Incognita");
            }
            if (numeroAdivinador>numeroIncognita){
                System.out.println("El numero que ingreso en Mayor al numero Incognita");
            }
            
            if (numeroAdivinador==numeroIncognita) {
                System.out.println("Muy Bien , Ud. ha adivinado el Número !!!");
                System.out.println("Lo a logrado en: "+ intentos + " intentos");
                resolusion=true;
                return;
            }
            
        } catch (MiExcepcion e) {
            throw e;

        } catch (Exception e) {

            e.printStackTrace();
            throw new MiExcepcion("Error de los inesperados");

        }finally {
            System.out.println("Van "+intentos +" intentos");
        }

    }

}
