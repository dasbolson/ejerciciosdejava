/*
 
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package guia11ejercicio2.Entidades;

/**
 *
 * @author Casa
 */
public class RevolverDeAgua {

    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    // llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    // deben ser aleatorios.
    public RevolverDeAgua llenarRevolver(RevolverDeAgua revolverDeAgua) {
       // this.posicionActual = (int) (Math.random() * 10);
       // this.posicionAgua = (int) (Math.random() * 10);
       revolverDeAgua.posicionActual=(int) (Math.random() * 10);
       revolverDeAgua.posicionAgua=(int) (Math.random() * 10);
        
        return revolverDeAgua;

    }
    //mojar(): devuelve true si la posición del agua coincide con la posición actual

    public Boolean mojar() {

        return (posicionActual == posicionAgua);
    }
    //siguienteChorro(): cambia a la siguiente posición del tambor 

    public void siguienteChorro() {

        posicionActual++;
        if (posicionActual > 9) {
            posicionActual = 1;
        }
          
    }
// • toString(): muestra información del revolver (posición actual y donde está el agua)

    public void mostrarInfo() {

        System.out.println(posicionActual.toString());
        System.out.println(posicionAgua.toString());
      
    }

    
    
    
}
