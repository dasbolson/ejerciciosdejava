/*
 Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre
 */
package guia12ejercicio2_3.Entidades;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Televisor extends Electrodomesticos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected Double resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

 
    /*
    Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.


Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos
     */
    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public Televisor crearTelevisor() {
       
        Electrodomesticos electro1;
        Double resol;
        Boolean sinton;
        String sinto;
        Televisor tele1;
        electro1 = crearElectrodomestico();
        System.out.println("Resolucion del TV");
        resol= leer.nextDouble();
        System.out.println("Sintonizador S/N");
        sinto = leer.next();
        if (sinto.equalsIgnoreCase("S")) {
            sinton = true;
        } else {
            sinton = false;
        }
        tele1 = new Televisor(resol, sinton, electro1.getPrecio(), electro1.getColor(), electro1.getConsumoEnergetico(), electro1.getPeso());

        return tele1;
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
        
        System.out.println("-------------------");
        System.out.println("                   ");
        System.out.println("Info Televisor");
        System.out.println("");
        System.out.println("Precio de La Televisor " + precio);
        System.out.println("Color de La Televisor " + color);
        System.out.println("Consumo Energetico de La Televisor " + consumoEnergetico);
        System.out.println("Peso de La Televisor " + peso);
        System.out.println("Resolusion de La Televisor " + resolucion);
        System.out.println("Sintonizador TDT " + sintonizadorTDT);
        System.out.println(" ");
        
    }    

    
   } 
/*
  
*/