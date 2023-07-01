/*
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos
 */
package guia12Ejercicio2.Entidades;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Televisor extends Electrodomesticos_SuperClase {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Integer resolucion; //(en pulgadas)
    Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolución, Boolean sintonizadorTDT, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolución;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolución() {
        return resolucion;
    }

    public void setResolución(Integer resolución) {
        this.resolucion = resolución;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    public void crearTelevisor() {

        super.crearElectrodomestico();
        System.out.println("Ingresar Resolucion (pulgadas)");
        Integer reso = leer.nextInt();
        //this.resolucion=reso;
        System.out.println("Sintonizador TDT ->(S/N) ");
        Boolean sinto = leer.nextBoolean();
        //this.sintonizadorTDT = sinto;

        new Televisor(reso, sinto, super.precio, super.color, super.consumo, super.peso);

    }

    /*
      • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
     */
    @Override
    public void precioFinal() {

        super.precioFinal();

        if (this.resolucion > 40) {
            this.precio = this.precio * 1.3;
        }
        if (sintonizadorTDT) {
            this.precio = this.precio + 500;
        }
    }

}
