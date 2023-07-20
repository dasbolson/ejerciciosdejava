/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:

    letra       Precio          peso             Precio
      A         1000            entre 1 y 19kg      100
      B          800            entre 20 y 49 kg    500
      C          600            entre 50 y 79 kg    800
      D          500            mayor a 80 kg       1000
      E          300        
      F          100

A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
 */
package guia12ejercicio2_3.Entidades;

import guia12ejercicio2_3.EnumColorElectrodomestico;
import guia12ejercicio2_3.EnumConsumo;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected Character consumoEnergetico; // (letras entre A y F) 
    protected Double peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, Character consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    
    
    
    /* • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible. 
     */
    public Character comprobarConsumoEnergetico(Character letraConsumo) {
        for (EnumConsumo auxConsumo : EnumConsumo.values()) {

            if (auxConsumo.toString().equalsIgnoreCase(String.valueOf(letraConsumo))) {
                return letraConsumo;
            } else {
                letraConsumo = 'F';
            }
        }
        return letraConsumo;
    }

    /*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible*/
    public String comprobarColor(String colorElectrodomestico) {

        for (EnumColorElectrodomestico auxColor : EnumColorElectrodomestico.values()) {

            if (auxColor.toString().equalsIgnoreCase(colorElectrodomestico)) {
                return colorElectrodomestico;
            } else {
                colorElectrodomestico = "BLANCO";
            }
        }
        return colorElectrodomestico;
    }

    /* • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public Electrodomesticos crearElectrodomestico() {

        Double precioElectrodomestico;
        String colorElectrodomestico;
        Character consumoEnergeticoElectrodomestico; // (letras entre A y F) 
        Double pesoElectrodomestico;
        Electrodomesticos electro;
        
        System.out.println("Precio del Electrodomestico");
        precioElectrodomestico = leer.nextDouble();
        System.out.println("Color del Electrodomestico");
        colorElectrodomestico = leer.next();
        System.out.println("Consumo del Electrodomestico");
        consumoEnergeticoElectrodomestico = leer.next().charAt(0);
        System.out.println("Peso del Electrodomestico");
        pesoElectrodomestico = leer.nextDouble();

        colorElectrodomestico = comprobarColor(colorElectrodomestico);
        consumoEnergeticoElectrodomestico = comprobarConsumoEnergetico(consumoEnergeticoElectrodomestico);

        precioElectrodomestico = precioElectrodomestico + 1000;

        electro = new Electrodomesticos(precioElectrodomestico, colorElectrodomestico, consumoEnergeticoElectrodomestico, pesoElectrodomestico);

        return electro;

    }

    /* Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    
    public void precioFinal() {
        Double precioF;
        char consumoElectro;
        Double pesoElectro;
        consumoElectro = consumoEnergetico;
        pesoElectro = peso;
        precioF = precio;
   
        switch (consumoElectro) {
            case 'A' :
                setPrecio (precioF + 1000);
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
        precioF = precio;
        
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
        
    }
}
