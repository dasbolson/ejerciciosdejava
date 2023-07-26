/*
5. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia6ejercicios5extras;


/**
 *
 * @author Casa
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
    
    
    
    public double calcularAumento(int edad, double salario){
    
        if (edad>30) {
            salario = salario +(salario*0.10);
      
        }else {
            salario= salario +(salario*0.05);
        }
        return salario;
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
}
