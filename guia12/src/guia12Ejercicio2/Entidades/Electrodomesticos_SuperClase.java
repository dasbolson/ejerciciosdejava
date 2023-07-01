package guia12Ejercicio2.Entidades;

import guia12Ejercicio2.Enumeraciones.EnumColorDeElectrodomestico;
import guia12Ejercicio2.Enumeraciones.EnumConsumoDeEnergia;
import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Electrodomesticos_SuperClase {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected Character consumo;

    protected Double peso;

    public Electrodomesticos_SuperClase() {
    }

    public Electrodomesticos_SuperClase(Double precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
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

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    // sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    // objeto y no será visible.
    public void comprobarConsumoEnergetico(char letra) {
        for (EnumConsumoDeEnergia auxConsumo : EnumConsumoDeEnergia.values()) {
            if (auxConsumo.toString().equalsIgnoreCase(String.valueOf(letra))) {
                return;
            }
        }
        this.consumo = 'F';
    }

    // • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    // usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    // blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    // minúsculas. Este método se invocará al crear el objeto y no será visible.
    public void comprobarColor(String color) {

        for (EnumColorDeElectrodomestico auxColor : EnumColorDeElectrodomestico.values()) {
            if (auxColor.toString().equalsIgnoreCase(color)) {
                return;
            }
        }
        this.color = "Blanco";

    }

//    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//  electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//  precio se le da un valor base de $1000
    public void crearElectrodomestico() {

        Double precio;
        String color;
        Character consumo;
        Double peso;
        Character letra;

        System.out.println("Ingresar Datos Electrodomesticos");
        System.out.println("--------------------------------");
        System.out.println("Precio Base :$ 1000");
        System.out.print("Ingresar Color: ");
        color = leer.next();
        comprobarColor(color);
        System.out.print("Ingresar Facator de Consumo: ");
        letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.print("Ingresar Peso: ");
        peso = leer.nextDouble();
        //precio Base $1000.
        Electrodomesticos_SuperClase electrodomestico = new Electrodomesticos_SuperClase(1000d, color, letra, peso);

    }

    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:
    LETRA PRECIO
    A     $1000
    B     $800
    C     $600
    D     $500
    E     $300
    F     $100
    
    PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

     */
    public void precioFinal() {

        switch (this.consumo) {
            case 'A':
                this.precio = this.precio + 1000;
                break;
            case 'B':
                this.precio = this.precio + 800;
                break;
            case 'C':
                this.precio = this.precio + 600;
                break;
            case 'D':
                this.precio = this.precio + 500;
                break;
            case 'E':
                this.precio = this.precio + 300;
                break;
            case 'F':
                this.precio = this.precio + 100;
                break;

            default:
                System.out.println("Valor no valido");
        }

        if (1 <= peso & peso <= 19) {
            this.precio = this.peso + 100d;
        }
        if (19 < peso & peso <= 79) {
            this.precio = this.peso + 800d;
        }
        if (50 <= peso & peso <= 49) {
            this.precio = this.peso + 500d;
        }
        if (peso > 80) {
            this.precio = this.peso + 1000d;
        }
    }

}
