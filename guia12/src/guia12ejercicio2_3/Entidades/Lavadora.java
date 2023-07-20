/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
Los métodos que se implementara serán:llamar al constructor de la clase padre

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
package guia12ejercicio2_3.Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomesticos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    /*• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    public Lavadora crearLavadora() {
        Lavadora lavalava;
        Double capacidadDeCarga;
        Electrodomesticos electro;

        electro = crearElectrodomestico();
        System.out.println(" Capacidad de Carga de la Lavadora");
        capacidadDeCarga = leer.nextDouble();

        lavalava = new Lavadora(capacidadDeCarga, electro.getPrecio(), electro.getColor(), electro.getConsumoEnergetico(), electro.getPeso());
        return lavalava;
    }

    /* Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
     */
    
    @Override
    public void precioFinal() {
        Lavadora lavalava;
        Double precioF;
        char consumoElectro;
        Double pesoElectro;
        consumoElectro = consumoEnergetico;
        pesoElectro = getPeso();
        precioF = getPrecio();

        switch (consumoElectro) {
            case 'A':
                setPrecio(precioF + 1000);
                break;
            case 'B':
                setPrecio(precioF + 800);
                break;
            case 'C':
                setPrecio(precioF + 600);
                break;
            case 'D':
                setPrecio(precioF + 500);
                break;
            case 'E':
                setPrecio(precioF + 300);
                break;
            case 'F':
                setPrecio(precioF + 100);
                break;

            default:
                System.out.println("Valor no valido");
        }
        precioF = getPrecio();

        if (1 <= pesoElectro & pesoElectro <= 19) {
            precioF = precioF + 100;
            setPrecio(precioF);
        }
        if (19 < pesoElectro & pesoElectro <= 79) {
            precioF = precioF + 500;
            setPrecio(precioF);
        }
        if (50 <= pesoElectro & pesoElectro <= 49) {
            precioF = precioF + 800d;
            setPrecio(precioF);

            if (pesoElectro > 80) {
                precioF = precioF + 1000;
                setPrecio(precioF);
            }
        }
        if (this.carga > 30) {
            precioF = getPrecio() + 500;
            setPrecio(precioF);
        }
        System.out.println("-------------------");
        System.out.println("                   ");
        System.out.println("Info Lavadora");
        System.out.println("");
        System.out.println("Precio de La Lavarora " + precio);
        System.out.println("Color de La Lavarora " + color);
        System.out.println("Consumo Energetico de La Lavarora " + consumoEnergetico);
        System.out.println("Peso de La Lavarora " + peso);
        System.out.println("Carga de La Lavarora " + carga);
        System.out.println(" ");
        
    }
}
