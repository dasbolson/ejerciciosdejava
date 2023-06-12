/*
 EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main
 */
package EjerciciosDeLaGuiaTeorica.Entidades;

/**
 *
 * @author Casa
 */
public class Dni {
    
    private Character serie;
    private Integer numero;

    public Dni() {
    }
    

    public Dni(Character serie, Integer numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public Character getSerie() {
        return serie;
    }

    public void setSerie(Character serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
    
    
}
