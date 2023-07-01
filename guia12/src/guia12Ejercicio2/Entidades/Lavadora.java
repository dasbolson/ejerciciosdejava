/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package guia12Ejercicio2.Entidades;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Lavadora extends Electrodomesticos_SuperClase {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(Double carga, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
   /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
    */ 
    
    public void crearLavadora (){
 
        crearElectrodomestico();
        System.out.println("Ingresar capasidad de Carga de la Lavadora:");
        carga= leer.nextDouble();
     Lavadora lavaropa;
        lavaropa = new Lavadora(carga,super.precio,super.color, super.consumo, super.peso);
 
    }
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */
    
    @Override
    public void precioFinal(){
    
    super.precioFinal();
        
        if (this.carga>30) {
            super.precio= super.precio+500;
        }
    }

    
    
}
